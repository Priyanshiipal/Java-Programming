import java.util.Scanner;

public class CountOccurrences {
    // Function to count occurrences of x in array A
    public static int countOccurrences(char[] A, char x) {
        int count = 0;
        for (char c : A) {
            if (c == x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of test cases
        int T = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Iterate through each test case
        for (int t = 0; t < T; t++) {
            // Input length of the array and the array itself
            int N = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            char[] A = scanner.nextLine().replaceAll("\\s", "").toCharArray();

            // Input the character to search for
            char x = scanner.next().charAt(0);

            // Count occurrences of x in array A
            int occurrences = countOccurrences(A, x);

            // Output the count of occurrences
            System.out.println(occurrences);
        }
        scanner.close();
    }
}
