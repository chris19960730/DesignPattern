package prototype;

public class PrimaryRules implements Rules{
	private final String type="PR";
	private double _timeLength;
	@Override
	public Rules clone() {
		return new PrimaryRules();
	}
	
	public void setTime(double time) {
		_timeLength=time;
	}
	
	public double getTime() {
		return _timeLength;
	}
}