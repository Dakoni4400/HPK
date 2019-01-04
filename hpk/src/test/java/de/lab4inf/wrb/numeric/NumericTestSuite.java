package de.lab4inf.wrb.numeric;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({DifferentiatorTest.class,
			   IntegratorTest.class})
public class NumericTestSuite{}
