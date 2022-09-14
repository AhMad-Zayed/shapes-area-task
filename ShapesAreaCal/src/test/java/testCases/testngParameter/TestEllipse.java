package testCases.testngParameter;
import com.shapes.*;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
public class TestEllipse {

    @Parameters({"ellipseA","ellipseB", "ellipseAreaExpected"})

    @Test
    public void ellipseAreaTest(double ellipseA,double ellipseB,double ellipseAreaExpected) throws NumberFormatException, IOException {
        Shapes ellipse = new Ellipse(ellipseA, ellipseB);

        assertEquals(ellipse.calculateArea(), ellipseAreaExpected);
    }
}
