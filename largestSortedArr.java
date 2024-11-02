/*import java.util.*;
  import java.io.*;
  
  public class largestSortedArr{
    public static boolean checksort(int n, int[] a){
      for(int i=0;i<n-1;i++){
        if(a[i]>a[i-1]){
            return false;
        }
        
    }
    return true;
  }  
    public static int largestSortedArray{

    }
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc =new Scanner(System.in);
      int T=sc.nextInt();
      for(int t=0;t<t;t++){
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
        }
        int res=
      }
    }
  }*/

  import java.util.*;

public class largestSortedArr{

    public static int findLargestSortedArray(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return n;
        }

        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = nums[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = nums[i];
        }

        int leftSize = findLargestSortedArray(left);
        int rightSize = findLargestSortedArray(right);

        if (isSorted(left) && isSorted(right)) {
            return n;
        }

        if (isSorted(left)) {
            return leftSize + rightSize;
        }

        if (isSorted(right)) {
            return leftSize + rightSize;
        }

        if (isSorted(swap(left))) {
            return leftSize + findLargestSortedArray(swap(left));
        }

        return Math.max(leftSize, rightSize);
    }

    public static boolean isSorted(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static int[] swap(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for (int i = 0; i < n / 2; i++) {
            result[i] = nums[n / 2 + i];
            result[n / 2 + i] = nums[i];
        }
        return result;
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

            int largestSorted = findLargestSortedArray(nums);
            System.out.println(largestSorted);
        }

        scanner.close();
    }
}