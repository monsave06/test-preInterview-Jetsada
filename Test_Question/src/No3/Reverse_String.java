package No3;

public class Reverse_String {
	
	public String  ReverseString(String input) {
		String reversedStr = "";
		  String  nstr="" ,result="";
	        char ch;
	    	String str[] = input.split(" ");
	    	
		if(str.length >= 2) {		
			 for (int i = 0; i < str.length; i++) {
				 for (int j=0; j<str[i].length(); j++){
			        ch= str[i].charAt(j); 
			        nstr= ch+nstr; 
			      }
				 result = result+nstr+" ";
				 nstr ="";
			    }
		}else {
			for (int i=0; i<input.length(); i++)
		      {
		        ch= input.charAt(i); 
		        result= ch+result; 
		      
		      }	
		}
				
		return result;
}
 }
