package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AmazonPage extends BasePage {

    @FindBy(xpath = "//span[@class='nav-line-2' and contains(text(), 'Departments')]")
    WebElement menuDepartments;

    @FindBy(css = "#nav-flyout-shopAll>*>a")
    List<WebElement> listDepartments;



    public AmazonPage() {
        PageFactory.initElements(driver, this);
    }

    public void navigateToDepartment(String department){
        int numDepartmetns = listDepartments.size();
        waitForElement(menuDepartments);
        mouseoverElement(menuDepartments);
        waitForElement(listDepartments.get(numDepartmetns-1));
        for(WebElement e: listDepartments){
            if(e.getText().toLowerCase().equals(department.toLowerCase())){
                e.click();
                break;
            }
        }
    }


}
