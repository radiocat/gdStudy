/**
 * PACKAGE_NAME.
 * User: radiocat
 * Date: 2013/06/13
 * Time: 0:38
 */
public class Study4 {

	public static long splitMaxNumber(String value, int digits){
		if (value == null || value.length() < digits ) throw new IllegalArgumentException(value);
		long maxNumber = -1;
		for(int i = 0; i <= (value.length() - digits) ; i++) {
			long number = Long.parseLong(value.substring(i, i + digits));
			if (maxNumber < number) {
				maxNumber = number;
			}
		}
		return maxNumber;
	}

}
