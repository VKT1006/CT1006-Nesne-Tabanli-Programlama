package Hafta5.casting;

public class Kopek extends Canli{

	@Override
	public void sesCikar() {
		System.out.println(super.getIsim() +  " havliyor");
	}

	public void kopeklikYap() {
		System.out.println("Kopeklik Yapiliyor.");
	}
	
	
	public Kopek() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Kopek(String isim, int yas) {
		super(isim, yas);
		// TODO Auto-generated constructor stub
	}

	
	
	
	
}