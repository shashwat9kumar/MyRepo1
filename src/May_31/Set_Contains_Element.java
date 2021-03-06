/**
 * 
 * @author Shashwat Kumar
 * @category Foxmula Internship
 * 
 */

package May_31;

import java.util.HashSet;
import java.util.Scanner;

public class Set_Contains_Element {
	
	public static void showArrayList(HashSet<Integer> set) {
		for(int i: set) {
			System.out.print(i + ",\t");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter 0 to input elements to set and 1 to exit inputting");
			choice = sc.nextInt();
			if(choice == 0) {
				System.out.println("Enter a number");
				set.add(sc.nextInt());
			}
			else if(choice == 1) {
				break;
			}
			else {
				System.out.println("Wrong choice");
			}
		}while(choice!=1);
		
		System.out.println("The set we have is: ");
		showArrayList(set);
		
		choice = 0;
		do {
			System.out.println("Enter 0 to input elements to check in set and 1 to exit");
			choice = sc.nextInt();
			if(choice == 0) {
				System.out.println("Enter a number");
				int input = sc.nextInt();
				if(set.contains(input)) {
					System.out.println("The set contains " + input);
				}
				else {
					System.out.println("The set does not contain " + input);
				}
			}
			else if(choice == 1) {
				break;
			}
			else {
				System.out.println("Wrong choice");
			}
		}while(choice!=1);
		
		sc.close();
	}

}
