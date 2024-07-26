package Paper;

class Employee {
	private String eName;
	private String ePosition;
	Employee(String eName, String ePosition){
		this.eName=eName;
		this.ePosition=ePosition;
	}
	public void setName(String eName){
		this.eName=eName;
	}
	public String getName() {
		return eName;
	}
	public void setPosition(String ePosition) {
		this.ePosition=ePosition;
	}
	public String getPosition() {
		return ePosition;
	}

	

}
