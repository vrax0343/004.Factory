package factory.af.unit;

import factory.af.AbstractTeamInfoFactory;
import factory.af.TeamMessage;
import factory.af.TeamName;
import strategy.behavior.attack.*;
import strategy.behavior.movement.*;
import strategy.behavior.weapon.*;
import strategy.unit.Unit;
//TODO ¿øº»
//public class MageTeamUnit extends TeamUnit {
//	AbstractTeamInfoFactory atf;
//
//	public MageTeamUnit(AbstractTeamInfoFactory atf) {
//		super();
//		this.atf = atf;
//		type = "Mage";
//		health=20;
//		
//		attack = new CastFireball();
//		movement = new Teleport();
//		weapon = new Staff();
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

public class MageTeamUnit extends Unit {
	AbstractTeamInfoFactory atf;
	public String teamMessage;
	public String teamName;
	
	public MageTeamUnit(AbstractTeamInfoFactory atf) {
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
	
	public String toString(){
		return "teamMessage: " + this.teamMessage + "teamName: " + this.teamName + "\n" + super.toString();  
	}

//	public TeamMessage getTeamMessage() {
//		return teamMessage;
//	}
//
//	public void setTeamMessage(TeamMessage teamMessage) {
//		this.teamMessage = teamMessage;
//	}
//
//	public TeamName getTeamName() {
//		return teamName;
//	}
//
//	public void setTeamName(TeamName teamName) {
//		this.teamName = teamName;
//	}
	
	
	
	
}
