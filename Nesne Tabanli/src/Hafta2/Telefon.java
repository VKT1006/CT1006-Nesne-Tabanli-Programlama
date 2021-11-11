package Hafta2;

/*
 * 	erişim_belirleyici   class    sınıf_ismi    extends    miras_alinan_siniflar
 *  implements    interfaceler
 * 	{
 * 
 * 		Sınıfın gövdesi
 * 
 * 	}
 *  
 */

public class Telefon {

	/*
	 * 	Alanlar - fields.
	 * 	Burada tanımladıklarımız sınıfımızın özellikleri oluyor. 
	 * 	Yani buraya yazdıklarımız oluşan objelerde bulunan özelliklerdir. 
	 * 
	 */
	private String uretici;
	private String model;
	private double fiyat;
	
	
	
	
	/*
	 * 	Yapıcı Method - constructor
	 * 	Yapıcı methodlar obje oluşurken ilk olarak çalışan methodtur.
	 * 	new Telefon(); --> bu kodda sona konulan parantezler constructor'u 
	 * 	çağırmamızı sağlar.
	 * 
	 * 
	 */
	
	
	/*
	 * 	
	 * 	başlangıç blokları
	 * 	Bir obje oluşmadan hemen önce çalışan kod parçası 
	 * 
	 */
	
	static {
		// class beleğe kaydedilirken bir defa çalışır
		System.out.println("Static olarak tanımlanan başlangıç bloğu!");
	}
	
	
	{
		// her obje oluşturulmadan önce çalışır
		System.out.println("non-static olarak tanımlanan başlangıç bloğu");
	}
	
	
	// parametre almayan bir constructor oluşturuyorum.
	public Telefon() {
		System.out.println("Parametresiz Constructor!");
	}

	// parametre alan bir constructor
	public Telefon(String uretici, String model, double fiyat) {
		System.out.println("Parametreli Constructor!");
		this.uretici = uretici;
		this.model = model;
		this.fiyat = fiyat;
	}
	
	
	
	
	
	
}
