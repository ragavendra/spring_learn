public class getClassName {
	public static void main(String args[]) {
		getClassName myClass = new getClassName();
		Class c = myClass.getClass();
		try {            
			System.out.println(c.getMethod("getNumber", null).toString());

			// method Integer
			Class[] cArg = new Class[1];
			cArg[0] = Integer.class;

			System.out.println(c.getDeclaredMethod("setNumber", cArg).toString());

		} catch (NoSuchMethodException | SecurityException e) {}
	}
	public Integer getNumber() {
		return 2;
	}
	public void setNumber(Integer n) {
	}
}
