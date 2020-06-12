package effectiveJava.staticClasses;

import java.util.Dictionary;
import java.util.function.Supplier;

public class GenericTranslationService {

    private final Dictionary<String, String> dictionary;

    /* Java 8 way of using Factories. Here we can call in with any dictionary subclassing builder
    *
    * */
    public GenericTranslationService(Supplier<? extends Dictionary > dictionaryFactory) {
        this.dictionary  = dictionaryFactory.get();
    }

    //TODO: Write test class for this to test Supplier.
}
