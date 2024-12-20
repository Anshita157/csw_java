import java.util.*;
public class IntegerObject_asString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Integer value in string format: ");
		String str=sc.next();
		try {
			Integer obj=new Integer(str);
			System.out.println(obj.intValue());
		}catch(NumberFormatException e) {
			System.out.println("Invalid Input");
		}
	

	}

}
