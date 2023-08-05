import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class appTest {
    // @Test
    // public void testMain() {
    //     Perros p = new Perros();
    //     p.add("Pitbull");
    //     p.add("Doberman");
    //     p.add("Pastor Aleman");
    //     assertEquals(p.razas.toString(), "[Pitbull, Doberman, Pastor Aleman]");
    //     // System.out.println(p.toStringg());
        
    // }

    @Test
    public void testString(){   
        Perros p = new Perros();
        p.add("Pitbull");
        p.add("Doberman");
        p.add("Pastor Aleman");
        p.add("Pitbull");
        p.add("Doberman");
        p.add("Pastor Aleman");
        assert(p.toStringg().equals("[Pitbull, Doberman, Pastor Aleman, Pitbull, Doberman, Pastor Aleman]"));
    }
}
