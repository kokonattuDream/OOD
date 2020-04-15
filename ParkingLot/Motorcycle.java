
public class Motorcycle extends Vehicle{
	public Motorcycle(){
		spotNeeded = 1;
		size = VehicleSize.MOTORCYCLE;
	}

	@Override
	public boolean canFitInSpot(ParkingSpot spot) {
		// TODO Auto-generated method stub
		return false;
	}
}
