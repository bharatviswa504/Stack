package Algo;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Stack s = new Stack(100);
		while(true){
		System.out.println("Select Which Operation to Perfrom");
		System.out.println("1. Push ");
		System.out.println("2. Pop ");
		System.out.println("3. Print ");
		System.out.println("4. Exit");
		Scanner read = new Scanner(System.in);
		int input = read.nextInt();
		switch(input) {
		case 1: System.out.println("Enter Element to Push");	
				s.push(read.nextInt());
				break;
		case 2:int popped = s.pop();
				if(popped!=-1)
					System.out.printf("Popped Element is:%d\n",popped);
				break;
		case 3:s.print();
				break;
		case 4:System.exit(0);	
				break;
		default:System.out.println("Invalid Option!!!Sorry!!!");
		}
		}
		
		
	}
}
