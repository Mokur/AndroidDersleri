import java.util.Scanner;

public class Ornek5 {

	static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sc = new Scanner(System.in);
		System.out.println("Ad�n�z:");
		String yazi1 = sc.next();
		
		System.out.println("Soyad�n�z:");
		String yazi2 = sc.next();
		
		//+ �ncesi ve sonras� string ise string elde edilir.
		System.out.println(yazi1+yazi2);
		
		String sinif= "Bili�im Okulu Derslik No:";
		int no= 9;
		
		String sinifNo= sinif+no;
		System.out.println(sinifNo);
		//+ �ncesi ya da sonras� hehrhangi biri string di�eri string olmayan bir veri tipi
		//ise yeni bir string elde edilir
		
		int sayi1 = 10;
		int sayi2 = 90;
		
		System.out.println(sayi1+sayi2);
		//+ �ncesi ve sonras� numerik de�er ise toplama i�lemi yap�l�r.
		
	}

}
