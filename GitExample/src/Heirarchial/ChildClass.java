package Heirarchial;


public class ChildClass extends ParentClass //ParentClass1
{
	public void hitman() {
		System.out.println("print Hitman");
	}
	public void rohit() {
		System.out.println("print Rohit45");
	}

	public static void main(String[] args) {
		ChildClass g=new ChildClass();
		g.hitman();
		g.rohit();
		//g.arjun();
		//g.royal();
		g.sahi();
		g.ramu();
}
}
