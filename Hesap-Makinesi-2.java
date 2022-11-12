package manavKasaProgrami;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("1.sayı : ");
        int number1= scan.nextInt();
        System.out.print("2.sayı : ");
        int number2= scan.nextInt();

        System.out.println("-----\nİŞLEM SEÇİN\n" +
                "1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n-----");
        int input=scan.nextInt();

        switch (input){
            case 1:
                System.out.println(number1+"+"+number2+" : "+(number1+number2));
                break;
            case 2:
                System.out.println(number1+"-"+number2+" : "+(number1-number2));
                break;
            case 3:
                System.out.println(number1+"x"+number2+" : "+(number1*number2));
                break;
            case 4:
                if(number1==0||number2==0){
                    System.out.println("sayı sıfıra bölünemez");
                }
                else if (number2>number1){
                    System.out.println(number2+"/"+number1+" : "+(number2/number1));
                }
                else System.out.println(number1+"/"+number2+" : "+(number1/number2));
                break;
            default:
                System.out.println("geçersiz işlem girdiniz");
                break;
        }
	 
	    } 
	}

	
