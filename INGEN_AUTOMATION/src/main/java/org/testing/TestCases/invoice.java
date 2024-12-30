package org.testing.TestCases;

import org.testing.TestScripts.methods;

public class invoice {
public static void main(String[] args) {
	methods m=new methods();
	m.browserlaunch();
	m.loginviacompany("aditya29@yopmail.com", "Ingen@123456789");
	m.invoice();
}
}
