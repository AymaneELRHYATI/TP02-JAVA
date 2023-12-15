
public class Rectangle {
    private Point hg;
    private Point bd;

    public Rectangle (){
        this.hg = new Point();
        this.bd = new Point();        
    }

    // public Rectangle (Point hg, Point bd){
    //     this.hg = hg;
    //     this.bd = bd;
    // }

    public Rectangle(Point haut, Point bas) {
        hg = new Point(haut);
        bd = new Point(bas);
    }

    public void afficher(){
        System.out.println("Rectangle de hauteur : " + this.hg + "est de largeur " + this.bd);
    }

    public int surface(){
        return  (int) ((bd.getX()-hg.getX()) * (bd.getY() - hg.getY()));
    }

    public void zoom (int deltax, int deltay){
        hg.setX(hg.getX() + deltax);
        hg.setY(hg.getY() + deltay);

        bd.setX(bd.getX() + deltax);
        bd.setY(bd.getY() + deltay);
    }
        //Getter et setter pour l'attribut hg
    public Point getHg() {
        return hg;
    }
    
    public void setHg(Point hg) {
        this.hg = hg;
    }
    
        //Getter et setter pour l'attribut bd
    public Point getBd() {
        return bd;
    }
    
    public void setBd(Point bd) {
        this.bd = bd;
    }
}
