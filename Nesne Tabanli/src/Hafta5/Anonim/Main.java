package Hafta5.Anonim;

public class Main {

	public static void main(String[] args) {
		
		
		
		/*
		 *  Anonom sınıf normalde sınıf oluşturulamayan abstract class veya
		 *  Interface'den tanımlandıkları satırda direkt olarak bir obje oluşturulması
		 *  
		 * 
		 * 
		 */
		
		KayitServisi kayitServis1 = new KayitServisi() {
			
			@Override
			public void mernisKontrol() {
				System.out.println("Kişi kontrol edildi!");
				
			}
			
			@Override
			public void emailKontrol() {
				System.out.println("Geçerli bir email adresi!");
				
			}
		}; 
		
		
		Deneme deneme = new Deneme() {
			
			@Override
			void deneme1() {
				System.out.println("Anonim sınıf abstract method!");
				
			}
		};
		
		
		deneme.deneme1();
		
		
		kayitServis1.mernisKontrol();
		kayitServis1.emailKontrol();
		
	}
	
	
}
