package pages;


import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ASUHomePage extends BaseUtil {
    //private BaseUtil util;

    public ASUHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver=driver;
    }

    @FindBy(how= How.CSS, using = "[id=\"radio-online\"]")
    public WebElement ASUOnlineClasses;
    @FindBy(how= How.ID, using = "term")
    public WebElement term;
    @FindBy(how= How.ID, using = "subjectEntry")
    public WebElement subject;
    @FindBy(how= How.ID, using = "catNbr")
    public WebElement catNumber;
    @FindBy(how= How.CSS, using = "[class=\"toggle-advanced-search\"]")
    public WebElement advanceSearchLink;
    @FindBy(how= How.ID, using = "level")
    public WebElement level;
    @FindBy(how= How.XPATH, using = ".//a[text()='Add']")
    public WebElement addButton;
    @FindBy(how= How.CSS, using = "[id=\"loading-alert\"] [class=\"fa fa-spinner fa-spin\"]")
    public WebElement loadingSpinner;
    @FindBy(how= How.ID, using = "session-button")
    public WebElement sectionTextBox;

    @FindBy(how= How.ID, using = "location-button")
    public WebElement locationButton;
    @FindBy(how= How.XPATH, using = "(.//td[@class=\"availableSeatsColumnValue\"]/div/div)[1]")
    public WebElement openSeats;







    public void navigateToATUHomePage(String Url)
    {
        driver.get(Url);
    }

    /**
     * Select ASU online classes
     */
    public void selectASUOnlineClasses()
    {
        ASUOnlineClasses.click();
    }

    /**
     * Select Term from dropdown
     * @param termValue
     */
    public void selectTerm(String termValue){
        Select dropdown = new Select(term);
        dropdown.selectByVisibleText(termValue);
    }

    /**
     * Enter SubjectName
     * @param subjectName
     */
    public void enterSubject(String subjectName){
        subject.sendKeys(subjectName);
    }

    /**
     * Enter CatNumber
     * @param catNumberValue
     */
    public void enterCatNumber(String catNumberValue){
        catNumber.sendKeys(catNumberValue);
    }

    /**
     * Click On advanceSearch
     */
    public void clickOnAdvanceSearch(){
        advanceSearchLink.click();
    }

    /**
     * Select Level frrom dropdown
     * @param levelValue
     */
    public void selectLevel(String levelValue)
    {
        Select levelDropdown = new Select(level);
        levelDropdown.selectByVisibleText(levelValue);
    }

    /**
     * Click On Add Button from catalog
     */
    public void clickOnAddButtonFromCatalogList()
    {
        WebDriverWait wait = new WebDriverWait(driver,120);
        wait.until(ExpectedConditions.invisibilityOf(loadingSpinner));
        addButton.click();
    }

    /**
     * Select Section From the List
     * @param sectionName
     */
    public void selectSectionFromTheList(String sectionName)
    {
        WebDriverWait wait = new WebDriverWait(driver,120);
        sectionTextBox.click();
        driver.findElement(By.xpath(".//span[text()='"+sectionName+"']//preceding-sibling::input")).click();
        wait.until(ExpectedConditions.invisibilityOf(loadingSpinner));
    }

    /**
     * Select location from the list
     * @param locationName
     */
    public void selectLocationFromTheList(String locationName){
        WebDriverWait wait = new WebDriverWait(driver,120);
        locationButton.click();
        driver.findElement(By.xpath(".//span[text()='"+locationName+"']//preceding-sibling::input")).click();
        wait.until(ExpectedConditions.invisibilityOf(loadingSpinner));
    }

    /**
     * Number of seats available
     * @return
     */
    public String numberOfSeatsAvailable()
    {

        return "Number Of Seats Open : "+openSeats.getText().trim();
    }
}
