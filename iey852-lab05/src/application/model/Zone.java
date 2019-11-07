package application.model;

public class Zone {

	private String nameOfZone;
	private String zoneCode;
	private String threatLevel;
	
	public Zone(String nameOfZone, String zoneCode, String threatLevel) {
		super();
		this.nameOfZone = nameOfZone;
		this.zoneCode = zoneCode;
		this.threatLevel = threatLevel;
	}
	

	public String getNameOfZone() {
		return nameOfZone;
	}
	public void setNameOfZone(String nameOfZone) {
		this.nameOfZone = nameOfZone;
	}
	public String getZoneCode() {
		return zoneCode;
	}
	public void setZoneCode(String zoneCode) {
		this.zoneCode = zoneCode;
	}
	public String getThreatLevel() {
		return threatLevel;
	}
	public void setThreatLevel(String threatLevel) {
		this.threatLevel = threatLevel;
	}

	@Override
	public String toString() {
		return "Zone [nameOfZone=" + nameOfZone + ", ZoneCode" + zoneCode + ", threatLevel=" + threatLevel
				+ "]";
	}
	
	 
}
