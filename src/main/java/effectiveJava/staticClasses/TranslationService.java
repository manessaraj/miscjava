package effectiveJava.staticClasses;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;

/*
* Since it is a utility class, it should not be coded to interface
* */

// Non instantiable utility class
public class TranslationService {
    /*
    * Item 4 & 5
    * */

    /* We should not create a instance of a Utility class ever. It means to be used in static way
    * So we need to make constructor private, else default constructor can be used to instantiate the class
    * But it should be even invoked from with in the class, like in singleton pattern.
    * */

    private final static Dictionary<String, String> dictionary = new Hashtable<>();
    // Suppress the default constructor
    private TranslationService(){
        //Suppress the internal initialization.
        throw new AssertionError();
    }

    public static String translate(String key) {
        String translation = null;
        if (key != null) {
            translation = dictionary.get(key);
        }
        return translation;
    }

    /*
    * Antipattern:  here is dictionary, which should not be final and unique, as we might have multiple services.
    * This class depends on a underlying resource which is dictionary here, so this resource should be injected via
    *  dependency injection (preferrably constructor)
    * */
}
