package Tasks;

import java.util.Scanner;

public class Task26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i,n,sum=0;

		   System.out.print("Input number of terms is: ");
		{
		   Scanner sc=new Scanner(System.in);
				  int n1 = sc.nextInt();
		  System.out.println ("\nThe odd numbers are :");
		   for(i=1;i<=n1;i++)

		   {
		     System.out.println (2*i-1);
		     sum+=2*i-1;
		   }
		   System.out.println ("The Sum of odd Natural Number upto " +n1+" terms is: " +sum);
	}

}
}