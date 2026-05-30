package TestNg;

import org.testng.annotations.Test;

public class CodecraftQA {

    @Test(enabled = false)
    public void Codecraft_Homepage(){
        System.out.println("This is the home page | "+ Thread.currentThread().getId());
    }

    @Test(enabled = false)
    public void Codecraft_Adminpage(){
        System.out.println("This is the home page | "+ Thread.currentThread().getId());
    }

    @Test(enabled = true)
    public void Codecraft_HelpPage(){
        System.out.println("This is the Help page | "+ Thread.currentThread().getId());
    }
}
