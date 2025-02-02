import java.util.Scanner;

public class UserInputs {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        /*
        int num = scan.nextInt();
        System.out.println("Number is: " + num);
        
        System.out.print("Enter Student Name: ");
        String name = scan.nextLine();
        
        System.out.print("Enter Subject: ");
        String subject = scan.nextLine();
        
        System.out.print("Enter Mark 01: ");
        int m1 = scan.nextInt();
        
        System.out.print("Enter Mark 02: ");
        int m2 = scan.nextInt();
        
        System.out.print("Enter Mark 03: ");
        int m3 = scan.nextInt();
        
        System.out.println("-----------------------------");
        System.out.println("Student Name is: " + name);
        System.out.println("Subject is: " + subject);
        System.out.println("Student Mark 01 is: " + m1);
        System.out.println("tudent Mark 02 is: " + m2);
        System.out.println("tudent Mark 03 is: " + m3);
        int total = m1 + m2 + m3;
        double avg = total / 3;
        System.out.println("Total is: " + total);
        System.out.println("Average is: " + avg);
        String grade;
        
        if (avg >= 75){
            grade = "A";
        } else if (avg >= 65 ){
            grade = "B";
        } else if (avg >= 55){
            grade = "C";
        } else if (avg >= 35){
            grade = "S";
        } else {
            grade = "F";
        }
        
        System.out.println("Grade is: " + grade);
        */
        System.out.print("Enter product: ");
        String product = scan.nextLine();
        
        System.out.print("Enter quantity: ");
        double qty = scan.nextInt();
        
        if(qty < 0){
            System.out.println("Invalid");
            System.exit(0);
        }
        
        System.out.print("Enter product price: ");
        double price = scan.nextDouble();
        
        double total = qty * price;
        
        double rate;
        double netTotal;
        double disAmount;
        
        if(total >= 5000){
            rate = 10;
            disAmount = total * 0.10; 
            netTotal = total - disAmount;
        }else if (total >= 2500){
            rate = 5;
            disAmount = total * 0.05; 
            netTotal = total - disAmount;
        } else if(total >= 1000){
            rate = 2;
            disAmount = total * 0.02; 
            netTotal = total - disAmount;
        } else {
            rate = 0;
            disAmount = 0; 
            netTotal = total - disAmount;
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Product is: " + product);
        System.out.println("Product quantity is: " + qty);
        System.out.println("Product total is: " + total);
        System.out.println("Discout(%): " + rate);
        System.out.println("Discount Amount: " + disAmount);
        System.out.println("Net Total: " + netTotal);
    }
}