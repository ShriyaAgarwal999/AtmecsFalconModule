package org.atmecs.falcongetmethods.models;

public class AnalysisResponseModel {
	
	private String message;
	private String testPhase;
	private int passPercentage;
	public AnalysisResponseModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AnalysisResponseModel(String message, String testPhase, int passPercentage) {
		super();
		this.message = message;
		this.testPhase = testPhase;
		this.passPercentage = passPercentage;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTestPhase() {
		return testPhase;
	}
	public void setTestPhase(String testPhase) {
		this.testPhase = testPhase;
	}
	public int getPassPercentage() {
		return passPercentage;
	}
	public void setPassPercentage(int passPercentage) {
		this.passPercentage = passPercentage;
	}
	@Override
	public String toString() {
		return "AnalysisResponseModel [message=" + message + ", testPhase=" + testPhase + ", passPercentage="
				+ passPercentage + "]";
	}
}
