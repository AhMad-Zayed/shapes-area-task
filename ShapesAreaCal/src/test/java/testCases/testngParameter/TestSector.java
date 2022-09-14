package testCases.testngParameter;
import com.shapes.*;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
public class TestSector {

    @Parameters({"sectorRadius","sectorTheta", "sectorAreaExpected"})

    @Test
    public void sectorAreaTest(double sectorRadius,double sectorTheta,double sectorAreaExpected) throws NumberFormatException, IOException {
        Shapes sector = new Sector(sectorRadius, sectorTheta);

        assertEquals(sector.calculateArea(), sectorAreaExpected);
    }
}
