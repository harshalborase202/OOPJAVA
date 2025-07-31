public class Employee1{
int emp_id;
String name;
int salary;
Employee1(){
emp_id = 1;
name = "Harshal Borase";
salary = 20000;
}
//public void display()
{


}
public static void main(String [] args){
Employee1 e1 = new Employee1();
System.out.println("Employee info");
System.out.println("id : " + e1.emp_id);
System.out.println("name : " + e1.name );
System.out.println("salary : " +e1.salary);

}
}