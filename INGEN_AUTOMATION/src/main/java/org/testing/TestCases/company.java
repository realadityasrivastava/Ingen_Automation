
//login via superadmin

package org.testing.TestCases;

import org.testing.TestScripts.methods;

public class company {
public static void main(String[] args) throws InterruptedException {
	methods m=new methods();
	m.browserlaunch();
	m.loginviasuperadmin();
	m.img_verify();
	m.companywithpass();
}
}
