import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numList = {-6, -2, -4, 4, 2, -3, 1, 0, 3, 5, -5, 6, -1};
		
		System.out.println("Numbers Before Sorting");
		System.out.println();

		
		
        for(int number : numList ){
        	
        	System.out.print(number+" ");
        	
        }
        
        System.out.println();
        System.out.println();
		System.out.println("Numbers After Sorting");
		System.out.println();
		
		Arrays.sort(numList);
		
		for (int number : numList){
			
			
			System.out.print(number+" ");
		}
	}

}
