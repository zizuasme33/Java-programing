package ZebibPractices.Practice_day14.Replit.Methods;

public class Call {
    private int result;
    private int x;
    private int y;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void plus() {
        result = x+y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void minus() {
        result = x-y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
