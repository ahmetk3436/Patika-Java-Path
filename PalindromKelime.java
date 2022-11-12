package manavKasaProgrami;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
    
public class Main {

    static boolean isPalindrome(String word){
        int first = 0;
        int last = word.length() - 1;

        while(first < last){
            if( word.charAt(first) != word.charAt(last) ){
                return false;
            }
            first++; last--;
        }
        return true;
    }
    
    static boolean isPalindrome2(String word){
        String reverse = "";
        for(int i=word.length()-1; i>=0; i--){
            reverse += word.charAt(i);
        }
        return word.equals(reverse);
    }
	public static void main(String[] args) {
		 System.out.println(isPalindrome("kayak"));
	        System.out.println(isPalindrome2("kayak"));
	    } 
	}

	
