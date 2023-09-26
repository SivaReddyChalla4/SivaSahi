package abstraction;

import interface1.Webdriver;

public abstract class ParentClass implements Webdriver {
	//1 an abstract method and class should contain abstract keyword
	//2  abstract method  should contain semicolon
	// 3 abstarct method never contains any method body but in normal method we can write the body 
	// 4 in abstract class we can't create object for class but we can inherit that abstract class by using extends keyword
	// 5 it is a partial abstraction
	// 6 if at least one method is an abstract method then class is also abstract class
	// 7 in abstarct class we can write normal(non static) methods and static methods from java 1.8 version but in normal class we can't create/write  abstract methods
		public void ram() {
			System.out.println("print name as Ram");
		}
		public static void sahi() {
			System.out.println("print name as Sahi");
		}
		public abstract void king();
		public abstract void hitman();
}
