import java.util.*;
public class Arrayadd{

public static void main(String[] args){
Scanner sc = new Scanner (System.in);

int Addition=0,n;

System.out.println("Enter how many numbers you want to enter :");
n=sc.nextInt();
int[] arr = new int[n];
System.out.printf("Enter(%d)numbers",n);
for(int i=0;i<n;i++){

  arr[i]=sc.nextInt();
  Addition +=arr[i];
}
System.out.println("Addition is " +Addition);
}
}