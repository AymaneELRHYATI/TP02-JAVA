
public class TestRectangle {
    public static void main(String[] args) {
        // Creating a Rectangle object using the default constructor
        Rectangle rectangle = new Rectangle();
        rectangle.afficher();
        System.out.println("Surface du rectangle : " + rectangle.surface());
        rectangle.zoom(10, 20);
        rectangle.afficher();
        System.out.println("Surface du rectangle après zoom : " + rectangle.surface());

        // Creating a Rectangle object using the parameterized constructor
        Point haut = new Point(5, 5);
        Point bas = new Point(10, 10);
        Rectangle rectangle2 = new Rectangle(haut, bas);
        rectangle2.afficher();
        System.out.println("Surface du rectangle2 : " + rectangle2.surface());
        rectangle2.zoom(5, 5);
        rectangle2.afficher();
        System.out.println("Surface du rectangle2 après zoom : " + rectangle2.surface());
    }
}