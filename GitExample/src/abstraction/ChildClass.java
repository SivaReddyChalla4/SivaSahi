package abstraction;

public class ChildClass extends ParentClass {
	public static void main(String args[]) {
		ChildClass r = new ChildClass();
		r.ram();
		ParentClass.sahi();
		r.king();
		r.hitman();
		r.newTab();
		r.openBrowser();
		r.closeBrowser();

	}

	@Override
	public void king() {
		System.out.println("print name is King");

	}

	@Override
	public void hitman() {
		System.out.println("print name is Hitman");
	}

	@Override
	public void openBrowser() {
		System.out.println("open browser");

	}

	@Override
	public void closeBrowser() {
		System.out.println("Close browser");

	}

	@Override
	public void newTab() {
		System.out.println("new Tab");

	}

}
