package Loops;

public class UseForLoop {
	int a, b, c;
	 int d;
	 
	
	
	public static void main(String[] args) {
		
		addationofthreeNumber(200,300,400);
		addationofthreeNumber(200,300,400);
		
		Maths(100,200,300"add");
		Maths(100,200,300"sub");
		Maths(100,200,300"mul");

	}
private static void Maths(int a, int b, int c) {
		
		
	}
public static void addationofthreeNumber(int a, int b, int c){
	d=a+b+c;
	
	System.out.println("addationofthreeNumber is:"+d);
}
public void Maths(int a, int b, int c, String String){
	if (String.equals("add")){
		d=a+b+c;
		System.out.println("MathsofthreeNumberadd is:"+d);
	}else if(String.equals("sub")){
		d=a-b-c;
		System.out.println("MathsofofthreeNumbersub is:"+d);
		
	}else if(String.equals("mul")){
		d=a*b*c;
		System.out.println("MathsofofthreeNumbersub is:"+d);
		
		
	}
}
}
