/**
 * 
 */
package converter;

import static org.junit.Assert.*;

import org.junit.Test;

import converter.Temperature;

/**
 * @author xdoyen
 *
 */
public class TemperatureTest {

	/**
	 * Test method for {@link converter.Temperature#conversionC()}. On v�rifie
	 * que la conversion F --> C fonctionne correctement - la valeur num�rique
	 * de la nouvelle temperature est celle attendue - l'unit� est celle
	 * attendue
	 */
	@Test
	public void testConversionC() {
		Temperature TempF = new Temperature(32.0, 'F');
		Temperature TempC = TempF.conversionC();
		assertEquals(TempC.getTemperature(), 0.0, 0.1);
		assertEquals(TempC.getUniteDeMesure(), 'C');

		// fail("Not yet implemented");
	}

	public void testConversionF() {
		Temperature TempC1 = new Temperature(-40.0, 'C');
		Temperature TempF1 = TempC1.conversionF();
		assertEquals(TempF1.getTemperature(), -40.0, 0.1);
		assertEquals(TempF1.getUniteDeMesure(), 'F');
	}

}
