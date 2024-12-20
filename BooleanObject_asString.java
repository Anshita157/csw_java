import java.util.*;
public class BooleanObject_asString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Boolean value in string format: ");
		String str=sc.next();
		try {
			Boolean obj=new Boolean(str);
			System.out.println(obj.booleanValue());
		}catch(NumberFormatException e) {
			System.out.println("Invalid Input");
		}

	}

}
