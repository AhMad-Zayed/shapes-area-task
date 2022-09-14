package testCases.testngParameter;
import com.shapes.*;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
public class TestTriangle {
    @Parameters({"triangleBase","triangleHeight", "triangleAreaExpected"})
    @Test
    public void triangleAreaTest(double triangleBase,double triangleHeight,double triangleAreaExpected ) throws NumberFormatException, IOException {
        Shapes triangle = new Triangle(triangleBase, triangleHeight);

        assertEquals(triangle.calculateArea(), triangleAreaExpected);
    }
}
