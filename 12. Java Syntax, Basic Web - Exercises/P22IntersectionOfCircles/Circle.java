package P22IntersectionOfCircles;

public class Circle {

    private Point Center;
    private double Radius;

    public Circle(Point center, double radius) {
        Center = center;
        Radius = radius;
    }

    public Point getCenter() {
        return Center;
    }

    public void setCenter(Point center) {
        Center = center;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }

    public boolean Intersect(Circle circle){

        double centersDistance = this.getCenter().Distance(circle.getCenter());
        double radiusCommonLength = this.getRadius() + circle.getRadius();

        if (centersDistance <= radiusCommonLength){
            return true;
        }else {
            return false;
        }
    }
}