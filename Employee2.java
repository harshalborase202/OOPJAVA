import java.util.*;
public class Employee2{
int emp_id;
String name;
int salary;
Employee2(String name,int salary,int emp_id){
this.emp_id = emp_id;
this.name = name;
this.salary = salary;
}
public void display(){
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
Employee2 e1 = new Employee2(name,salary,emp_id);
e1.display();



}
}