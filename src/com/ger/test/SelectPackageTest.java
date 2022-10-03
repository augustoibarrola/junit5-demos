package com.ger.test;


import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages({"com.ger.test.add", "com.ger.test.subtract", "com.ger.test.multiply"})
public class SelectPackageTest {

}
