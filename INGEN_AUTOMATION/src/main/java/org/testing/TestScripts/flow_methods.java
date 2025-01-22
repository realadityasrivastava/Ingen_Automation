package org.testing.TestScripts;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.Base64;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class flow_methods {
	ChromeDriver driver;
	public void loginviasuperadmin() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Use shared driver
		WebElement user = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter Your Email']"))); // Identifying
		user.sendKeys("superadmin@example.com"); // Action
		
		WebElement reject=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"c-s-bn\"]")));
		reject.click();
		
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Enter Your Password']")); // Identifying
		password.sendKeys("1234"); // Action
		
		WebElement lg = driver.findElement(By.xpath("//input[@id='saveBtn']")); // Identifying
		lg.click(); // Action
		
		System.out.println("LOGIN SUCCESSFULLY VIA SUPER ADMIN");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	public void scroll() {
		Actions actions = new Actions(driver); //for scrolling the page
 		actions.sendKeys(org.openqa.selenium.Keys.PAGE_DOWN).perform();
	}
	public void browserlaunch() {
		driver=new ChromeDriver();
		driver.manage().window().maximize(); // for maximizing window
		driver.get("http://ec2-13-60-64-45.eu-north-1.compute.amazonaws.com/"); //link
		System.out.println("WEBSITE LOADED SUCCESSFULLY");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		}	
	public void img_verify_httponly() {
	    try {
	        // Get all <img> elements
	        List<WebElement> images = driver.findElements(By.tagName("img"));

	        System.out.println("Total images found: " + images.size());

	        // Loop through each image and validate
	        for (WebElement img : images) {
	            String src = img.getAttribute("src");

	            if (src == null || src.isEmpty()) {
	                System.err.println("Image with missing 'src' attribute found.");
	                continue;
	            }

	            HttpURLConnection connection = null;
	            int responseCode = -1; // Initialize with a default value

	            try {
	                // Validate image using HTTP connection
	                connection = (HttpURLConnection) new URL(src).openConnection();
	                connection.setRequestMethod("HEAD");
	                connection.connect();

	                responseCode = connection.getResponseCode();
	                if (responseCode >= 200 && responseCode < 400) {
	                    System.out.println("Response code = " + responseCode);
	                    System.out.println("Image is valid: " + src);
	                } else {
	                    System.err.println("Broken image detected: " + src);
	                }
	            } catch (Exception e) {
	            	System.err.println("Response code: " + responseCode);
	                System.err.println("Error validating image: " + src);
	                e.printStackTrace();
	            } finally {
	                if (connection != null) {
	                    connection.disconnect();
	                }
	            }
	        }
	    } finally {
	        // Close the browser
	        // driver.quit();
	    }
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	public void companywithpass(String comapnay_name, String email,String trade_name, String business_address, String contact) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement cmp=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Companies']")));
		cmp.click();
		WebElement plus=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='']")));
		plus.click();
		WebElement cname=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Company Name']")));
		cname.sendKeys(comapnay_name);
		WebElement em=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Company Email']")));
		em.sendKeys(email);
		WebElement trade=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Trade Name']")));
		trade.sendKeys(trade_name);
		WebElement vat=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Vat Registration Number']")));
		vat.sendKeys("28229713");
		WebElement brn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='business_registration_number']")));
		brn.sendKeys("C24205252");
		WebElement address=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='business_address']")));
		address.sendKeys(business_address);
		WebElement num=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='contact_number']")));
		num.sendKeys(contact);
		WebElement loginsw=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='password_switch']")));
		loginsw.click();
		WebElement pass=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='password']")));
		pass.sendKeys("Ingen@123456789");
		WebElement create=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Create']")));
		create.click();
		}
	public void loginviacompany(String email, String pass) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Use shared driver
		WebElement user = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter Your Email']"))); // Identifying
		user.sendKeys(email); // Action
		
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Enter Your Password']")); // Identifying
		password.sendKeys(pass); // Action
		
		WebElement lg = driver.findElement(By.xpath("//input[@id='saveBtn']")); // Identifying
		lg.click(); // Action
		
		
		System.out.println("LOGIN SUCCESSFULLY VIA COMPANY");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	public void customer(String name, String contact, String email) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Use shared driver
		WebElement sales=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/nav/div[1]/div[2]/ul/li[2]/a")));
		sales.click();
		WebElement cus=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Customer")));
		cus.click();
		WebElement plus=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div[1]/div/div/div[2]/div/a[3]")));
		plus.click();
		WebElement cname=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='name']")));
		cname.sendKeys(name);
		WebElement cnum=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='contact']")));
		cnum.sendKeys(contact);
		WebElement em=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='email']")));
		em.sendKeys(email);
		WebElement tax=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='tax_number']")));
		tax.sendKeys("28229713");
		WebElement brn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='business_registration_number']")));
		brn.sendKeys("C24205252");
		WebElement nin=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='nic_number']")));
		nin.sendKeys("adityaaaaaa123");
		this.scroll();
		WebElement create=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='CreateSubmit']")));
		create.click();
	}
	public void setup_for_product() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Use shared driver
		WebElement setup=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Setup']")));
		setup.click();
		WebElement accounting_setup=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Accounting Setup")));
		accounting_setup.click();
		WebElement tax=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-title='Create Tax Rate']")));
		tax.click();
		WebElement taxname=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter Tax Rate Name']")));
		taxname.sendKeys("Tax1");
		WebElement rate=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='rate']")));
		rate.sendKeys("10");
		WebElement create=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Create']")));
		create.click();
		System.out.println("Tax Rate Setup Complete");
		System.out.println("Tax Name = Tax1, Tax Rate = 10%");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		
		//setting up category
		WebElement category=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Category")));
		category.click();
		WebElement plus=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-title='Create New Category']")));
		plus.click();
		WebElement catename=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='name']")));
		catename.sendKeys("Category1");
		WebElement drop=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='type']")));
		Select s=new Select(drop);
		s.selectByVisibleText("Product & Service");
		WebElement color=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='color']"))); 
		color.sendKeys("Red");
		WebElement create2=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Create']")));
		create2.click();
		System.out.println("Category Created Successfully");
		System.out.println("Category Name = Category1, Category Type = Product & Service");
		WebElement plus2=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-title='Create New Category']")));
		plus2.click();
		WebElement catename2=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='name']")));
		catename2.sendKeys("Category2");
		WebElement drop2=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='type']")));
		Select s2=new Select(drop2);
		s2.selectByVisibleText("Income");
		Thread.sleep(2000);
		WebElement color2=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='color']"))); 
		color2.sendKeys("Green");
		WebElement create3=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Create']")));
		create3.click();
		System.out.println("Category Name = Category2, Category Type = Income");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		
		//setting up Unit
		WebElement unit=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Unit")));
		unit.click();
		WebElement plus1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-title='Create New Unit']")));
		plus1.click();
		WebElement unitname=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='name']")));
		unitname.sendKeys("KG");
		WebElement create_unit=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Create']")));
		create_unit.click();
		System.out.println("Unit Create Successfully");
		System.out.println("Unit Name = KG");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		}
	public void product(String product_name, String sku, String sale_price, String cost_price, String quantity) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Use shared driver
		WebElement dashboard=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Dashboard")));
		dashboard.click();
		WebElement setup=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Setup']")));
		setup.click();
		WebElement ps=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Product & Services Setup")));
		ps.click();
