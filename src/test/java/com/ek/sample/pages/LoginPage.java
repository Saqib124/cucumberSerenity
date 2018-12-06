package com.ek.sample.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "marhabaLocations:loginLocation1")
    private WebElement txtAirport;

    @FindBy(id = "marhabaLocations:loginLocation2")
    private WebElement txtLocation;

    @FindBy(name = "marhabaLocations:j_id26")
    private WebElement loginButton;

    public void selectAirport(String airport) {
        selectByValue(txtAirport, airport);
    }

    public void selectLocation(String location) {
        selectByValue(txtLocation, location);
    }

    public void tabLoginButton() {
        clickOn(loginButton);
    }
}

