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
	 * Test method for {@link converter.Temperature#conversionC()}. On vérifie
	 * que la conversion F --> C fonctionne correctement - la valeur numérique
	 * de la nouvelle temperature est celle attendue - l'unité est celle
	 * attendue
	 */
	@Test
	public void testConversionC() {
		Temperature TempF = new Temperature(32.0, 'F');
		Temperature TempC = TempF.conversionC();
		assertEquals(0.0 , TempC.getTemperature(), 0.1);
		assertEquals('C' , TempC.getUniteDeMesure() );
		// fail("Not yet implemented");
	}
	@Test
	public void testConversionF() {
		Temperature TempC = new Temperature(-40.0, 'C');
		Temperature TempF = TempC.conversionF();
		assertEquals(-40 , TempF.getTemperature(), 0.1);
		assertEquals('F' , TempF.getUniteDeMesure());
	}
	@Test
	public void testConversionC2() {
		Temperature TempF = new Temperature(-40, 'F');
		Temperature TempC = TempF.conversionC();
		assertEquals(-40 , TempC.getTemperature(), 0.1);
		assertEquals('C' , TempC.getUniteDeMesure());
	}
	@Test
	public void testConversionC3() {
		Temperature TempF = new Temperature(64, 'F');
		Temperature TempC = TempF.conversionC();
		assertEquals(17.78 , TempC.getTemperature(), 0.01);
		assertEquals('C' , TempC.getUniteDeMesure());
	}
	
	@Test
	public void testConversionReverse(){
		Temperature TempC = new Temperature(32 , 'C');
		Temperature TempF = TempC.conversionF();
		
		Temperature TempX = TempF.conversionC();
		
		assertEquals(TempC.getTemperature() , TempX.getTemperature(), 0.1);
		assertEquals(TempC.getUniteDeMesure(), TempX.getUniteDeMesure());
		
		assertEquals(89.6, TempF.getTemperature() ,0.1);
		assertEquals('F' , TempF.getUniteDeMesure());
		
	}
	
	
}
