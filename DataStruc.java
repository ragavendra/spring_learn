import java.util.*;

class Sample {

	public String args;

	public Sample( String arg_passed ) {
		args = arg_passed;
	}

	void hash_func (){
		HashMap<String, Integer> car_weight = new HashMap<String, Integer>();

		car_weight.put("Volkswagen", 1820);
		car_weight.put("Porsche", 1759);
		car_weight.put("Honda", 1893);
		System.out.println("Total car types are " + car_weight.size());
		
		for (String car_name : car_weight.keySet())
			System.out.println("Car " + car_name + " weighs " + car_weight.get(car_name) + " lbs");
	}
}


class DataStruc {

	public String var_passed;
	public DataStruc( String variable ) {
		var_passed = variable;
	}

	void hash_func (){
		HashMap<String, Integer> car_weight = new HashMap<String, Integer>();

		car_weight.put("Volkswagen", 1820);
		car_weight.put("Porsche", 1759);
		car_weight.put("Honda", 1893);
		System.out.println("Total car types are " + car_weight.size());
		
		for (String car_name : car_weight.keySet())
			System.out.println("Car " + car_name + " weighs " + car_weight.get(car_name) + " lbs");
	}

	public static void main (String args[]) {
		ArrayList<String> cars = new ArrayList<String>();
		//cars = ["Volkswagen", "Mercedes", "Porsche"];
		cars.add("Volkswagen");
		cars.add("Mercedes");
		cars.add("Porsche");

		System.out.println("Total car types are " + cars.size());

		for (String car: cars) 
			System.out.println("Car name is " + car);

		DataStruc sample = new DataStruc("money");
		sample.hash_func();
		System.out.println("The variable passed is " + sample.var_passed);

		Sample var = new Sample("test");
		System.out.println("The variable passed is " + var.args);
		var.hash_func();
	}
}

