import java.util.Scanner;
public class Sum{
	public static void main(String args[]){
		int x,y,sum;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first number");
		x= in.nextInt();
		System.out.println("Enter the second number");
		y= in.nextInt();
		sum=x+y;
		System.out.println("sum is " + sum);
	}
}