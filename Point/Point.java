
public class Point implements Comparable<Point> {

    double x;
    double y;

    // public Point() {
    //     this.x = 0;
    //     this.y = 0;
    // }

    public Point(){this(0,0);}

// option de reecrire le constructeur
    // public Point(){
    //     this(0);
    // }

    public Point(int a, int b ){x = a; y = b;}

    public Point(int a){
        this.x = 0;
        this.y = 0;
    }

    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
// option2: Exercice page 3.
    // public Point(int a) {
    //     this();
    //     this.x = a;
    // }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void move(double distanceX, double distanceY) {
        this.x += distanceX;
        this.y += distanceY;
    }

    public void reset() {
        this.x = 0;
        this.y = 0;
    }

    public double distance(Point b) {
        double deltaX = this.x - b.getX();
        double deltaY = this.y - b.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public static double distance(Point a, Point b){
        double delta = a.x -b.getX();
        double deltaa = a.y - b.getY();

        return Math.sqrt(delta*delta + deltaa*deltaa);
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.getX() && this.y == o.getY()) {
            return 0;
        }
        return 1;
    }

    @Override
    // public boolean equals(Object obj) {
    //     if (this == obj) {
    //         return true;
    //     }
    //     if (obj == null || getClass() != obj.getClass()) {
    //         return false;
    //     }
    //     Point point = (Point) obj;
    //     return Double.compare(point.getX(), getX()) == 0 &&
    //             Double.compare(point.getY(), getY()) == 0;
    // }
    
    public boolean equals(Object a){
        return (this.x == ((Point)a).x && this.y == ((Point)a).y);
    }

    @Override
    public String toString(){
        return "(" + x + "," + y + ")";
    }


}