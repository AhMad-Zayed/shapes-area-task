package testCases.testngParameter;
import com.shapes.*;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
public class TestParallelogram {

    @Parameters({"parallelogramBase","parallelogramVertical", "parallelogramAreaExpected"})

    @Test
    public void parallelogramAreaTest(double parallelogramBase,double parallelogramVertical,double parallelogramAreaExpected) throws NumberFormatException, IOException {
        Shapes parallelogram = new Parallelogram(parallelogramBase, parallelogramVertical);

        assertEquals(parallelogram.calculateArea(), parallelogramAreaExpected);
    }

}
