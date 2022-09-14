package testCases;


import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.shapes.Circle;
import com.shapes.Ellipse;
import com.shapes.Parallelogram;
import com.shapes.ReadFile;
import com.shapes.Rectangle;
import com.shapes.Sector;
import com.shapes.Shapes;
import com.shapes.Square;
import com.shapes.Trapezoid;
import com.shapes.Triangle;

public class AreaTestCasesTestNG {

    /*Shapes square = new Square(10);
    Shapes rectangle = new Rectangle(4, 5);
    Shapes triangle = new Triangle(4, 8);
    Shapes parallelogram = new Parallelogram(6, 9);
    Shapes trapezoid = new Trapezoid(3, 6, 4);
    Shapes circle = new Circle(3);
    Shapes ellipse = new Ellipse(5, 6);
    Shapes sector = new Sector(4, 30);
    ReadFile readfile = new ReadFile();
*/

    @Parameters({"squareSide", "squareAreaExpected"})
    @Test
    public void squareAreaTest(double squareSide,double squareAreaExpected) throws NumberFormatException, IOException {
        Shapes square = new Square(squareSide);

        assertEquals(square.calculateArea(), squareAreaExpected);

    }
    @Parameters({"rectangleWidth","rectangleHeight", "rectangleAreaExpected"})

    @Test
    public void rectangleAreaTest(double rectangleWidth,double rectangleHeight,double rectangleAreaExpected) throws NumberFormatException, IOException {
        Shapes rectangle = new Rectangle(rectangleWidth, rectangleHeight);

        assertEquals(rectangle.calculateArea(),rectangleAreaExpected);
    }

    @Parameters({"triangleBase","triangleHeight", "triangleAreaExpected"})
    @Test
    public void triangleAreaTest(double triangleBase,double triangleHeight,double triangleAreaExpected ) throws NumberFormatException, IOException {
        Shapes triangle = new Triangle(triangleBase, triangleHeight);

        assertEquals(triangle.calculateArea(), triangleAreaExpected);
    }
    @Parameters({"parallelogramBase","parallelogramVertical", "parallelogramAreaExpected"})

    @Test
    public void parallelogramAreaTest(double parallelogramBase,double parallelogramVertical,double parallelogramAreaExpected) throws NumberFormatException, IOException {
        Shapes parallelogram = new Parallelogram(parallelogramBase, parallelogramVertical);

        assertEquals(parallelogram.calculateArea(), parallelogramAreaExpected);
    }

    @Parameters({"trapezoidA","trapezoidB", "trapezoidH", "trapezoidAreaExpected"})

    @Test
    public void trapezoidAreaTest(double trapezoidA,double trapezoidB,double trapezoidH,double trapezoidAreaExpected) throws NumberFormatException, IOException {
        Shapes trapezoid = new Trapezoid(trapezoidA, trapezoidB, trapezoidH);

        assertEquals(trapezoid.calculateArea(), trapezoidAreaExpected);
    }
    @Parameters({"circleRadius", "circleAreaExpected"})

    @Test
    public void circleAreaTest(double circleRadius, double circleAreaExpected) throws NumberFormatException, IOException {
        Shapes circle = new Circle(circleRadius);

        assertEquals(circle.calculateArea(), circleAreaExpected);
    }
    @Parameters({"ellipseA","ellipseB", "ellipseAreaExpected"})

    @Test
    public void ellipseAreaTest(double ellipseA,double ellipseB,double ellipseAreaExpected) throws NumberFormatException, IOException {
        Shapes ellipse = new Ellipse(ellipseA, ellipseB);

        assertEquals(ellipse.calculateArea(), ellipseAreaExpected);
    }
    @Parameters({"sectorRadius","sectorTheta", "sectorAreaExpected"})

    @Test
    public void sectorAreaTest(double sectorRadius,double sectorTheta,double sectorAreaExpected) throws NumberFormatException, IOException {
        Shapes sector = new Sector(sectorRadius, sectorTheta);

        assertEquals(sector.calculateArea(), sectorAreaExpected);
    }
}

