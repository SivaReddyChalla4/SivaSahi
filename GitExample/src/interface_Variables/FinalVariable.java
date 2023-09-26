package interface_Variables;

interface Final {
	public final double PI = 3.14;// by default it will take abstract and final and public
	//// final keyword is used for the value which cant modified then we have to use
	//// this final
}

public class FinalVariable implements Final {

	public static void main(String[] args) {
		int radious = 2;
		double area = PI * radious * radious;
		System.out.println("area of circle: " + area);

	}

}
