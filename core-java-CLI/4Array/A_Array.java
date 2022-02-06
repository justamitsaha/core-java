public class A_Array {
    	public static void main(String[] args) {
		String[] strings = { "stringValue" };
		Object[] objects = strings;
		String[] againStrings = (String[]) objects;
		//againStrings[0] =new StringBuilder(); // DOES NOT COMPILE
		objects[0] = new StringBuilder(); // careful!
	}
}