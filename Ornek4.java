import java.util.Scanner;

public class Ornek4 {
 
	
	static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sc = new Scanner(System.in);
		
		System.out.println("Ýlk sayýyý giriniz: ");
		int sayi = sc.nextInt();
		
		System.out.println("Ýkinci sayýyý giriniz: ");
		int sayi2 = sc.nextInt();
		
		int toplam = sayi + sayi2;
		int cikarma = sayi - sayi2;
		int carpma = sayi * sayi2;
		int bolme = sayi / sayi2;
		int mod = sayi % sayi2;
		
		System.out.println("Ýþlemi seçiniz(+ - * / %): ");
		String islem = sc.next();
		
		switch(islem) {
			case"+":
			
				System.out.println("Ýki sayýnýn toplamý: " + toplam);
				break;
				
			case"-":
				System.out.println("Ýki sayýnýn farký: " +cikarma);
				break;
				
			case"*":
				System.out.println("Ýki sayýnýn çarpýmý: " +carpma);
				break;
				
			case"/":
				System.out.println("Ýki sayýnýn bölümü: " +bolme);
				break;
				
			case"&":
				System.out.println("Ýki sayýnýn modu: " +mod);
			}

		
	}

}
