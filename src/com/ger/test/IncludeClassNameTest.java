package com.ger.test;


import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeClassNamePatterns;
import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("com.ger.test")
@IncludeClassNamePatterns(".sub*")
@ExcludeClassNamePatterns(".add")
public class IncludeClassNameTest {

}
