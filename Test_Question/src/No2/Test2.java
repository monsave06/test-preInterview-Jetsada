package No2;

public class Test2 {
 private String charnumber; 
 private int  resultsum ,result ;
 private String  resultstr ="";
	
public int  SquareDigits(int number) {
	
	String num =Integer.toString(number);
	System.out.println(num);
	for(int a =0 ;a <num.length() ;a++) {
	  int sum = Integer.parseInt(num.substring(a,a+1));
	  resultsum =sum*sum ;
	  resultstr= resultsum+resultstr; 
	}
	result = Integer.parseInt(resultstr);
	return result;
	
}	
}
