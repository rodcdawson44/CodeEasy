import java.util.ArrayList;

/**
 * 
 */

/**
 * @author RCDawson17
 *
 */
public class Loops {
	protected ArrayList<String> loopy = new ArrayList<String>();
	/**
	 * @param args
	 * 
	 */
	public Loops(){
		loopy.add("find");
		loopy.add("while");
		loopy.add("search");
		loopy.add("traverse");
	}
	
	public int isLoops(String [] arr){
		for(int i=0; i<arr.length; i++){
			 for(int j=0; j<loopy.size(); j++){
				 if(arr[i].equals(loopy.get(j)))
						 return i;
			 }
		 }	
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
