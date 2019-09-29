import java.util.Scanner;

public class Ornek5 {

	static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sc = new Scanner(System.in);
		System.out.println("Adýnýz:");
		String yazi1 = sc.next();
		
		System.out.println("Soyadýnýz:");
		String yazi2 = sc.next();
		
		//+ öncesi ve sonrasý string ise string elde edilir.
		System.out.println(yazi1+yazi2);
		
		String sinif= "Biliþim Okulu Derslik No:";
		int no= 9;
		
		String sinifNo= sinif+no;
		System.out.println(sinifNo);
		//+ öncesi ya da sonrasý hehrhangi biri string diðeri string olmayan bir veri tipi
		//ise yeni bir string elde edilir
		
		int sayi1 = 10;
		int sayi2 = 90;
		
		System.out.println(sayi1+sayi2);
		//+ öncesi ve sonrasý numerik deðer ise toplama iþlemi yapýlýr.
		
	}

}
