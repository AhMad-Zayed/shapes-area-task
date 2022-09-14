package testCases.testngParameter;
import com.shapes.*;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
public class TestTrapezoid {

    @Parameters({"trapezoidA","trapezoidB", "trapezoidH", "trapezoidAreaExpected"})

    @Test
    public void trapezoidAreaTest(double trapezoidA,double trapezoidB,double trapezoidH,double trapezoidAreaExpected) throws NumberFormatException, IOException {
        Shapes trapezoid = new Trapezoid(trapezoidA, trapezoidB, trapezoidH);

        assertEquals(trapezoid.calculateArea(), trapezoidAreaExpected);
    }
}
