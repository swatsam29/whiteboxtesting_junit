public class MathResponse implements Response {
    private int result;
    public MathResponse(int result){
         this.result = result;
    }

    int getResult(){
        return result;
    }
}
