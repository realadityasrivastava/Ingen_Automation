package org.testing.TestCases;
import org.testing.TestScripts.methods;

public class invoice {
public static void main(String[] args) throws InterruptedException {
	methods m=new methods();
	m.browserlaunch();
	m.loginviacompany("govind17@yopmail.com", "Ingen@123456789");
	m.invoice();
	m.capturePopupAndStopOnError2();
	Thread.sleep(3000);
	m.qrverify_latestinvoice();
	m.img_verify2_httpwithbase64();
	m.browserclose();
}
}
