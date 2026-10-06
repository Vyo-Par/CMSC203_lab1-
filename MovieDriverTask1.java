
import java.util.Scanner;



public class MovieDriverTask1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		Movie movie1 = new Movie();
		
		System.out.println("Enter the name of movie");
	
		String title = keyboard.nextLine();
		movie1.setTitle(title);
		
		System.out.println("Enter the rating of the movie");
		String rating = keyboard.nextLine();
		movie1.setRating(rating);
		
		System.out.println("Enter the number of tickets sold for this movie");
		int tickets = keyboard.nextInt();
		movie1.setSoldTickets(tickets);
		
		
	}

}
