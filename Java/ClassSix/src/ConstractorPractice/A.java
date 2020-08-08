package ConstractorPractice;

public class A extends B {

	public static void main(String[] args) {
		
		//B obj = new B();
		A obj = new A();
		obj.myMethod();
	}
	A(){
		System.out.println("constractorA");	
		}
	void myMethod() {
		System.out.println("Method A");
	}

}
