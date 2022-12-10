public class ErrorRespose implements Response {
    private Request originalRequest;
    private Exception originalException;
    public ErrorRespose(Request request, Exception exception) {
        this.originalRequest = request;
        this.originalException = exception;
    }
    public Request getOriginalRequest(){
        return this.originalRequest;
    }

    public Exception getOriginalException() {
        return originalException;
    }
}
