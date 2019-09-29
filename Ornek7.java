import java.util.Scanner;

public class Ornek7 {

	static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sc = new Scanner(System.in);
		System.out.println("Bir renk giriniz:");
		String renk1 = sc.next();
		
		System.out.println("Ýkinci rengi giriniz: ");
		String renk2 = sc.next();
		
		System.out.println("renk 1: " +renk1);
		System.out.println("renk 2: " +renk2);
		
		String bos = "";
		
		bos = renk1;
		
		renk1 = renk2;
		
		renk2 = bos;
		
		System.out.println("yeni renk 1: " +renk1);
		System.out.println("yeni renk 2: " +renk2);
		
		
	}

}
