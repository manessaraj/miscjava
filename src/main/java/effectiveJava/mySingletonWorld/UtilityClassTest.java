package effectiveJava.mySingletonWorld;

import org.jetbrains.annotations.TestOnly;
import org.junit.Test;

public class UtilityClassTest {
    @Test
    public void  testThatSingletonCanBeMocked() {
        @Mock
        UtilityClassInterface instance = Mockito.mock(UtilityClassInterface);
    }
}
