package Utility;

import java.util.List;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass{
	
	public static void selectItem(List<WebElement> list, String ExpectedValue)
	{
		for(WebElement abc: list)
		{
			String str = abc.getText();
			if(str.equalsIgnoreCase(ExpectedValue))
			{
				Wait.click(abc);
				break;
			}
		}
	}

}
