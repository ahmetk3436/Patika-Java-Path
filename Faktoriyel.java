package manavKasaProgrami;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n,r;
        int total =1;
        int total2 =1;
        int total3 =1;
        Scanner inp = new Scanner(System.in);
        System.out.println("1.sayiyi giriniz : ");
        n = inp.nextInt();

        for (int i=1;i<=n;i++){
            total *=i;

        }
        System.out.println(n+ ".faktoriyel : "+ total);

        Scanner inpt = new Scanner(System.in);
        System.out.println("2.sayiyi giriniz : ");
        r= inpt.nextInt();

        for (int k=1;k<=r;k++){
            total2 *= k;
        }

        System.out.println(r+". faktoriyel :"+total2);

        int s=n-r;

        for (int d=1;d<=s;d++){
            total3 *=d;
        }
        System.out.println("faktoriyel fark : "+total3);


        double sonuc=total/(total2*total3);
        System.out.println("Sonuc : " +sonuc);
	 
	    } 
	}

	
