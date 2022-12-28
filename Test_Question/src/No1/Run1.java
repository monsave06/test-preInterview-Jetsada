package No1;

import java.util.List;

public class Run1 {

	private static OddEvenList test =new OddEvenList();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// add Number 
		int number = 0;
		List<Integer> ListOod ;
		List<Integer> ListEven ;
		List<Integer> ListRundom ;
		number =test.add(2);
		number =test.add(8);
		number =test.add(9);
		number =test.add(22);
		number =test.add(15);
		number =test.add(4);
		
		// Remove Number
		boolean resultRemove  ;
		resultRemove = test.remove(2);
		if(resultRemove == true) {
			System.out.println("Remove Number succuss !!");
		}
		
		// Odd Number
		ListOod  =test.getOdd();
		System.out.println("Get Odd :: "+ListOod);
		
		// even Number
		ListEven = test.getEven();
		System.out.println("Get Even :: "+ListEven);
		
		// even Number
		ListRundom = test.getRandom();
		System.out.println("Get Even :: "+ListRundom);
	}

}
