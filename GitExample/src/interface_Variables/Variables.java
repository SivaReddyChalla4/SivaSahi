package interface_Variables;
 abstract class Anotherabstractcls {
	 abstract void run();
	 
	 protected static String color="red";
	 
	 public static int numb=1637;
	  
	 
	 protected static void num() {                  
		 System.out.println("it is 10");
		
		 }
	 private void sweets() {
		 System.out.println("its amazing sweets");// it wont accept private class if we want to call we have to add this method inside public method then only it will call
	 }
	 public void masalaTea() {
		 System.out.println("its amazing tea" );
		 sweets();
	 }
	 
	   
	 }

public class Variables extends Anotherabstractcls  {

	public static void main(String[] args) {
		Variables v=new Variables();
		v.num();
		v.run();
		v.masalaTea();
		System.out.println(v.color);
		System.out.println(v.numb);
		//System.out.println(c.Sweets());
	}

	@Override
	void run() {
		System.out.println("it is running");
		

	}

}
