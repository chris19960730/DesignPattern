package prototype;

public class prototypeFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Rules rules=RulesPrototype.getPrototype("PR");
				Rules sRules=RulesPrototype.getPrototype("SR");
				
				SecondaryRules bSecondaryRules=(SecondaryRules)sRules;
				bSecondaryRules.setSpacePro(0.1);
				bSecondaryRules.setSpaceSpeed(100);
				bSecondaryRules.setTime(100);
				
				System.out.println("空间占比："+bSecondaryRules.getSpacePro()+"   空间转移速度：  "+
				bSecondaryRules.getSpaceSpeed()+" 时间片长度:   "+bSecondaryRules.getTime());
//				if(rules!=null) {
//					PrimaryRules aPrimaryRules=(PrimaryRules) rules;
//					aPrimaryRules.setTime(10);
//					System.out.println(rules);
//					System.out.println(aPrimaryRules.getTime());
				//}
	}

}
