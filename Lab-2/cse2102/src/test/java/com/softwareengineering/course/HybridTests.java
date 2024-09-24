package com.softwareengineering.course;

// import com.softwareengineering.course.CarRunner;
// import com.softwareengineering.course.Hybrid;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class HybridTests extends TestCase {

	public HybridTests(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(HybridTests.class);
	}

	public void testApp() {
		Hybrid hybrid;
		double gasMiles = 100;
		double electricMiles = 100;
		double gallons = 5; 
		double totalkwh = 33.7;
		double galCost = 3.50;
		double kwhCost = 0.24;

		double mpg = gasMiles/gallons;
		double mpge = (electricMiles/totalkwh) * 33.7;

		double epsilon = 1e-10;
		
		hybrid = new Hybrid();
		hybrid.setMilesfromGas(gasMiles);
		hybrid.setElectricMiles(electricMiles);
		hybrid.setGallonsfromGas(gallons);
		hybrid.setTotalkWh(totalkwh);
		hybrid.setCostPerGal(galCost);
		hybrid.setCostPerKWH(kwhCost);

		double expected = mpg;
		double actual = hybrid.calcGasMPG();
		assertTrue(Math.abs(actual - expected) < epsilon);
		
		expected = mpge;
		actual = hybrid.calcMPGe();
		assertTrue(Math.abs(actual - expected) < epsilon);

		expected = (mpg + mpge) / 2;
		actual = hybrid.calcHybridModeMPG();
		assertTrue(Math.abs(actual - expected) < epsilon);
		
		expected = gallons * galCost;
		actual = hybrid.totalGasCost();
		assertTrue(Math.abs(actual - expected) < epsilon);
		
	}
}
	

// 	@Test
// 	public void mpgTest() {
// 		// MPG
// 		double expected = mpg;
// 		double actual = hybrid.calcGasMPG();
// 		assertTrue(Math.abs(actual - expected) < epsilon);
// 	}

// 	@Test
// 	public void mpgeTest() {
// 		// MPGe
// 		double expected = mpge;
// 		double actual = hybrid.calcMPGe();
// 		assertTrue(Math.abs(actual - expected) < epsilon);
// 	}
	
// 	@Test
// 	public void avgMPGTest() {
// 		// average MPG during Hybrid Mode
// 		double expected = (mpg + mpge) / 2;
// 		double actual = hybrid.calcHybridModeMPG();
// 		assertTrue(Math.abs(actual - expected) < epsilon);
// 	}

// 	@Test
// 	public void gasCostTest() {
// 		// total gas cost
// 		double expected = gallons * galCost;
// 		double actual = hybrid.totalGasCost();
// 		assertTrue(Math.abs(actual - expected) < epsilon);
// 	}

// 	@Test
// 	public void electricCostTest() {
// 		// total electric cost
// 		double expected = totalkwh * kwhCost;
// 		double actual = hybrid.totalElectricCost();
// 		assertTrue(Math.abs(actual - expected) < epsilon);

// 	}

// 	@Test
// 	public void fixedValueExamples() {

// 		// Testing examples given in instructions
// 		// The values were rounded up to the nearest hundredth
// 		double error = 0.01;

// 		hybrid.setMilesfromGas(120);
// 		hybrid.setElectricMiles(300);
// 		hybrid.setGallonsfromGas(6);
// 		hybrid.setTotalkWh(70);
// 		hybrid.setCostPerGal(3.50);
// 		hybrid.setCostPerKWH(0.24);

// 		assertTrue(Math.abs(hybrid.calcMPGe() - 144.43) < error);
// 		assertTrue(Math.abs(hybrid.totalGasCost() - 21) < error);
// 	}
// }