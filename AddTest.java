import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddTest {

    @Test
    public void execute() {
        Add obj = new Add();
        int sum = obj.execute(11,22);
        assertEquals(33,sum,0);
    }
}