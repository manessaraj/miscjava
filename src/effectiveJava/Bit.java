package effectiveJava;


import org.jetbrains.annotations.NotNull;

// I1
/*
* This class highlights the properties of an immutable class.
* It is non-instantiable, instance controlled, enum like implementation.
* Its a basic implementation of Flyweight pattern.
* @author: saraj
 */

public class Bit extends Number implements Comparable<Bit> {
    private int val;
    private static Bit ONE = new Bit(true);
    private static Bit ZERO = new Bit(false);

    private Bit(boolean marked) {
        this.val = marked ? 1: 0;
    }

    //factory method, not analogue of any design pattern.
    public static Bit valueOf(boolean marked) {
        return marked ? Bit.ONE : Bit.ZERO;
    }

    @Override
    public int compareTo(@NotNull Bit o) {
        return 0;
    }

    @Override
    public int intValue() {
        return val;
    }

    @Override
    public long longValue() {
        return (long) (val);
    }

    @Override
    public float floatValue() {
        return (float) val;
    }

    @Override
    public double doubleValue() {
        return (double) val;
    }
}
