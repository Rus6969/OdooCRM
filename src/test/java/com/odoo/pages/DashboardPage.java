package com.odoo.pages;

import com.odoo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage{
    public DashboardPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//div//ul//li//a[@data-menu='347']")
    public WebElement invetory;

    @FindBy(xpath = "//ul//li//a[@class='oe_menu_leaf']")
    public WebElement discuss;

    @FindBy(id = "oe_applications")
    public WebElement options;

}
