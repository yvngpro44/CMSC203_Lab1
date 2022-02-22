	/*
	 * Class: CMSC203 	
	 * Instructor:Grinberg
	 * Description: dispaly movie ratings and info
	 * Due: 2/21/2022
	 * Platform/compiler: Eclipse
	 * I pledge that I have completed the programming assignment independently.
	   I have not copied the code from a student or any source.
	   I have not given my code to any student.
	   Print your Name here: Elvis Gomez
	 */
	import java.util.Scanner;
public class MovieDriver_task2 {
		public static void main(String [] args) {
			Scanner sc = new Scanner(System.in);
			Movie movie = new Movie();
			char ans = ' ';
			do {
				System.out.println("Enter the name of the movie");
				movie.setTitle(sc.nextLine());
				
				System.out.println("Enter the rating of the movie");
				movie.setRating(sc.nextLine());
				
				System.out.println("Enter the number of tickets sold for this movie");
				movie.setSoldTickets(sc.nextInt());
				
				System.out.println(movie.toString());
				
				do {
					System.out.println("Do you wanter to enter another? (y or n)");
					ans = sc.next().charAt(0);
					
					
				}while (ans != 'y' && ans!='n');	
			
			}while(ans =='y');
				System.out.println("Goodbye!");
			
			
		
	}
	}

