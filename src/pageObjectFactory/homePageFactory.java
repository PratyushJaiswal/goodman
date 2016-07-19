package pageObjectFactory;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class homePageFactory {
	static Logger log = Logger.getLogger(homePageFactory.class);
	WebDriver driver;
	/*@FindBy(xpath = "xpath of the element ")
	WebElement elementname;
	*/
	public homePageFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*public void notification(){
		elementname.click();
	}
*/
	@FindBy(xpath = "//div[@class='header']//a[@href='/home']")
	public WebElement Home_Logo;
	
	public void gotoHome(){
	
	
	Home_Logo.click();
	
	}
	
	@FindBy(xpath = "//div[@id='menu']/ul/li[1])")
	public WebElement About;
	
	public void gotoAbout(){
		About.click();
	}
	
	@FindBy(xpath = "//div[@id='menu']/ul/li[2]")
	public WebElement Product;
	
	public void gotoProduct(){
		Product.click();
	}
	
	@FindBy(xpath = "//div[@id='menu']/ul/li[3]")
	public WebElement Resources;
	
	public void gotoResources(){
		Resources.click();
	}
	
	@FindBy(xpath = "//div[@id='menu']/ul/li[4]")
	public WebElement Support;
	
	public void gotoSupport(){
		Support.click();
	}
	
	@FindBy(xpath = "//div[@id='menu']/ul/li[5]")
	public WebElement Warranty;
	
	public void gotoWarranty(){
		Warranty.click();
	}
	
	@FindBy(xpath = "//div[@id='menu']/ul/li[6]")
	public WebElement ProductReg;
	
	public void gotoProdReg(){
		ProductReg.click();
	}
	
	@FindBy(xpath = "//div[@class='search-icon']//a[contains(text(), 'Search Goodman')]")
	public WebElement Search;
	
	public void Search(){
		Search.click();
	}
	
	@FindBy(xpath = "//div[@class='dealer-icon']//a[@href='/resources/find-a-dealer']")
	public WebElement FindDealer;
	
	public void gotoDealer(){
		FindDealer.click();
	}
	
	@FindBy(xpath = "//div[@class='gm-home-banner-left']//a[@href='/about']")
	public WebElement Banner1;
	
	public void clickBanner1(){
		Banner1.click();
	}
	
	@FindBy(xpath = "//div[@class='gm-home-banner-left']//a[@href='/resources/consumer-finance']")
public WebElement Banner2;
	
	public void clickBanner2(){
		Banner2.click();
	}
	
	@FindBy(xpath = "//div[@class='gm-home-banner-left']//a[@href='/resources/customer-reviews']")
public WebElement Banner3;
	
	public void clickBanner3(){
		Banner3.click();
	}
	
	@FindBy(xpath = "//div[@class='gm-home-banner-left']//a[@href='/about/plant-locations']")
public WebElement Banner4;
	
	public void clickBanner4(){
		Banner4.click();
	}
	
	@FindBy(xpath = "//div[@id='banner-fade']/ol/li[1]/a")
	public WebElement NavBanner1;
	
	public void clickNavban1(){
		NavBanner1.click();
	}
	
	@FindBy(xpath = "//div[@id='banner-fade']/ol/li[2]/a")
public WebElement NavBanner2;
	
	public void clickNavban2(){
		NavBanner2.click();
	}
	
	@FindBy(xpath = "//div[@id='banner-fade']/ol/li[3]/a")
public WebElement NavBanner3;
	
	public void clickNavban3(){
		NavBanner3.click();
	}
	
	@FindBy(xpath = "//div[@id='banner-fade']/ol/li[4]/a")
public WebElement NavBanner4;
	
	public void clickNavban4(){
		NavBanner4.click();
	}
	
	@FindBy(xpath = "//input[@id='txtfdsearch'][@type='text']")
	public WebElement Zip;
	
	public void enterZipcode(String zip){
		Zip.sendKeys(zip);
	}
	
	@FindBy(xpath = "//input[@id='txtfdmiles'][@type='number']")
	public WebElement Miles;
	
	public void enterMiles(){
		Miles.sendKeys("10");
	}
	
	@FindBy(xpath = "//input[@id='btngmfdsearch'][@type='button']")
	public WebElement FindDealerBtn;
	
	public void clickFindDealer(){
		FindDealerBtn.click();
	}
	
	@FindBy(xpath = "//div[@id='content_C003_Col01']//a[@href='/resources/repair-or-replace']")
	public WebElement FindMoreBtn;
	
	public void clickFindMore(){
		FindMoreBtn.click();
	}
	
	@FindBy(xpath = "//div[@id='content_C011_Col00']//a[@href='/about/energy-responsibility']")
	public WebElement BlueLearMoreBtn;
	
	public void clickBlueLearMore(){
		BlueLearMoreBtn.click();
	}
	
	@FindBy(xpath = "//div[@id='content_C013_Col00']//a[@href='#']")
	public WebElement BlueArrow;
	
	public void clickBlueArrow(){
		BlueArrow.click();
	}
	
	@FindBy(xpath = "//input[@id='content_C020_ctl00_ctl00_searchTextBox']")
	public WebElement SearchProd;
	
	public void SearchProd(){
		SearchProd.sendKeys("text");
	}
	
	@FindBy(xpath = "//div[@id='content_C023_Col00']//a[@href='/resources/customer-reviews']")
	public WebElement ProdRev;
	
	public void gotoProdRev(){
		ProdRev.click();
	}
	
	@FindBy(xpath = "//div[@id='content_C023_Col01']//a[@href='/resources/energy-calculator']")
	public WebElement EnergyCalc;
	
	public void gotoEnergyCalc(){
		EnergyCalc.click();
	}
	
	@FindBy(xpath = "//div[@id='owl-demo']//div[@class='owl-prev']")
	public WebElement Prev;
	
	public void clickPrev(){
		Prev.click();
	}
	
	@FindBy(xpath = "//div[@id='owl-demo']//div[@class='owl-next']")
	public WebElement Next;
	
	public void clickNext(){
		Next.click();
	}
	
	@FindBy(xpath = "//div[@id='content_C046_Col00']//a[@href='/products']")
	public WebElement ViewAll;
	
	public void clickViewAll(){
		ViewAll.click();
	}
	
	@FindBy(xpath = "//div[@id='owl-demo']//a[@href='/products/air-conditioners']")
	public WebElement AC;
	
	public void clickAC(){
		AC.click();
	}
	
	@FindBy(xpath = "//div[@class='owl-item']//a[@href='/products/gas-furnaces/80-afue-gas-furnaces']")
	public WebElement GF;
	
	public void clickGF(){
		GF.click();
	}
	
	@FindBy(xpath = "//div[@id='content_C025_Col00']//a[@href='/resources/customer-reviews']")
	public WebElement ProdRev2;
	
	public void gotoProdRev2(){
		ProdRev2.click();
	}
	
	@FindBy(xpath = "//div[@id='content_C036_Col00']//a[@href='/about/energy-responsibility']")
	public WebElement GreenLearMoreBtn;
	
	public void clickGreenLearnMore(){
		GreenLearMoreBtn.click();
	}
	
	@FindBy(xpath = "//div[@id='content_C043_Col01']//a[@href='http://www.dsireusa.org/']")
	public WebElement RI;
	
	public void clickRebateInc(){
		RI.click();
	}
	
	@FindBy(xpath = "//div[@id='content_C043_Col01']//a[@href='/product-registration']")
	public WebElement ProdReg;
	
	public void clickProdReg(){
		ProdReg.click();
	}
	
	@FindBy(xpath = "//div[@id='footer_TA575B027026_Col00']/div/ul/li[1]/a")
	public WebElement FooterContact;
	
	public void gotoContact(){
		FooterContact.click();
	}
	
	@FindBy(xpath = "//div[@id='footer_TA575B027026_Col00']/div/ul/li[2]/a")
	public WebElement PrivPolicy;
	
	public void gotoPrivPolicy(){
		PrivPolicy.click();
	}
	
	@FindBy(xpath = "//div[@id='footer_TA575B027026_Col00']/div/ul/li[3]/a")
	public WebElement FooterCorpGov;
	
	public void gotoFooterCorpGov(){
		FooterCorpGov.click();
	}
	
	@FindBy(xpath = "//div[@id='footer_TA575B027026_Col00']/div/ul/li[4]/a")
	public WebElement FooterResource;
	
	public void gotoFooterResource(){
		FooterResource.click();
	}
	
	@FindBy(xpath = "//div[@id='footer_TA575B027026_Col00']/div/ul/li[5]/a")
	public WebElement Partner;
	
	public void gotoPartner(){
		Partner.click();
	}
	
	@FindBy(xpath = "//div[@id='footer_TA575B027026_Col00']/div/ul/li[6]/a")
	public WebElement BecomeDealer;
	
	public void gotoBecomeDealer(){
		BecomeDealer.click();
	}
	
	@FindBy(xpath = "//div[@id='footer_TA575B027026_Col00']/div/ul/li[7]/a")
	public WebElement ComProd;
	
	public void gotoComProd(){
		ComProd.click();
	}
	
	@FindBy(xpath = "//div[@id='footer_TA575B027026_Col00']/div/ul/li[8]/a")
	public WebElement Employment;
	
	public void Employment(){
		Employment.click();
	}
	
	@FindBy(xpath = "//div[@id='footer_TA575B027011_Col02'][@class='sf_colsIn sf_3cols_3in_25']")
	public WebElement ProdRecall;
	
	public void gotoProdRecall(){
		ProdRecall.click();
	}
	
	@FindBy(xpath = "//a[@id='back-to-top'][@class='show']")
	public WebElement GotoTop;
	
	public void clickTop(){
		GotoTop.click();
	}
}
