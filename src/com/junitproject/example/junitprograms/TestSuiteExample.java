package com.junitproject.example.junitprograms;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses( {MyFirstTestClass.class, MySecondTestClass.class} )
public class TestSuiteExample
{
	
}
