package come.test;

public class Operators {
	public static void main(String ar[]) {
	// TODO Auto-generated method stub
			//ternary operators
			boolean a = true ;
			boolean b = true ;
			System.out.println(a&&b);
			System.out.println(a||b);
			System.out.println(!a);
			//Relational Operators
			System.out.println(a==b);
		// conditional Operators	
		int x=10;
		int y= 20;
		int z =3;
		if (x>z && x>y) {
			System.out.println("x is the biggest among other"+x);
		}
		else if(y>z && y>x) {
			System.out.println("y is the biggest among other"+y);
		}
		else {
			System.out.println("z is the biggest among other"+z);
		}
		//ternary operators
		String c = x>y?"a is big":"b is big";
		System.out.println(c);
		int d = (x>z && x>y)?x:((y>z && y>x)?y:z);
		System.out.println(d);
		//switch
		switch(x) {
		
		case 3:System.out.println("2st case");
				break;
		case(5+5):System.out.println("1st case");
					break;
		case 5:System.out.println("2st case");
				break;
		default : System.out.println("this is default");
		
		
		
		}
		

}
}
