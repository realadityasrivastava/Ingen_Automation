package org.testing.TestCases;

import org.testing.TestScripts.methods;

public class creditnote {
public static void main(String[] args) throws InterruptedException {
	methods m=new methods();
	m.browserlaunch();
	m.loginviacompany("govind17@yopmail.com", "12345678");
	m.credit_note("INV-2025-00010", "20102025", "500");
	m.capturePopupAndStopOnError2();
	m.browserclose();
}
}
