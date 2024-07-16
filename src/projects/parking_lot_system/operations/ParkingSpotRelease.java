package projects.parking_lot_system.operations;

public class ParkingSpotRelease implements OperationAPI {

	@Override
	public boolean execute(String licensePlate) {
		// TODO Auto-generated method stub
		return releaseParkingSlot(licensePlate);
	}
	
	public boolean releaseParkingSlot(String licensePlate) {
		return true;
	}

}
