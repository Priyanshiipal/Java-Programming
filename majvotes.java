import java.util.Scanner;

public class majvotes {

    // Function to find the winner using a brute-force algorithm
    static int findWinner(int[] votes) {
        int majorityThreshold = votes.length / 2;

        // Iterate through each candidate
        for (int candidate : votes) {
            int count = 0;

            // Count the number of votes for the current candidate
            for (int vote : votes) {
                if (vote == candidate) {
                    count++;
                }
            }

            // Check if the current candidate has more than half of the total votes
            if (count > majorityThreshold) {
                return candidate;
            }
        }

        // If no candidate has more than half of the votes, return -1
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of test cases
        int T = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Iterate through each test case
        for (int t = 0; t < T; t++) {
            // Input number of votes and the votes
            int N = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            int[] votes = new int[N];
            for (int i = 0; i < N; i++) {
                votes[i] = scanner.nextInt();
            }

            // Find and print the winner
            int winner = findWinner(votes);
            System.out.println(winner);
        }

        scanner.close();
    }
}
