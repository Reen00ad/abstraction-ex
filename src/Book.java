public class Book extends Product{
    private String auther;

    public Book(String name, double price, String auther) {
        super(name, price);
        this.auther = auther;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    @Override
    public double getDiscount() {
        double diss = (getPrice() * 30)/100;
        double total = getPrice() - diss;
        return total;
    }

    @Override
    public String toString() {
        return "Book auther = " + auther + " book name : "+getName()+
                " price : "+getPrice() ;
    }
}
