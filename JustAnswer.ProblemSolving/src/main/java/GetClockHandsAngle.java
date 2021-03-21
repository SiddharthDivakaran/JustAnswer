
public class GetClockHandsAngle {
	public float getAngle(int hour,int minute)throws Exception {
		if(hour<0 || minute<0 || hour>12 || minute>60 ||hour<0)
			throw new Exception("invalid input");
			
		if(hour==12)
			hour=0;
		if(minute==60) {
			minute=0;
			hour=hour+1;
			if(hour>12)
				hour=hour-12;
		}
		float hourAngle = (float)(0.5*(hour*60+minute));
		float minuteAngle = (float)(6*minute);
		float resAngle = Math.abs(hourAngle-minuteAngle);
		resAngle = Math.min(360-resAngle, resAngle);
		return resAngle;
	}
	public static void main(String args[]) {
		GetClockHandsAngle g = new GetClockHandsAngle();
		int hour = 12;
		int minute = 60;
		try {
			System.out.print("Angle: "+g.getAngle(hour, minute));
		}
		catch(Exception e) {
			System.out.print(e.getMessage());
		}
		
	}
}
