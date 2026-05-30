package SeleniumTraining;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertMethods {

    @Test
    public void FacebookPage(){
        String actual= "Facebook";
        String expected = "Facebook";
        String title= "facebook";

        //Hard Assert
        Assert.assertEquals(actual,expected);
        System.out.println("Test case passed");
        Assert.assertEquals(expected,title); // This line won't be executed because it's a Hard assert
        System.out.println("Verify the title");

    }


    @Test
    public void AmazonPage(){
        String actual= "Amazon";
        String expected = "Amazon";
        String title= "facebook";

        SoftAssert sa= new SoftAssert();
        sa.assertEquals(actual,expected); //Passed
        sa.assertEquals(actual,expected); //failed
        System.out.println("Navigate to Cart page"); //This will be executed because we are using soft assert
        sa.assertAll();

    }

    @Test
    public void AssertionMethods(){

        String actual= "Amazon";
        String expected = "Amazon";
        String title= "facebook";

        //assertEquals and assertNotEquals
        Assert.assertEquals(actual,expected); //Passed
        Assert.assertNotEquals(actual,title); //Passed
        //Assert.assertNotEquals(actual,expected); //Fails

        //assertEqualsNoOrder
        String[] str1= {"Apple", "Banana", "PineApple"};
        String[] str2= {"Apple", "PineApple", "Banana"};
        Assert.assertEqualsNoOrder(str1,str2);
        System.out.println("It will pass the assert statement even if the elements are not in correct proper");

        //assertTrue and assertFalse
        boolean exp = true;
        boolean act = false;
        boolean actResult= true;
        Assert.assertTrue(exp); //It will pass
        System.out.println("AssertTrue: End result will be true");
        Assert.assertFalse(act);
        System.out.println("AssertFalse: End result will be true");
        //Assert.assertFalse(exp);// This will fail

        //assertNull and assertNotNull
        String expectedName = "Sachin";
        String actualName = null;
        Assert.assertNull(actualName); // This will pass
        //Assert.assertNull(expectedName);// This will fail
        Assert.assertNotNull(expectedName); //This will pass
        System.out.println("This test case will pass");
        //Assert.assertNotNull(actualName);//This will fail
        System.out.println("This line will not be executed");

        //assertSame and assertNotSame
        AssertMethods firstObj = new AssertMethods();
        AssertMethods secObj= new AssertMethods();

        AssertMethods thirdObj = firstObj;

        //Assert.assertSame(firstObj,secObj);//This will fail because two objects do not refer to the same object
        Assert.assertSame(firstObj,thirdObj); //This will pass because two objects refer to the same object

        Assert.assertNotSame(firstObj,secObj); //This will pass because two objects do not refer to the same object
        System.out.println("Print");
        //Assert.assertNotSame(firstObj,thirdObj); //This will fail because two objects refer to the same object


    }

    @Test
    public void chrome(){
        System.out.println("Chrome Browser");
        Assert.fail("Invoke Error");

    }
}
