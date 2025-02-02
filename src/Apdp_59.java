
public class Apdp_59 {
    public static void main(String[] args){
        Apdp_59 myObject = new Apdp_59();
        myObject.sum();        
        myObject.sub();
        myObject.passsum(45, 30);
        myObject.passsub(45, 10);
        myObject.details("Afker", 25, "HND-Softawre Eng.");
        int total = myObject.returnSum(50, 40);
        
        System.out.println(total);
        if(total >= 0){
            System.out.println("Return value is positive");
        } else {
            System.out.println("Return value is negative");
        }

    }
    
    public void sum(){
        int a = 5;
        int b = 6;
        int total = a + b;
        
        System.out.println("Total is " + total);
    }
    
    public void passsum(int a, int b){
        int total = a + b;
        
        System.out.println("Total is " + total);
    }
    
    public void sub(){
        int a = 3;
        int b = 1;
        int total = a - b;
        System.out.println("Total is " + total);
    }
    
    public void passsub(int a, int b){
        int total = a- b;
        System.out.println("Total is " + total);
    }
    
    public void details(String name, int age, String course){
        System.out.println("Name: "+ name + "\nAge: " + age + "\nCourse: "+ course);
    }
    
    public int returnSum(int a, int b){
        return a+b;
    }
}
