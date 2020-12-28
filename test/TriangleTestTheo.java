import org.junit.Test;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import static org.junit.Assume.assumeTrue;

@RunWith(Theories.class)
public class TriangleTestTheo {

    @DataPoints
    public static int[] s1={-1,2,3,4,5,6,7};

    @DataPoints
    public static int[] s2={9,7,6,5,4,3};

    @DataPoints
    public static int[] s3={5,4,3,6,7,2,};

    @Theory
    public void checkTriangle(int m,int n,int p) {
        assumeTrue(m==n || n==p || m==p);

        assumeTrue(Triangle.checkTriangle(m,n,p)==Tri.MOTESAVI);
    }
}