package factory.af.unit;

import strategy.behavior.attack.*;
import strategy.behavior.movement.*;
import strategy.behavior.weapon.*;
import strategy.unit.Unit;
import factory.af.AbstractTeamInfoFactory;
import factory.af.TeamMessage;
import factory.af.TeamName;
//TODO ¿øº»
//public class KnightTeamUnit extends TeamUnit {
//	AbstractTeamInfoFactory atf;
//
//	public KnightTeamUnit(AbstractTeamInfoFactory atf) {
//		super();
//		this.atf = atf;
//		type = "Knight";
//		health = 30;
//		
//		attack = new SwingSword();
//		movement = new Walk();
//		weapon = new Sword();
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
public class KnightTeamUnit extends Unit {
	AbstractTeamInfoFactory atf;
	public String teamMessage;
	public String teamName;
	
	public KnightTeamUnit(AbstractTeamInfoFactory atf) {
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
