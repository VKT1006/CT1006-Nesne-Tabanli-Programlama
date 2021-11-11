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
		
		KayitServisi kayitServisi = new KayitServisi() {
			
			@Override
			public void mernisKontrol() {
				
				System.out.println("Kullanici MERNİS kontrolu yapıldı!");
				
			}
			
			@Override
			public void emailKontrol() {
				
				System.out.println("Kullanıcı Email kontrolu yapıldı!");
				
				
			}
		};
		
		
		kayitServisi.emailKontrol();
		System.out.println(" ");
		kayitServisi.mernisKontrol();
		
	}
	
	
}
