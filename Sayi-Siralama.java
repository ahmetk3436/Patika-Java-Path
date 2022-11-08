package manavKasaProgrami;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 int number1,number2,number3;
	        Scanner scr = new Scanner(System.in);

	        System.out.println("1. Sayı : ");
	        number1 = scr.nextInt();

	        System.out.println("2. Sayı : ");
	        number2 = scr.nextInt();

	        System.out.println("3. Sayı : ");
	        number3 = scr.nextInt();

	        if ((number1 > number2) && (number1 > number3)){
	            if (number2 > number3){
	                System.out.println("a > b > c");
	            }
	            else{
	                System.out.println("a > c > b");
	            }
	        } else if ((number2 > number1) && (number2 > number3)) {
	            if (number1 > number3){
	                System.out.println("b > a > c");
	            }
	            else {
	                System.out.println("b > c > a");
	            }
	        }
	        else {
	            if (number1 > number2){
	                System.out.println("c > a > b");
	            }
	            else {
	                System.out.println("c > b > a");
	            }
	        }
	}
	}
