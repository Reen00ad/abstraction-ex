public class Main {
    public static void main(String[] args) {

    Book b1 = new Book("life",50,"Reenad");
        System.out.println(b1.toString());
        System.out.println(" price after discount : "+b1.getDiscount());
        System.out.println("-------------------------------------------");

        Movie m1 = new Movie("home",100,"james");
        System.out.println(m1.toString());
        System.out.println(" price after discount : "+m1.getDiscount());
        System.out.println("-------------------------------------------");

      MovablePoint mp1 = new MovablePoint(2,5,8,1);
        System.out.println(mp1.toString());
        System.out.println("-------------------------------------------");
        mp1.moveUp();
        System.out.println("move up : "+mp1);
        System.out.println("-------------------------------------------");
        mp1.moveRight();
        System.out.println("move right : "+mp1);
        System.out.println("-------------------------------------------");
        mp1.moveDown();
        System.out.println("move down : "+mp1);
        System.out.println("-------------------------------------------");
        mp1.moveLeft();
        System.out.println("move left : "+mp1);
        System.out.println("-------------------------------------------");


    }
}