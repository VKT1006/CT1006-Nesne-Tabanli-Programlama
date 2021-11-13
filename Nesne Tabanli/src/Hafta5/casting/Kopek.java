package Hafta5.casting;

public class Kopek extends Canli{

	
	private String cins;
	
	
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

	public Kopek(String isim, int yas, String cins) {
		super(isim, yas);
		this.cins = cins;
		// TODO Auto-generated constructor stub
	}

	public String getCins() {
		return cins;
	}

	public void setCins(String cins) {
		this.cins = cins;
	}
	
	

	
	
	
	
}
