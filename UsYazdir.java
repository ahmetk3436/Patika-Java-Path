package manavKasaProgrami;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		  double i;
	       Scanner input = new Scanner(System.in);
	       i = input.nextDouble();
	       for (int j = 1; j < i; j++) {
			System.out.println(Math.pow(j,4.0) +  " " + Math.pow(j,5.0));
		}
	 
	    } 
	}

	
