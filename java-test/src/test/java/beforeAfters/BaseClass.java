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

public class BaseClass{

    @BeforeSuite
    public void beforeSuiteBase(){ System.out.println("Before Suite (Base)");}

    @BeforeTest
    public void beforeTestBase(){ System.out.println("Before Test (Base)");}

    @BeforeClass
    public void beforeClassBase(){ System.out.println("Before Class (Base)");}

    @BeforeMethod
    public void beforeMethodBase(){ System.out.println("  Before Method (Base)");}

    @Test public void BaseTest(){
        System.out.println("Base Test 🟥(Base)");
    }

    @AfterSuite
    public void afterSuiteBase(){ System.out.println("After Suite (Base)");}

    @AfterTest
    public void afterTestBase(){ System.out.println("After Test (Base)");}

    @AfterClass
    public void afterClassBase(){ System.out.println("After Class (Base)");}

    @AfterMethod
    public void afterMethodBase(){ System.out.println("  After Method (Base)");}
}
