package com.odoo.step_definitions;

import com.odoo.pages.DashboardPage;
import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NotesStepDefs {


    @When("the user clicks on Note module")
    public void the_user_clicks_on_Note_module() {
        DashboardPage hp = new DashboardPage();
        hp.notesButton.click();
    }

    @Then("the user should be navigated to Note")
    public void the_user_should_be_navigated_to_Note() {
        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Notes - Odoo", actualTitle);
    }

}
