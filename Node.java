import java.util.HashMap;
import java.util.*;

public class Node {
	
	private int id;
	private Album album;
	private HashMap<Integer, Node> out;
	private int group;
	
	public Node(int id, Album album, HashMap<Integer, Node> outEdges, int group) {
		this.id = id;
		this.album = album;
		this.out = outEdges;
		this.group = group;
	}

	public int getId() {
		return this.name;
	}

	public Album getAlbum() {
		return this.album;
	}
	public Set getOut() {
		return this.out.entrySet();
	}

	public int getGroup() {
		return this.group;
	}

	public Node getConnectedNode(int id) {
		if (!this.out.containsKey(id)) {
			System.out.println("Invalid Entry");
			return null;
		} else {
			return this.nodes.get(id);	
		}
	}

	public void addOut(Album entry) {
		out.put(entry.getName(), entry);
	}

	public Album removeOut(Album entry) {
		return out.remove(entry.getName());
	}

}