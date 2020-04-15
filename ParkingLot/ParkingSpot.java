
public class ParkingSpot {
	private Vehicle vehicle;
	private VehicleSize spotSize;
	private int row;
	private int spotNumber;
	private Level level;
	
	public ParkingSpot(Level level, int row, int spotNumber, VehicleSize size){
		this.setRow(row);
		this.setSpotNumber(spotNumber);
		this.setLevel(level);
		spotSize = size;
	}
	
	public boolean isAvailable(){
		return vehicle == null;
	}
	
	public boolean parkVehicle(Vehicle vehicle){
		if(canFitVehicle(vehicle)){
			this.vehicle = vehicle;
			return true;
		}
		return false;
	}
	
	public boolean canFitVehicle(Vehicle vehicle){
		switch(vehicle.getSize()){
			case MOTORCYCLE:
				return spotSize == VehicleSize.MOTORCYCLE;
				
			case COMPACT:
				return spotSize == VehicleSize.MOTORCYCLE || spotSize == VehicleSize.COMPACT;
			case LARGE:
				return true;
			default:
				return false;
		}
	}
	
	public void removeVehicle(){
		vehicle = null;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getSpotNumber() {
		return spotNumber;
	}

	public void setSpotNumber(int spotNumber) {
		this.spotNumber = spotNumber;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}
	
}
