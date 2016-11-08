package converter;

public class Temperature {
	private double temperature;
	private char uniteDeMesure;

	// constructeur
	public Temperature(double temperature, char uniteDeMesure) {
		this.temperature = temperature;
		this.uniteDeMesure = uniteDeMesure;
	}
	
	public Temperature(double temperature){
		this(temperature , ' ');
	}

	// get & set
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public char getUniteDeMesure() {
		return uniteDeMesure;
	}
	public void setUniteDeMesure(char uniteDeMesure) {
		this.uniteDeMesure = uniteDeMesure;
	}
	
	// conversion en degré Celcius
	public Temperature conversionC(){
		Temperature temp;		
		temp = new Temperature(((this.temperature - 32.0) / 1.8), 'C');
		return temp;
	
	}
	
	// conversion en degré Farenheit
	public Temperature conversionF(){
		Temperature temp;
		temp = new Temperature(((this.temperature * 1.8) + 32.0) , 'F');
		return temp;
	
	}
	
}
