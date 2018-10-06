import java.util.ArrayList;

public class VoidType implements ReturnType{
	String search;
	ArrayList<String> searcher; 
	public VoidType(){
		searcher= new ArrayList<String>();
		searcher.add("find");
		searcher.add("search");
		searcher.add("traverse");
		searcher.add("go through ");
		
	}
	
	public int isReturnType(String[] arr){
		 for(int i=0; i<arr.length; i++){
			 for(int j=0; j<searcher.size(); j++){
				 if(arr[i].equals(searcher.get(j))){
						 return i;
				 }
			 }
		 }
	 
	 return -1;
	 }



}
