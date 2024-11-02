import java.util.*;

public class LastRemainingNumber {
    
    public static int findLastRemainingNumber(int[] nums) {
        int n = nums.length;
        if (n % 2 == 1) {
            Arrays.sort(nums);
            return nums[n / 2];
        } else {
            return Math.max(nums[0], nums[n - 1]);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases
        
        while (T-- > 0) {
            int N = scanner.nextInt(); // Size of the array
            int[] nums = new int[N];
            
            // Read the elements of the array
            for (int i = 0; i < N; i++) {
                nums[i] = scanner.nextInt();
            }
            
            int lastRemaining = findLastRemainingNumber(nums);
            System.out.println(lastRemaining);
        }
        
        scanner.close();
    }
}
