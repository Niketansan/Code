package homeWork;

public class D_MStatements {
	private int x,y;
	int i=0;
	
	
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
	public void compare(D_MStatements d) {
		int x= d.getX();
		int y=d.getY();
		if (x==y) {
			System.out.println("X AND Y are equal");
		}
		else if (x>y) {
			System.out.println("x is greater than y");
		}
		else
			System.out.println("Y is greater than x");
	}

	public static void main(String[] args) {
		D_MStatements d=new D_MStatements();
		d.setX(19);
		d.setY(10);
		d.compare(d);
	}
}
