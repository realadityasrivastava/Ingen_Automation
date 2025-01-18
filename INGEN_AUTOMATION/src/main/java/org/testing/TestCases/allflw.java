package org.testing.TestCases;

import org.testing.TestScripts.Flow1;

public class allflw {
public static void main(String[] args) throws InterruptedException {
	Flow1 f=new Flow1();
	f.browserlaunch();
	f.loginviasuperadmin();
	f.img_verify();
	f.companywithpass("Govind Private Limited", "govind17@yopmail.com", "Govind17", "Noida", "523487925");
	Thread.sleep(5000);
	f.logout_superadmin();
	f.loginviacompany("govind17@yopmail.com", "Ingen@123456789");
	f.setup_for_product();
	f.customer("Guru", "456258789", "guru18@yopmail.com");
	f.product("Apple", "001", "100", "70", "100");
	f.invoice();
	f.img_verify();
}
}
