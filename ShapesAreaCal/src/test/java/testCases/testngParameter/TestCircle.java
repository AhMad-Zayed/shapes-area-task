package testCases.testngParameter;
import com.shapes.*;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
public class TestCircle {
    @Parameters({"circleRadius", "circleAreaExpected"})

    @Test
    public void circleAreaTest(double circleRadius, double circleAreaExpected) throws NumberFormatException, IOException {
        Shapes circle = new Circle(circleRadius);

        assertEquals(circle.calculateArea(), circleAreaExpected);
    }
}
