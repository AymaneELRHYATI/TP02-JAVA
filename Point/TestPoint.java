public class TestPoint{
    public static void main(String[] args) {
        // Point pointA = new Point();
        // pointA.setX(1);
        // pointA.setY(2);

        // Point pointB = new Point();
        // pointB.setX(2);
        // pointB.setY(3);

        // double distance = Point.distance(pointB, pointA);
        // System.out.println("The distance between A and B is: " + distance);

        //Point pointA = new Point();
        ///pointA.setX(1);
        //pointA.setY(2);

        // Point pointB = new Point();
        // pointB.setX(1);
        // pointB.setY(2);
        //Point pointB  = pointA; //En résumé pour comparer les attributs de deux objets et non les références, il faut surcharger la méthode equals dans la classe de ces objets

        //System.out.println("Are pointA and pointB equal? " + pointA.equals(pointB));

        Point pointA = new Point();
        pointA.setX(1);
        pointA.setY(2);

        Point pointB = new Point();
        pointB.setX(1);
        pointB.setY(2);

        // call the equals method from the Object class
        Object objectP = pointA;
        Object objectQ = pointB;

        System.out.println("Are pointA and pointB equal? " + pointA.equals(pointB));
        System.out.println("Are objectP and objectQ equal? " + objectP.equals(objectQ));

        Point p = new Point();
        Point q = new Point(5,2);  
    }

}