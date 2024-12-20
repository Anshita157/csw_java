import java.util.*;
public class DoubleObject_asString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Double value in string format: ");
		String str=sc.next();
		try {
			Double obj=new Double(str);
			System.out.println(obj.doubleValue());
		}catch(NumberFormatException e) {
			System.out.println("Invalid Input");
		}

	}

}
