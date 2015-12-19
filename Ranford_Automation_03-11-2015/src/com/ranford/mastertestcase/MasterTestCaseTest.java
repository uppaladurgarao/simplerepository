package com.ranford.mastertestcase;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class MasterTestCaseTest {
  @Test
  public void TestCase() {
	  
	  TestNG testng=new TestNG();
	  
	  List<String> suites=new ArrayList<String>();
	
	  suites.add("Branches_TestSuite.xml");
	  testng.setTestSuites(suites);	
	  
	  testng.run();
  }
}
