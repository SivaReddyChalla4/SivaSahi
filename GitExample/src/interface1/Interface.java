package interface1;



public class Interface  implements Webdriver,Chrome,Firefox {

	public static void main(String[] args) {
		Interface n=new Interface();
		n.openBrowser();
		n.closeBrowser();
		n.newTab();
		n.google();
		n.facebook();
		Webdriver.xyz();
		n.amazon();
		n.flipkart();
	}

	@Override
	public void openBrowser() {
System.out.println("open browser");		
	}

	@Override
	public void closeBrowser() {
		System.out.println("close browser");
	}

	@Override
	public void newTab() {
		System.out.println("new tab");		
	}

	@Override
	public void google() {
		System.out.println("google tab");		

	}

	@Override
	public void facebook() {
		System.out.println("Facebooktab");		
		
	}

	@Override
	public void flipkart() {
		System.out.println("Flipkart");		

	}

	@Override
	public void amazon() {
		System.out.println("Amazon");		
		
	}

}
