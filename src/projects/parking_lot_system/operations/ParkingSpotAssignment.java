package projects.parking_lot_system.operations;

public class ParkingSpotAssignment implements OperationAPI {

	@Override
	public boolean execute(String licensePlate) {
		// TODO Auto-generated method stub
		return assignParkingSpot(licensePlate);
	}
	
	public boolean assignParkingSpot(String licensePlate) {
		return true;
	}

}
