package package1;

import java.util.Scanner;

public class pgm38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		for (int i=1;i<=10;i++) {
			System.out.println(num+"*"+i+"="+num*i);
		}

	}

}
