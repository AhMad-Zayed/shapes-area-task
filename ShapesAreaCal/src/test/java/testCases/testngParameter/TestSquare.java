package testCases.testngParameter;

import com.shapes.Shapes;
import com.shapes.Square;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class TestSquare {
    @Parameters({"squareSide", "squareAreaExpected"})
    @Test
    public void squareAreaTest(double squareSide,double squareAreaExpected) throws NumberFormatException, IOException {
        Shapes square = new Square(squareSide);

        assertEquals(square.calculateArea(), squareAreaExpected);

    }
}
