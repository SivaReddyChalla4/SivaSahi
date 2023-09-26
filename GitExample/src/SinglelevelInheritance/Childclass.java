package SinglelevelInheritance;



public class Childclass extends ParentClass {
	public void arjun() {
		System.out.println("prrint Arjun");
	
	}
	public void royal() {
		System.out.println("print Royal");
	}
	public static void main(String[] args) {
		Childclass c=new Childclass();
		c.arjun();
		c.royal();
		c.sahi();
		c.ramu();
	}
}
