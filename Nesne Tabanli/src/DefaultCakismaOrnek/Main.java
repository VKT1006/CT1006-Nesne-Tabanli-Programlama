package DefaultCakismaOrnek;

interface Animal {
default public String identifyMyself() {
return "I am an animal.";
}
}
interface EggLayer extends Animal {
default public String identifyMyself() {
return "I am able to lay eggs.";
}
}
interface FireBreather extends Animal { }


class Dragon implements FireBreather {
	
	
}



public class Main {
	
	public static void main (String... args) {
		Dragon myApp = new Dragon();
		System.out.println(myApp.identifyMyself());
	}
}
