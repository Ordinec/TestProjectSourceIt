package main;

import main.components.TextInput;
import main.locators.Locators;
import org.openqa.selenium.By;

import static main.utils.TestManager.waitForPageToLoad;

/**
 * Created by User on 03.11.2015.
 */
public class MainPage {
    private By searchFieldInput = By.id(Locators.SEARCH_FIELD.getValue());

    public ResultPage search(String searchParameter){
        TextInput searchField = new TextInput(searchFieldInput);
        searchField.type(searchParameter);
        waitForPageToLoad();
        return new ResultPage();
    }


}
