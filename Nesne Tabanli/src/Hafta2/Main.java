package Hafta2;

public class Main {
	
	public static void main(String[] args) {
		

		Telefon telefon1 = new Telefon();
		Telefon telefon2 = new Telefon();
		Telefon telefon3 = new Telefon();
		
		//telefon1.fiyat = -500;
		
		
		System.out.println(telefon1.getFiyat());
		
		telefon1.setFiyat(2500);
		
		System.out.println(telefon1.getFiyat());
		
		telefon1.uretici = "Xiaomi";
		
		System.out.println(telefon1.uretici);
		
		
	}

}
