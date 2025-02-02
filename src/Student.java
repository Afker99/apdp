public class Student {
    public static void main(String[] args){
        Student student = new Student();
        String name = student.student_name("John");
        double total = student.student_total_marks(35.6, 67, 45.5);
        double average = student.student_average(total);
        String grade = student.grade(total);
        System.out.println("Name: " + name);
        student.student_marks(35.6, 67, 45.5);
        System.out.println("Average: " + average);
        System.out.println("Grade: "+ grade);

    }
    
    public String student_name(String name){
        return name;
    }
    
    public void student_marks(double marks1, double marks2, double marks3){
        System.out.println("Marks: "+ marks1 + ", " + marks2 + ", " + marks3);
    }
    
    public double student_total_marks(double marks1, double marks2, double marks3){
        return (marks1 + marks2 + marks3);
    }
    
    public double student_average(double total){
        return (total/3);
    }
    
    public String grade(double total){
        if(total >= 75 || total <=100){
            return "A";
        }else if(total >= 65) {
            return "B";
        }else if(total >= 55) {
            return "C";
        }else if(total >= 35) {
            return "S";
        } else {
            return "Invalid grade, check the marks^";
        }
    }
}
