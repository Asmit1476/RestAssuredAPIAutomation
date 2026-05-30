package TestNg;

import org.testng.annotations.Test;

public class TestNgGroups {

    @Test(groups = {"functional","smoke"})
    public void postFeature(){
        System.out.println("It will post the tweet");
    }

    @Test(groups = "functional")
    public void deleteFeature(){
        System.out.println("It will delete the post");
    }

    @Test(groups = "smoke")
    public void updateFeature(){
        System.out.println("It will update the post");
    }
}
