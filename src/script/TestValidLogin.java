package script;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.XL;
import page.EnterTimeTrackPage;
import page.LoginPage;

public class TestValidLogin extends BaseTest {
@Test
public void testValidLogin() throws EncryptedDocumentException, FileNotFoundException, IOException
{
	String un=XL.getdata(XL_PATH, "validlogin", 1, 0);
	String pw=XL.getdata(XL_PATH, "validlogin", 1, 1);
	String title=XL.getdata(XL_PATH, "validlogin", 1, 2);
	
	
	LoginPage lp=new LoginPage(driver);
	lp.username(un);
	lp.setpassword(pw);
	lp.loginButton();
	
	EnterTimeTrackPage etp=new EnterTimeTrackPage(driver);
	etp.verifyHPisDisplayed(driver, 5, title);
	
}
	
}

