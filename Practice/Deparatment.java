package Paper;

import java.util.ArrayList;

class Deparatment {
	private String dName;
	private ArrayList<Employee> Demployees= new ArrayList<>();
    public void setEmployee(Employee employee) {
    	Demployees.add(employee);
    }
    public Deparatment(String dName,Employee e) {
    	this.dName=dName;
    	Demployees.add(e);
    	
    }
    public void getData() {
    	System.out.println("Deparatment : "+dName);
    	for(Employee e: Demployees) {
    		System.out.println(e.getName()+" : "+e.getPosition());
    	}
    }
	public void searchByPos(String position){
		for(Employee e : Demployees){
			if(e.getPosition().contains(position)){
				System.out.println("The Employee is Available "+e.getName());
			}
				else{
					System.out.println("The Employee is Not Available");
				}
			}
	}
} 

