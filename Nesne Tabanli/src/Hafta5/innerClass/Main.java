package Hafta5.innerClass;

public class Main {

	public static void main(String[] args) {
		
		// static olmayan bir inner class'i tanımlama şekli
		
		InnerClass.Kitap kitap = new InnerClass().new Kitap("Hüseyin Nihal ATSIZ", "Ruh Adam");
		
		System.out.println(kitap.toString());
		
		
		// static olan bir inner class tanımlama
		
		
		StaticInnerClass.Kitap kitap1 = new StaticInnerClass.Kitap("", "");
		
		System.out.println(kitap1.toString());
		
		
	}
	
	
}
