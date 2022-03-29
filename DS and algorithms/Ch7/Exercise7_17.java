package Ch7;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7_17 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input ="";
		int size = 0;
		System.out.println("Enter number of Students: ");
		size = in.nextInt();
		String[] students = new String[size];
		int[] scores = new int[size];
		int a=0;
		do {
			System.out.println("Enter student name: ");
			students[a] = in.next();
			System.out.println("enter student score: ");
			scores[a] = in.nextInt();
			a++;
		}
		while(a<size);
		
		for(int i=0; i<students.length;i++) {
			if(i+1 == students.length-1 )
				return;
			else if(scores[i] < scores[i+1]) {
				String temp = students[i];
				int tempScore = scores[i];
				scores[i] = scores[i+1];
				students[i] = students[i+1];
				scores[i+1] = tempScore;
				students[i+1] = temp;
			}
		}
		System.out.println(Arrays.toString(students) +"\n"+Arrays.toString(scores));
		for(int i=0;i<scores.length;i++) {
			System.out.println(students[i]+":"+scores[i]);
		}
	}
}
