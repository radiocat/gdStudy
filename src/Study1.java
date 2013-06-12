/**
 * PACKAGE_NAME.
 * User: radiocat
 * Date: 2013/06/11
 * Time: 18:16
 */
public class Study1 {

	public static String[] reverse(String[] arg) {
		String[] ret = new String[arg.length];
		int i = arg.length;
		while (i > 0) {
			ret[arg.length - i] = arg[--i];
		}
		return ret;
	}

	private static void sysOut(String[] arg) {
		for (String out : arg) {
			System.out.println(out);
		}
	}

	public static void main(String arg[]) {
		String[] test = {"a", "b", "c", "d"};
		sysOut(reverse(test));
	}

}
