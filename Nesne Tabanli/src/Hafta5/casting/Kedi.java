package Hafta5.casting;

public class Kedi extends Canli{

	private String gozRenk;
	
	
	
	
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

	public Kedi(String isim, int yas, String gozRenk) {
		super(isim, yas);
		this.gozRenk = gozRenk;
		// TODO Auto-generated constructor stub
	}


	public String getGozRenk() {
		return gozRenk;
	}


	public void setGozRenk(String gozRenk) {
		this.gozRenk = gozRenk;
	}

	
	
	
	
}
