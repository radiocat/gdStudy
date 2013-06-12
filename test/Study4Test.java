import org.junit.Test;

import static org.junit.Assert.*;

/**
 * PACKAGE_NAME.
 * User: radiocat
 * Date: 2013/06/13
 * Time: 0:52
 */
public class Study4Test {

	@Test
	public void testSplitMaxNumber() throws Exception {

		String value;
		int digits;

		try{
			assertEquals(null, Study4.splitMaxNumber(null, 1));
			fail();
		}catch (Exception e){
			assertTrue(e instanceof IllegalArgumentException);
		}

		try{
			assertEquals(null, Study4.splitMaxNumber("1", 2));
			fail();
		}catch (Exception e){
			assertTrue(e instanceof IllegalArgumentException);
		}

		assertEquals(12L, Study4.splitMaxNumber("12", 2));
		assertEquals(2L, Study4.splitMaxNumber("12", 1));
		assertEquals(21L, Study4.splitMaxNumber("121", 2));
		assertEquals(21L, Study4.splitMaxNumber("211", 2));
		assertEquals(918L, Study4.splitMaxNumber("27360918", 3));
		assertEquals(7360L, Study4.splitMaxNumber("27360918", 4));
		assertEquals(27360918L, Study4.splitMaxNumber("27360918", 8));


		assertEquals(0L, Study4.splitMaxNumber("000", 2));

	}
}
