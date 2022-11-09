package manavKasaProgrami;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);

	        System.out.print("Yılı Giriniz : ");
	        int year = input.nextInt();
	        if(year %4 == 0)
	        {
	        	System.out.println(year  + " Bir artık yıldır !!!");
	        } else if(year %400 == 0){
	        	System.out.println(year  + " Bir artık yıldır !!!");
	        } else {
	        	System.out.println(year  + " Bir artık yıl değildir !!!");
	        }

	      
	}
}
	
