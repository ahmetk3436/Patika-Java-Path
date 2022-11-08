package manavKasaProgrami;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number1,number2,select;
		System.out.println("İlk sayıyı giriniz : ");
		number1 = sc.nextInt();
		System.out.println("İkinci sayıyı giriniz : ");
		number2 = sc.nextInt();
		
		System.out.println("1-Toplama \n2-Çıkarma \n3-Çarpma\n4-Bölme \nYapacağınız işlemi seçiniz :  ");
		select = sc.nextInt();
		
		switch (select) {
		case 1: 
			System.out.println("Sonuç : " + (number1+number2));
			break;
		case 2: 
			System.out.println("Sonuç : " + (number1-number2));
			break;
		case 3: 
			System.out.println("Sonuç : " + (number1/number2));
			break;
		case 4: 
			System.out.println("Sonuç : " + (number1*number2));
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + select);
		}
}
		        } 
