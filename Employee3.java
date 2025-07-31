import java.util.*;
public class Employee3{
int emp_id;
String name;
int salary;
public Employee3(String name,int salary,int emp_id){
this.emp_id = emp_id;
this.name = name;
this.salary = salary;

System.out.println("Employee Info");
System.out.println("id : " + emp_id);
System.out.println("name : " + name );
System.out.println("salary : " +salary);
System.out.println("");
}
public Employee3(Employee3 obj){
this.emp_id = obj.emp_id;
this.name = obj.name;
this.salary =obj. salary;

System.out.println("Employee Info");
System.out.println("id : " + emp_id);
System.out.println("name : " + name );
System.out.println("salary : " +salary);
}

public static void main(String [] args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter employee id");
int emp_id = sc.nextInt();
System.out.println("Enter name");
String name = sc.next();
System.out.println("Enter salary");
int salary = sc.nextInt();
System.out.println("");
Employee3 e1 = new Employee3(name,salary,emp_id);
Employee3 e2 = new Employee3(e1);

}
}