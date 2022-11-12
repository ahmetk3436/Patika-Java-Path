package manavKasaProgrami;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		  int number,i,pow;

	        Scanner input = new Scanner(System.in);

	        System.out.println("Sayıyı giriniz: ");
	        number= input.nextInt();
	        for(i=0;i<=number;i++){
	            if(i==number){
	               pow = number*i ;
	                System.out.println("Üslü ifade: "+pow);
	            }
	        }
	 
	    } 
	}

	
