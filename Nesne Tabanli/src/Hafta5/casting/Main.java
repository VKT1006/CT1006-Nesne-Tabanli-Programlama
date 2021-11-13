package Hafta5.casting;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * 	Upcasting yani üst sınıfın referansına alt sınıfın objesini atadım
		 * 
		 * 
		 */
		
		Canli canli1 = new Kedi("Boncuk",3,"Mavi");
		Canli canli2 = new Kopek("Karabaş",6,"Pitbull");
		
		
		
		
		
		/*sesCikartmaFonk(canli1);
		
		System.out.println(" ");
		
		sesCikartmaFonk(canli2);
		*/
	}
	
	public static void sesCikartmaFonk(Canli canli) {
		/*
		 * 	Bunlar çalışmaz çünkü casting işlemi yapılmadı!
		 * canli.kopeklikYap();
		 * canli.dkdilikYap();
		 * 
		*/
		
		
		if(canli instanceof Kopek) {
			/*
			 *  Downcasting
			 * 
			 */
			Kopek kopek = (Kopek)canli;
			kopek.getCins();
			kopek.sesCikar();
			
		}
		else if(canli instanceof Kedi) {
			
			/*
			 * 
			 *  Downcasting
			 * 
			 */
			
			Kedi kedi = (Kedi)canli;
			kedi.getGozRenk();
			kedi.sesCikar();
			
		}
		else {
			System.out.println("Yanlış Tür Yolladınız!");
		}
		
	}
	
	
}
