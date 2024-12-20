import java.util.*;
public class FloatObject_asString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Float value in string format: ");
		String str=sc.next();
		try {
			Float obj=new Float(str);
			System.out.println(obj.floatValue());
		}catch(NumberFormatException e) {
			System.out.println("Invalid Input");
		}
	

	}

}
