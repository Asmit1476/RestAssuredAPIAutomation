package SeleniumTraining;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class TestNgBasics {
    @BeforeSuite
    public void setup(){
        System.out.println("BeforeSuite ---> Staring Setup");
    }

    @BeforeTest
    public void launchBrowser(){
        System.out.println("BeforeTest --> Launching Browser");
    }

    @BeforeClass
    public void launchUrl(){
        System.out.println("BeforeClass --> Launching URL");
    }

    @BeforeMethod
    public void login(){
        System.out.println("BeforeMethod --> Login to application");
    }

    @Test
    public void googleTestCase(){
        System.out.println("This test case will be executed first");
    }

    @Test
    public void facebookTestCase(){
        System.out.println("This test case will be executed second");
    }

    @Test(priority = 1, invocationCount = 1)
    public void testMessageFeature(){
        System.out.println("Test --> Check the Messaging feature");
    }


    @Test(priority = 2)
    public void testApplicationTitle(){
        String actual = "Asmit";
        String expected = "Anand";

        System.out.println("Test --> Check the title of the application");
        Assert.assertEquals(actual,expected);
    }

    @Test(dependsOnMethods = "testApplicationTitle")
    public void testProfilePic(){
        System.out.println("Test --> Check the Profile Pic");
    }

    @Test(priority = 3, timeOut = 2000)
    public void testStatus(){

        try {
//        String actual = "Asmit";
//        String expected = "Anand";
            Thread.sleep(3000);

            System.out.println("Test --> Check the Status");
//        Assert.assertEquals(actual,expected);

        }catch (Exception e){
            System.out.println(e);
        }
    }

    @Test(priority = 4, expectedExceptions = ArithmeticException.class)
    public void testHomePage(){
        int num = 10/0;
        System.out.println("Number is " +num);
    }




    @AfterMethod
    public void signout(){
        System.out.println("AfterMethod --> Sign-out of aapplication ");
    }


    @AfterClass
    public void closeBrowser(){
        System.out.println("AfterClass --> Closing Browser");
    }

    @AfterTest
    public void deleteAllCookies(){
        System.out.println("AfterTest --> Deleting all the cookies");
    }

    @AfterSuite
    public void generateReport(){
        System.out.println("AfterSuite --> Generating Report");
    }

//    @BeforeGroups(value = "smoke")
//    public void beforeGroupMethod(){
//        System.out.println("Before Group ---> It will run before the test associated with the particular group");
//    }
//
//    @Test(groups = "smoke")
//    public void checkPost(){
//        System.out.println("Group Test case --> For checking group feature");
//    }
//
//    @AfterGroups(value = "smoke")
//    public void beforeAfterGroupMethod(){
//        System.out.println("After Group ---> It will run after the test associated with the particular group");
//    }
}
