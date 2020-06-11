package effectiveJava.mySingletonWorld;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class UtilityClassTest {
    @Mock
    UtilityClassInterface instance;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void  testThatSingletonCanBeMocked() {
       Assert.assertTrue(instance != null);
    }
}
