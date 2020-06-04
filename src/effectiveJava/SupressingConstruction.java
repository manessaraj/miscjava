package effectiveJava;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class SupressingConstruction {

    /* Now this class is suppressed and no one can instantiate it now! */
    /* We can define the purpose of this class and the way it should be used, like Collections class in java.util.Collections */
    private SupressingConstruction(){}


    //lets write Binary search as it is in Collections class, an example of static factory.
    public static <T>
    int binarySearch(@NotNull List<? extends Comparable<?>> list, T key) {
        return 0;
    }
}
