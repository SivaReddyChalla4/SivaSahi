package interface_Variables;

interface interface_Variables1 {
	int Limit = 100;
	String name = "Siva";

	public void sleeping();

	default void bite() {
		System.out.println("bite in interface");
	}

	// protected void sit();
//	private static void sat() {
//		System.out.println("i am reddy");
//	}
	static void sun() {
		System.out.println("this  Leo");
	}
// it is not allowing 
}

public class Sampleclass implements interface_Variables1 {

	public static void main(String[] args) {
		Sampleclass s = new Sampleclass();
		s.sleeping();
		s.bite();
		interface_Variables1.sun();
		// s.sun(); // Doubt why it is not taking with object reference name
		System.out.println("the limit is :" + Limit);
		System.out.println("the name is :" + name);

	}

	@Override
	public void sleeping() {
		System.out.println("Sleeping mode on");
	}
}
