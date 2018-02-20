public Class Album {
	
	private String name;
	private int year;
	private String[] artists;
	private String[] leader;

	public Album(String name, int year, String[] artists, String[] leader) {

		this.name = name;
		this.year = year;
		this.artists = artists;
		this.leader = leader;
	}



	public String getName() {
		return this.name;
	}

	public int getYear() {
		return this.year;
	}

	public String[] getArtists() {
		return this.artists;
	}
	public String[] getLeader() {
		return this.leader;
	}




	public String setName(String name) {
		this.name = name;
		return this.albumName;
	}
	public int setYear(int year) {
		this.year = year;
		return this.year;
	}
	public String[] setArtists(String[] artists) {
		this.artists = artists;
		return this.artists;
	}
	public String[] setArtists(String[] leader) {
		this.leader = leader;
		return this.leader;
	}


}