import java.util.Scanner;

public class Ornek4 {
 
	
	static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sc = new Scanner(System.in);
		
		System.out.println("�lk say�y� giriniz: ");
		int sayi = sc.nextInt();
		
		System.out.println("�kinci say�y� giriniz: ");
		int sayi2 = sc.nextInt();
		
		int toplam = sayi + sayi2;
		int cikarma = sayi - sayi2;
		int carpma = sayi * sayi2;
		int bolme = sayi / sayi2;
		int mod = sayi % sayi2;
		
		System.out.println("��lemi se�iniz(+ - * / %): ");
		String islem = sc.next();
		
		switch(islem) {
			case"+":
			
				System.out.println("�ki say�n�n toplam�: " + toplam);
				break;
				
			case"-":
				System.out.println("�ki say�n�n fark�: " +cikarma);
				break;
				
			case"*":
				System.out.println("�ki say�n�n �arp�m�: " +carpma);
				break;
				
			case"/":
				System.out.println("�ki say�n�n b�l�m�: " +bolme);
				break;
				
			case"&":
				System.out.println("�ki say�n�n modu: " +mod);
			}

		
	}

}
