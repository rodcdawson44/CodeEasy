import java.util.ArrayList;
// THis class is a list of keywords that allow easycode to recognize a number and 
// gives the method header the return type of int
public class Number implements ReturnType {
 ArrayList<String> nums; 
String number;
 // whenever number is created, these words are added.
 public Number(){
	 nums=new ArrayList<String>();
	 nums.add("value");
	 nums.add("number");
	 nums.add("values");
	 nums.add("numbers");


	
 }
 // checks the array for keywords
 public int isReturnType(String[] arr){
	 for(int i=0; i<arr.length; i++){
		 for(int j=0; j<nums.size(); j++){
			 if(arr[i].equals(nums.get(j)))
					 return i;
		 }
	 }
 
 return -1;
 }




}

