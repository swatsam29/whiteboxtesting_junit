import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(value= Parameterized.class)
public class MultiplyTest {

     int expected;
     int valueOne;
     int valueTwo;

    @Parameterized.Parameters
    public static Collection<Integer[]> getTestParameters() {
        return Arrays.asList(new Integer[][] {
                {15,3,5},
                {28,4,7},
                {36,6,6},
        });
    }

    public MultiplyTest(int expected,int valueOne, int
                        valueTwo){
        this.expected = expected;
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }
    @Test
    public void execute() {
        Multiply obj = new Multiply();
        assertEquals(expected,obj.execute(valueOne,valueTwo),0);
    }
}