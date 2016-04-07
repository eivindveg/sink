package ninja.eivind.sink;

public class Sink extends Number {

    private Number value;

    public Sink(Number value) {
        this.value = value;
    }

    @Override
    public int intValue() {
        return value.intValue();
    }

    @Override
    public long longValue() {
        return value.longValue();
    }

    @Override
    public float floatValue() {
        return value.floatValue();
    }

    @Override
    public double doubleValue() {
        return value.doubleValue();
    }

    public static Number getFloatOrSink(Number boat) {
        if (boat instanceof Float) {
            return boat;
        }
        return new Sink(boat);
    }
}

