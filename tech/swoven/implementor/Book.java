package tech.swoven.implementor;

public class Book implements Resource{
	
	private final String name;
	private String picture;
	
	public Book(String name){
		this.name = name;
		this.picture = ":-)";
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
