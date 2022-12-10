
import java.util.*;

/**
 * 
 */
public interface RequestHandler {

    /**
     * @param request 
     * @return
     */
    public Response process(Request request);

}