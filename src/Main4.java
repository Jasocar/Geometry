

public class Main4 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println(r);
        r.moveTo(4, 7);
        System.out.println(r);
        //ejercicio 36
        Rectangle r2 = new Rectangle(new Point(1,1),8,6);
        System.out.println(r2);

        //ejercicio 38
        Rectangle r3= new Rectangle(new Point(2,2),new Point(5,8));
        System.out.println(r3);

        //ejercicio 41
        Point p= r3.getPoint();
        System.out.println(p);

        //ejercicio 46
        Rectangle r4 = new Rectangle(new Point(5,6),10,6);
        System.out.println(r4.getBottomLeftPoint());
        System.out.println(r4.getTopLeftPoint());
        System.out.println(r4.getTopRightPoint());
        System.out.println(r4.getBottomRightPoint());
    }

}