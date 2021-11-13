package Interface;

public interface IKayit {

	default void emailKontrol() {
		
		System.out.println("Email kontrol ediliyor...");
		
	}
	
	void kimlikKontrol();
	
	void yasKontrol();
	
		
	
}
