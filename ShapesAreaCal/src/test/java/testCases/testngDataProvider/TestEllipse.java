package testCases.testngDataProvider;
import com.shapes.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

import static org.testng.Assert.assertEquals;
public class TestEllipse {

    @DataProvider(name = "Data")
    public static Object[][] getData() throws Exception{

        List<String[]> lines = ReadFile.readAllLines("EllipseData.csv");
        lines.remove(0);
        Object[][] data = new Object[lines.size()][lines.get(0).length];
        int index = 0;
        for(String[] line : lines) {
            data[index] = line;
            index++;
        }
        return data;
    }
    @Test(dataProvider = "Data")
    public void ellipseAreaTest(String ellipseA,String ellipseB,String ellipseAreaExpected) throws NumberFormatException, IOException {
        Shapes ellipse = new Ellipse(Double.parseDouble(ellipseA), Double.parseDouble(ellipseB));

        assertEquals(ellipse.calculateArea(), Double.parseDouble(ellipseAreaExpected));
    }
}
