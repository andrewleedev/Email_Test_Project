package com.amsis;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class TrafficViolationInput implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private int speedLimit;
	private int drivingSpeed;
	private int violationPoints;

	public TrafficViolationInput() {
	}

	public int getSpeedLimit() {
		return this.speedLimit;
	}

	public void setSpeedLimit(int speedLimit) {
		this.speedLimit = speedLimit;
	}

	public int getDrivingSpeed() {
		return this.drivingSpeed;
	}

	public void setDrivingSpeed(int drivingSpeed) {
		this.drivingSpeed = drivingSpeed;
	}

	public int getViolationPoints() {
		return this.violationPoints;
	}

	public void setViolationPoints(int violationPoints) {
		this.violationPoints = violationPoints;
	}

	public TrafficViolationInput(int speedLimit, int drivingSpeed,
			int violationPoints) {
		this.speedLimit = speedLimit;
		this.drivingSpeed = drivingSpeed;
		this.violationPoints = violationPoints;
	}

}