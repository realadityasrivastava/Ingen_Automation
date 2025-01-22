package org.testing.TestCases;

import org.testing.TestScripts.flow_methods;

public class Flow1 {
public static void main(String[] args) throws InterruptedException {
	flow_methods f=new flow_methods();
	f.browserlaunch();
	f.loginviasuperadmin();
	f.img_verify2_httpwithbase64();
	f.companywithpass("Naman Goods and Service", "naman22@yopmail.com", "Naman22", "Noida", "523487925");
	f.capturePopupAndStopOnError2();
	Thread.sleep(5000);
	f.logout_superadmin();
	f.loginviacompany("govind17@yopmail.com", "12345678");
	f.setup_for_product();
	f.capturePopupAndStopOnError2();
	f.customer("Ram", "456258789", "ram22@yopmail.com");
	f.capturePopupAndStopOnError2();
	f.product("Apple", "001", "100", "70", "100");
	f.invoice();
	f.capturePopupAndStopOnError2();
	f.qrverify_latestinvoice();
	f.img_verify2_httpwithbase64();
}
}
