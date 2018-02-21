import java.util.HashMap;

public Class Node {
	
	private String name;
	private Album album;
	private HashMap<String, Album> out = new HashMap<String, Album>();
	private HashMap<String, Album> in = new HashMap<String, Album>();
	private int group;
	
	public Node(String name, Album album, Album[] outEdges, Album[] inEdges, int group) {
		this.name = name;
		this.album = album;
		for (int i = 0; i < outEdges.length; i += 1) {
			out.put(outEdges[i].name, outEdges[i]);
		}
		for (int i = 0; i < inEdges.length; i += 1) {
			in.put(inEdges[i].name, inEdges[i]);
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
			System.out.println("Found %s in Out", name);
			return out.get(name);
		} else if (in.containsKey(name)) {
			System.out.println("Found %s in In", name);
			return in.get(name);
		} else {
			System.out.println("Entry not found")
			return null;
		}
	}

	public int getGroup() {
		return this.group;
	}

	public void addOut(Album entry) {
		out.put(entry.name, entry);
	}
	public void addIn(Album entry) {
		in.put(entry.name, entry);
	}

	public Album removeOut(Album entry) {
		out.remove(entry.name);
	}
	public Album removeIn(Album entry) {
		in.remove(entry.name);
	}

}