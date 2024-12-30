package org.testing.TestScripts;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class methods {
	ChromeDriver driver;
	public void loginviasuperadmin() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Use shared driver
		WebElement button=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/header/div[2]/nav/div[3]/a[1]")));
		button.click();
		WebElement user = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter Your Email']"))); // Identifying
		user.sendKeys("superadmin@example.com"); // Action
		
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
	public void img_verify() {

        try {
            // Get all <img> elements
            List<WebElement> images = driver.findElements(By.tagName("img"));

            System.out.println("Total images found: " + images.size());

            // Loop through each image and validate
            for (WebElement img : images) {
                String src = img.getAttribute("src");

                if (src == null || src.isEmpty()) {
                    System.out.println("Image with missing 'src' attribute found.");
                    continue;
                }

                // Validate image using HTTP connection
                try {
                    HttpURLConnection connection = (HttpURLConnection) new URL(src).openConnection();
                    connection.setRequestMethod("HEAD");
                    connection.connect();

                    int responseCode = connection.getResponseCode();
                    if (responseCode >= 200 && responseCode < 400) {
                        System.out.println("Image is valid: " + src);
                    } else {
                        System.out.println("Broken image detected: " + src);
                    }

                } catch (Exception e) {
                    System.out.println("Error validating image: " + src);
                    e.printStackTrace();
                }
            }
        } finally {
            // Close the browser
//            driver.quit();
        }
    
}
	public void companywithpass(String comapnay_name, String email,String trade_name, String business_address, String contact) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement cmp=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Companies']")));
		cmp.click();
		WebElement plus=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='']")));
		plus.click();
		WebElement cname=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter Company Name']")));
		cname.sendKeys(comapnay_name);
		WebElement em=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter Company Email']")));
		em.sendKeys(email);
		WebElement trade=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter Trade Name']")));
		trade.sendKeys(trade_name);
		WebElement vat=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Vat Registration Number']")));
		vat.sendKeys("28229713");
		WebElement brn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='business_registration_number']")));
		brn.sendKeys("24205252");
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
		WebElement button=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/header/div[2]/nav/div[3]/a[1]")));
		button.click();
		WebElement user = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter Your Email']"))); // Identifying
		user.sendKeys(email); // Action
		
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Enter Your Password']")); // Identifying
		password.sendKeys(pass); // Action
		
		WebElement lg = driver.findElement(By.xpath("//input[@id='saveBtn']")); // Identifying
		lg.click(); // Action
		
		WebElement reject=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"c-s-bn\"]")));
		reject.click();
		
		System.out.println("LOGIN SUCCESSFULLY VIA COMPANY");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	public void customer(String name, String contact, String email) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Use shared driver
		WebElement as=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/nav/div[1]/div[2]/ul/li[3]/a/span[2]")));
		as.click();
		WebElement sales=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/nav/div[1]/div[2]/ul/li[3]/ul/li[2]/a")));
		sales.click();
		WebElement cus=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/nav/div[1]/div[2]/ul/li[3]/ul/li[2]/ul/li[1]/a")));
		cus.click();
		WebElement plus=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/div/a[3]")));
		plus.click();
		WebElement cname=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter Name']")));
		cname.sendKeys(name);
		WebElement cnum=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter Contact']")));
		cnum.sendKeys(contact);
		WebElement em=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter email']")));
		em.sendKeys(email);
		WebElement tax=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='tax_number']")));
		tax.sendKeys("7");
		WebElement brn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[1]/div[1]/div[5]/div/input")));
		brn.sendKeys("24205252");
		WebElement nin=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[1]/div[1]/div[8]/div/input")));
		nin.sendKeys("aditya123");
		this.scroll();
		WebElement create=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Create']")));
		create.click();
	}
	public void setup_for_product() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Use shared driver
		WebElement as=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/nav/div[1]/div[2]/ul/li[3]/a/span[2]")));
		as.click();
		WebElement ac=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/nav/div/div[2]/ul/li[3]/ul/li[7]/a")));
		ac.click();
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
		WebElement create2=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Create']")));
		create2.click();
		System.out.println("Category Created Successfully");
		System.out.println("Category Name = Ctaegory1, Category Type = Product & Service");
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
		WebElement ps=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Products System")));
		ps.click();
		WebElement ps2=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Product & Services")));
		ps2.click();
		WebElement plus=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-title='Create New Product & Service']")));
		plus.click();
		WebElement name=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='name']")));
		name.sendKeys(product_name);
		WebElement sk=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='sku']")));
		sk.sendKeys(sku);
		WebElement saleprice=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='sale_price']")));
		saleprice.sendKeys(sale_price);
		WebElement costprice=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='purchase_price']")));
		costprice.sendKeys(cost_price);
		WebElement income=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@name='sale_chartaccount_id']")));
		Select s=new Select(income);
		s.selectByVisibleText("4010 - Sales Income");
		WebElement expense=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@name='expense_chartaccount_id']")));
		Select s1=new Select(expense);
		s1.selectByVisibleText("5010 - Cost of Sales - Purchases");
		WebElement tax=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div/div[2]/form/div[1]/div[2]/div[8]/div/div[1]/input")));
		tax.sendKeys("tax");
		tax.sendKeys(Keys.ENTER);
		WebElement category=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='category_id']")));
		Select s2=new Select(category);
		s2.selectByVisibleText("Category1");
		this.scroll();
		WebElement quan1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='quantity']")));
		quan1.sendKeys(quantity);
		WebElement desp=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id='description']")));
		desp.sendKeys("test");
		WebElement create=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Create']")));
		create.click();
		System.out.println("Product Created Succesfully");
		System.out.println("Product Name = Apple, Sale Price = 100, Quantity = 100");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	public void invoice() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Use shared driver
		WebElement as=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Accounting System")));
		as.click();
		WebElement sales=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sales")));
		sales.click();
		WebElement invoice=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Invoice")));
		invoice.click();
		WebElement plus=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-bs-original-title='Create']")));
		plus.click();
		WebElement cus=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='customer']")));
		Select s=new Select(cus);
		s.selectByVisibleText("Customer1");
		WebElement issue=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='issue_date']")));
		issue.sendKeys("30122024");
		WebElement due=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='due_date']")));
		due.sendKeys("05012025");
		

	}
}
