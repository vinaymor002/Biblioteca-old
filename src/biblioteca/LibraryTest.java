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
	
	@Test
	public void shouldDispayMenuList(){
		String menuList="1.Display Books" +
				"2.Reserve a Book" +
				"3Check Library number";
		Assert.assertEquals(menuList, new Library().getMenuList());
	}
	
	@Test
	public void shouldBeAbleToSelectMenuOption1(){
		Assert.assertEquals(1,new Library().selectMenuOption());
	}
	
	@Test 
	public void shouldBeAbleToSelectMenuOption2(){
		Assert.assertEquals(2, new Library().selectMenuOption());
	}
		
}
