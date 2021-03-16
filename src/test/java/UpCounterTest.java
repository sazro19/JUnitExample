import org.junit.*;

import java.lang.reflect.AnnotatedArrayType;

import static org.junit.Assert.*;

public class UpCounterTest {

    private AbstractCounter counter;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before UpCounterTest.class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After UpCounterTest.class");
    }

    @Before
    public void initTest() {
        counter = new UpCounter(1000);
    }

    @After
    public void afterTest() {
        counter = null;
    }

    @Test
    public void testCount() {
        long t = counter.getCounter();
        counter.count();
        if (t == UpCounter.MAX_VALUE) {
            assertEquals(0, counter.getCounter());
        } else {
            assertEquals(t + 1, counter.getCounter());
        }
    }

    @Test
    public void testDefaultConstruct() {
        AbstractCounter counter = new UpCounter();
        assertEquals(0, counter.getCounter());
    }

    @Test
    public void testPrimParConstruct() {
        AbstractCounter counter = new UpCounter(10);
        assertEquals(10, counter.getCounter());
    }

    @Test
    public void testLinkParConstruct() {
        AbstractCounter counter = new UpCounter(this.counter);
        assertEquals(1000, counter.getCounter());
    }
}