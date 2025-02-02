
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static Scanner scan;

    public static void main(String[] args) {
        /*int number = 5;
        if(number > 0){
            System.out.println("Postive");
        } else {
            System.out.println("Negative");
        }
        

        int num = 10;
        if(num % 2 == 0){
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
        

        int price = 50;
        int quantity = -1;
        int total = price * quantity;
        
        System.out.println(total);
        
        if(total >= 150){
            System.out.println("Hello");
        } else {
            if(quantity >= 0){
                System.out.println("Bye");
            } else {
                System.out.println("Invalid Message");
            }
        }
        
        int number = 50;
        if(number >= 0 && number <= 100){
            System.out.println("Inside");
        } else {
            System.out.println("Outside");
        }
        
        
        for(int i = 0; i < 5; i++){
            System.out.println("*");
        }
        
        
        for(int i = 0; i < 5; i++){
            System.out.print("*");
        }
        
        
        for(int i = 0; i < 5; i++){
            System.out.println(i+1);
        }
        
        
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
                
            }
            System.out.println();
        }
        
        int count = 0;
        
        while(count < 4){
            System.out.println("*");
            count++;
        }
        
        int row = 3;
        int i = 1;
        while(i <= row){
            int j = 1;
            while(j <= i){
                System.out.print(j);
                j++;
            }
            i++;
            System.out.println();
        }
        
        
        int count = 5;
        do {
            System.out.println(count);
            count++;
        } while(count < 10);
        
        
        int marks = 39;
        
        if (marks >= 75 && marks <= 100){
            System.out.println("Grade A");
        } else if (marks >= 65 ){
            System.out.println("Grade B");
        } else if (marks >= 55){
            System.out.println("Grade C");
        } else if (marks >= 35){
            System.out.println("Grade S");
        } else {
            System.out.println("Fail");
        }
        
        
        String day = "Monday";
        switch(day){
            case "Monday":
                System.out.println("This is Monday");
                break;
                
            case "Tuesday":
                System.out.println("This is Tuesday");
                break;
                
            case "Wednesday":
                System.out.println("This is Wednesday");
                break;
            
            case "Thursday":
                System.out.println("This is Thursday");
                break;
                
            case "Friday":
                System.out.println("This is Friday");
                break;
                
            case "Saturday":
                System.out.println("This is Saturday");
                break;
                
            case "Sunday":
                System.out.println("This is Sunday");
                break;
                
            default:
                System.out.println("Invalid");
        }
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("*");
            }
            
            
        }
        int i = 1;
        while(i < 4){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("\n");
           i++;
        }
         
        for (int i = 1; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("\n");

        }
        
        for(int i = 0; i < 10; i++){
//            System.out.print("*");
//            System.out.println(i+1);
            if(i%2 == 1){
                System.out.print(i + " ");
            }
        }
        
        int[] numbers = {10, 20, 30, 40};
        for(int i = 0; i < numbers.length; i++){
            //System.out.print(numbers[i] + " ");
        }
        int i = 0;
        while(i < numbers.length){
            System.out.println(numbers[i]);
            i++;
        }
        
        int[] numbers = {10, 20, 30, 40};
        
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = scan.nextInt();
        }
        System.out.print("Your Array: ");
        printArray(numbers);
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter product name: ");
        String product = scan.nextLine();
        //System.out.println(product);
        
        System.out.print("Enter product quantity: ");
        int quantity = scan.nextInt();
        System.out.print("Enter product price: ");
        double price = scan.nextDouble();
        double total = quantity * price;
        //System.out.println("Your total is: " + total);
        
        double newPrice;
        int discount;
        if(total >= 1000){
            discount = 10;
            newPrice = total - (total * 0.10);
        } else {
            discount = 5;
            newPrice = total - (total * 0.05);
        }
        //System.out.println("Your price after discount: " + newPrice);
        printReceipt(product, quantity, price, total, discount, newPrice);
        
*/
        scan = new Scanner(System.in);
        
        String product = getProduct(scan);
        int quantity = getQuantity(scan);
        double price = getPrice(scan);
        double total = getTotal(scan, quantity, price);
        int discount = findDiscount(total);
        double newPrice = applyDiscount(discount, total);
        printReceipt(product, quantity, price, total, discount, newPrice);
        
    }
    public static void printArray(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
    
    public static String getProduct(Scanner scan){
        System.out.print("Enter product name: ");
        String product = scan.nextLine();
        return product;
    }
    
    public static int getQuantity(Scanner scan){
        System.out.print("Enter product quantity: ");
        int quantity = scan.nextInt();
        return quantity;
    }
    
    public static double getPrice(Scanner scan){
        System.out.print("Enter product price: ");
        double price = scan.nextDouble();
        return price;
    }
    
    public static double getTotal(Scanner scan, int quantity, double price){
        double total = quantity * price;
        return total;
    }
    public static int findDiscount(double total){
        int discount;
        
        if(total >= 1000){
            discount = 10;
        } else {
            discount = 5;
        }
        return discount;
    }
    public static double applyDiscount(int discount, double total){
        double newPrice;
        
        if(discount == 10){
            newPrice = total - (total * 0.10);
        } else {
            newPrice = total - (total * 0.05);
        }
        return newPrice;
    }
    
    public static void printReceipt(String product, int quantity, double price, double total, double discount, double newPrice){
        System.out.println("\n****** Your Invoice ******");
        System.out.println("Product: " + product);
        System.out.println("Quantity: " + quantity);
        System.out.println("Gross Total: " + total);
        System.out.println("Discount(%): " + discount);
        System.out.println("Net Total: " + newPrice);
        System.out.println("");
        System.out.println("Thanks for Choosing us, Come again!!!\n");
    }
}