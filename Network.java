import java.util.HashMap;

public Class Network {
	
	private String name;
	private HashMap<String, Node> nodes = new HashMap<String, Node>();
	
	public Network(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public Node addNode(Node entry) {
		this.nodes.put(entry.getName(), entry);
	}

	public Node getNode(String entry) {
		if (!this.nodes.containsKey(entry)) {
			System.out.println("Invalid Entry");
			return null;
		} else {
			this.nodes.get(entry);	
		}
	}


}