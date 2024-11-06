import java.util.Scanner;

public class CustomerSurvey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Declare necessary variables (e.g., to hold rating counts, total number of ratings, sum, etc.)
        // TODO: Declare a flag for detecting if any 5-star rating was entered

        System.out.println("Welcome to Customer Survey! Enter ratings from 1 to 5 (enter -1 to stop):");

        // Sentinel-Controlled Loop to collect customer ratings
        while (true) {
            // TODO: Prompt user to enter a rating
            // TODO: Read the rating input

            // TODO: Check if the sentinel value (-1) was entered, and break if true

            // TODO: Validate that the rating is between 1 and 5
            // If invalid, display an error message and continue to the next iteration

            // TODO: Process valid rating: 
            // - Update counters for each rating
            // - Add rating to the total for average calculation
            // - If rating is 5, set the flag to indicate a 5-star rating was received
        }

        // Summary Report
        System.out.println("\nSummary Report:");
        
        // TODO: Display the total number of ratings

        // TODO: Calculate and display the average rating, if any ratings were entered

        // TODO: Display the count for each rating (1-star to 5-star) without using arrays

        scanner.close(); // Close the scanner
    }
}
