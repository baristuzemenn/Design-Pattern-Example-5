public class MotherBoard extends Hardware{
    int socketNumber;
    int maxRamSupport;

    public MotherBoard(String name, double price, int compatibility, int socketNumber, int maxRamSupport) {
        super(name, price, compatibility);
        this.socketNumber = socketNumber;
        this.maxRamSupport = maxRamSupport;
    }

    @Override
    public String toString() {
        return "MotherBoard{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", compatibility=" + compatibility +
                ", socketNumber=" + socketNumber +
                ", maxRamSupport=" + maxRamSupport +
                '}';
    }
}
