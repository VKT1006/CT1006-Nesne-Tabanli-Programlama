package Hafta5.innerClass;

public class InnerClass {

	private String ustDegisken;
	
	
	// Static olmayan bir iç sınıf!
	class Kitap{
		
		private String yazar;
		private String isim;
		
		public Kitap(String yazar, String isim) {
		
			this.isim = isim;
			this.yazar = yazar;
			
		}
		
		public void degiskenBastir() {
			System.out.println("Üst sınıfın değişkeni: " + InnerClass.this.ustDegisken);
			// veya
			System.out.println("Üst sınıfın değişkeni: " + ustDegisken);
		}
		

		@Override
		public String toString() {
			return "Kitap [yazar=" + yazar + ", isim=" + isim + "]";
		}
		
		
				
	}
	
	
	
	
}
