package testCases.testngParameter;
import com.shapes.*;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
public class TestRectangle {
    @Parameters({"rectangleWidth","rectangleHeight", "rectangleAreaExpected"})

    @Test
    public void rectangleAreaTest(double rectangleWidth,double rectangleHeight,double rectangleAreaExpected) throws NumberFormatException, IOException {
        Shapes rectangle = new Rectangle(rectangleWidth, rectangleHeight);

        assertEquals(rectangle.calculateArea(),rectangleAreaExpected);
    }

}
