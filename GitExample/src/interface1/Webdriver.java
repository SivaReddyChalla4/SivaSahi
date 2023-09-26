package interface1;

public interface Webdriver {

	public  void openBrowser();
	public static void xyz() {
		System.out.println("xyz");
	}
	public void closeBrowser();
	public   void newTab();
	}
	//1 an interface is a keyword in java 
	//2 it is similiar to class but it is not a class its starts with interface
	//3 interface can have methods and variables
	//4 upto java 1.7 version on wards an interface contains only abstract methods by default
	//5 all the methods defined inside an interface is by default public & abstract
	//6 all the variables defined inside an interface is by default public ,static&final.
	//7 in order to implement the interface java software people provided a keyword called "implements"
	//8 all the abstract methods defined inside an interface must be overridden in the sub class otherwise sub class will also abstarct class.once a class is abstract we can't create object for that class
	//9 we cant create object for interface why because by default it will support abstract methods.so we cant create obect
