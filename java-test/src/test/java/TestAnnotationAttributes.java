import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class TestAnnotationAttributes {

    // Exceptions
    @Test(expectedExceptions={IOException.class,NullPointerException.class})
    public void exceptionTestPass() throws Exception{
        System.out.println("shit my face");
        System.out.println("exception test");
        throw new IOException();
    }

    // Timeout
    @Test(timeOut=5000)
    public void timeTestOne() throws InterruptedException{
        Thread.sleep(2000);
        System.out.println("Pass");
    }

    // Data driven
    @DataProvider(name = "my-data-provider")
    public Object[][] dataProviderMethod() {
        return new Object[][] {
                { "a1", "b1", "c1" },
                { "a2", "b2", "c2" }
        };
    }
    @Test(dataProvider = "my-data-provider")
    public void testMethod(String A, String B, String C) {
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println("---");
    }






}
