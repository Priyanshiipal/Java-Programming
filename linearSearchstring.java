// WAP to linear search in menu of an restraunt

import java.util.*;

public class linearSearchstring{
    public static int linearSearch(String menu[], String key){
        for(int i=0; i<menu.length; i++){
            if (menu[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main (String args[] )
    {
    String[] menu={ "dosa","samosa","kachori","noodles","pasta","momos","maggie" };
    String key="noodles";

    int index = linearSearch(menu, key);
    if (index==-1){
        System.out.println("The item is not in the menu");
    }

    else{
        System.out.println("The item is at position "+index+" of the menu");
    }
    }

    
    }

