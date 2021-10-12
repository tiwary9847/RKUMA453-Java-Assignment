class Point2D {
	
	int x,y;

	//Parameterized constructor section
	
	public Point2D (int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String getDetails()
	{
		int x = getX();
		int y = getY();
		return "point ("+x+", "+y+")";
	}
	
	//@override
	public int hashCode() {
		return Objects.hash(x,y);
	}
	//isEqual() 
	public boolean isEquals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point2D other = (Point2D) obj;
		return x == other.x && y == other.y;
	}
	
	//getter and setter section
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public static void main(String[] args) {
		
		Point2D p1 = new Point2D(2,3);
		Point2D p2 = new Point2D(2,3);
	
	//out put section
	System.out.println(p1.getDetails());
	System.out.println(p1.isEquals(p2));
	}
}
