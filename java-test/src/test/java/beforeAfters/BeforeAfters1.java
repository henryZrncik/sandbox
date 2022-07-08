package beforeAfters;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfters1 {

    @BeforeSuite public void beforeSuite1(){ System.out.println("Before Suite 1");}

    @BeforeTest public void beforeTest1(){ System.out.println("Before Test 1");}

    @BeforeClass public void beforeClass1(){ System.out.println("Before Class 1");}

    @BeforeGroups public void beforeGroup1(){ System.out.println("Before Groups 1");}

    @BeforeMethod public void beforeMethod1(){ System.out.println("  Before Method 1");}


    @Test public void Test1Red() {
        System.out.println("   Test1🟥");
    }

    @Test public void Test1Green() {
        System.out.println("   Test1🟩");
    }

    @Test public void Test1Blue() {
        System.out.println("   Test1🟦");
    }
}
