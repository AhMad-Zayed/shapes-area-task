package testCases.testngDataProvider;

import com.shapes.ReadFile;
import com.shapes.Shapes;
import com.shapes.Square;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class TestSquare {
    @DataProvider(name = "Data")
    public static Object[][] getData() throws Exception{

        List<String[]> lines = ReadFile.readAllLines("Square.csv");
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
    public void squareAreaTest(String squareSide,String squareAreaExpected) throws NumberFormatException, IOException {
        Shapes square = new Square(Double.parseDouble(squareSide));

        assertEquals(square.calculateArea(), Double.parseDouble(squareAreaExpected));

    }
}
