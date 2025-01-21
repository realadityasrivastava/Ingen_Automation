package org.testing.TestCases;

import org.testing.TestScripts.methods;

public class customer {
public static void main(String[] args) {
	methods g=new methods();
	g.browserlaunch();
	g.loginviacompany("govind17@yopmail.com", "Ingen@123456789");
	g.customer("Suraj", "546892130", "suraj18@yopmail.com");
	g.capturePopupAndStopOnError2();
	g.browserclose();
	g.browserclose();
}
}
