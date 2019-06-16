package script;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.FWUtil;

public class TestBaseTest extends BaseTest {
	@Test
	public void test() throws IOException
	{
		FWUtil.getphoto(driver, "./screenshots/google.png");
		Reporter.log("test",true);
	}

}
