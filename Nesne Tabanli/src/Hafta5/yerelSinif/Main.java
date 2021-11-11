package Hafta5.yerelSinif;

public class Main {

	public static String sinifOlusturanMethod() {
		
		/*
		 * 	Bir fonksiyon içerisinde tanımlanmış method
		 * 
		 * 
		 */
		
		class Ogrenci{
			
			private int id;
			private String isim;
			
			public Ogrenci(int id, String isim) {
				this.id = id;
				this.isim = isim;
			}
			
			public String getIsim() {
				return this.isim;
			}
			
			
		}
		
		
		return new Ogrenci(1, "Veysel").getIsim();
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(sinifOlusturanMethod());
		
		
		
	}
	
}
