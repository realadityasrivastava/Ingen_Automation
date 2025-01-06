package org.testing.TestCases;

import org.testing.TestScripts.methods;

public class invoice {
public static void main(String[] args) throws InterruptedException {
	methods m=new methods();
	m.browserlaunch();
	m.loginviacompany("mohan06@yopmail.com", "Ingen@123456789");
	m.invoice();
	Thread.sleep(3000);
	m.img_verify();
}
}
