import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;


@RunWith(Parameterized.class)
public class TriangleTestDataDriven {
    int x;
    int y;
    int z;
    Tri t;

    public TriangleTestDataDriven(int x,int y,int z, Tri t)
    {
        this.t=t;
        this.x=x;
        this.y=y;
        this.z=z;
    }

    @Parameterized.Parameters
    public static Object[][] parameters()
    {
        Object[][] res={{1,2,0,Tri.INVALID},{2,2,2,Tri.MOTEVAZi},{2,2,3,Tri.MOTESAVI},{4,3,2,Tri.GHEYREIN}};
        return res;
    }

    @Test
    public void checkTriangle() {
        assertEquals(Triangle.checkTriangle(x,y,z),t);
    }
}