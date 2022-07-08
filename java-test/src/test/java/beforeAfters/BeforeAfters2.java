package beforeAfters;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfters2 {

    @BeforeSuite
    public void beforeSuite1(){ System.out.println("Before Suite 2");}

    @BeforeTest
    public void beforeTest1(){ System.out.println("Before Test 2");}

    @BeforeClass
    public void beforeClass1(){ System.out.println("Before Class 2");}

    @BeforeGroups
    public void beforeGroup1(){ System.out.println("Before Groups 2");}

    @BeforeMethod
    public void beforeMethod1(){ System.out.println("  Before Method 2");}


    @Test public void Test1Red() {
        System.out.println("   Test2🟧");
    }

    @Test public void Test1Green() {
        System.out.println("   Test2🟪");
    }

    @Test public void Test1Blue() {
        System.out.println("   Test2🟨");
    }
}
