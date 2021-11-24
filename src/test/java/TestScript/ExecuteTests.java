package TestScript;
import java.io.IOException;
import org.testng.annotations.Test;
import com.globalkinetic.SwagLab.LandingPageTitle;
import com.globalkinetic.SwagLab.LoginSuccessful;



public class ExecuteTests extends BaseClass {
	
	String CSVpath = "./TestData\\LoginUser.csv";

	@Test
	public void VerifyLandingPage() throws IOException {
		
		try {
			BrowserSetup("chrome");
			
			LandingPageTitle mainpage  = new LandingPageTitle(driver);
			mainpage.VerifyTitlePageObject();

		} catch (Exception e) {

			// Close the browser
			System.out.print(e);

		}
	}
	

	@Test

	public void loginPage() throws  IOException{
		
		try {
			
			BrowserSetup("chrome");
			
			String userName = ReadDataFromCSV("USERNAME", CSVpath);
			String password = ReadDataFromCSV("PASSWORD", CSVpath);

			LoginSuccessful login = new LoginSuccessful(driver);
			login.LoginPageObject(userName, password);
			
			

		} catch (Exception e) {
			System.out.print("inside catch");

			// Close the browser
			System.out.print(e);	
		}	
	}
	
	@Test
	
	public void VerifyProductTitlePage() throws IOException{
		try {BrowserSetup("firefox");
		
		com.globalkinetic.SwagLab.ProductsPage products = new com.globalkinetic.SwagLab.ProductsPage(driver);
		products.VerifyProductsTitlePageObject();
		
		
	} catch (Exception e) {
		System.out.print("inside catch");
		

		}
	}
	
	@Test
	
	public void ProductsPage() throws IOException{
		try {BrowserSetup("chrome");
		
		com.globalkinetic.SwagLab.ProductsPage products = new com.globalkinetic.SwagLab.ProductsPage(driver);
		products.ProductsPageObject();
		
		
	} catch (Exception e) {
		System.out.print("inside catch");



		}
	}
	 
	
	@Test 
	public void CheckoutPage() throws IOException{
		try {BrowserSetup("chrome");
		
		String firstName = ReadDataFromCSV("FIRSTNAME", CSVpath);
		String lastName = ReadDataFromCSV("LASTNAME", CSVpath);
		String postalCode = ReadDataFromCSV("POSTALCODE", CSVpath);
		
		com.globalkinetic.SwagLab.CheckoutPage products = new com.globalkinetic.SwagLab.CheckoutPage(driver);
		products.CheckoutPageObject(firstName, lastName, postalCode);
	
	} catch (Exception e) {
		
		System.out.print("inside catch");

		

		}
	}
	
	public void close() {
		BrowserClose();
		
		
	}
}
	
	

