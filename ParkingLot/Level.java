
public class Level {
	private int floor;
	private ParkingSpot[] spots;
	private int availableSpots = 0;
	
	public Level(int floor, int numberSpots){
		spots = new ParkingSpot[numberSpots];
		this.floor = floor;
		availableSpots = numberSpots;
	}
	
	public int availableSpots(){
		return availableSpots;
	}
	
	public boolean parkVehicle(Vehicle vehicle){
		int index = findAvailableSpots(vehicle);
		if(spots[index].parkVehicle(vehicle)){
			availableSpots--;
			return true;
		}
		return false;
	}
	
	private int findAvailableSpots(Vehicle vehicle) { 
		for(int i = 0; i < spots.length; i++){
			if(spots[i].isAvailable() && spots[i].canFitVehicle(vehicle)){
				return i;
			}
		}
		return -1;
	}
	
	public void spotFreed(){
		availableSpots++;
	}
}
