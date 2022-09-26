public class Rectangle extends Point {
    private int width;
    private int height;

    public Rectangle() {
        super();
        width = 0;
        height = 0;
    }

    public Rectangle(Point p, int newWidth, int newHeight) {
        super(p.getX(), p.getY());
        width = newWidth;
        height = newHeight;
    }

    public Rectangle(Point p1, Point p2) {
        this(p1, p2.getX() - p1.getX(), p2.getY() - p1.getY());
    }

    public String toString() {
        return super.toString() + " width: " + width + " height = " + height;
    }

    public int getArea() {
        return width * height;
    }

    public Point getTopLeftPoint() {
        Point p = new Point(getX(),getY() + height);
        return p;
    }
    public Point getTopRightPoint() {
    //Point p = new Point(getX() + width, getY() + height);
        Point p = new Point(getX(),getY());
        p.setOffset(width, height);
        return p;
    }
    public Point getBottomLeftPoint() {
        return getPoint();
    }
    public Point getBottomRightPoint() {
        Point p = new Point(getX() + width, getY());
        return p;
    }

    public Point getPoint() {
        return new Point(getX(), getY());
    }

    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public void setWidth(int newWidth) {
        width = newWidth;
    }
    public void setHeight(int newHeight) {
        height = newHeight;
    }
}