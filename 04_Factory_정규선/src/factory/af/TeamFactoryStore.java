package factory.af;

import strategy.unit.Unit;

public abstract class TeamFactoryStore {
	
	public abstract Unit createTeamUnit(String type);
	
	public Unit makeUnit(String type) {
		Unit tempUnit = createTeamUnit(type);
//		System.out.println("--- Making a " + tempUnit.getName() + " ---");
//		tempUnit.prepare();
//		tempUnit.print();
		
		return tempUnit; 
	}
}
