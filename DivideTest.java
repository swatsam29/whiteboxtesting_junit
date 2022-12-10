import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class DivideTest {
    int expected;
    int valueOne;
    int valueTwo;

    @Parameterized.Parameters
    public static Collection<Integer[]> getTestParameters() {
        return Arrays.asList(new Integer[][] {
                {5,25,5},
                {20,40,2},
                {2,12,6},
        });
    }
    public DivideTest(int expected,int valueOne, int
            valueTwo){
        this.expected = expected;
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }
    @Test
    public void execute() {
        Divide obj = new Divide();
        assertEquals(expected,obj.execute(valueOne,valueTwo),0);
    }
}