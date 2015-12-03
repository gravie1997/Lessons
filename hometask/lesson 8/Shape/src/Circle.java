/**
 * Created by Admin on 12/2/2015.
 */
public class Circle extends Shape {

    Point center ;
    int radius ;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {

        Point[] points = new Point[4*(radius + 1 )];


        for (int i = 0 ; i <= radius ; i++){
            int xOffset = radius-i ;
            int yOffset =((int)Math.sqrt((Math.pow(radius, 2) - Math.pow(xOffset, 2))));
            Point topRight = new Point(center.getX() + xOffset , center.getY()-yOffset );
            Point topLeft = new Point(center.getX() - xOffset , center.getY()-yOffset );
            Point bottomLeft = new Point(center.getX() - xOffset , center.getY()+yOffset );
            Point bottomRight = new Point(center.getX() + xOffset , center.getY()+yOffset );

            points [i] = topRight;
            points [radius+i+1] = topLeft;
            points [radius*2+i+2] = bottomLeft;
            points [radius*3+i+3] = bottomRight;

        }
        for (int i = 0 ; i < points.length ; i++){

            System.out.println(points[i]);

        }



    }
}

