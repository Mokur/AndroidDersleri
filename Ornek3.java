import java.util.Scanner;

public class Ornek3 {
	
	static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sc = new Scanner(System.in);
		
		System.out.println("Ad�n�z� giriniz: ");
		String ad = sc.next();
		
		System.out.println("Soyad�n�z� giriniz: ");
		String soyad = sc.next();
		
		System.out.println("Ad ve Soyad�n�z: " +ad +" " +soyad);
	}

}
