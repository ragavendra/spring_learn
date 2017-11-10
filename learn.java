
interface MyInterface0 {
	public void Method1();
	public void Method2();
}

interface MyInterface1 {
	public void Method1();
}

interface MyInterface2 extends MyInterface1 {
	public void Method2();
}

class XYZ implements MyInterface2 {

	String color;
	int weight;
	String model;

	void drive_front() {
		System.out.println ("Car is driving front");
	}
	
	void drive_back() {
		System.out.println ("Car is driving front");
	}

	public void Method1() {
		System.out.println ("This is method 1");
	}
	
	public void Method2() {
		System.out.println ("This is method 2");
	}

	public static void main ( String args[] ) {
	
		MyInterface2 obj = new XYZ();
		obj.Method1();
		obj.Method2();

		XYZ car_obj = new XYZ();
		car_obj.drive_front();
	}

}
