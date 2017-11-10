import java.util.*;

class DataStruc {

	public String var_passed;
	public DataStruc( String variable ) {
		String var_passed = variable;
	}

	public static void main (String args[]) {
		ArrayList<String> cars = new ArrayList<String>();
		//cars = ["Volkswagen", "Mercedes", "Porsche"];
		cars.add("Volkswagen");
		cars.add("Mercedes");
		cars.add("Porsche");

		for (String car: cars) {

			System.out.println("Car name is " + car);
		}
	}
}
