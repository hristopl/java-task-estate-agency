package uni.plovdiv;

public abstract class Estate {

    private double price;
    private double squareMeters;

    public Estate(double price, double squareMeters){
        this.price = price;
        this.squareMeters = squareMeters;
    }

    public abstract void info();

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(double squareMeters) {
        this.squareMeters = squareMeters;
    }
}
