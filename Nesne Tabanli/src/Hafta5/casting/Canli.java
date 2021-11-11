package Hafta5.casting;

public class Canli implements Icanli{
	
	private String isim;
	private int yas;
	
	public Canli() {
		
		
	}
	
	public Canli(String isim, int yas) {
		this.isim = isim;
		this.yas = yas;
	}

	@Override
	public void sesCikar() {
		
		System.out.println("canli ses cikariyor");
		
	}
	
	
	
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	
	
	
	

}
