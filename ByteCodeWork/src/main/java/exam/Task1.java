package exam;
import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter no of rows in theatre = ");
		        int rows = sc.nextInt();

		        boolean seats[][] = new boolean[rows][];

		        for (int i = 0; i < rows; i++) {
		            System.out.print("No of seats in row " + (i + 1) + " = ");
		            int cols = sc.nextInt();
		            seats[i] = new boolean[cols];
		        }

		        int choice;
		        do {
		            System.out.println("===== Theatre Booking Menu =====");
		            System.out.println("1. Display Seat Status");
		            System.out.println("2. Book a Seat");
		            System.out.println("3. Check Seat Status");
		            System.out.println("4. Cancel a Booking");
		            System.out.println("5. Exit");
		            System.out.print("Enter your choice: ");
		            choice = sc.nextInt();

		            switch (choice) {
		                case 1:
		                    System.out.println("\nCurrent Seat Status (true = Booked, false = Available):");
		                    for (int i = 0; i < rows; i++) {
		                        System.out.print("Row " + (i + 1) + ": ");
		                        for (int j = 0; j < seats[i].length; j++) {
		                            System.out.print(seats[i][j] + " ");
		                        }
		                        System.out.println();
		                    }
		                    break;

		                case 2:
		                    System.out.print("Enter row number to book: ");
		                    int rowno = sc.nextInt() - 1;
		                    System.out.print("Enter seat number to book: ");
		                    int seatno = sc.nextInt() - 1;
		                    if (rowno >= 0 && rowno < rows && seatno >= 0 && seatno < seats[rowno].length) {
		                        if (!seats[rowno][seatno]) {
		                            seats[rowno][seatno] = true;
		                            System.out.println("Seat booked successfully!");
		                        } else {
		                            System.out.println("Seat already booked!");
		                        }
		                    } else {
		                        System.out.println("Invalid seat number!");
		                    }
		                    break;

		                case 3:
		                    System.out.print("Enter row number to check: ");
		                    int checkrow = sc.nextInt() - 1;
		                    System.out.print("Enter seat number to check: ");
		                    int checkseat = sc.nextInt() - 1;
		                    if (checkrow >= 0 && checkrow < rows && checkseat >= 0 && checkseat < seats[checkrow].length) {
		                        if (seats[checkrow][checkseat]) {
		                            System.out.println("Seat is BOOKED.");
		                        } else {
		                            System.out.println("Seat is AVAILABLE.");
		                        }
		                    } else {
		                        System.out.println("Invalid seat number!");
		                    }
		                    break;

		                case 4:
		                    System.out.print("Enter row number to cancel: ");
		                    int cancellrow = sc.nextInt() - 1;
		                    System.out.print("Enter seat number to cancel: ");
		                    int cancellseat = sc.nextInt() - 1;
		                    if (cancellrow >= 0 && cancellrow < rows && cancellseat >= 0 && cancellseat < seats[cancellrow].length) {
		                        if (seats[cancellrow][cancellseat]) {
		                            seats[cancellrow][cancellseat] = false;
		                            System.out.println("Booking cancelled successfully!");
		                        } else {
		                            System.out.println("Seat is not booked!");
		                        }
		                    } else {
		                        System.out.println("Invalid seat number!");
		                    }
		                    break;

		                case 5:
		                    System.out.println("Exit");
		                    break;

		                default:
		                    System.out.println("Invalid choice. Please try again!");
		            }
		        } while (choice != 5);
		        sc.close();
		    }
		
		
		
	}

