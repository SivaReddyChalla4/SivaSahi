package access_modifiers;

public class Modifiers {

	int num = 10;

	private void meth1() {// with in the class we can access this method anywhere
		System.out.println("private method");
	}

	public void meth2() {// it can access anywhere exp:- Inside class, inside package and outside package  out side project also we can access
		System.out.println(num);
		meth1();
	}

	void meth4() {
		System.out.println("default method");// it can access that with in the class and with in the package
		
	}

	protected void meth3() {
		System.out.println("protected method");// it can be access in Classs and (whith in package and outside the package  by using child child class you can access this )

	}

}