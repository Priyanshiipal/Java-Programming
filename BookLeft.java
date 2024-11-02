import java.util.*;
public class BookLeft {

    public static int booksLeft(int[] chapters, int k) {
        int left = 0;
        int right = chapters.length - 1;
        int unreadCount = chapters.length;

        while (left <= right) {
            // Check leftmost book
            if (chapters[left] <= k) {
                left++;
            } else if (chapters[right] <= k) {
                // Check rightmost book if left is not readable
                right--;
            } else {
                // Both ends have unreadable books, decrement unread count
                unreadCount--;
            }
        }

        return unreadCount;
    }
    public static void main (String[]  args){
     Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] chapters = new int[n];
        for (int i = 0; i < n; i++) {
            chapters[i] = scanner.nextInt();
        }
        scanner.close();

        // Output
        System.out.println(booksLeft(chapters, k));
    }
}    