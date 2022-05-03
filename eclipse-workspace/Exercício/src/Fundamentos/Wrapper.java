package Fundamentos;


public class Wrapper {

	public static void main(String[] args) {

		// Byte

		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt("1000");// int
		Long l = 100000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println( l / 3);
		
		Float f = 123.333F;
		System.out.println(f);
		
		Double d = 1234.3333;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '%'; // Char
		System.out.println(c + "...");
		
	
	}
}