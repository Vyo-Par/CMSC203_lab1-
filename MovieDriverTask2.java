
import java.util.Scanner;



public class MovieDriverTask2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String answer;
		
		do {

			Movie movie1 = new Movie();

			System.out.println("Enter the name of a movie");
			String title = keyboard.nextLine();
			movie1.setTitle(title);

			System.out.println("Enter the rating of the movie");
			String rating = keyboard.nextLine();
			movie1.setRating(rating);

			System.out.println("Enter the number of tickets sold for this movie");
			int tickets = keyboard.nextInt();
			movie1.setSoldTickets(tickets);

			System.out.println(movie1);

			keyboard.nextLine();

			System.out.println("Do you want to enter another movie? (y/n)");
			answer = keyboard.nextLine();

		} while (answer.equalsIgnoreCase("y"));
		
		
	}

}
