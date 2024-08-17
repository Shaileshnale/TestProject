package milestone1;

import java.util.Scanner;
public class basicsalary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter basic salary");
		int bs=sc.nextInt();
		int  da=0;
		int hra=0;
		if (bs<=10000);{
			hra=(bs*20)/100;
			da=(bs*80)/100;
		} if (bs<=20000) {
			hra=(bs*25)/100;
			da=(bs*90)/100;
		} else if (bs>=20000) {
			hra=(bs*30)/100;
			da=(bs*95)/100;
		
	}
		int gs= bs+hra+da;
		System.out.println("he got HRA:"+hra);
		System.out.println("he got DA:"+da);
		System.out.println("he got Gross salary:"+gs);
		

}
}
