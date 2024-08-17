package milestone1;

import java.util.Scanner;

public class profitloss {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter sp");
	int sp=sc.nextInt();
	System.out.println("Enter cp");
	int cp= sc.nextInt();

	//int sp = 1200;
	//int cp =300;
	int profit=sp-cp;

	
		if(sp>cp){
		
		System.out.println("Profit=" +profit);
	} else if (cp>sp) {
		System.out.println("Loss");
	}
	
}
}