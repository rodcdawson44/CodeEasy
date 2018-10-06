import java.util.Scanner;


/**
 * 
 */
/** HOnor Pledge: All work here is honestly obtained and is my own. RC  Dawson
* @author RCDawson17
*9/10/15
*Assignment: Independent Study project 
*Attribution:  Mr Yoder, Joey, Matt
*	
*The purpose of this code is to take in text and create code based off of that text.
*
*/ // I am not aware of one error which is that this does not correctly determine the parameters for methodheader, but it is not completely finished. This outline of code would work for simple code that consisted of one for loop, and if statement, and a list 
// of some sort.

public class EasyCode extends Holder {
	int tracker=0;
	String className;
	Holder decipher;
	String [] rtrnType; // would be to keep track of the methods
	// empty constructor
	public EasyCode(){
		decipher = new Holder();
		rtrnType= new String [10];
		for(int i=0; i<rtrnType.length; i++){
			rtrnType[i]="";
		}
	}
	// based off input this method should return the method header of the code
	public String findMethodHeader(String input){
		int spot=0;
		String str ="";
		str= input;
		String [] stuff= str.split(" ");
		
//		for(int i=0; i<stuff.length; i++)
//			System.out.println(stuff[i]);
		if(decipher.nums.isReturnType(stuff)>0){// this set of if statements is to deturn the return type.
			str= "public int";
			spot =decipher.nums.isReturnType(stuff);// the spot of the word which determines the return type
			rtrnType[tracker]=stuff[spot];
		
		}
		String methodName= " ";
		String cap= ""+ rtrnType[tracker].substring(0,1).toUpperCase();// from the return type we get the name
		String name=""+cap+ rtrnType[tracker].substring(1);
		methodName+=stuff[spot-1]+name;
		String parameter= "(int [] arr)";// this is because we dont have something that parses a dataset
		return str + " "+ methodName +parameter +"{"+"\n";
		
	}
	// determines the methodBody
	public String methodBody(String input){
		NoIfSituation sis2= new NoIfSituation(input);
String str ="" ;
		int spot=0;
		String str1 ="";
		String var="";
		str1= input;
		String [] stuff= str1.split(" ");// for the variable in the method body
		if(decipher.nums.isReturnType(stuff)>0){
			str= "int ";
			spot =decipher.nums.isReturnType(stuff);
			rtrnType[tracker]=stuff[spot];
			str+= stuff[spot-1]+ "=0";
			var=stuff[spot-1];// this is the variable
		
		}
		// for for loops
		if(decipher.looper.isLoops(stuff)>0){
			spot=decipher.looper.isLoops(stuff);
			ForLoops nice = new ForLoops();
			str+= "\n" +nice.toString()+"\n"+sis2.toString()+"\n"+"return "+ var+";"+ "\n"+"}"; // adds the for loop to the string and the iff statement. It is the explicit version
																										// still needs more work to determine when to use if statemetns
		}
	return str;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input= in.nextLine();
		EasyCode sis = new EasyCode();

	
	String str= sis.methodBody(input);// day 5 major problem on method body
	String str1= sis.findMethodHeader(input);
		System.out.println(str1+str);// this is hthe method we maked printed out to screen.
		
	
	}

} 
