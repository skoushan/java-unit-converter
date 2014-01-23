public class ConversionString {

	private String inquiry;
	private int[] spaces = new int[3];

	public Unit inputUnit, outputUnit;
	public double inputNum, outputNum;

	public ConversionString(String s) {
		inquiry = s.trim();
/**/System.out.println ("The inquiry is: "+ inquiry);
		determineSpaces();
		inputNum = Double.parseDouble(inquiry.substring(0, spaces[0]));
/**/System.out.println ("The inputNum is: "+ inputNum);
		inputUnit = Unit.stringToUnit(inquiry.substring(spaces[0] + 1,
				spaces[1]));
/**/System.out.println ("The inputUnit is: "+ inputUnit);
		outputUnit = Unit.stringToUnit(inquiry.substring(spaces[2] + 1,
				inquiry.length()));
/**/System.out.println ("The outputUnit is: "+ outputUnit);
		outputNum = Convertor.convert(this);
/**/System.out.println ("The outputNum is: "+ outputNum);
/**/System.out.println ();
	}

	private void determineSpaces() {
		spaces[0] = inquiry.indexOf(' '); // index of first space
		spaces[1] = inquiry.indexOf(' ', spaces[0] + 1); // index of second
															// space
		spaces[2] = inquiry.lastIndexOf(' '); // index of last space
	}

	public void setInputUnit(String s) {
		inputUnit = Unit.stringToUnit(s);
		outputNum = Convertor.convert(this);
	}

	public void setOutputUnit(String s) {
		outputUnit = Unit.stringToUnit(s);
		outputNum = Convertor.convert(this);
	}

	public void setInputNum(double d) {
		inputNum = d;
		outputNum = Convertor.convert(this);
	}

	public void setOutputNum(double d) {
		System.out.println();
		inputNum = d;
		System.out.println(inputNum);
		Unit in = inputUnit;
		Unit out = outputUnit;
		inputUnit = out;
		outputUnit = in;
		System.out.println("Input Unit is :" + inputUnit);
		System.out.println("Output Unit is :" + outputUnit);
		System.out.println();
		outputNum = Convertor.convert(this);
	}
}
