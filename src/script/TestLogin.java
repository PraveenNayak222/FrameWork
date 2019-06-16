package script;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.XL;


public class TestLogin extends BaseTest{
	@Test 
	public void login() throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		Reporter.log("login",true);
		int rc = XL.getRowCount(XL_PATH, "sheet1");
		Reporter.log("rows: "+rc, true);
		int cc = XL.getCellCount(XL_PATH, "sheet1");
		Reporter.log("columns: "+rc, true);
		String v = XL.getdata(XL_PATH, "sheet1", 0, 0);
		Reporter.log(v,true);
		
		Assert.fail();
	}

}
