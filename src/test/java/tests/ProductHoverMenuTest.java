package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductHoverMenuTest extends TestBase {

	@Test
	public void OpenNoteBooksPage() {
		homeObject.OpenNoteBooks();
		Assert.assertEquals(homeObject.pagetitle.getText(), "Notebooks");
	}
}
