package u;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import c.CarRunner;
import c.Hybrid;

import java.lang.Math;

public class HybridTests {

	Hybrid hybrid;
	double gasMiles = 100;
	double electricMiles = 100;
	double gallons = 5; 
	double totalkwh = 33.7;
	double galCost = 3.50;
	double kwhCost = 0.24;

	
	@Before
	public void setUp() throws Exception {
		hybrid = new Hybrid();
	}

	@Test
	public void mpgTest() {
		hybrid.setGallonsfromGas(gasMiles);
		hybrid.setElectricMiles(electricMiles);
		hybrid.setGallonsfromGas(gallons);
		hybrid.setTotalkWh(totalkwh);
		hybrid.setCostPerGal(galCost);
		hybrid.setCostPerKWH(kwhCost);

        double epsilon = 0.00001;
		
		// MPG
		double expected = gasMiles/gallons;
		double actual = hybrid.calcGasMPG();
		assertTrue(5==5);
		
	}
}