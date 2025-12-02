package ObjectRepository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class HomeScreen {

	AndroidDriver driver;
	public HomeScreen(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//android.widget.TextView[@text=''])[1]")
	private WebElement profileDropButton;
	
	
	@FindBy(xpath = "(//android.widget.TextView[@text=''])[2]")
	private WebElement dateDropDwn;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='OK']")
	private WebElement okButton;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='Cancel']")
	private WebElement cancelButton;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc='Clear']")
	private WebElement clearButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='View Bill']")
	private WebElement viewBillButton;
	
	@FindBy(xpath = "//android.view.View[@content-desc='Shop']")
	private WebElement shopTab;
	
	@FindBy(xpath = "//android.view.View[@content-desc=', Help']")
	private WebElement helpTab;
	
	@FindBy(xpath = "//android.view.View[@content-desc=', Orders']")
	private WebElement ordersTab;
	
	public void clickOnProfileDropButton() {
		try {
			profileDropButton.click();
			System.out.println("Click on profileDropButton");
		} catch (Exception e) {
			System.out.println();
		}
	}

	public void DateRange() {

	    // --- Function to add ordinal suffix to day ---
	    java.util.function.Function<LocalDate, String> formatDate = (date) -> {
	        int day = date.getDayOfMonth();
	        String suffix;

	        if (day >= 11 && day <= 13) {
	            suffix = "th";
	        } else {
	            switch (day % 10) {
	                case 1: suffix = "st"; break;
	                case 2: suffix = "nd"; break;
	                case 3: suffix = "rd"; break;
	                default: suffix = "th";
	            }
	        }

	        DateTimeFormatter monthFormat = DateTimeFormatter.ofPattern("MMMM");
	        return day + suffix + " " + date.format(monthFormat);
	    };

	    // Start = today
	    LocalDate startDate = LocalDate.now();

	    // End = +18 days
	    LocalDate endDate = startDate.plusDays(19);

	    // Format both dates with ordinal suffix
	    String S_Date = formatDate.apply(startDate);
	    String E_Date = formatDate.apply(endDate);

	    // Print
	    System.out.println("Date Range: " + S_Date + " - " + E_Date);

	    // XPath CLICK
	    WebElement dateRange = driver.findElement(
	            By.xpath("//android.view.ViewGroup[@content-desc='" + S_Date + " - " + E_Date + ", ']"));
	    
	    dateRange.click();
	}
	
	public void selectStartDate() {
		// Format (e.g., "dd MMMM yyyy")
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	    
	 // Today's date
        LocalDate startDate = LocalDate.now();
        
        LocalDate SDate =startDate.minusDays(4);
        
        String S_Date =SDate.format(formatter);
        //  //android.widget.Button[@resource-id="2025-11-01"]
        System.out.println(S_Date);
        
        WebElement StartDate=driver.findElement(By.xpath("//android.widget.Button[@resource-id='"+S_Date+"']"));
        StartDate.click();
	}
	
	public void selectEndDate() {
		// Format (e.g., "dd MMMM yyyy")
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	    
	 // Today's date
        LocalDate startDate = LocalDate.now();
     // End date is startDate + 18 days 
       //LocalDate EndDate = startDate.plusDays(19);
        String E_Date =startDate.format(formatter);
        
        WebElement endDate=driver.findElement(By.xpath("//android.widget.Button[@resource-id='"+E_Date+"']"));
        endDate.click();
	}
	
	public void clickOndateDropDwn() {
		try {
			dateDropDwn.click();
			System.out.println("Clicked on dateDropDwn");
		} catch (Exception e) {
			System.out.println("Not able to click on dateDropDwn "+e);
		}
	}
	
	public void clickOnOkButton() {
		try {
			okButton.click();
			System.out.println("Clicked on OK Button");
		} catch (Exception e) {
			System.out.println("Not able to click on OK Button "+e);
		}
	}
	
	public void clickOnCancelButton() {
		try {
			cancelButton.click();
			System.out.println("Clicked on Cancel Button");
		} catch (Exception e) {
			System.out.println("Not able to click on Cancel Button "+e);
		}
	}
	
	public void clickOnClearButton() {
		try {
			clearButton.click();
			System.out.println("Clicked on clearButton");
		} catch (Exception e) {
			System.out.println("Not abke to click on clearButton"+e);
		}
	}
	
	public void clickOnviewBillButton() {
		try {
			viewBillButton.click();
			System.out.println("Clicked on viewBillButton");
		} catch (Exception e) {
			System.out.println("Not able to click on viewBillButton "+e);
		}
	}
	
	public void clickOnShopTab() {
		try {
			shopTab.click();
			System.out.println("click on shopTab");
		} catch (Exception e) {
			System.out.println("Not able to click on shopTab "+e);
		}
	}
	
	public void clickOnHelpTab() {
		try {
			helpTab.click();
			System.out.println("Clciked on helpTab");
		} catch (Exception e) {
			System.out.println("Not able to click on helpTab "+e);
		}
	}
	
	public void clickOnordersTab() {
		try {
			ordersTab.click();
			System.out.println("Clicked on ordersTab");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}




