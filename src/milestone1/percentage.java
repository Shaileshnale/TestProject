package milestone1;

import java.util.Scanner;

public class percentage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Physics Marks");
		int physics=sc.nextInt();
		System.out.println("Enter Chemistry marks");
		int chemistry=sc.nextInt();
		System.out.println("Enter Biology marks");
		int biology=sc.nextInt();
		System.out.println("Enter Maths marks");
		int maths=sc.nextInt();
		System.out.println("Enter computer marks");
		int comp=sc.nextInt();
		
		double per=((physics+chemistry+biology+maths+comp)*100.0)/500.0;
		System.out.println("Percentage is "  +per);
		if (per>=90){
		System.out.println("Grade is A" );
		}else if(per>=80) {
			System.out.println("Grade is B" );
		}else if(per>=70) {
			System.out.println("Grade is C" );
			
		}else if(per>=60) {
			System.out.println("Grade is D" );
		
		}else if(per>=40) {
			System.out.println("Grade is E" );
	
		}else if(per<=40) {
			System.out.println("Grade is F" );
	}
	
	
	
	}

}
