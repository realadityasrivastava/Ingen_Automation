package org.testing.TestCases;

import org.testing.TestScripts.methods;

public class product {
public static void main(String[] args) {
	methods g=new methods();
	g.browserlaunch();
	g.loginviacompany("aditya29@yopmail.com", "Ingen@123456789");
	g.product("Apple", "001", "100", "70", "100");
}
}
