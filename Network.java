import java.util.HashMap;

public class Network {
	
	private String name;
	private HashMap<Integer, Node> nodes = new HashMap<Integer, Node>();
	
	public Network(String name) {
		this.name = name;
	}


	public String getName() {
		return this.name;
	}

	public Node getNode(int id) {
		if (!this.nodes.containsKey(id)) {
			System.out.println("Invalid Entry");
			return null;
		} else {
			return this.nodes.get(id);	
		}
	}

	public void addNode(Node entry) {
		this.nodes.put(entry.getId(), entry);
	}


}