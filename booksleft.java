import java.util.Scanner;

public class booksleft {

    public static int remainingBooks(int N, int K, int[] chapters) {
        int left = 0;
        int right = N - 1;
        int bookcnt=N;
        while (left <= right) {
            if (chapters[left] <= K) {
                left++;
            } else if (chapters[right] <= K) {
                right--;
            } else {
                bookcnt--;
            }
        }
        return bookcnt;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] chapters = new int[N];
        for (int i = 0; i < N; i++) {
            chapters[i] = scanner.nextInt();
        }
        scanner.close();

        // Output
        System.out.println(remainingBooks(N, K, chapters));
    }
}
