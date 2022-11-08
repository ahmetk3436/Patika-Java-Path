package manavKasaProgrami;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String userName,password;
		int select;
		System.out.println("Kullanıcı adınız : ");
		userName= sc.nextLine();
		System.out.println("Şifreniz : ");
		password= sc.nextLine();
		
		if(userName.equals("patika") && password.equals("java123"))
		{
			System.out.println("Giriş yapıldı ");
		} else {
			System.out.println("Bilgileriniz yanlış !");
		}
		System.out.println("Bilgilerinizi sıfırlamak ister misiniz ? : ");
		System.out.println("0-Evet \n 1-Hayır");
		select = sc.nextInt();
		switch (select) {
		case 0: {
			System.out.println("Yeni şifreinizi giriniz : ");
			if(password.equals(sc.nextLine()))
			{
				System.out.println("Şifre oluşturulamadı , eski şifreyle aynı !");
			} else {
				System.out.println("Şifre oluşturuldu !");
			}
		}
		break;
		case 1: {
			System.out.println("Sistem kapatıldı !");
		}
		break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + select);
		}
		
}
		        } 
