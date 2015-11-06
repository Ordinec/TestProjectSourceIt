package main.components;

import org.openqa.selenium.By;

/**
 * Created by User on 06.11.2015.
 */
public class TextInput extends Element{

    public TextInput(By by){
        super(by);
    }

    public void type(String string){
        composeWebElement().clear();
        composeWebElement().sendKeys(string);
    }
}
