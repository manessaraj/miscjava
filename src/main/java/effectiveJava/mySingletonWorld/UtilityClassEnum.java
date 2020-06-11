package effectiveJava.mySingletonWorld;


/*
 * If inheritance is not required, enum is best way to declare the singleton objects.
 * It doesn't suffer from Serialization problems and reflection substitution
 * */
public enum UtilityClassEnum {
    INSTANCE;
    public void doSomething() {
        return;
    }
}

