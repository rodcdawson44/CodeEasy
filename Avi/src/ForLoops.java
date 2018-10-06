/**
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author RCDawson17
 *
 */
// iteration class is a loop, so it can use the list to determine whether for loops need ot be used.
public class ForLoops extends Loops {
	private String var;
	private String condition;
	private int start;
	private int stop;
	private String increment;
	// constructs a loop based on the input given by user. Default
		public ForLoops(){
			var ="";
			condition ="";
			increment ="";
			System.out.println("Starting point of List is 1 not 0)");
			System.out.println("Enter starting point");
			Scanner input= new Scanner(System.in);
			start =input.nextInt()-1;
			
			System.out.println("enter length");
//			Scanner input2 = new Scanner(System.in);
			stop=input.nextInt();
			var="i="+start;
			condition = "" +var.substring(0,1)+"<"+stop +";";
			increment ="" +var.substring(0,1) +"++";
		}
		public ForLoops(String var1, String condition1){

        }
		public String toString(){
			return "for(int" +var+ " "+ condition+ increment+"){";
		}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ForLoops nice =new ForLoops();
		System.out.println(nice.toString()) ;

	}

}
