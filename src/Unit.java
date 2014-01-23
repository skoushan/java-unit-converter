
public enum Unit {
	unknown_unit ("U/N","U/N","U/N",0, 0),

	// TODO: add data rates, force, illuminance, power, work
	// TODO: add plural/singular names

	//DATA
	b ("data","b","bits", 1, 0), //Base Unit
	kb ("data","kb","kilobits", Math.pow(10, 3), 0),
	Mb ("data", "Mb", "megabits", Math.pow(10, 6), 0),
	Gb ("data", "Gb", "gigabits", Math.pow(10, 9), 0),
	Tb ("data", "Tb", "terrabits", Math.pow(10, 12), 0),
	Pb ("data", "Pb", "pettabits", Math.pow(10, 15), 0),

	B ("data","B","bytes", 8, 0),
	kB ("data","kB","kilobytes", 8 * Math.pow(10, 3), 0),
	MB ("data", "MB", "megabytes", 8 * Math.pow(10, 6), 0),
	GB ("data", "GB", "gigabytes", 8 * Math.pow(10, 9), 0),
	TB ("data", "TB", "terrabytes", 8 * Math.pow(10, 12), 0),
	PB ("data", "PB", "pettabytes", 8 * Math.pow(10, 15), 0),

	//LENGTH
	mm ("length","mm", "millimeters", Math.pow(10, -3), 0),
	cm ("length","cm","centimeters",Math.pow (10,-2), 0),
	m ("length","m","meters", 1, 0), //Base Unit
	km ("length","km","kilometers", Math.pow(10, 3), 0),
	in ("length","in","inches", 0.0254, 0),
	mi ("length","mi","miles", 1609.334, 0),
	ft ("length","ft","feet", 0.3048, 0),
	yd ("length","yd","yard",0.9144, 0),

	//AREA
	mm2("area","mm^2","millimeters squared", Math.pow(10, -6), 0),
	sq_in ("area","sq in","square inches", 0.00064516, 0),
	in2 ("area", "in^2","inches squared", 0.00064516, 0),
	cm2("area","cm^2","centimeters squared",Math.pow(10,-4), 0),
	sq_ft ("area", "sq ft","square feet", 0.092903, 0),
	ft2("area","ft^2","feet squared", 0.092903, 0),
	sq_yd("area","sq yd","square yards",0.836127, 0),
	yd2("area","yd^2","yards squared",0.836127, 0),
	m2("area","m^2","meters squared", 1, 0),
	acre ("area", "ac","acres", 4046.8564, 0),
	hectare ("area","ha","hectares",Math.pow(10,4), 0),
	km2 ("area","km^2","kilometers squared",Math.pow(10, 6), 0),
	sq_mi("area","sq mi","square miles",2589998.11, 0),
	mi2("area","mi^2","miles squared",2589998.11, 0),

	//MASS
	mg ("mass","mg","milligrams",Math.pow(10, -3), 0),
	g ("mass","g","grams", 1, 0), //Base Unit
	kg ("mass","kg", "kilograms", Math.pow(10, 3), 0),
	oz ("mass","oz", "ounzes", 28.34952, 0),
	lb ("mass","lb", "pounds", 453.5924, 0),
	t ("mass","t", "tonnes", 1000000, 0),

	//VOLUME
	cc ("volume","cc","cubic centimetres", Math.pow(10,-3), 0),
	ml ("volume","ml","millilitres",Math.pow(10,-3), 0),
	tsp ("volume","tsp","teaspoons",0.00492892, 0),
	tbsp("volume","tbsp","tablespoons", 0.0147868, 0),
/**/fl_oz ("volume","fl oz","ounces", 0.0295735, 0),
	cup ("volume", "cup", "cups", 0.2365882, 0),
	pt ("volume","pt","pint",0.4731765, 0),
	qt ("volume","qt","quart",0.9463529, 0),
	L ("volume","L","litres", 1, 0),
	l ("volume","l", "litre", 1, 0),
	gal ("volume","gal","gallons",3.785412, 0),

	//TEMPERATURE
	k ("temperature","K","Kelvins", 1, -273.15),
	f ("temperature","F","degrees Fahrenheit", 5.0/9.0, -32),
	c ("temperature","C","degrees Celcius", 1, 0), //Base Unit

	//SPEED
/**/kph ("speed","kph","kilometers/hour",1, 0),
	mph ("speed", "mph", "miles/hour",1.609344, 0),
	kts("speed","kts", "knots", 1.852, 0);

	public final String type, shortName,fullName;
	public final double value, offset;

	Unit (String s1, String s2, String s3, double d1, double d2) {
		type = s1;
		shortName=s2;
		fullName=s3;
		value=d1;
		offset=d2;
	}
	public static Unit stringToUnit(String s){
		for (Unit a : Unit.values())
			if (s.equalsIgnoreCase (a.fullName) || s.equals(a.shortName))
				return a;
				return Unit.unknown_unit;
	}

}
