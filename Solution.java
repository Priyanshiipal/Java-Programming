import java.util.*;
public class Solution {
    public static int solution(char ch){
        if(Character.isUpperCase(ch))
        return 1;

        else if(Character.isLowerCase(ch))
        return -1;

        else
        return 0;
    }
    public static void main(String[] args) {
        // Write your code her.  
        Scanner sc = new Scanner (System.in);
        char inputChar = sc.next().charAt(0);

         System.out.println(solution(inputChar));
        sc.close();

    }
}