
public class ParkingLot {
	private Level[] levels;
	
	public ParkingLot(int num_levels){
		levels = new Level[num_levels];
	}
	
	public boolean parkVehicle(Vehicle vehicle){
		for(int i = 0; i < levels.length; i++){
			if(levels[i].availableSpots() > 0 && levels[i].parkVehicle(vehicle)){
				return true;
			}
		}
		return false;
	}
}
