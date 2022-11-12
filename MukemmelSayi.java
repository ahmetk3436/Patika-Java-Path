package manavKasaProgrami;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		  Scanner scan =new Scanner(System.in);
	        System.out.println("lütfen sayı giriniz.");
	        int number= scan.nextInt();
	        int total=0;
	        for (int i=1; i<number; i++){
	            if (number%i==0){
	                total=total+i;
	            }
	        }if (total==number){
	            System.out.println(total+"mükemmel sayidir");
	        }else {
	            System.out.println("bölenler toplamı "+total+" dır ve mükemmel değildir.");
	        }
	    } 
	}

	
