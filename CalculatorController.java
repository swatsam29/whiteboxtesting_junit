
import java.util.*;

/**
 * 
 */
public class CalculatorController implements Controller {

    private Map requestHandlers = new HashMap();

    protected RequestHandler getHandler(Request request){
        if (!this.requestHandlers.containsKey(request.getName())){
            String message = "Cannot find Handler for request name"+ "["+request.getName()+"]";
            throw new RuntimeException(message);
        }
        return (RequestHandler)
                this.requestHandlers.get((request.getName()));
    }
    /**
     * Default constructor
     */
    public CalculatorController() {
    }

    /**
     * @param request 
     * @return
     */
    public Response processRequest(Request request) {
        Response response;
        try{
            response = getHandler(request).process(request);
        }
        catch (Exception exception){
            response  = new ErrorRespose(request, exception);
        }
        return response;
    }

    /**
     * @param request 
     * @param requestHandler
     */
    public void addHandler(Request request, RequestHandler requestHandler) {
        if (this.requestHandlers.containsKey(request.getName())){
            throw new RuntimeException("A request handler has already been registered for request name " + "["+request.getName()+"]");
        }
        else {
            this.requestHandlers.put(request.getName(), requestHandler);
        }
    }

}