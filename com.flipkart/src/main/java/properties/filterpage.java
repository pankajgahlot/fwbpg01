package properties;

public interface filterpage {

	String FILTER_HEADER = "//span[text()='Filters']";
	String F_ASSURED_CHECKBOX = "//div[@class='_24_Dny _3tCU7L']";
	String BRAND_CHECKBOX = "//div[@class='_24_Dny']//following-sibling::div[text()='SAMSUNG']";
	String RAM_HEADER="//div[text()='RAM']";
	String SORT_ICON="//div[text()='Price -- Low to High']";

	
	
	String DEVICE_NAME="//div[@class='_4rR01T' and contains(text(),'SAMSUNG')]";
	String DEVICE_LINK="//div[@class='_4rR01T'and contains(text(),'SAMSUNG')]//preceding::div[@class='_3pLy-c row']//parent::a";
	String DEVICE_COST="//div[@class='_4rR01T'and contains(text(),'SAMSUNG')]//following::div[@class='_30jeq3 _1_WHN1']";
}
