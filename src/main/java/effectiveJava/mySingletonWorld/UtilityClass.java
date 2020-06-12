package effectiveJava.mySingletonWorld;

import java.io.Serializable;

public class UtilityClass implements UtilityClassInterface, Serializable {

    /*
    * If your instance can't be overridden by reflection machnism, then don't use static factory method
    * to implement singleton (i.e. getInstance), rather make instance public because it will make Client code more readable
    * */
    private final UtilityClass instance = new UtilityClass();

    /*
    * This is problematic, deserializing can create multiple instances of this class.
    * */
    private String name;
    /*
    * The better way, if instance is Serializable (implements Serializable instance).
    * */

    private transient String nameBetter;

    private UtilityClass() {
        this.name = this.getClass().getName();
        this.nameBetter = this.getClass().getName();
    }

    public UtilityClass getInstance() {
        /* This will stop any overriding of instance using reflection, because instance is not accessible*/
        return instance;
    }

    // This is reserved methodName, helps to resolve objects on read.
    public Object readResolve(){
        // Let garbage collector take care of any impersonator created because of serialization
        return instance;
    }
}
