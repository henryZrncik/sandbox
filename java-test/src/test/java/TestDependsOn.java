import org.testng.annotations.Test;

public class TestDependsOn{

    @Test
    public void test1(){ System.out.println("Test 1"); }

    @Test
    public void test2(){ System.out.println("Test 2"); }

    @Test(dependsOnMethods={"test1","test2", "test4"})
    public void test3(){ System.out.println("Test 3"); }

    @Test
    public void test4(){ System.out.println("Test 4"); }
}


