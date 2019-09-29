import java.util.Scanner;

public class Ornek3 {
	
	static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sc = new Scanner(System.in);
		
		System.out.println("Adýnýzý giriniz: ");
		String ad = sc.next();
		
		System.out.println("Soyadýnýzý giriniz: ");
		String soyad = sc.next();
		
		System.out.println("Ad ve Soyadýnýz: " +ad +" " +soyad);
	}

}
