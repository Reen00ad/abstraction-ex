public class Movie extends Product{
    private String director;

    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public double getDiscount() {
        double diss = (getPrice() * 10)/100;
        double total = getPrice() - diss;
        return total;
    }

    @Override
    public String toString() {
       return "Movie director = " + director  +" book name : "+getName()+
                " price : "+getPrice() ;
    }
}
