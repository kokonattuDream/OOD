
public abstract class Vehicle {
	protected int spotNeeded;
	protected VehicleSize size;
	protected String licensePlate;
	
	public int getSpotsNeeded(){
		return spotNeeded;
	}
	
	public VehicleSize getSize(){
		return size;
	}
	
	public abstract boolean canFitInSpot(ParkingSpot spot); 
	
}
