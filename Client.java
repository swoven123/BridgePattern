import tech.swoven.abstracts.LongView;
import tech.swoven.abstracts.ShortView;
import tech.swoven.abstracts.View;
import tech.swoven.implementor.Artist;
import tech.swoven.implementor.Movie;
import tech.swoven.implementor.Resource;

public class Client {
	
	public static void main(String[] args) {
		
		View longView = new LongView();
		
		View shortView = new ShortView();
		
		Resource artist = new Artist("Mithun");
		Resource moview = new Movie("Titanic");
		Resource book = new tech.swoven.implementor.Book("GOF");
		
		
		longView.display(artist);
	
		
		longView.display(moview);
		longView.display(book);
		
		shortView.display(artist);
		shortView.display(book);
		shortView.display(moview);
		
		
	}

}
