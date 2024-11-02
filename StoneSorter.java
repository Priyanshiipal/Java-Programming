import java.util.*;

public class StoneSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases
        
        while (T-- > 0) {
            int N = scanner.nextInt(); // Total number of stones
            int[] stones = new int[N];
            
            // Read the weights of stones
            for (int i = 0; i < N; i++) {
                stones[i] = scanner.nextInt();
            }
            
            // Split the array into two halves
            int mid = N / 2;
            int[] firstHalf = Arrays.copyOfRange(stones, 0, mid);
            int[] secondHalf = Arrays.copyOfRange(stones, mid, N);
            
            // Merge the sorted halves
            int i = 0, j = 0, k = 0;
            while (i < mid && j < N - mid) {
                if (firstHalf[i] < secondHalf[j]) {
                    stones[k++] = firstHalf[i++];
                } else {
                    stones[k++] = secondHalf[j++];
                }
            }
            while (i < mid) {
                stones[k++] = firstHalf[i++];
            }
            while (j < N - mid) {
                stones[k++] = secondHalf[j++];
            }
            
            // Print the sorted array
            for (int stone : stones) {
                System.out.print(stone + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
