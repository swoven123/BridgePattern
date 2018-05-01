package tech.swoven.abstracts;

import tech.swoven.implementor.Resource;

public class ShortView  implements View{
	
	@Override
	public void display(Resource resource) {
		System.out.println("ShortView");
		System.out.println(resource.getName());
		System.out.println(resource.resourcePicture());
	}
	
}
