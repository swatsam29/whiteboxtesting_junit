
import java.util.*;

/**
 * 
 */
public class CalculatorHandler implements RequestHandler {

    /**
     * Default constructor
     */
    public CalculatorHandler() {
    }

    /**
     * @param request 
     * @return
     */
    public Response process(Request request) {
        MathOperator mathOperator;
        if(request.getName() == "+"){
            mathOperator = new Add();
        }else if(request.getName() == "-"){
            mathOperator = new Subtract();
        }else if(request.getName() == "*"){
            mathOperator = new Multiply();
        }else if(request.getName() == "/"){
            mathOperator = new Divide();
        }else{
            throw new RuntimeException("No such operator is supported");
        }

        Response resp = new MathResponse(mathOperator.execute(request.getParam1(),
                request.getParam2()));
        return resp;

    }

}