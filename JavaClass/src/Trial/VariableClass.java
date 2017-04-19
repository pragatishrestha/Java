package Trial;

public class VariableClass {
	
	private static final boolean True = false;

	public static void main (String [] args) {
	
		int a = 2;
		int b = 3;
		String h = "50";
		String hi = "hi";
		//char ch = 'mom';
		boolean t = True;
		short s = 12;
		long l = 2141242;
		float f = 20.03f;
		double d = 20.09809808;
		byte bt = 44;
		//char sp = '';
		
		System.out.println(Integer.toString(a) + b + Integer.valueOf(h) + hi + String.valueOf(t) + s + l + f + d + bt);
		
		int ab = 999_09_9999;
		long lb = 999_09_9999L;
		float tb = 90.9999f;
		short sb = 5____2;
		int ib = 0x52;
		
		System.out.println (ab);
		System.out.println (lb);
		System.out.println (tb);
		System.out.println (sb);
		System.out.println (ib);


				
	}

}
