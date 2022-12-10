public class MathRequest implements Request {
    @Override
    public String getName() {
        return "+";
    }

    @Override
    public int getParam1() {
        return 60;
    }

    @Override
    public int getParam2() {
        return 30;
    }
}
