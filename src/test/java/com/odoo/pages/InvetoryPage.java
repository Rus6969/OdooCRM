package com.odoo.pages;

import com.odoo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvetoryPage {
    public InvetoryPage(){ PageFactory.initElements(Driver.get(),this);}

    @FindBy(xpath = "//li//a[@data-menu='378']")
    public WebElement products;

    @FindBy(xpath = "//div//button[@accesskey='c']")
    public WebElement createBTN;

    @FindBy(id = "o_field_input_2443")
    public WebElement productName;

    @FindBy(xpath = "//div//button[@accesskey='s']")
    public WebElement saveBTN;

    @FindBy(xpath = "//h1")
    public WebElement actualProduct;

}
