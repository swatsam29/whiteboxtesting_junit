import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class CalculatorControllerTest {

    private CalculatorController controller;

    @Before
    public void instantiate() throws Exception{
        controller = new CalculatorController();
    }

    @Test
    public void testAddHandler(){
        Request request = new MathRequest();
        RequestHandler handler1 = new CalculatorHandler();
        controller.addHandler(request, handler1);
        RequestHandler handler2 = controller.getHandler(request);
        assertSame("Handler we set in controller should be the same handler we get",handler2,handler1);
    }

    @Test
    public void testProcessRequest(){
        Request request = new MathRequest();
        RequestHandler handler1 = new CalculatorHandler();
        controller.addHandler(request,handler1);
        Response response = controller.processRequest(request);
        assertNotNull("Must not return a null response", response);
        assertEquals("Response should be of type SampleResponse", MathResponse.class, response.getClass());
    }

}