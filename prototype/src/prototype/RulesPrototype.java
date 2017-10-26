package prototype;

import java.util.HashMap;
import java.util.Map;

public class RulesPrototype {
	private static final Map<String, Rules> prototype=new HashMap<>();
	
	static {
		prototype.put("PR", new PrimaryRules());
		prototype.put("SR", new SecondaryRules());
		
	}
	public static Rules getPrototype(String type) {
		try {
			return prototype.get(type).clone();
		}catch (NullPointerException ex) {
            System.out.println("Prototype with name: " + type + ", doesn't exist");
            return null;
	}

}
}