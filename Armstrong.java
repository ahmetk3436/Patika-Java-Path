package manavKasaProgrami;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		  int number;
	        Scanner input = new Scanner(System.in);
	        System.out.print("Sayı giriniz:");
	        number= input.nextInt();
	        int headNumber=0,tenpNumber=number;
	        int headValue;
	        int result=0;
	        while (tenpNumber!=0){
	            tenpNumber/=10;
	            headNumber++;
	        }
	        tenpNumber=number;
	        while (tenpNumber!=0){
	            headValue=tenpNumber%10;
	            tenpNumber/=10;
	            result+=headValue;

	        }
	        System.out.print("Basamak sayıları toplamı: "+result);
	 
	    } 
	}

	
