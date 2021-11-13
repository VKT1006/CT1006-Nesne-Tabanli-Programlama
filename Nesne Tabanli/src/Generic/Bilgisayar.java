package Generic;

public class Bilgisayar<K> {

	private K k;
	
	public Bilgisayar(K obje) {
		this.k = obje;
	}
	
	public K getK() {
		return this.k;
	}
}
