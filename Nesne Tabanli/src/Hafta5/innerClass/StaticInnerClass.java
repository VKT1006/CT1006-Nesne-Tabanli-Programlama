package Hafta5.innerClass;

public class StaticInnerClass {

	private static String ustDegisken;
	
	static class Kitap{
		
		private String yazar;
		private String isim;
		
		public Kitap(String yazar, String isim) {
		
			this.isim = isim;
			this.yazar = yazar;
			
		}
		
		public void degiskenBastir() {
			System.out.println("Üst sınıfın değişkeni: " + ustDegisken);
		}
		

		@Override
		public String toString() {
			return "Kitap [yazar=" + yazar + ", isim=" + isim + "]";
		}
		
		
				
	}
	
	
	
}
