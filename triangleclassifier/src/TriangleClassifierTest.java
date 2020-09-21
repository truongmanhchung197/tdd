import org.junit.Test;

import static org.junit.Assert.*;
public class TriangleClassifierTest {

    @Test
    public void testTriangle222() {
        double firstEdge = 2;
        double secondEdge = 2;
        double thirdEdge = 2;
        String expected = "tam giac deu";
        String result = TriangleClassifier.TriangleClassifierTest(firstEdge, secondEdge, thirdEdge);
        assertEquals(expected, result);
    }

    @Test
    public void testTriangle223() {
        double firstEdge = 2;
        double secondEdge = 2;
        double thirdEdge = 3;
        String expected = "tam giac can";
        String result = TriangleClassifier.TriangleClassifierTest(firstEdge, secondEdge, thirdEdge);
        assertEquals(expected, result);
    }

    @Test
    public void testTriangle345() {
        double firstEdge = 3;
        double secondEdge = 4;
        double thirdEdge = 5;
        String expected = "tam giac thuong";
        String result = TriangleClassifier.TriangleClassifierTest(firstEdge, secondEdge, thirdEdge);
        assertEquals(expected, result);
    }

    @Test
    public void testTriangle823() {
        double firstEdge = 8;
        double secondEdge = 2;
        double thirdEdge = 3;
        String expected = "khong phai la tam giac";
        String result = TriangleClassifier.TriangleClassifierTest(firstEdge, secondEdge, thirdEdge);
        assertEquals(expected, result);
    }

    @Test
    public void testTriangleNegative121() {
        double firstEdge = -1;
        double secondEdge = 2;
        double thirdEdge = 1;
        String expected = "khong phai la tam giac";
        String result = TriangleClassifier.TriangleClassifierTest(firstEdge, secondEdge, thirdEdge);
        assertEquals(expected, result);
    }
    @Test
    public void testTriangle011() {
        double firstEdge=0;
        double secondEdge=1;
        double thirdEdge=1;
        String expected="khong phai la tam giac";
        String result=TriangleClassifier.TriangleClassifierTest(firstEdge,secondEdge,thirdEdge);
        assertEquals(expected,result);
    }

}