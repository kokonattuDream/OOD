
public class Car extends Vehicle {
	public Car(){
		spotNeeded = 1;
		size = VehicleSize.COMPACT;
	}

	@Override
	public boolean canFitInSpot(ParkingSpot spot) {
		// TODO Auto-generated method stub
		return false;
	}
}
