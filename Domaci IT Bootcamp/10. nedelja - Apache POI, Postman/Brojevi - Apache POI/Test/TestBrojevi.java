package ExcelBrojevi.Test;

import ExcelBrojevi.BasePage.BasePage;
import org.testng.annotations.Test;

public class TestBrojevi extends BasePage {

    @Test
    public void sumaBrojeva(){
        int suma = 0;
        for(int i = 1; i <= excelReader.getLastRow("Brojevi"); i++){
            suma = suma + excelReader.getIntegerData("Brojevi", i, 0);
        }
        System.out.println("Suma brojeva: " + suma);
    }
}
