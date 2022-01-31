public class Processor extends Hardware{
    int memory;
    int baseSpeed;
    int maxSpeed;
    boolean isOverclocked;

    public Processor(String name, double price, int compatibility, int memory,
                     int baseSpeed, int maxSpeed, boolean isOverclocked) {
        super(name, price, compatibility);
        this.memory = memory;
        this.baseSpeed = baseSpeed;
        this.maxSpeed = maxSpeed;
        this.isOverclocked = isOverclocked;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", compatibility=" + compatibility +
                ", memory=" + memory +
                ", baseSpeed=" + baseSpeed +
                ", maxSpeed=" + maxSpeed +
                ", isOverclocked=" + isOverclocked +
                '}';
    }
}
