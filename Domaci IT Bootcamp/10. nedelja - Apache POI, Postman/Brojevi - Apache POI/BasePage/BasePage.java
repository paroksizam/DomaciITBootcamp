package ExcelBrojevi.BasePage;

import org.testng.annotations.BeforeClass;

import java.io.IOException;

public class BasePage {

    public ExcelReader excelReader;

    @BeforeClass
    public void setUp() throws IOException {
        excelReader = new ExcelReader("C:\\Users\\Marija\\IdeaProjects\\SeleniumProject\\Brojevi.xlsx");
    }
}
