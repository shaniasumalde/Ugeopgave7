public class Drink {
    // Opgave 2: Kast en fejl selv

double price;
    public void setPrice(double price){
        if (price < 0) {
            throw new IllegalArgumentException("FEJL: Prisen må ikke være under 0 eller andet. Du tastede " + price);
        }
        this.price = price;
    }


    public double getPrice(){
        return price;
    }
}
