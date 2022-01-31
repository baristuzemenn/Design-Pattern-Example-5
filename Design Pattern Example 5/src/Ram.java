public class Ram extends Hardware{
    int busClockSpeed;
    int dataRate;

    public Ram(String name, double price, int compatibility,
               int busClockSpeed, int dataRate) {
        super(name, price, compatibility);
        this.busClockSpeed = busClockSpeed;
        this.dataRate = dataRate;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", compatibility=" + compatibility +
                ", busClockSpeed=" + busClockSpeed +
                ", dataRate=" + dataRate +
                '}';
    }
}
