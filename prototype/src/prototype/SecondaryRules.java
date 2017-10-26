package prototype;


public class SecondaryRules implements Rules {

	private final String type="SR";
	private double _timeLength;
	private double _spacePropotion;
	private double _spaceSpeed;
	@Override
	public Rules clone() {
		return new SecondaryRules();
		
	}
	
	public double getTime() {
		return _timeLength;
	}
	
	public double getSpaceSpeed() {
		return _spaceSpeed;
	}
	
	public double getSpacePro() {
		return _spacePropotion;
	}
	
	public void setTime(double time) {
		_timeLength=time;
	}
	
	public void setSpacePro(double propotion) {
		_spacePropotion=propotion;
	}
	
	public void setSpaceSpeed(double speed) {
		_spaceSpeed=speed;
	}
	
}
