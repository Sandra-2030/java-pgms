import java.util.Scanner;
class Employee
{
int eNo,eSalary;
String eName;
public Employee (int no , int sal,String name)
{
eNo=no ;
eSalary=sal ;
eName = name ;
}
public void showData ( )
{
System.out.print ("EmpId = "+eNo + " " + " Name = "+eName + " " + " Salary= "+eSalary ) ;
System.out.println( ) ;
}
}
public class emparray
{
public static void main(String [ ] args )
{
System.out.println("Enter number of employees : " ) ;
Scanner sc = new Scanner(System.in ) ;
int n = sc.nextInt ( );
System.out.println("Enter Employee details one by one " ) ;
// create array of objects
Employee employees[ ] = new Employee[n] ;
Scanner sc_emp = new Scanner (System . in ) ;
int eid ,esal ;
String enam;
for(int i =0; i<n;i++)
{
System.out.println ( "Enter "+ i + " employee details " ) ;

System.out.println( "Enter employee id" ) ;
eid = sc_emp.nextInt ( ) ;
System.out.println( "Enter employee name: " ) ;
String nam = sc_emp.next ( ) ;
enam = new String(nam) ;
System.out.println("Enter employee salary: " ) ;
esal = sc_emp.nextInt ( ) ;
Employee emp = new Employee(eid,esal,enam) ;
employees[i]=emp ;
}
System.out.println("Employees are : n" ) ;
for(Employee y : employees )
y.showData ( ) ;
System.out.println("Enter employee id to search : " ) ;
int semp = sc.nextInt();
boolean found = false ;
for (Employee e:employees)
{
if(semp == e.eNo)
{
found = true ;
System.out.println("Employee found") ;
e.showData ( ) ;
break ;
}
}
if(!found )
{
System.out.println("Employee not found . ") ;
}
}
}
