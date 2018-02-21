import java.util.HashMap;
import java.util.*;

public class Node {
	
	private String name;
	private Album album;
	private HashMap<String, Album> out = new HashMap<String, Album>();
	private HashMap<String, Album> in = new HashMap<String, Album>();
	private int group;
	
	public Node(String name, Album album, Album[] outEdges, Album[] inEdges, int group) {
		this.name = name;
		this.album = album;
		for (int i = 0; i < outEdges.length; i += 1) {
			out.put(outEdges[i].getName(), outEdges[i]);
		}
		for (int i = 0; i < inEdges.length; i += 1) {
			in.put(inEdges[i].getName(), inEdges[i]);
		}
		this.group = group;
	}

	public String getName() {
		return this.name;
	}

	public Album getAlbum() {
		return this.album;
	}
	public Set getOut() {
		return out.entrySet();
	}
	public Set getIn() {
		return in.entrySet();
	}

	public Album where(String name) {
		if (out.containsKey(name)) {
			System.out.printf("Found %s in Out\n", name);
			return out.get(name);
		} else if (in.containsKey(name)) {
			System.out.printf("Found %s in In\n", name);
			return in.get(name);
		} else {
			System.out.printf("Entry not found\n");
			return null;
		}
	}

	public int getGroup() {
		return this.group;
	}

	public void addOut(Album entry) {
		out.put(entry.getName(), entry);
	}
	public void addIn(Album entry) {
		in.put(entry.getName(), entry);
	}

	public Album removeOut(Album entry) {
		return out.remove(entry.getName());
	}
	public Album removeIn(Album entry) {
		return in.remove(entry.getName());
	}

}