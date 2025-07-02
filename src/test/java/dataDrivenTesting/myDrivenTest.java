package dataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class myDrivenTest {
	
	@Test(dataProvider="Chintu")
	public void deleverableProduct(String cityName, String pincode)
	{
		System.out.println("Pincode : "+pincode);
	}
	
	@Test
	public void notDeleverableProduct()
	{
		
	}
	@DataProvider(name="Chintu")
	public Object[] [] pincodesData()
	{
		 Object[] [] pincodes={{"Baner", "411052"},
		                       {"Pimple Saudagar", "411053"},
		                       {"Baner", "411054"},
		                       {"Baner", "411055"}
				 
		                      };
		 return pincodes;
	}

}
