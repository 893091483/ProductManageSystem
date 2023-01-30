package MainApp;

import java.util.Scanner;

import Controller.productController;

public class Main {
	public static void main(String[] args) {
		int choice=0;
		Scanner sc=new Scanner(System.in);
		productController pc=new productController();
		System.out.println("Welcome to Product Management Application");
		do {
			
			System.out.println("1-Add");
			System.out.println("2-Display");
			System.out.println("3-Update");
			System.out.println("4-Delete");
			System.out.println("5-Exit");
			System.out.println("Please enter your choice...");
			choice=sc.nextInt();
			pc.accpept(choice);
			
		}while(choice!=5);
		sc.close();
	}
}
