package Products;

public class HotDrink extends Product {

    private int temperature;
    private int volume;

    public HotDrink(String name, double price, int volume, int temperature) {
        super(name, price);
        this.volume = volume;
        this.temperature = temperature;
    }

    public int getTemperature() {
        return this.temperature;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int value) {
        this.volume = value;
    }

    public void setTemperature(int value) {
        this.temperature = value;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Price: %s, Volume: %s, Tempreture: %s", 
        super.getName(), super.getPrice(), this.volume, this.temperature);
    }
}
