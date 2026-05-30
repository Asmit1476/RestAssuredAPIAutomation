package zap;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.zaproxy.clientapi.core.ApiResponse;
import org.zaproxy.clientapi.core.ClientApi;
import org.zaproxy.clientapi.core.ClientApiException;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ZapSecurityTest {
    static final String ZAP_PROXY_ADDRESS = "localhost";
    static final int ZAP_PROXY_PORT = 8081;
    static final String ZAP_API_KEY = "e818gofv48873e8lsi1o1snlp7";

    private WebDriver driver;
    private ClientApi api;


    @BeforeMethod
    public void setup(){

//        ProcessBuilder pb = new ProcessBuilder("/Applications/OWASP\\ ZAP.app/Contents/Java/zap.sh");  // full path to script, use zap.bat on Windows
//        pb.directory(new File("/Users/asmit/Documents/Web\\ Automation\\ Template/Web_Automation_Template/Training2022/src/main/java/zap/ZapSecurityTest.java"));  // directory where the script is in
//        try {
//            Process p = pb.start();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
       // driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);


        String proxyServerURL = ZAP_PROXY_ADDRESS + ":" + ZAP_PROXY_PORT;

        Proxy proxy = new Proxy();
        proxy.setHttpProxy(proxyServerURL);
        proxy.setSslProxy(proxyServerURL);

        ChromeOptions co = new ChromeOptions();
        co.setAcceptInsecureCerts(true);
        co.setProxy(proxy);

        //System.setProperty("webdriver.chrome.driver","/Users/asmit/Downloads/chromedriver");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(co);
        api = new ClientApi(ZAP_PROXY_ADDRESS,ZAP_PROXY_PORT,ZAP_API_KEY);

    }

    @Test
    public void codecraftSecurityTest(){
        driver.get("https://www.codecrafttech.com/");
        Assert.assertTrue(driver.getTitle().contains("CodeCraft"));
    }

    @AfterMethod
    public void tearDown(){

        if(api != null){
            String title = "Codecraft ZAP Security Report";
            String template = "traditional-html";
            String description = "This is Codecraft ZAP Security Report";
            String reportFileName = "codecraft-zap-report.html";
            //String targetFolder = "/Users/asmit/Downloads/Zap_Report";
            String targetFolder = System.getProperty("user-dir"); //or

            try {
                ApiResponse response = api.reports.generate(title,template,null,description,null,null,null,null,null,reportFileName,null,targetFolder,null);
                System.out.println("ZAP Report generated at this location:" + response.toString());
            } catch (ClientApiException e) {
                e.printStackTrace();
            }
        }
        driver.quit();



    }
}
