package manavKasaProgrami;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int temperature;
			Scanner scan = new Scanner(System.in);
			System.out.println("Hava sıcaklığını giriniz : ");
			temperature = scan.nextInt();
			 String suggestion = (temperature < 5) ? "You Can Ski."
		                : ((5 <= temperature && temperature < 15) ? "You can go to the cinema."
		                        : ((15 <= temperature && temperature <= 25) ? "You can go on a picnic."
		                                : "You can go swimming."));

		        System.out.println(suggestion);

		        scan.close();
	}
	}
