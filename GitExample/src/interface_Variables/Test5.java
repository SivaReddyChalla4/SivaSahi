package interface_Variables;

interface A{  
void a();//by default, public and abstract  
void b();  
void c();  
void d();  
}  
  
//Creating abstract class that provides the implementation of one method of A interface  
abstract class B implements A{  
public void c()// it will be useful for partial Abstraction and we acn add more methods in abstraction it can be any type method
{
	System.out.println("I am C");
}  
}  
  
//Creating subclass of abstract class
class M extends B{  // full abstraction
public void a(){System.out.println("I am a");}  
public void b(){System.out.println("I am b");}  
public void d(){System.out.println("I am d");}  
}  
  
//Creating a test class that calls the methods of A interface  
class Test5{  
public static void main(String args[]){  
M a=new M();  
a.a();  
a.b();  
a.c();  
a.d();  
}}
