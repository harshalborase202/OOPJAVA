import java.util.*;
public class Factorial2{

public static int factorial(int n){
if(n==1){
return 1;
}
return n*factorial(n-1);
}

public static void main(String[] args){
Scanner sc = new Scanner (System.in);
System.out.println("Enter the number");

int n = sc.nextInt();

int result = factorial(n);
System.out.println("Factorial is : " +result);

}
}