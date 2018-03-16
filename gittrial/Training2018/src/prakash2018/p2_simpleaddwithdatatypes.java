package prakash2018;

public class p2_simpleaddwithdatatypes {

	
	static double  x=0;
	public static void main(String[] args) {
	
		int a=10;
		float b= 20.5f;
	//	float b= 20.5; error
		
		System.out.println(a+b);
		
		int c= (int)b;
		
		System.out.println(a+c);
		
	//	int d= a+b+c; error
		
		double d= a+b+c+x;
		
		System.out.println(d);
	}

}
