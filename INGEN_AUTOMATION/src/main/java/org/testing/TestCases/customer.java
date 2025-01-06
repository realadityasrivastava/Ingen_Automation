package org.testing.TestCases;

import org.testing.TestScripts.methods;

public class customer {
public static void main(String[] args) {
	methods g=new methods();
	g.browserlaunch();
	g.loginviacompany("mohan06@yopmail.com", "Ingen@123456789");
	g.customer("Customer2", "7546892130", "customer2@yopmail.com");
}
}
