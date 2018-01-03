package P22IntersectionOfCircles;

public class Point {

    private double X;
    private double Y;

    public Point(double x, double y) {
        X = x;
        Y = y;
    }

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }

    public double Distance(Point point){

        double x = this.getX() - point.getX();
        double y = this.getY() - point.getY();

        return Math.sqrt((x * x) + (y * y));
    }
}