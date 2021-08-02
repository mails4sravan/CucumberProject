package Steps;

import Base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.ASUHomePage;

import java.util.List;

public class Scenario1Step extends BaseUtil {

    private  BaseUtil util;
    ASUHomePage homepageObj;
    public Scenario1Step(BaseUtil util) {
        this.util = util;
         homepageObj = new ASUHomePage(util.driver);

    }

    @Given("^I navigate to ASU home page$")
    public void iNavigateToASUHomePage(DataTable table) throws Throwable {
        List<List<String>> data= table.raw();
        util.driver.manage().window().maximize();
        homepageObj.navigateToATUHomePage(data.get(0).get(0));
        util.driver.manage().window().maximize();
    }

    @And("^I select ASU Online Classes$")
    public void iSelectASUOnlineClasses() throws Throwable {
        homepageObj.selectASUOnlineClasses();
    }

    @And("^I select Term$")
    public void iSelectTerm(DataTable table) throws Throwable {
        List<List<String>> data= table.raw();
        homepageObj.selectTerm(data.get(0).get(0));
    }

    @And("^I select Subject$")
    public void iSelectSubject(DataTable table) throws Throwable {
        List<List<String>> data= table.raw();
        homepageObj.enterSubject(data.get(0).get(0));
    }

    @And("^I select CatNumber$")
    public void iSelectCatNumber(DataTable table) throws Throwable {
        List<List<String>> data= table.raw();
        homepageObj.enterCatNumber(data.get(0).get(0));
    }

    @And("^I click on Advance Search$")
    public void iClickOnAdvanceSearch() throws Throwable {
        homepageObj.clickOnAdvanceSearch();
    }

    @And("^I select Level$")
    public void iSelectLevel(DataTable table) throws Throwable {
        List<List<String>> data= table.raw();
        homepageObj.selectLevel(data.get(0).get(0));
    }

    @And("^I select Course From Catalog List$")
    public void iSelectCourseFromCatalogList() throws Throwable {
        homepageObj.clickOnAddButtonFromCatalogList();
    }

    @Then("^I should see the login Form$")
    public void iShouldSeeTheLoginForm() throws Throwable {
    }

    @And("^I Click and Select Section$")
    public void iClickAndSelectSection(DataTable table) throws Throwable {
        List<List<String>> data= table.raw();
        homepageObj.selectSectionFromTheList(data.get(0).get(0));
    }

    @And("^I Click and  Select Location$")
    public void iClickAndSelectLocation(DataTable table) throws Throwable {
        List<List<String>> data= table.raw();
        homepageObj.selectLocationFromTheList(data.get(0).get(0));
    }

    @Then("^I should see Number of seats available$")
    public void iShouldSeeNumberOfSeatsAvailable() throws Throwable {
        homepageObj.numberOfSeatsAvailable();
    }
}
