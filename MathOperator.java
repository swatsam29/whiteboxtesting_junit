
import java.util.*;

/**
 * 
 */
public abstract class MathOperator {

    String operator = "";
    /**
     * Default constructor
     */
    public MathOperator() {
    }

    /**
     * @param n1 
     * @param n2 
     * @return
     */
    public int execute(int n1, int n2) {
        int result;
        switch (operator){
            case "+":
                result = n1+n2;
                break;
            case "-":
                result = n1-n2;
                break;
            case "*":
                result = n1*n2;
                break;
            case "/":
                result = n1/n2;
                break;
            default:
                throw new RuntimeException(" Operator not found");
        }
        return result;
    }

}