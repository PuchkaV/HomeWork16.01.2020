package Task2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Rectangle rectangle1 = new Rectangle();
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter the length of the rectangle: ");
	if(sc.hasNextInt() || sc.hasNextDouble()){
		rectangle1.setSide1(sc.nextDouble());
	}
	else{
		System.out.println("Only numbers can be entered!");
		return;
	}

	System.out.println("Enter the width of the rectangle: ");
	if (sc.hasNextInt() || sc.hasNextDouble()){
		rectangle1.setSide2(sc.nextDouble());
	}
	else{
		System.out.println("Only numbers can be entered!");
		return;
	}
	System.out.println("The area of the rectangle is: " + rectangle1.areaCalculator(rectangle1.getSide1(), rectangle1.getSide2()));
    System.out.println("Периметр прямокутника складає: " + rectangle1.perimeterCalculator(rectangle1.getSide1(), rectangle1.getSide2()));

    }
}
