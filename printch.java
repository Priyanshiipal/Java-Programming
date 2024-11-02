/*
Print character
You are given a character 
c
h
. You have to print the character 
c
h
 same as it is.

Note:- Character 
c
h
 will contain only lowercase English letters.

Input Format
The first line of input contains a character 
c
h
.

Output Format
Print the character 
c
h
 same as it is.

Constraints
a
<=
c
h
<=
z

Time Limit
 0.5 second

Example
Sample Input
a

Sample Output
a
*/

import java.util.*;
  import java.io.*;
  
  public class printch {
    public static void main(String args[])  {
      
      Scanner sc = new Scanner(System.in);
      char a;
      a=sc.next().charAt(0);
      System.out.println(" "+a);
      
    }
  }