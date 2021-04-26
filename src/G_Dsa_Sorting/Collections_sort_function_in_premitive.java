package G_Dsa_Sorting;
import java.util.*;
public class Collections_sort_function_in_premitive {

	public static void main(String[] args) {
//		List<Integer> arr = new ArrayList<Integer>();
//		arr.add(10);
//		arr.add(50);
//		arr.add(70);
//		arr.add(20);
//		arr.add(30);
//		Collections.sort(arr);
//		System.out.println("The sorted array= "+arr);
//		Collections.sort(arr, Collections.reverseOrder());
//		System.out.println("The Reverse Array = "+arr);	
		
	System.out.println("---------------------------------------------------------------------");
	System.out.println();
	
	
		List<Point> list = new ArrayList<Point>();
		list.add(new Point(5,10));
		list.add(new Point(2,20));
		list.add(new Point(10,30));	
		list.add(new Point(5,50));
		Collections.sort(list);
		for(Point P : list) {
			System.out.println(P.x+" "+P.y);
		}
		
	System.out.println("-------------------------------------------------------------------------");
	System.out.println();
		
	ArrayList<Point2> list2 = new ArrayList<Point2>();
	list2.add(new Point2(5,10));
	list2.add(new Point2(2,20));
	list2.add(new Point2(10,30));	
	list2.add(new Point2(5,50));
	Collections.sort(list2, new MyComp());
	for(Point2 P : list2) {
		System.out.println(P.x+ " " +P.y);
	}
	
	
		
		
		}
}

