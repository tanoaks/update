import java.util.HashMap;


public class Node {

	private HashMap<String,Node> map= new HashMap<String,Node>();
	private Integer name=0;
	private Integer distance =0;
	public HashMap<String, Node> getMap() {
		return map;
	}
	public void setMap(HashMap<String, Node> map) {
		this.map = map;
	}
	public Integer getName() {
		return name;
	}
	public void setName(Integer name) {
		this.name = name;
	}
	public Integer getDistance() {
		return distance;
	}
	public void setDistance(Integer distance) {
		this.distance = distance;
	}
	
}
