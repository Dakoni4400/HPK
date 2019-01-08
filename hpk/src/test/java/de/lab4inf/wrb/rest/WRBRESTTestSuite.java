package de.lab4inf.wrb.rest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({WRBClientTest.class, 
			   WRBRESTIntegralServiceTest.class,
			   WRBRESTDifferentialServiceTest.class,
			   WRBRESTValueServiceTest.class})
public class WRBRESTTestSuite {

}
