import java.util.List;

public class Deparment {
	
	private List<Position> positions;
	private String name;
	private  String  location;
	
	
	public Deparment(String name, String location) {
		super();
		this.name = name;
		this.location = location;
		
	}
	public List<Position> getPositions() {
		return positions;
	}
	public void setPositions(List<Position> positions) {
		this.positions = positions;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
