import static org.junit.Assert.*;
import static org.junit.Assert.fail;
import static org.testng.Assert.*;
import org.junit.Test;

public class GetAngleTest {
	GetClockHandsAngle g = new GetClockHandsAngle();
	@Test
	//Negative hour test
	public void testAngle() {
		
		try {
			g.getAngle(-1, 10);
			fail("Excepion not thrown");
		} catch (Exception e) {
			e.getMessage();
			assertEquals("invalid input",e.getMessage());
		}
		
	}
	@Test
	//Negative minute test
	public void testAngle2() {
		
		try {
			g.getAngle(12, -40);
			fail("Excepion not thrown");
		} catch (Exception e) {
			e.getMessage();
			assertEquals("invalid input",e.getMessage());
		}
		
	}
	@Test
	//Test with proper hour and minute
	public void testAngle3() {
		try {
			int angle = (int)g.getAngle(5, 30);
			assertEquals("wrong calculation",angle,15);
		}
		catch(Exception e) {
			e.getMessage();
		}
	}
	@Test
	//Invalid hour test
	public void testAngle4() {
		
		try {
			g.getAngle(70, 40);
			fail("Excepion not thrown");
		} catch (Exception e) {
			e.getMessage();
			assertEquals("invalid input",e.getMessage());
		}
		
	}
	@Test
	//Invalid minute test
	public void testAngle5() {
		
		try {
			g.getAngle(10, 89);
			fail("Excepion not thrown");
		} catch (Exception e) {
			e.getMessage();
			assertEquals("invalid input",e.getMessage());
		}
		
	}
	@Test
	//Invalid hour and Invalid minute test
	public void testAngle6() {
		
		try {
			g.getAngle(99, 99);
			fail("Excepion not thrown");
		} catch (Exception e) {
			e.getMessage();
			assertEquals("invalid input",e.getMessage());
		}
		
	}
	@Test
	//Test with proper hour and minute when angle should be zero
	public void testAngle7() {
		try {
			int angle = (int)g.getAngle(0, 0);
			assertEquals("wrong calculation",angle,0);
		}
		catch(Exception e) {
			e.getMessage();
		}
	}
	@Test
	//Test for angle close to 180
	public void testAngle8() {
		try {
			int angle = (int)g.getAngle(0, 33);
			assertEquals("wrong calculation",angle,178);
		}
		catch(Exception e) { 
			e.getMessage();
		}
	}
	@Test
	//Test for angle when max of hour hand and max of minute hand is reached i.e 12 hour 60 minute
	public void testAngle9() {
		try {
			int angle = (int)g.getAngle(12, 60);
			assertEquals("wrong calculation",angle,30);
		}
		catch(Exception e) { 
			e.getMessage();
		}
	}
	@Test
	//Test for angle when hour is greater than 12
	public void testAngle10() {
		try {
			int angle = (int)g.getAngle(20, 20);
			assertEquals("wrong calculation",angle,50);
		}
		catch(Exception e) { 
			e.getMessage();
		}
	}
	@Test
	//Test for angle when minute is greater than 60
	public void testAngle11() {
		try {
			int angle = (int)g.getAngle(11, 70);
			assertEquals("wrong calculation",angle,55);
		}
		catch(Exception e) { 
			e.getMessage();
		}
	}

}
