import java.util.ArrayList;
import java.util.Random;

public class World {
	
	public static final int SIZE = 9;

	
	private Point2D[] suspectLocations;
	private PatrolCar car;
	// data fields 
	
	public World() {
		Random random = new Random();
		
		this.suspectLocations = new Point2D[random.nextInt(SIZE)];
		ArrayList<Point2D> usedPoints = new ArrayList<Point2D>();
		
		for(int i = 0; i < suspectLocations.length; i++) {
			// generate a random x and y
			while(true) {
				Point2D newPoint = new Point2D(random.nextInt(SIZE), random.nextInt(SIZE));
				boolean pointIsUnique = true;
				
				for(int j = 0; j < usedPoints.size(); j++) {
					if(usedPoints.get(j).compareTo(newPoint) == 0) {
						pointIsUnique = false;
						break;
					}
				}
				
				if(pointIsUnique) {
					this.suspectLocations[i] = newPoint;
					usedPoints.add(newPoint);
					break;
				}
			}
		}
	
		this.car = new PatrolCar();
	} 
	
	// a method update(), which checks if the patrolCar is in the same location as a suspect. If it is it changes
	// the suspects position to (-1,-1) and increases the PatroCarís arrested value by 1.
	public void update() {
		for(int i = 0; i < this.suspectLocations.length; i++) {
			if(car.getLocation().compareTo(this.suspectLocations[i]) == 0) {
				car.addArrested();
				this.suspectLocations[i].setx(-1);
				this.suspectLocations[i].sety(-1);
			}
		}
	} 
	// a method move() which moves the PatrolCar in a random direction (east, west, north, south) and for a
	// random number of cells ( upto World.SIZE) and calls update() method at each step.
	public void move() {
		Random random = new Random();
		
		int cellsTocheck = random.nextInt(World.SIZE);
		
		for(int i = 0; i < cellsTocheck; i++) {
			int direction = random.nextInt(4);
			
			switch(direction){
			case 0: this.car.moveNorth(); break;
			case 1: this.car.moveEast(); break;
			case 2: this.car.moveWest(); break;
			case 3: this.car.moveSouth(); break;
			}
			
			this.update();
		}
			
	}
	
	// application is main method, which calls the move() method and prints the position and number of arrests 
	// made by the PatrolCar object, until all suspects are arrested.
	
	public static void main(String[] args) {
		World world = new World();
		
		while(world.car.getNumSuspectsArrested() != world.suspectLocations.length) 
			world.move();
	
		System.out.println(world.car);
	}
	
	
}

	
	