package Hafta5.casting;

public class Kedi extends Canli{

	@Override
	public void sesCikar() {
		System.out.println(super.getIsim() + " miyavliyor");
	}

	
	public void kedilikYap() {
		
		System.out.println("Kedilik Yapiliyor...");
		
	}
	
	
	public Kedi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Kedi(String isim, int yas) {
		super(isim, yas);
		// TODO Auto-generated constructor stub
	}

	
	
	
	
}
