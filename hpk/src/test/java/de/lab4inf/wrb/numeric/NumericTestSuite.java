package de.lab4inf.wrb.numeric;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({IntegratorTest.class,
			   DifferentiatorTest.class})
public class NumericTestSuite {}
