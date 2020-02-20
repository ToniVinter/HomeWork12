package carShop;

public class RangeKm {
    private final int low;
    private final int high;

    public RangeKm(int low, int high) {
        this.low = low;
        this.high = high;
    }

    public int getLow() {
        return low;
    }

    public int getHigh() {
        return high;
    }

    @Override
    public String toString() {
        return "RangeKm{" +
                "low=" + low +
                ", high=" + high +
                '}';
    }
}
