package project1;

import java.util.Scanner;
class evenodd 
{
public static void main(String[] args)
{
	int num;
	System.out.println("Enter the no:");
Scanner input =new Scanner(System.in);
	num=input.nextInt();
	if(num%2==0)
		System.out.println("even");
	else
		System.out.println("odd");
}
}