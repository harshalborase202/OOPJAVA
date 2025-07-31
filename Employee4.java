import java.util.*;
class Employee4{
int id,salary;
String name,company;
Employee4(){
int id = 4;
String name = "Harshal";
int salary = 90000;
System.out.println("id "+id +"\tSalary "+salary +"\tName " +name );
}
Employee4(int id,String name,int salary){
this.id = id;
this.name = name;
this.salary = salary;
System.out.println("id "+id +"\tSalary "+salary +"\tName " +name );
}
Employee4(int id,String name,int salary ,String company){
this.id = id;
this.name = name;
this.salary = salary;
this.company = company;
System.out.println("id "+id +"\tSalary "+salary +"\tName " +name +"\tCompany "+company);
}
Employee4(int id,String name,String company){
this.id = id;
this.name = name;
salary = 150000;
this.company = company;
System.out.println("id "+id +"\tSalary "+salary +"\tName "+name +"\tcompany "+company );
}

public static void main(String[] args){
Employee4 e1 = new Employee4();
Employee4 e2 = new Employee4(2,"Sagar",90000);
Employee4 e3 = new Employee4(3,"Manish",100000,"Juspay");
Employee4 e4 = new Employee4(4,"Digambar","Google");

}

}