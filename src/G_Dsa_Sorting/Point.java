package G_Dsa_Sorting;
public class Point implements Comparable<Point> {
	int x; int y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	@Override
	public int compareTo(Point P) {
		return this.x - P.x;
	}
}


