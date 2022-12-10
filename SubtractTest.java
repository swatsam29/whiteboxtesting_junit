import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubtractTest {

    @Test
    public void execute() {
        Subtract obj = new Subtract();
        int sub = obj.execute(10,5);
        assertEquals(5,sub,0);
    }
}