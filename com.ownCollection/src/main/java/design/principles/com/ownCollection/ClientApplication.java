package design.principles.com.ownCollection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;



public class ClientApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> l = new CustomCollection(Arrays.asList(0,0,0,0,0,0,0,0,0,0));
		System.out.println("1)Add element");
		System.out.println("2)Fetch element");
		System.out.println("3)Remove element");
		System.out.println("4)Exit");
		int option;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter option");
			option = sc.nextInt();
			
			int UserInput;
			if(option==1)
			{System.out.println("enter number");
			UserInput = sc.nextInt();
				l.add(UserInput);
				System.out.println(l);
			}
			else if(option==2)
			{System.out.println("enter index");
			UserInput = sc.nextInt();
				System.out.println(l.get(UserInput));
						
			}
			else if(option==3)
			{
				System.out.println("enter index");
				UserInput = sc.nextInt();
				l.remove(UserInput);
				System.out.println(l);
			}
			else if(option==4)
			{
				break;
			}
		}
	}

}
