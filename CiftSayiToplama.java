package manavKasaProgrami;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);

        int k, total = 0, number = 0, result;


        System.out.print("Sayi : ");
        k = src.nextInt();


        // 3 VE 4 E TAM BOLUNEN SAYILARI BULMA
        for (int i = 0; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
                total += i;
                number++;
            }
        }
    
        result = total / (number - 1);
        System.out.println("Sonuc : " + result);

	      
	}
}
	
