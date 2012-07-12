package biblioteca;

import org.junit.Assert;
import org.junit.Test;

public class LibraryTest {
	
	@Test
	public void shouldCreateLibraryObject(){
		Assert.assertNotNull(new Library());
	}
	
	@Test
	public void shouldDisplayWelcomeMessage(){
		Assert.assertEquals("Welcome !", new Library().getWelcomeMessage());
	}
	
}
