package No4;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
	private String[] str = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t"
			,"u","v","w","x","y","z"};
	private int sum ,max ,index;
	private List<Integer> Resultsum =new ArrayList<>();
	private String Resultstr = "";
	
	public String calculater(String strinput) {
		String Liststr[] = strinput.split(" ");
		if(Liststr.length >= 2) {
			for(int i =0 ;i< Liststr.length ;i++) {
				
				for(int j =0;j <Liststr[i].length();j++) {
					String st =Liststr[i].substring(j,j+1);
					for(int a =0 ; a < str.length;a++) {
						if(str[a].equals(st.toLowerCase())) {
							sum =sum+(a+1);
						}
					}
				} 
				System.out.println("ผลรวม = "+sum);
				Resultsum.add(sum);
				sum=0 ; 
			}
			for(int m=0 ;m<Resultsum.size();m++){
				if(Resultsum.get(m) > max) {
					max = Resultsum.get(m) ;
					index =m ;
				}	
			}
			Resultstr =Liststr[index];
		}else {
			for(int j =0;j <strinput.length();j++) {
				String st =strinput.substring(j,j+1);
				for(int a =0 ; a < str.length;a++) {
					if(str[a].equals(st.toLowerCase())) {
						sum =sum+(a+1);
					}
				}
			}
			System.out.println("ผลรวม = "+sum);
			Resultsum.add(sum);
			sum=0 ;
			for(int m=0 ;m<Resultsum.size();m++){
					if(Resultsum.get(m) > max) {
						max = Resultsum.get(m) ;
						index =m ;
					}	
				}
				Resultstr =Liststr[index];
		}
		return Resultstr;
	}

}
