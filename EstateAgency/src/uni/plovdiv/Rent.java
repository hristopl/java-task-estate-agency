package uni.plovdiv;

public class Rent extends Estate{
    private double deposit;

    public Rent(double price,double squareMeters,double deposit){
        super(price,squareMeters);
        this.deposit = deposit;

    }

    @Override
    public void info() {
        System.out.println("Estate type:" + Rent.class.getSimpleName()+", price: "+getPrice()+", square meters: "+getSquareMeters()+ ", deposit: "+deposit);
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }
}
