package manavKasaProgrami;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);

	        System.out.print("Doğum Yılınızı Giriniz : ");
	        int year = input.nextInt();
	        year %= 12;
	        
	        switch (year) {
			case 0:
				System.out.println("Çin zodyağı borcunuz : Maymun");
				break;
			case 1:
				System.out.println("Çin zodyağı borcunuz : Horoz");
				break;
			case 2:
				System.out.println("Çin zodyağı borcunuz : Köpek");
				break;
			case 3:
				System.out.println("Çin zodyağı borcunuz : Domuz");
				break;
			case 4:
				System.out.println("Çin zodyağı borcunuz : Fare");
				break;
			case 5:
				System.out.println("Çin zodyağı borcunuz : Öküz");
				break;
			case 6:
				System.out.println("Çin zodyağı borcunuz : Kaplan");
				break;
			case 7:
				System.out.println("Çin zodyağı borcunuz : Tavşan");
				break;
			case 8:
				System.out.println("Çin zodyağı borcunuz : Ejderha");
				break;
			case 9:
				System.out.println("Çin zodyağı borcunuz : Yılan");
				break;
			case 10:
				System.out.println("Çin zodyağı borcunuz : At");
				break;
			case 11:
				System.out.println("Çin zodyağı borcunuz : Koyun");
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + year);
			}

	      
	}
}
	
