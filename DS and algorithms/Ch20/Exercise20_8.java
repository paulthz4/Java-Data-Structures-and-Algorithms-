package Ch20;

/*
(Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a threedigit
number. The program prompts the user to enter a three-digit number and
determines whether the user wins according to the following rules:
1. If the user input matches the lottery number in the exact order, the award is
$10,000.
2. If all digits in the user input match all digits in the lottery number, the award is
$3,000.
3. If one digit in the user input matches a digit in the lottery number, the award is
$1,000.
*/
/*********************************************************************************
* (Game: lottery) Revise Programming Exercise 3.15 to add an additional $2,000   *
* award if two digits from the user input are in the lottery number. (Hint: Sort *
* the three digits in the lottery number and three digits in the user input into *
* two lists, and use the Collection’s containsAll method to check whether the    *
* two digits in the user input are in the lottery number                         *
*********************************************************************************/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise20_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		// Generate a random three-digit number and extract the numbers
		int lottery = (int) (Math.random() * 1000);
		int num1 = lottery / 100;
		int num2 = (lottery % 100) / 10;
		int num3 = lottery % 10;
		List<Integer> list = new ArrayList<>();
		list.add(num1);
		list.add(num2);
		list.add(num3);
		list.sort(null);
		System.out.println(lottery + " first:" + num1 + " second:" + num2 + " third: " + num3);
		System.out.println("Enter a 3 digit number:");
		Integer guess = input.nextInt();
		int first = guess / 100;
		int second = (guess % 100) / 10;
		int third = guess % 10;
		List<Integer> list2 = new ArrayList<>();
		list2.add(first);
		list2.add(second);
		list2.add(third);
		list2.sort(null);
		if (num1 == first && num2 == second && third == num3)
			System.out.println("all numbers match your reward is $10 000");
		else if ( (list.contains(first) && list.contains(second))  ||
				(list.contains(first) && list.contains(third)) ||
				(list.contains(third) && list.contains(second)))
			System.out.println("Your reward is $3000");
		else if(list.containsAll(list2))
			System.out.println("Reward is $2000. two digits from the user input are in the lottery number");
		else if (num1 == first || num2 == second || third == num3)
			System.out.println("Your reward is $1000");
		System.out.println("winning numbers are "+lottery);
		//System.out.println(list + "\n" + list2);
		System.out.println(list.containsAll(list2));

	}

}
