public class Point {
    private int x;
    private int y;
    public Point(int a, int b) {
        x = a;
        y = b;
    }
    public Point() {
        x = 0;
        y = 0;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void setOffset(int offsetX, int offsetY) {
        x += offsetX;
        y += offsetY;
    }
}


//-------------------------------------------------

