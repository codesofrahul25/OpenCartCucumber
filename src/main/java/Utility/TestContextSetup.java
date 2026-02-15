package Utility;

import java.io.IOException;

import PageObjects.PgHomePage;
import PageObjects.PgLogin;
import PageObjects.PgMyAccount;
import PageObjects.PgRegister;

public class TestContextSetup {
	
	public TestContextSetup ts;
	public DriverSetup driversetup;
	public PgHomePage homepage;
	public PgRegister register;
	public PgMyAccount myaccount;
	public PgLogin login;
	
	public TestContextSetup() throws IOException
	{
		driversetup = new DriverSetup();
		homepage = new PgHomePage(driversetup.returnDriver());
		register = new PgRegister(driversetup.returnDriver());
		myaccount = new PgMyAccount(driversetup.returnDriver());
		login = new PgLogin(driversetup.returnDriver());
	}

}
