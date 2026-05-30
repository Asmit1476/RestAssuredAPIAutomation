package TestNg;

import org.testng.annotations.Test;

public class TestParallel2 {

    @Test
    public void Chrome1(){
        System.out.println("Chrome 1"+Thread.currentThread().getId());
    }

    @Test
    public void Chrome2(){
        System.out.println("Chrome 2"+Thread.currentThread().getId());
    }
}
