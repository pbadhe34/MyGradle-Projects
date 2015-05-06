 
package test.com.bank;

import junit.framework.TestCase;
import junit.framework.AssertionFailedError;

import com.company.HelloWorld;

/**
 * JUnit 3.2 testcases for HelloWorld
 *
 * @author malcolm g. davis
 */
public class HelloWorldTest extends TestCase {

    public HelloWorldTest(String name) {
        super(name);
    }

    protected void setUp() {
       System.out.println("Setting up HellWorld Test...");
    }

    protected void tearDown() {
 System.out.println("Tearing down the HellWorld Test...");
    }

    public static void main(String args[]) {
        junit.textui.TestRunner.run(HelloWorldTest.class);
    }

    public void testSayHello() {
        HelloWorld world = new HelloWorld();
        assert( world!=null );
        assertEquals("Hello World",  world.sayHello() );
    }
}
