import java.util.Scanner;

public class CustomerSurvey {
public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        //Declare necessary variables (e.g., to hold rating counts, total number of ratings, sum, etc.)
        int rating = 0; 
        int totalRatings = 0; 
        int sumRatings = 0; 
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;

        //Declare a flag for detecting if any 5-star rating was entered
        boolean excellentRatingReceived = false;
        System.out.println("Welcome to Customer Survey! Enter ratings from 1 to 5 (enter -1 to stop):");

        //Sentinel-Controlled Loop to collect customer ratings
        while (true) {
            //Prompt user to enter a rating
            System.out.println("Enter customer ratings (1-5). Enter -1 to stop:");

            //Read the rating input
            rating = scanner.nextInt(); 

            //Check if the sentinel value (-1) was entered, and break if true            
            //Validate that the rating is between 1 and 5
            //If invalid, display an error message and continue to the next iteration
            if (rating == -1) {
                break;
            } else if (rating < 1 || rating > 5) { 
                System.out.println("Invalid rating. Please enter a number between 1 and 5."); 
            } else {
                //Process valid rating: 
                //- Update counters for each rating
                //- Add rating to the total for average calculation
                //- If rating is 5, set the flag to indicate a 5-star rating was received
                totalRatings++; 
                sumRatings += rating; 
                if (rating == 1) {
                    count1++; 
                } else if (rating == 2) {
                    count2++; 
                } else if (rating == 3) {
                    count3++; 
                } else if (rating == 4) {
                    count4++; 
                } else if (rating == 5) { 
                    count5++; 
                    excellentRatingReceived = true;

                }
                System.out.println();
            }
        
        if (excellentRatingReceived) {
            System.out.println("Excellent rating received!");
        }


        }

        //Summary Report
        //Display the total number of ratings
        //Calculate and display the average rating, if any ratings were entered
        //Display the count for each rating (1-star to 5-star)
        System.out.println("\nSummary Report:"); 
        System.out.println("Total number of ratings: " + totalRatings); 
        if (totalRatings > 0) { 
            double averageRating = (double) sumRatings / totalRatings; 
            System.out.println("Average rating: " + averageRating); 
        } else { 
            System.out.println("Average rating: N/A"); 
        } 
        // Count of each rating 
        System.out.println("1-star ratings: " + count1); 
        System.out.println("2-star ratings: " + count2); 
        System.out.println("3-star ratings: " + count3); 
        System.out.println("4-star ratings: " + count4); 
        System.out.println("5-star ratings: " + count5);
        scanner.close(); // Close the scanner
    }
}
