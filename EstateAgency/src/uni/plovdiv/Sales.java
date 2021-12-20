package uni.plovdiv;

public class Sales extends Estate{
    public Sales(double price, double squareMeters){
        super(price,squareMeters);
    }

    @Override
    public void info() {
        System.out.println("Estate type: "+Sales.class.getSimpleName()+", price: "+getPrice()+", square meters: "+getSquareMeters());
    }
}
