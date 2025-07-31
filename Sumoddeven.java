import java.util.*;
public class Sumoddeven{

public static void main(String[] args){
Scanner sc = new Scanner (System.in);
int sume=0,sumo=0;

System.out.println("Enter the no of elements in array");
int n = sc.nextInt();
int[] arr = new int[n];

System.out.println("Enter the elements in array");
for(int i=0;i<n;i++){
arr[i] = sc.nextInt();
}

for(int i=0;i<n;i++){
if(arr[i]%2==0){
sume = sume + arr[i];
}
else{
sumo = sumo + arr[i];
}
}
System.out.println("Sum of even numbers is " +sume);
System.out.println("Sum of odd numbers is " +sumo);
}
}