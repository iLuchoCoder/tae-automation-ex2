package Document.locators;

import Document.baseDocument.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LocatorElementsTests extends BaseTests {

    @Test
    public void testFindElement1(){
        assertTrue(homePage.searchCssElementOnPage1().contains("Jukka Korpela"),
                "Searched element incorrect");
    }

    @Test
    public void testFindElement2(){
        assertTrue(homePage.searchCssElementOnPage2().contains("Three. Well, probably this list item should be longer."),
                "Searched element incorrect");
    }

    @Test
    public void testFindElement3(){
        assertTrue(homePage.searchCssElementOnPage3().contains("One."),
                "Searched element incorrect");
    }

    @Test
    public void testFindElement4(){
        assertTrue(homePage.searchCssElementOnPage4().contains("Three. Well, probably this list item should be longer so that it will probably"),
                "Searched element incorrect");
    }

    @Test
    public void testFindElement5(){
        assertTrue(homePage.searchCssElementOnPage5().contains("A cool"),
                "Searched element incorrect");
    }

    @Test
    public void testFindElement6(){
        assertTrue(homePage.searchCssElementOnPage6().contains("Reset 2"),
                "Searched element incorrect");
    }

    @Test
    public void testFindElement7(){
        assertTrue(homePage.searchCssElementOnPage7().contains("three"),
                "Searched element incorrect");
    }

    @Test
    public void testFindElement8(){
        assertTrue(homePage.searchCssElementOnPage8().contains("100,250"),
                "Searched element incorrect");
    }

    @Test
    public void testFindElement9(){
        assertTrue(homePage.searchCssElementOnPage9().contains("In the following, a width setting should cause some hyphenation,"),
                "Searched element incorrect");
    }

    @Test
    public void testFindElement10(){
        assertTrue(homePage.searchCssElementOnPage10().contains("JavaScript-driven hyphenation"),
                "Searched element incorrect");
    }
}
