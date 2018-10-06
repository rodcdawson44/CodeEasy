import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author RCDawson17
 *
 */
// hardest class ever made
public class NoIfSituation extends EasyCode {
private String comfortable;
private String competitor;
private String condition;
Holder hold;
// sets all the fields to something based off findings from Easy code class
public NoIfSituation(String str)  {
	String [] stuff= str.split(" ");
	hold = new Holder();
	if(hold.nums.isReturnType(stuff)>=0 && hold.looper.isLoops(stuff)>=0){
		comfortable=""+ findMethodHeader(str).substring(findMethodHeader(str).lastIndexOf(" "), findMethodHeader(str).indexOf(")"))+"[i]";
		competitor =""+ stuff[hold.nums.isReturnType(stuff)-1];
		//////////////////////what to do baout Condition
		condition =""+ getCondition(str);
	}
		
}
public String getComfortable(){
	if(comfortable== null)
		return "";
	else 
		return comfortable;
}
public String getCompetitor(){
	if(competitor==null)
		return "";
	else
		return competitor;
}
	/**
	 * @param 
	 */
// this determines what condition is based off words, it is used in another method. A helping method, not a getter
public String getCondition(String str){
	String atl ="";
	String [] stuff= str.split(" ");
	hold = new Holder();
	if(hold.nums.isReturnType(stuff)>=0){
		if(isGreater(str))
			atl=">";
		else if(isSmaller(str))
			atl = "<";
	}
	return atl;
}
// checks to see if condition isGreater
public boolean isGreater(String str){
	ArrayList<String> gr= new ArrayList();
	gr.add("max");
	gr.add("larger");
	gr.add("greatest");
	gr.add("minimum");
	gr.add("largest");
	String [] arr = str.split(" ");
	 for(int i=0; i<arr.length; i++){
		 for(int j=0; j<gr.size(); j++){
			 if(arr[i].equals(gr.get(j))){
					 return true;
			 }
		 }
	 }
	return false;
}
//checks to see if condition is smaller
public boolean isSmaller(String str){
	ArrayList<String> gr= new ArrayList();
	gr.add("min");
	gr.add("minimum");
	gr.add("least");
	gr.add("smaller");
	gr.add("smallest");
	String [] arr = str.split(" ");
	 for(int i=0; i<arr.length; i++){
		 for(int j=0; j<gr.size(); j++){
			 if(arr[i].equals(gr.get(j))){
					 return true;
			 }
		 }
	 }
	return false;
}
// checks to see if it condition is equal
public boolean isEquals(String str){
	ArrayList<String> gr= new ArrayList();
	gr.add("equals");
	gr.add("same");
	gr.add("exact");
	String [] arr = str.split(" ");
	 for(int i=0; i<arr.length; i++){
		 for(int j=0; j<gr.size(); j++){
			 if(arr[i].equals(gr.get(j))){
					 return true;
			 }
		 }
	 }
	return false;
}
// 
public String toString(){
	return "if("+comfortable+condition+competitor+"){" +"\n"+ competitor+"="+comfortable +";" +"\n"+ "}";
}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input= in.nextLine();
		NoIfSituation sis = new NoIfSituation(input);
		System.out.println(sis.getComfortable());
		System.out.println(sis.getCompetitor());
		System.out.println(sis.getCondition(input));
		System.out.println(sis);
	}

}
