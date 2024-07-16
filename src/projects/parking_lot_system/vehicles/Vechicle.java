package projects.parking_lot_system.vehicles;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public abstract class Vechicle {

	private String id;
	private String licensePlate;
	private VehicleType type;
	private LocalDateTime entryDateTime;
	private LocalDateTime exitDateTime;
	private double chargingStandard;
	
	public Vechicle(String id, String licensePlate, VehicleType type, LocalDateTime entryDateTime) {
		super();
		this.id = id;
		this.licensePlate = licensePlate;
		this.type = type;
		this.entryDateTime = entryDateTime;
		
		switch(type) {
			case VehicleType.Car:
				this.chargingStandard = 10.0;
				break;
			case VehicleType.Motorcycle:
				this.chargingStandard = 5.0;
				break;
			case VehicleType.Truck:
				this.chargingStandard = 15.0;
				break;
			default:
				this.chargingStandard = 15.0;
				break;
		}
	}
	
	public Vechicle(String licensePlate, VehicleType type, LocalDateTime entryDateTime) {
		super();
		this.id = UUID.randomUUID().toString();
		this.licensePlate = licensePlate;
		this.type = type;
		this.entryDateTime = entryDateTime;
		
		switch(type) {
			case VehicleType.Car:
				this.chargingStandard = 10.0;
				break;
			case VehicleType.Motorcycle:
				this.chargingStandard = 5.0;
				break;
			case VehicleType.Truck:
				this.chargingStandard = 15.0;
				break;
			default:
				this.chargingStandard = 15.0;
				break;
		}
	}
	
	public Vechicle(String licensePlate, VehicleType type) {
		super();
		this.id = UUID.randomUUID().toString();
		this.licensePlate = licensePlate;
		this.type = type;
		
		switch(type) {
			case VehicleType.Car:
				this.chargingStandard = 10.0;
				break;
			case VehicleType.Motorcycle:
				this.chargingStandard = 5.0;
				break;
			case VehicleType.Truck:
				this.chargingStandard = 15.0;
				break;
			default:
				this.chargingStandard = 15.0;
				break;
		}
	}
	

	public String getId() {
		return id;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public VehicleType getType() {
		return type;
	}

	public void setType(VehicleType type) {
		this.type = type;
	}

	public LocalDateTime getEntryDateTime() {
		return entryDateTime;
	}

	public void setEntryDateTime(LocalDateTime entryDateTime) {
		this.entryDateTime = entryDateTime;
	}
	
	public double getCharge() {
		// Base on the vehicle type to find the charging standard
		// If we have charging standard, then we can calculate the fee, bases on
		// Formular: entryDateTime * charging standard(per hr)
		Duration diff = Duration.between(LocalDateTime.now(), entryDateTime);
		long hoursDiff = diff.toHours() % 24;
		double chargingFee = hoursDiff*chargingStandard;
		
		return chargingFee;
		
	}
	
	
}
