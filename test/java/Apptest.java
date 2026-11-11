package studentApp.test.java;
import org.junit.jupiter.api.Test;
import org.junit.Assert.*;

public class Apptest {
    @Test
    public void testAdd() {
        App Obj = new App();
        Assert.assertEquals(10,Obj.add(5,5));
    }
}
