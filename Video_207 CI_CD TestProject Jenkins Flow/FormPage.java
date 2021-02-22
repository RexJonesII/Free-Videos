package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FormPage extends BasePage {

  private By countryDropDown = By.id("country");
  private By addressField = By.cssSelector("#address");
  private By emailAddressField = By.cssSelector("#email");
  private By phoneNumberField = By.xpath("//input[@id='phone']");
  private By saveButton = By.xpath("//button[@id='save']");
  private By confirmationMessage = By.cssSelector("#saved span");

  public FormPage (WebDriver driver) {
    super(driver);
  }

  public void selectFromCountryDropDown (String value) {
    Select country = new Select(find(countryDropDown));
    country.selectByVisibleText(value);
  }

  public void completeForm (String country, String address, String email, String phone) {
    selectFromCountryDropDown(country);
    type(address, addressField);
    type(email, emailAddressField);
    type(phone, phoneNumberField);
    click(saveButton);
  }

  public String getConfirmationMessage () {
    return find(confirmationMessage).getText();
  }
}