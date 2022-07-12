import java.util.Scanner;

class EmployeeT{
    int empid;
    String name;
    float salary;
    String address;
    EmployeeT(){}
    EmployeeT(int empid, String name, float salary, String address){
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

class Teacher extends EmployeeT{
    String department, subject;
    Teacher(int empid, String name, float salary, String address, String department, String subject){
        super(empid,name,salary,address);
        this.department = department;
        this.subject = subject;
    }
    public void display(){
        System.out.println("Teacher id : "+empid);
        System.out.println("Teacher name : "+name);
        System.out.println("Teacher salary : "+salary);
        System.out.println("Teacher address : "+address);
        System.out.println("Teacher department : "+department);
        System.out.println("Teacher subject : "+subject);
    }
}

public class Main{
    public static void main(String[] args){
        System.out.println("enter number of teacher : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println("enter teacher details one by one...");
        Teacher teacher[] = new Teacher[n];
        Scanner ScT = new Scanner(System.in);
        int tid; String name; float salary; String address; String department; String subject;
        
        for(int i=0; i<n; i++){
            System.out.println("enter " +i+ "teacher details...");
            System.out.println("enter teacher id (Integer) : ");
            tid = ScT.nextInt();
            System.out.println("enter teacher name (String) : ");
            name = ScT.next();
            System.out.println("enter teacher salary (Float) : ");
            salary = ScT.nextFloat();
            System.out.println("enter teacher address (String) : ");
            address = ScT.next();
            System.out.println("enter teacher department (String) : ");
            department = ScT.next();
            System.out.println("enter teacher subject (String) : ");
            subject = ScT.next();
            
            Teacher t = new Teacher(tid, name, salary, address, department, subject);
            teacher[i] = t;
        }
        System.out.println("teacher's are : \n");
        for(Teacher x:teacher){
            x.display(); System.out.println("\n");
        }
    }
}



















