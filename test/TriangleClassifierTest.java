import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleClassifierTest {
    @Test
    public void testTriangle(){
        int a=7;
        int b=7;
        int c=7;

        String expected="tam giac deu";

        String result=TriangleClassifier.findKindOfTriangle(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    public void testTriangle1(){
        int a=7;
        int b=7;
        int c=4;

        String expected="tam giac can";

        String result=TriangleClassifier.findKindOfTriangle(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    public void testTriangle2(){
        int a=7;
        int b=8;
        int c=9;

        String expected="tam giac thuong";

        String result=TriangleClassifier.findKindOfTriangle(a,b,c);
        assertEquals(expected,result);
    }

}