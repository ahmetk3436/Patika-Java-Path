package manavKasaProgrami;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		  int i,total=0;
	        try (Scanner input = new Scanner(System.in)) {
				do {
				       System.out.print("Sayı giriniz:");
				       i= input.nextInt();
				   }while (i%2==0);
			}
	       for (int j = 0; j <= i; j++) {
	    	   if(j % 2==0 || j%4==0) {
	               total+=j;
	           }
		}
	        System.out.println("Girilen çift ve dördün katları olan sayıların toplamı: "+total);
	    }

	      
	}

	
