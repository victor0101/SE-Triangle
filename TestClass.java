import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class MainTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(Main.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @org.junit.Test
    public void equilateral() {
        assertEquals("Equilateral", Main.triangle(2, 2, 2));

    }

    @org.junit.Test
    public void isoscel() {
        assertEquals("Isosceles", Main.triangle(2, 2, 1));

    }

    @org.junit.Test
    public void scalene() {
        assertEquals("Scalene", Main.triangle(2, 1, 4));

    }

    @org.junit.Test
    public void notTriangle() {
        assertEquals("Not Triangle", Main.triangle(0, 1, 4));

    }
}
}
