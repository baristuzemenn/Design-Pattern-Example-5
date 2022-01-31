public class GraphicsCard extends Hardware{
    int bitRate;
    int memoryAmount;
    String memoryType;
    boolean isOverclocked;

    public GraphicsCard(String name, double price, int compatibility, int bitRate,
                        int memoryAmount, String memoryType, boolean isOverclocked) {
        super(name, price, compatibility);
        this.bitRate = bitRate;
        this.memoryAmount = memoryAmount;
        this.memoryType = memoryType;
        this.isOverclocked = isOverclocked;
    }

    @Override
    public String toString() {
        return "GraphicsCard{" +
                "bitRate=" + bitRate +
                ", memoryAmount=" + memoryAmount +
                ", memoryType='" + memoryType + '\'' +
                ", isOverclocked=" + isOverclocked +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", compatibility=" + compatibility +
                '}';
    }
}
