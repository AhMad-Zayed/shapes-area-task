package testCases.testngDataProvider;
import com.shapes.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

import static org.testng.Assert.assertEquals;
public class TestCircle {
    @DataProvider(name = "Data")
    public static Object[][] getData() throws Exception{

        List<String[]> lines = ReadFile.readAllLines("./CircleData.csv");
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
    public void circleAreaTest(String circleRadius, String circleAreaExpected) throws NumberFormatException, IOException {

        Shapes circle = new Circle(Double.parseDouble(circleRadius));

        assertEquals(circle.calculateArea(), Double.parseDouble(circleAreaExpected));
    }
}
