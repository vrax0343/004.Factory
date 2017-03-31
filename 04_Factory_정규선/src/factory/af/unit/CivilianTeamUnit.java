package factory.af.unit;

import strategy.behavior.attack.*;
import strategy.behavior.movement.*;
import strategy.behavior.weapon.*;
import strategy.unit.Unit;
import factory.af.AbstractTeamInfoFactory;
import factory.af.TeamMessage;
import factory.af.TeamName;
//TODO ¿øº»
//public class CivilianTeamUnit extends TeamUnit {
//	AbstractTeamInfoFactory atf;
//
//	public CivilianTeamUnit(AbstractTeamInfoFactory atf) {
//		super();
//		this.atf = atf;
//		health=10;
//		type="Civilian";
//		
//		attack = new Punch();
//		movement = new Walk();
//		weapon = new Fist();
//	}
//
//	@Override
//	public void prepare() {
//		// TODO Auto-generated method stub
//		teamMessage = atf.createTeamMessage();
//		teamName	= atf.createTeamName();
//	}
//	
//	
//}

public class CivilianTeamUnit extends Unit {
	AbstractTeamInfoFactory atf;
	public String teamMessage;
	public String teamName;
	
	public CivilianTeamUnit(AbstractTeamInfoFactory atf) {
		super();
		this.atf = atf;
		type = "Mage";
		health=20;
		
		attack = new CastFireball();
		movement = new Teleport();
		weapon = new Staff();
	}

	@Override
	public void prepareTeamInfo() {
		// TODO Auto-generated method stub
		teamMessage = atf.createTeamMessage();
		teamName	= atf.createTeamName();
	}
	
	
}