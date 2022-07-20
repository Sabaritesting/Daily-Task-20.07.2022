package Tasks;

import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,n,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Given Values");
 n=sc.nextInt();
 System.out.println("The natural numbers are"+n);
 for(i=1;i<=n;i++) {
System.out.println(i);
sum+=i;
 }
 System.out.println("The Sum of Natural Number upto "+n+ " and their sum is : " +sum);
	}

}
