package beforeAfters;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChildClass extends BaseClass{

    @BeforeSuite
    public void beforeSuiteChild(){ System.out.println("Before Suite (Child)");}

    @BeforeTest
    public void beforeTestChild(){ System.out.println("Before Test (Child)");}

    @BeforeClass
    public void beforeClassChild(){ System.out.println("Before Class (Child)");}

    @BeforeMethod
    public void beforeMethodChild(){ System.out.println("  Before Method (Child)");}

    @Test public void childTest(){
        System.out.println("child Test 🟥(Child)");
    }

    @AfterSuite
    public void afterSuiteChild(){ System.out.println("After Suite (Child)");}

    @AfterTest
    public void afterTestChild(){ System.out.println("After Test (Child)");}

    @AfterClass
    public void afterClassChild(){ System.out.println("After Class (Child)");}

    @AfterMethod
    public void afterMethodChild(){ System.out.println("  After Method (Child)");}
}
