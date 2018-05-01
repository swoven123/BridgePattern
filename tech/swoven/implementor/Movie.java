package tech.swoven.implementor;

public class Movie implements Resource {
	
	private final String name;
	
	private String picture;
	
	public Movie(String name) {
		this.name = name;
		this.picture = "$$$$88888$$$$$$";
	}
	
	@Override
	public String resourcePicture() {
		return picture;
	}

	@Override
	public String getName() {
		return name;
	}

}
