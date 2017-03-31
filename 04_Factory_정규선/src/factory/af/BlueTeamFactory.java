package factory.af;

import factory.af.unit.*;
import strategy.unit.Mage;
import strategy.unit.Unit;

public class BlueTeamFactory extends TeamFactoryStore {
	@Override
	public Unit createTeamUnit(String item) {
		// TODO Auto-generated method stub
		Unit teamUnit = null;
		AbstractTeamInfoFactory atf = new BlueTeamInfoFactory();
		
		if (item.equals("Mage")) {
			teamUnit = new MageTeamUnit(atf);
//			teamUnit = new TeamUnit(new Mage());
			
		}else if (item.equals("Civilian")) {
			teamUnit = new CivilianTeamUnit(atf);
//			teamUnit.setName("��� �ù�");
		}else if (item.equals("Knight")) {
			teamUnit = new KnightTeamUnit(atf);
//			teamUnit.setName("��� ���");
		}
//		teamUnit.setTeamName(new BlueTeamName());
		return teamUnit;
	}

}
//TODO ����
//public class BlueTeamFactory extends TeamFactoryStore {
//	
//	@Override
//	public TeamUnit createTeamUnit(String item) {
//		// TODO Auto-generated method stub
//		TeamUnit teamUnit = null;
//		AbstractTeamInfoFactory atf = new BlueTeamInfoFactory();
//		
//		if (item.equals("Mage")) {
//			teamUnit = new MageTeamUnit(atf);
//			teamUnit.setName("��� ����");
//			
//		}else if (item.equals("Civilian")) {
//			teamUnit = new CivilianTeamUnit(atf);
//			teamUnit.setName("��� �ù�");
//		}else if (item.equals("Knight")) {
//			teamUnit = new KnightTeamUnit(atf);
//			teamUnit.setName("��� ���");
//		}
//		
//		return teamUnit;
//	}
//	
//}
