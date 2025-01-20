package org.testing.TestCases;

import org.testing.TestScripts.methods;

public class creditnote {
public static void main(String[] args) throws InterruptedException {
	methods m=new methods();
	m.browserlaunch();
	m.loginviacompany("govind17@yopmail.com", "Ingen@123456789");
	m.credit_note("INV-2025-00014", "20102025", "500");
	m.capturePopupAndStopOnError2();
}
}
