package com.odoo.step_definitions;

import com.odoo.pages.DashboardPage;
import com.odoo.pages.InvetoryPage;
import com.odoo.utilities.BrowserUtils;
import com.odoo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class InvetoryStepDefs {



    @Then("sales manager click on one of the options")
    public void sales_manager_click_on_one_of_the_options() {
        // Write code here that turns the phrase above into concrete actions
//         DashboardPage dashboardPage=new DashboardPage();
//         dashboardPage.options.click();
//         dashboardPage.discuss.click();
//         BrowserUtils.waitFor(3);
//        Driver.get().findElement(By.id("oe_applications")).click();
//        Driver.get().findElement(By.xpath("//ul//li//a[@class='oe_menu_leaf']")).click();


    }



    @When("sales manager click on invetory module")
    public void sales_manager_click_on_invetory_module() {
        DashboardPage dashboardPage= new DashboardPage();
        dashboardPage.invetory.click();
    }

    @Then("sales manager clicks on products")
    public void sales_manager_clicks_on_products() {
        BrowserUtils.waitFor(2);
        InvetoryPage invetoryPage=new InvetoryPage();
        invetoryPage.products.click();
        BrowserUtils.waitFor(2);
    }

    @Then("sales manager clicks on create button product creation window appeared")
    public void sales_manager_clicks_on_create_button_product_creation_window_appeared() {
        InvetoryPage invetoryPage = new InvetoryPage();
        invetoryPage.createBTN.click();
        BrowserUtils.waitFor(3);
    }

    @When("sales manager give expected name {string} click save btn")
    public void sales_manager_give_expected_name_click_save_btn(String string) {
       InvetoryPage invetoryPage = new InvetoryPage();
       invetoryPage.productName.sendKeys("Toyota Corolla");
       invetoryPage.saveBTN.click();
    }


    @Then("expected name must be the same with actual product name")
    public void expected_name_must_be_the_same_with_actual_product_name() {
        InvetoryPage invetoryPage= new InvetoryPage();
        System.out.println(invetoryPage.actualProduct.getText());
        String actual= invetoryPage.actualProduct.getText();
        Assert.assertEquals("Toyota Corolla" ,actual);
    }
}
