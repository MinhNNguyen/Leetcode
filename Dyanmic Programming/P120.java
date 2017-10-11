import java.util.ArrayList;
import java.util.List;


public class P120 {
	public static int minimumTotal(List<List<Integer>> triangle) {
	    int[] A = new int[triangle.size()+1];
	    for(int i=triangle.size()-1;i>=0;i--){
	        for(int j=0;j<triangle.get(i).size();j++){
	            A[j] = Math.min(A[j],A[j+1])+triangle.get(i).get(j);
	            
	            System.out.println("Meet " + triangle.get(i).get(j) + " set " + A[j]);
	        }
	    }
	    return A[0];
	}
	
	public static void main(String[] args) {
		List<Integer> first = new ArrayList<Integer>();
		List<Integer> second = new ArrayList<Integer>();
		List<Integer> third = new ArrayList<Integer>();
		first.add(10);
		second.add(20);
		second.add(10);
		third.add(4);
		third.add(5);
		third.add(7);
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		list.add(first);
		list.add(second);
		list.add(third);
		
		System.out.println(minimumTotal(list));
		
	}
}
