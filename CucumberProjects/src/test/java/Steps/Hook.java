package Steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by E002152 on 4/19/2018.
 */



//adding Sravan Comments
public class Hook extends BaseUtil
{

    private  BaseUtil util;

    public Hook(BaseUtil util) {
        this.util = util;
    }

    @Before
    public void initializeTest(){

        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
        util.driver = new ChromeDriver();
    }

    @After
    public void tearDownThEBrowser(Scenario scenario)
    {
       util.driver.quit();
    }
}
