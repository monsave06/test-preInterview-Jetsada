package No1;

import java.util.ArrayList;
import java.util.List;

public class OddEvenList {
	private ArrayList<Integer> ListResult= new ArrayList<Integer>() ;
	private ArrayList<Integer> odd= new ArrayList<Integer>() ;
	private ArrayList<Integer> even= new ArrayList<Integer>() ;
	private ArrayList<Integer> random= new ArrayList<Integer>() ;
	private int index ;
	private boolean Resultromove = false;
	
	public int add(int num) {
		 ListResult.add(num);
		 index =num ;
		return index ;
	}
	
	public boolean remove(int num) {
		if(Resultromove == false ) {
		for(int i=0;i <ListResult.size();i++) {
			if(ListResult.get(i)==num) {
				ListResult.remove(i);	
			}else {
				Resultromove = true ;	
			}
		}
		System.out.println(ListResult);
		}
		return Resultromove ;
	}
	
	public List<Integer> getOdd(){	
	  for(int i =0 ; i < ListResult.size();i++) {
		if(ListResult.get(i)%2 != 0) {
			odd.add(ListResult.get(i));
		  }
	   }
		return  odd;
	}
	
	public List<Integer> getEven(){
		for(int i =0 ; i < ListResult.size();i++) {
			if(ListResult.get(i)%2 == 0) {
				even.add(ListResult.get(i));
			}
		}
		return  even;
	}
	
	public List<Integer> getRandom(){
		for(int i =0 ; i < ListResult.size();i++) {
			if(ListResult.get(i)%2 == 0) {
				random.add(ListResult.get(i));
			}else {
				random.add(ListResult.get(i));
			}
		}
		return  random;
	}

}
