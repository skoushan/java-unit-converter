
// TODO: make conversion work for temperature

public class Convertor {

	public static double convert (ConversionString s){
		double output;
		output = (s.inputNum + s.inputUnit.offset) * s.inputUnit.value;
/**/System.out.printf("First part of the equation: (%,.2f + %,.2f) * %,.2f = %,.2f%n",s.inputNum, s.inputUnit.offset,s.inputUnit.value,output);
/**/System.out.printf ("Second part of the equation: (%,.2f/%,.2f) - %,.2f = ",output,s.outputUnit.value,s.outputUnit.offset);
		output = (output / s.outputUnit.value) - s.outputUnit.offset;
/**/System.out.println (output);
		return output;
	}

	public static double convert (String inputUnit, String outputUnit, double inputNum){
		double output;
		Unit InputUnit = Unit.stringToUnit(inputUnit);
		Unit OutputUnit = Unit.stringToUnit(outputUnit);
		
		output = (inputNum + InputUnit.offset) * InputUnit.value;
		output = (output / OutputUnit.value) - OutputUnit.offset; 
		
		return output;
	}

}
