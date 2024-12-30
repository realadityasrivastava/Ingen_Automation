package org.testing.TestCases;

import org.testing.TestScripts.methods;

public class accounting_setup {
public static void main(String[] args) {
	methods g=new methods();
	g.browserlaunch();
	g.loginviacompany();
	g.setup_for_product();
}
}
