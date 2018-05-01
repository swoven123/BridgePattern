package tech.swoven.abstracts;

import tech.swoven.implementor.Resource;

public class LongView implements View{

	@Override
	public void display(Resource resource) {
		System.out.println("Long View");
		System.out.println(resource.getName());
		System.out.println(resource.resourcePicture());
	}

}