//		WebElement ps2=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Product & Services")));
//		ps2.click();
		WebElement plus=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-title='Create New Product & Service']")));
		plus.click();
		WebElement name=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='name']")));
		name.sendKeys(product_name);
		WebElement sk=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='sku']")));
		sk.sendKeys(sku);
		WebElement tax=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='tax_category']")));
		Select s=new Select(tax);
		s.selectByVisibleText("TC01");
		
		WebElement saleprice=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='sale_price']")));
		saleprice.sendKeys(sale_price);
		WebElement costprice=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='purchase_price']")));
		costprice.sendKeys(cost_price);
		WebElement income=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@name='sale_chartaccount_id']")));
		Select s0=new Select(income);
		s0.selectByVisibleText("4010 - Sales Income");
		WebElement expense=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@name='expense_chartaccount_id']")));
		Select s1=new Select(expense);
		s1.selectByVisibleText("5010 - Cost of Sales - Purchases");
		WebElement tax2=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div/div/div[2]/form/div[1]/div/div[8]/div/div[1]/input")));
		tax2.sendKeys("tax");
		tax2.sendKeys(Keys.ENTER);
		WebElement category=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='category_id']")));
		Select s2=new Select(category);
		s2.selectByVisibleText("Category1");
		this.scroll();
		WebElement quan1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='quantity']")));
		quan1.sendKeys(quantity);
		WebElement unit=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='unit_id']")));
		Select s3 = new Select(unit);
		s3.selectByVisibleText("KG");
		
		WebElement desp=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='description']")));
		desp.sendKeys("test");
		WebElement create=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Create']")));
		create.click();
		System.out.println("Product Created Succesfully");
		System.out.println("Product Name = Apple, Sale Price = 100, Quantity = 100");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	public void invoice() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Use shared driver
		WebElement sales=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/nav/div[1]/div[2]/ul/li[2]/a")));
		sales.click();
		WebElement invoice=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Invoice")));
		invoice.click();
		WebElement plus=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-bs-original-title='Create']")));
		plus.click();
		WebElement cus=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='customer']")));
		Select s=new Select(cus);
		s.selectByVisibleText("Suraj");
		WebElement issue=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='issue_date']")));
		issue.sendKeys("30122024");
		WebElement due=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='due_date']")));
		due.sendKeys("05012025");
		WebElement cate=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='category_id']"))); 
		Select s1=new Select(cate);
		s1.selectByVisibleText("Category2");
		WebElement ref=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='ref_number']")));
		ref.sendKeys("001");
		this.scroll();
		WebElement selcat=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"sortable-table\"]/tbody/tr[1]/td[1]/select")));
		Select s2=new Select(selcat);
		s2.selectByVisibleText("Apple");
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Qty']"))).sendKeys("5");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Create']"))).click();
		System.out.println("Invoice Created Succesfully");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	public void qrverify_latestinvoice() {
		this.scroll();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Use shared driver
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div[4]/div/div/div/div/div/div[2]/table/tbody/tr/td[6]/span/div[3]/a"))).click();
		this.scroll();
	}
	public void img_verify2_httpwithbase64() {
	    try {
	        // Get all <img> elements
	        List<WebElement> images = driver.findElements(By.tagName("img"));

	        System.out.println("Total images found: " + images.size());

	        for (WebElement img : images) {
	            String src = img.getAttribute("src");

	            if (src == null || src.isEmpty()) {
	                System.err.println("Image with missing 'src' attribute found.");
	                continue;
	            }

	            if (src.startsWith("data:image")) {
	                // Handle Base64-encoded images
	                System.out.println("Data URI detected: " + src);

	                try {
	                    // Extract Base64 data
	                    String base64Data = src.substring(src.indexOf(",") + 1);

	                    // Sanitize Base64 data by removing whitespaces
	                    base64Data = base64Data.replaceAll("\\s", "");

	                    // Decode Base64 data
	                    byte[] imageBytes = Base64.getDecoder().decode(base64Data);

	                    // Verify the decoded image
	                    BufferedImage image = ImageIO.read(new ByteArrayInputStream(imageBytes));
	                    if (image != null) {
	                        System.out.println("Base64 image is valid.");
	                    } else {
	                        System.err.println("Invalid Base64 image.");
	                    }
	                } catch (IllegalArgumentException e) {
	                    System.err.println("Error decoding Base64 image: Invalid format.");
	                    e.printStackTrace();
	                } catch (Exception e) {
	                    System.err.println("Error validating Base64 image: " + e.getMessage());
	                    e.printStackTrace();
	                }
	            } else {
	                // Handle standard HTTP/HTTPS image URLs
	                HttpURLConnection connection = null;

	                try {
	                    // Validate image URL
	                    connection = (HttpURLConnection) new URL(src).openConnection();
	                    connection.setRequestMethod("HEAD");
	                    connection.connect();

	                    int responseCode = connection.getResponseCode();
	                    if (responseCode >= 200 && responseCode < 400) {
	                        System.out.println("Response code = " + responseCode);
	                        System.out.println("Image is valid: " + src);
	                    } else {
	                        System.err.println("Broken image detected: " + src + " (Response code: " + responseCode + ")");
	                    }
	                } catch (Exception e) {
	                    System.err.println("Error validating image: " + src);
	                    e.printStackTrace();
	                } finally {
	                    if (connection != null) {
	                        connection.disconnect();
	                    }
	                }
	            }
	        }
	    } finally {
	        // Close the browser (if needed)
	        // driver.quit();
	    }
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	public void capturePopupAndStopOnError2() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

	    // Wait for the pop-up to be visible
	    WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"liveToast\"]/div/div")));

	    // Get the text of the pop-up
	    String message = popup.getText();
	    
	    // Check for errors first
	    if (message == null || message.isEmpty()) {
	        System.out.println("\u001B[31m" + "No message found in the pop-up." + "\u001B[0m"); // Red error message
	        throw new RuntimeException("No pop-up message detected. Stopping execution.");
	    }

	    // Check for success messages
	    if (checkForSuccess(message)) {
	        System.out.println("\u001B[32m" + "Success: " + message + "\u001B[0m"); // Green success message
	    }
	    // If not a success message, check for errors
	    else if (checkForError2(message)) {
	        System.out.println("\u001B[31m" + "Failed: " + message + "\u001B[0m"); // Red error message
	    }
	    // If neither success nor error, print the message in default color
	    else {
	        System.out.println("\u001B[0m" + "Captured Pop-up Message: " + message + "\u001B[0m"); // Default message color
	    }
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	public boolean checkForError2(String message) {
	    // Method to check for error messages in the pop-up
	    String[] errorKeywords = { "error", "failed", "user not created", "invalid", "unsuccessful", "Opps", "already" };

	    // Check if the message contains any error keyword
	    for (String keyword : errorKeywords) {
	        if (message.contains(keyword)) {
	            return true; // Error found
	        }
	    }

	    return false; // No errors found
	}
	public boolean checkForSuccess(String message) {
	    // Method to check for success messages in the pop-up
	    String[] successKeywords = { "success", "completed", "created", "done", "successful", "congratulations", "successfully" };

	    // Check if the message contains any success keyword
	    for (String keyword : successKeywords) {
	        if (message.contains(keyword)) {
	            return true; // Success found
	        }
	    }

	    return false; // No success found
	}
	public void credit_note(String invoice_number, String ddmmyyyy, String credit_amount) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Use shared driver
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/nav/div[1]/div[2]/ul/li[2]/a"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Credit Note"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-title='Create New Credit Note']"))).click();
		WebElement invoice_name=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='invoice']")));
		Select inv = new Select(invoice_name);
		inv.selectByVisibleText(invoice_number);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='amount']"))).clear();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='amount']"))).sendKeys(credit_amount);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='date']"))).sendKeys(ddmmyyyy);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='description']"))).sendKeys("test");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='creditNoteCreateSubmit']"))).click();
	}
	public void browserclose() {
		driver.close();
		System.out.println("BROWSER CLOSED");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	public void logout_superadmin() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Use shared driver
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Hi, Super Admin 1!']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Logout"))).click();
	}
}