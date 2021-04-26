package G_Dsa_Sorting;
import java.util.*;

public class Point2 {
	int x; int y;
	Point2(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class MyComp implements Comparator<Point2>{

	@Override
	public int compare(Point2 P1, Point2 P2) {
		return P1.x - P2.x;
	}
	
}

