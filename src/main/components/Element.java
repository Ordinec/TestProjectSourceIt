package main.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static main.utils.TestManager.getDriver;

/**
 * Created by User on 06.11.2015.
 */
public abstract class Element {
    protected By by;

    protected Element(By by){
        this.by = by;
    }

    protected WebElement composeWebElement(){
        return getDriver().findElement(by);
    }
}
