package manavKasaProgrami;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		static float matematik,fizik,kimya,türkce,tarih,müzik;
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Matematik notunu giriniz : ");
			if(scan.nextFloat() >= 0 && scan.nextFloat() <= 100)
			matematik = scan.nextFloat();
			
			System.out.println("Fizik notunu giriniz : ");
			if(scan.nextFloat() >= 0 && scan.nextFloat() <= 100)
			fizik = scan.nextFloat();
			
			System.out.println("Kimya notunu giriniz : ");
			if(scan.nextFloat() >= 0 && scan.nextFloat() <= 100)
			kimya = scan.nextFloat();
			
			System.out.println("Türkçe notunu giriniz : ");
			if(scan.nextFloat() >= 0 && scan.nextFloat() <= 100)
			türkce = scan.nextFloat();
			
			System.out.println("Tarih notunu giriniz : ");
			if(scan.nextFloat() >= 0 && scan.nextFloat() <= 100)
			tarih = scan.nextFloat();
			
			System.out.println("Müzik notunu giriniz : ");
			if(scan.nextFloat() >= 0 && scan.nextFloat() <= 100)
			müzik = scan.nextFloat();
			scan.close();
			
			int sonuc = (int)(matematik + fizik + kimya + türkce + tarih + müzik) / 6;
			System.out.println(sonuc ==  55 ? "Sınıfı geçti" : "Sınıfta kaldı");}
		        } 
