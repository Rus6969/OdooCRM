package com.odoo.step_definitions;

import com.odoo.pages.LoginPage;
import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.ConfigurationReader;
import com.odoo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {


    @Given("the user is on login page")
    public void the_user_is_on_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @Then("the user should be logged in")
    public void the_user_should_be_logged_in() {
        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("#Inbox - Odoo", actualTitle);
    }

    @When("sales manager enters login credentials")
    public void sales_manager_enters_login_credentials() {
        String username = ConfigurationReader.get("sales_manager_username");
        String password = ConfigurationReader.get("sales_manager_password");
        LoginPage loginSales = new LoginPage();
        loginSales.login(username, password);
    }

    @When("expense manager enters login credentials")
    public void expense_manager_enters_login_credentials() {
        String username = ConfigurationReader.get("expenses_manager_username");
        String password = ConfigurationReader.get("expenses_manager_password");
        LoginPage loginSales = new LoginPage();
        loginSales.login(username, password);
    }

    @When("events crm manager enters login credentials")
    public void events_crm_manager_enters_login_credentials() {
        String username = ConfigurationReader.get("events_manager_username");
        String password = ConfigurationReader.get("events_manager_password");
        LoginPage loginSales = new LoginPage();
        loginSales.login(username, password);
    }
}
