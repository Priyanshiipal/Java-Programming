import java.util.*;

public class hashing{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        string s=sc.nextLine();
        //int n=s.length();


       //pre compute
        int hash[26]={0};
        for(int i=0; i<s.size;i++){
            hash[s[i]-'a']++;
        }

        int q=sc.nextInt();
        while(q--){
            char c=sc.next().charAt(0);
            //fetch
            System.out.println(hash[c-'a']);
        }




        
    }
}