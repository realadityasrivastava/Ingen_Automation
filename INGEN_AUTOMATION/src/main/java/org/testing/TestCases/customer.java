package org.testing.TestCases;

import org.testing.TestScripts.methods;

public class customer {
public static void main(String[] args) {
	methods g=new methods();
	g.browserlaunch();
	g.loginviacompany("aditya29@yopmail.com", "Ingen@123456789");
	g.customer("Customer1", "+917546892130", "customer1@yopmail.com");
}
}
