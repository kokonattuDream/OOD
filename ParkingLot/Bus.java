
public class Bus extends Vehicle{
	public Bus(){
		spotNeeded = 5;
		size = VehicleSize.LARGE;
	}

	@Override
	public boolean canFitInSpot(ParkingSpot spot) {
		// TODO Auto-generated method stub

		return false;
	}
	
}
