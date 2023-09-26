package MultilvelInheritance;



public class GrandchildClass extends Childclass{
	public void hitman() {
		System.out.println("print Hitman");
	}
	public void rohit() {
		System.out.println("print Rohit45");
	}

	public static void main(String[] args) {
		GrandchildClass g=new GrandchildClass();
		g.hitman();
		g.rohit();
		g.arjun();
		g.royal();
		g.sahi();
		g.ramu();
	}

}
