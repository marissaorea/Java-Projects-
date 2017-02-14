//Lab#7 | Final Lab
//PatrolCar 1.2

public class PatrolCar {
	private static int NEXT_ID = 1;
	
	private int id;
	
	private Point2D location;
	
	private int arrested; // represents the number of suspects this PatrolCar object have arrested. 

	
	public PatrolCar() {
		
		this.id = NEXT_ID;
		this.arrested = 0;
		this.location = new Point2D(0, 0);
		
		NEXT_ID++;
		
	}
	
	public boolean moveWest() {
		int currentX = this.location.getx();
			if( currentX == 0) 
						return false;
			this.location.setx(currentX - 1);
			return true;
	} // West
	
	public boolean moveEast() {
		int currentX = this.location.getx();
			if(currentX == World.SIZE) 
						return false;
			
			this.location.setx(currentX + 1);
			return true;
	} // East
	
	public boolean moveNorth() {
		int currentY = this.location.gety();
			if(currentY == 0) 
					return false;
			
			this.location.sety(currentY -1);
			return true;
		
	} // North
	
	public boolean moveSouth() {
		int currentY = this.location.gety();
			if(currentY == World.SIZE) 
					return false;
			
			this.location.sety(currentY +1);
			return true;
			
	}
	
	public int getId() {
		return this.id;
	}
	
	public Point2D getLocation() {
		return this.location;
	}
	
	public int getNumSuspectsArrested() {
		return this.arrested;
	}
	
	public int addArrested() {
		return this.arrested++;
	}
	
	public int compareTo(PatrolCar that) {
		if(this.id == that.id) return 0;
		if(this.id > that.id) return 1;
		return -1;
			
}
	public String toString() {
		String string = "ID: " + this.id + "\n";
		string += "Location: " + this.location + "\n";
		string += "Arrested: " + this.arrested;
		
		return string;
	}
	
	// main method to perform unit test for this class and its methods.
		public static void main(String[] args) {
			// test ID 
			PatrolCar p = new PatrolCar();
			System.out.println(p);
			
			// test ID
			PatrolCar p2 = new PatrolCar();
			System.out.println(p);
			
			// test movements
			p.moveNorth();
			System.out.println(p);
			
			p.moveWest();
			System.out.println(p);
			
			p.moveEast();
			System.out.println(p);
			
			p.moveSouth();
			System.out.println(p);
			
			// test compare
			System.out.println(p.compareTo(p2));
			System.out.println(p2.compareTo(p));
		}
	}

	
	
