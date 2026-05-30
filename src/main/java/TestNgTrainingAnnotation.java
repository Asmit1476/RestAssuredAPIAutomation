import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.sql.SQLOutput;

public class TestNgTrainingAnnotation {

//    1.@BeforeSuite
//    2.@BeforeTest
//    3.@BeforeClass
//    4.@BeforeMethod 2 times
//    5.@Test
//    @Test
//    6.@AfterMethod 2 times
//    7.@AfterClass
//    8.@AfterTest
//    9.@AfterSuite


//    @BeforeSuite
//    public void setup(){
//
//        System.out.println("This is a setup method");
//    }
//
//    @BeforeTest
//    public void launchBrowser(){
//        System.out.println("Launch the browser");
//    }
//
//    @BeforeClass
//    public void navigateToUrl(){
//        System.out.println("Navigate to a specified URL");
//    }
//
//    @BeforeMethod
//    public void login(){
//        System.out.println("Please Login");
//    }

//    @Test(timeOut = 2000)
//    public void Codecraft() throws InterruptedException {
//        System.out.println("Running this testcase");
////        int num = 1/0;
////        System.out.println("This test case will not fail");
//        Thread.sleep(1000);
//    }
//
//    @Test(invocationCount = 3)
//    public void Xmen(){
//        System.out.println("Marvel");
//    }
//
//    @Test(priority = 3)
//    public void verifyHomeScreen(){
//        System.out.println("This is the first testcase - Verify the Home Screen");
//        String actual = "Codecraft";
//        String expected = "Codecraft";
//
//        Assert.assertEquals(actual,expected);
//    }
//
//    @Test(priority = 2)
//    public void verifyTitleScreen(){
//        System.out.println("This is the second testcase - Verify the Title");
//    }
//
//
//    @Test(priority = 1)
//    public void verifySignOut(){
//        System.out.println("This is the third testcase - Verify the signout feature");
//    }

//    @AfterMethod
//    public void logout(){
//        System.out.println("This will perform Logout");
//    }
//
//    @AfterClass
//    public void closetheBrowser(){
//        System.out.println("This will close the browser");
//    }
//
//    @AfterTest
//    public void deleteCookies(){
//        System.out.println("Deleting all the cookies");
//    }
//
//    @AfterSuite
//    public void generateReport(){
//        System.out.println("Generating the report");
//    }

//
//    @BeforeGroups(value = "smoke")
//    public void Test1(){
//        System.out.println("Test 1");
//        String actual = "Abc";
//        String expected = "abc";
//        Assert.assertNotEquals(actual,expected);
//    }
//
//    @Test(groups = "smoke")
//    public void Test2(){
//        System.out.println("Test 2");
//    }
//
//    @Test()
//    public void Tes42(){
//        System.out.println("Test 4");
//    }
//
//    @AfterGroups(value="smoke")
//    public void Tes3(){
//        System.out.println("Test 3");
//    }

    @Test
    public void Test1(){
        System.out.println("Test 1");
        String actual = "Abc";
        String expected = "Abc";
        String expected1 = "abc";

        //assertNotEquals and assertEquals
        Assert.assertNotEquals(actual,expected1);
        Assert.assertEquals(actual,expected);

        //assertSame and assertNotSame
        TestNgTrainingAnnotation demo1 = new TestNgTrainingAnnotation();
        TestNgTrainingAnnotation demo2 = new TestNgTrainingAnnotation();
        TestNgTrainingAnnotation ob= demo2;
        Assert.assertNotSame(demo1,demo2);
        Assert.assertSame(ob,demo2);

        //assertNull and assertNotNull
        String str1 = null;
        String str2 = "hello";
        Assert.assertNull(str1);
        Assert.assertNotNull(str2);

        //assertTrue and assertFalse
        boolean actualResult = true;
        boolean expectedResult = true;
        boolean expectation = false;
        Assert.assertTrue(actualResult);
        Assert.assertFalse(expectation);
        Assert.assertTrue(expectation);
        Assert.assertFalse(actualResult);


        //assertEqualsNoOrder
        String[] strAr1 = {"Mango", "Apple", " Banana"};
        String[] strAr2 = {"Apple", "Mango", " Banana"};
        Assert.assertEqualsNoOrder(strAr1,strAr2);



        }

        @Test
        public void Facebook(){
            System.out.println("Facebook");
            Assert.fail("Unknown Error");
        }

    @Test
    public void Google(){
        System.out.println("Facebook");

        String actual = "Abc";
        String expected = "Abc";
        String expected1 = "abc";

        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actual,expected);
        sa.assertEquals(actual,expected1);
        System.out.println("running");
        sa.assertAll();

    }

    }


