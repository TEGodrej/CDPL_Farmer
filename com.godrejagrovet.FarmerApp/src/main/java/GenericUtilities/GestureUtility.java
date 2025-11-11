package GenericUtilities;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

/**
 *@author DivyaPrakashAmar
 */
public class GestureUtility {
 AndroidDriver driver;
 
 	public GestureUtility(AndroidDriver driver) {
 		this.driver=driver;
 		PageFactory.initElements(driver, this);
 	}
 
 	/**
 	 *This method is use to perform click gesture
 	 *@param element , takes webelement on which have to perform gesture
 	 */
		public void click(WebElement element) {
			try {
			((JavascriptExecutor)driver).executeScript("mobile: clickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId()));
			}catch (Exception e) {
				((JavascriptExecutor)driver).executeScript("mobile: clickGesture", ImmutableMap.of(
					    "elementId", ((RemoteWebElement) element).getId()));
				System.out.println("Not able to perform click gesture");
			}
		}
		/**
	 	 *This method is use to perform longclick gesture
	 	 *@param element , takes webelement on which have to perform gesture
	 	 */
		public void longClick(WebElement element) {
			((JavascriptExecutor)driver).executeScript("mobile:longClickGesture", ImmutableMap.of(
				"elementId",((RemoteWebElement)element).getId()));
		}
		/**
	 	 *This method is use to perform doubleclick gesture
	 	 *@param element , takes webelement on which have to perform gesture
	 	 */
		public void doubleClick(WebElement element) {
			((JavascriptExecutor)driver).executeScript("mobile:doubleClickGesture", ImmutableMap.of(
					"elementId",((RemoteWebElement)element).getId()));
		}
		/**
	 	 *This method is use to perform drag and drop gesture
	 	 *@param element , takes webelement on which have to perform gesture
	 	 */
		public void dragAndDrop(WebElement element,int x, int y) {
			((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),"endX", 100,"endY", 100));
		}
		/**
	 	 *This method is use to perform drag and drop by axis gesture from one place to another
	 	 *@param startX , takes starting X co-ordinates of the element
	 	 *@param startY , takes starting Y Co-ordinates of the element
	 	 *@param endX ,takes ending X Co-ordinates of the element
	 	 *@param endY, takes ending Y Co-ordinates of the element
	 	 */
		public void dragAndDropByAxis(int startX, int startY, int endX, int endY) {
		    ((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
		        "startX", startX,
		        "startY", startY,
		        "endX", endX,
		        "endY", endY));
		}
		/**
		 * This method is use to perform fling Gesture on element
		 * @param element , take webelement reference on which action has to be perform
		 * @param dir, take direction in which action have to perform
		 * @param speed , take speed to know how fast action have to be perform
		 * @param canScrollMore , this returns boolean condition
		 * */
		public void flingGesture(WebElement element, String dir, int Speed, boolean canScrollMore) {
			 canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: flingGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),
			    "direction", "dir",
			    "speed", Speed));
		}
		/**
		 * This method is use to perform pinch open gesture on particular element
		 * @param element , take webelement as parameter on which action has to be performed
		 * @param percentage , takes percentage as parameter to know how much element have to be zoomIn
		 * */
		public void pinchOpen(WebElement element, double percentage) {
			((JavascriptExecutor) driver).executeScript("mobile: pinchOpenGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),
			    "percent", percentage));
		}
		/**
		 * This method is use to perform pinch close gesture on particular element
		 * @param element , take webelement as parameter on which action has to be performed
		 * @param percentage , takes percentage as parameter to know how much element have to be zoomout
		 * */
		public void pinchClose(WebElement element, double percentage) {
			((JavascriptExecutor) driver).executeScript("mobile: pinchCloseGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(),
			    "percent", 0.75	));
		}
		/**
		 * This method is use to perfrom swipe gesture on webelement
		 * @param element , take webelement as parameter on which action has to be performed
		 * @param left , take left co-ordinate of the element
		 * @param top,take top co-ordinate of the element
		 * @param width , take width of the element
		 * @param height , take height  till where it have to swipe
		 * @param percentage , take it as what percent of the screen it have to swipe
		 * @param dir , take it to know in which direction it have to swipe
		 * */
		public void swipeWithElement(WebElement element, int left,int top, int width,int height,double percentage,String dir) {
			((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
			    "left", left, "top", top, "width", width, "height", height,
			    "direction", dir, "percent", percentage));
		}
		/**
		 * This method is use to perfrom swipe gesture on webelement
		 * @param element , take webelement as parameter on which action has to be performed
		 * @param left , take left co-ordinate of the element
		 * @param top,take top co-ordinate of the element
		 * @param width , take width of the element
		 * @param height , take height  till where it have to swipe
		 * @param percentage , take it as what percent of the screen it have to swipe
		 * @param dir , take it to know in which direction it have to swipe
		 * @param canScrollMore , it returns boolean condition after action is performed
		 * */
		public void scroll(WebElement element,boolean canScrollMore, int left, int top, int width,int height,double percentage,String dir) {
			 canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "left", left, "top", top, "width", width, "height", height,
			    "direction", dir,"percent", percentage));
		}
		/**
		 * This method is use to perform click gesture by using co-ordinates
		 * @param x , take X co-ordinate where action have to be performed
		 * @param y , take y co-ordinate where action have to be performed
		 * */
		public void clickByAxes(int x, int y) {
			driver.executeScript("mobile: clickGesture", ImmutableMap.of("x",x,"y",y));
		}
		/**
		 * This method is use to perform double click gesture by using co-ordinates
		 * @param x , take X co-ordinate where action have to be performed
		 * @param y , take y co-ordinate where action have to be performed 
		 * */
		public void doubleClickByAxes(int x, int y) {
			driver.executeScript("mobile: doubleClickGesture", ImmutableMap.of("x",x,"y",y));
		}
		/**
		 * This method is use to perform long click gesture by using co-ordinates
		 * @param x , take X co-ordinate where action have to be performed
		 * @param y , take y co-ordinate where action have to be performed 
		 * */
		public void longClickByAxes(int x,int y) {
			driver.executeScript("mobile: longClickGesture", ImmutableMap.of("x",x,"y",y));
		}
		/**
		 * This method is use to perform pinch open gesture by using co-ordinates
		 * @param startX , take X co-ordinate from where action have to be performed
		 * @param startY , take y co-ordinate from where action have to be performed 
		 * @param endX , take X co-ordinate from where action have to be performed
		 * @param endY ,take Y co-ordinate from where action have to be performed
		 * @parma percentage ,takes to know how much to zoomIn
		 * */
		public void pinchOpenByAxes(int startX, int startY, int endX, int endY, double percentage) {
		    ((JavascriptExecutor) driver).executeScript("mobile: pinchOpenGesture", ImmutableMap.of(
		        "startX", startX,
		        "startY", startY,
		        "endX", endX,
		        "endY", endY,
		        "percent", percentage
		    ));
		}
		/**
		 * This method is use to perform scroll gesture by using co-ordinates
		 * @param startX , take X co-ordinate from where action have to be performed
		 * @param startY , take y co-ordinate from where action have to be performed 
		 * @param endX , take X co-ordinate from where action have to be performed
		 * @param endY ,take Y co-ordinate from where action have to be performed
		 * @parma percentage ,takes to know how much to scroll
		 * @param dir , take to know in which direction it has to scroll
		 * */
		public void scrollByAxes(int startX, int startY, int endX, int endY, String dir, double percentage) {
		    @SuppressWarnings("unused")
		    boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
		        "startX", startX, 
		        "startY", startY, 
		        "endX", endX, 
		        "endY", endY,
		        "direction", dir, 
		        "percent", percentage
		    ));
		}
		/**
		 * This method is use to perform swipe gesture by using co-ordinates
		 * @param startX , take X co-ordinate from where action have to be performed
		 * @param startY , take y co-ordinate from where action have to be performed 
		 * @param endX , take X co-ordinate from where action have to be performed
		 * @param endY ,take Y co-ordinate from where action have to be performed
		 * @parma percentage ,takes to know how much to scroll
		 * @param dir , take to know in which direction it has to scroll
		 * */
		public void swipe(int startX, int startY, int endX, int endY, String dir, double percentage) {
		    ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
		        "startX", startX, 
		        "startY", startY, 
		        "endX", endX, 
		        "endY", endY,
		        "direction", dir,
		        "percent", percentage
		    ));
		}
		
		public void swipeWithJS(String direction, double percentage) {
		    JavascriptExecutor js = (JavascriptExecutor) driver;

		    // Get device screen size dynamically
		    Dimension size = driver.manage().window().getSize();
		    int width = size.getWidth();
		    int height = size.getHeight();

		    // Define swipe area (use most of the screen)
		    Map<String, Object> params = new HashMap<>();
		    params.put("left", 0);
		    params.put("top", 0);
		    params.put("width", width);
		    params.put("height", height);
		    params.put("direction", direction);
		    params.put("percent", percentage);

		    js.executeScript("mobile: swipeGesture", params);
		}
		
		/**
		 * This method is use to perform fling gesture by using co-ordinates
		 * @param startX , take X co-ordinate from where action have to be performed
		 * @param startY , take y co-ordinate from where action have to be performed 
		 * @parma percentage ,takes to know how much to scroll
		 * @param dir , take to know in which direction it has to scroll
		 * */
		public void fling(int startX, int startY, String dir, int speed) {
		    ((JavascriptExecutor) driver).executeScript("mobile: flingGesture", ImmutableMap.of(
		        "startX", startX, 
		        "startY", startY, 
		        "direction", dir,
		        "speed", speed
		    ));
		}
		/**
		 * This method is use to perform pinch close gesture by using co-ordinates
		 * @param startX , take X co-ordinate from where action have to be performed
		 * @param startY , take y co-ordinate from where action have to be performed 
		 * @param endX , take X co-ordinate from where action have to be performed
		 * @param endY ,take Y co-ordinate from where action have to be performed
		 * @parma percentage ,takes to know how much to scroll
		 * @param dir , take to know in which direction it has to scroll
		 * */
		public void pinchCloseByAxes(int startX, int startY, int endX, int endY, double percentage) {
		    ((JavascriptExecutor) driver).executeScript("mobile: pinchCloseGesture", ImmutableMap.of(
		        "startX", startX,
		        "startY", startY,
		        "endX", endX,
		        "endY", endY,
		        "percent", percentage
		    ));
		}
		/**
		 * This method is use to scrollUp gesture via UiAutomator
		 * */
		public void scrollUp() {
	        String scrollAction = "new UiScrollable(new UiSelector().scrollable(true)).scrollBackward()";
	        driver.findElement(AppiumBy.androidUIAutomator(scrollAction));
	    }
		/**
		 * This method is use to scrollDown gesture via UiAutomator
		 * */
		public void scrollDown() {
	        String scrollAction = "new UiScrollable(new UiSelector().scrollable(true)).scrollForward()";
	        driver.findElement(AppiumBy.androidUIAutomator(scrollAction));
	    }
		/**
		 * This method is use to scrollToElement gesture via UiAutomator
		 * @param elementText , takes elements Text as a reference
		 * */
		 public void scrollToElement(String elementText) {
		        String scrollAction = "new UiScrollable(new UiSelector().scrollable(true)).scrollTextIntoView('" + elementText + "')";
		        driver.findElement(AppiumBy.androidUIAutomator(scrollAction));
		}
		 
		 public void clickAndSendKeys(int x, int y, String text) {
		        try {
		            // 1️⃣ Click on the coordinates
		            ((JavascriptExecutor) driver).executeScript("mobile: clickGesture", ImmutableMap.of(
		                    "x", x,
		                    "y", y
		            ));

		            // 2️⃣ Small wait for the input to focus
		            Thread.sleep(500);

		            // 3️⃣ Type text directly into the focused field
		            driver.executeScript("mobile: type", ImmutableMap.of("text", text));
//		            driver.hideKeyboard();

		        } catch (Exception e) {
		            System.out.println("Failed to click and send keys at coordinates (" + x + ", " + y + "): " + e.getMessage());
		        }
		    }
		 
		 


}


