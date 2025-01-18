package org.testing.TestCases;

import org.testing.TestScripts.methods;

public class accounting_setup {
public static void main(String[] args) throws InterruptedException {
	methods g=new methods();
	g.browserlaunch();
	g.loginviacompany("govind17@yopmail.com", "Ingen@123456789");
	g.setup_for_product();
}
}
