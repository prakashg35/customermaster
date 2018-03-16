package prakash2018;

public class p3_uniaryoperators {
	
	static int a=10, b=10, e=200;

	public static void main(String[] args) {
		
		
		boolean c= true, d=false;
		
		System.out.println("Uniary Operations");
		System.out.println(a++);//10 (11)  
		System.out.println(++a);//12  
		System.out.println(b--);//12 (11)  
		System.out.println(--b);//10  
		System.out.println(~a);//-11 (minus of total positive value which starts from 0)  
		System.out.println(~b);//9 (positive of total minus, positive starts from 0)  
	//	System.out.println(!a);//false (opposite of boolean value) -- not defined 
	//	System.out.println(!b);//true  -- not defined
		
		System.out.println("boolean Operations");	
		System.out.println(!c);//false (opposite of boolean value) 
		System.out.println(!d);//true
		
		System.out.println("arithmetic Operations");
		
		System.out.println(a+b);  
		System.out.println(a-b);  
		System.out.println(a*b);  
		System.out.println(a/b);  
		System.out.println(a%b);  
		
		System.out.println("OR and AND Operations");
		
		System.out.println(a<b||a<e);//false && true = false  
		System.out.println(a<b&&a<e);//false & true = false  
		
		System.out.println("Assignement operator");
		a+=3; 
		System.out.println(a);  
		a-=4;
		System.out.println(a);  
		a*=2;
		System.out.println(a);  
		a/=2; 
		System.out.println(a);  
	}

}
