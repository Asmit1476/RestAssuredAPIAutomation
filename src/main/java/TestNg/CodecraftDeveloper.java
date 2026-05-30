package TestNg;

import org.testng.annotations.Test;

public class CodecraftDeveloper {

    @Test
    public void Codecraft_Dev1(){
        System.out.println("This is the Dev 1 page |" + Thread.currentThread().getId());
    }

    @Test
    public void Codecraft_Dev2(){
        System.out.println("This is the Dev 2 page | "+Thread.currentThread().getId());
    }
}
