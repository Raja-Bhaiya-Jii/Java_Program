
public class UnitConverter {

	public static void main(String[] args) {
		        double value = 5.5;
		        String conversionType = "km_to_m"; // Options: "km_to_m", "m_to_cm", "m_to_mm"

		        switch (conversionType) {
		            case "km_to_m":
		                System.out.println(value + " km = " + (value * 1000) + " meters");
		                break;
		            case "m_to_cm":
		                System.out.println(value + " m = " + (value * 1000) + " centimeters");
		                break;
		            case "cm_to_mm":
		                System.out.println(value + " cm = " + (value * 10) + " millimeters");
		                break;
		            default:
		                System.out.println("Conversion logic rule not recognized.");
		        }
		    }
	
}
