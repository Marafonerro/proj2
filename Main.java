/*Vladyslav Kozlov
CIS219-66W Tuesdays and Thursdays at 3:30pm
Final Project - Age Checker and Personalized Message
12/23/2021*/
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //The Scanner class is used to get user input
		System.out.println("Enter the year you were born:"); //asks for a year
		int y = scan.nextInt();
		System.out.println("Enter the month you were born:"); //asks for a month
		int m = scan.nextInt();
		System.out.println("Enter the day you were born:"); //asks for a day
		int d = scan.nextInt();
		
		LocalDate today = LocalDate.now(); ////gets localDate
		LocalDate birthDate = LocalDate.of(y, m, d); //generates a birthdate based on user input
		int years = Period.between(birthDate, today).getYears(); //utlizes the Period and LocalDate classes to determine the age of the user

		System.out.println("You\'re " + years + " years old"); //prints out how old is user
		
		switch (m) { //prints out a personalized sentence, based on their month of birth, birthstones
		case 1: 
			System.out.println("January\'s Birthstone - Garnet. The meaning of garnets - Protection.");
			break;
		case 2:
			System.out.println("February\'s Birthstone - Amethyst. The meaning of amethyst - Wisdom.");
			break; 
		case 3:
			System.out.println("March\'s Birthstone - Aquamarine. Aquamarine\'s meaning - Serenity.");
			break;
		case 4:
			System.out.println("April\'s Birthstone - Quartz. Quartz\'s meaning - Strength.");
			break;
		case 5:
			System.out.println("May\'s Birthstone - Emerald. Emerald\'s meaning - Hope.");
			break;
		case 6:
			System.out.println("June\'s Birthstone - Alexandrite. Alexandrite\'s meaning - Love.");
			break;
		case 7:
			System.out.println("July\'s Birthstone - Ruby. Ruby\'s meaning - Vitality.");
			break;
		case 8:
			System.out.println("August\'s Birthstone - Peridot. Peridot\'s meaning - Beauty.");
			break;
		case 9:
			System.out.println("September\'s Birthstone - Lapis Lazuli. Lapis Lazuli\'s meaning - Truth."); 
			break;
		case 10:
			System.out.println("October\'s Birthstone - Tourmaline or Opal. Tourmaline\'s meaning - Healing."); 
			break;
		case 11:
			System.out.println("November\'s Birthstone - Citrine. Citrine\'s meaning - Joy."); 
			break;
		case 12:
			System.out.println("December\'s Birthstone - Turquoise. Turquoise\'s meaning - Friendship."); 
			break;
	    }
	}
}