import java.util.*;

public class CharacterCount{

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String uni=new String("");
        int count=0;
        for(int i=0;i<str.length();i++){
            count=0;
            for(int j=0;j<=i;j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                uni+=str.charAt(i);
            }
        }
        for(int i=0;i<uni.length();i++){
            count=0;
            for(int j=0;j<str.length();j++){
                if(uni.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                System.out.print(uni.charAt(i));
            }else{
                System.out.print(uni.charAt(i)+ ""+ count);
            }
        }
    }
}