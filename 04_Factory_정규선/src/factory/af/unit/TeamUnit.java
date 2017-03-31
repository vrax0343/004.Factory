package factory.af.unit;

import factory.af.TeamInfo;
import factory.af.TeamMessage;
import factory.af.TeamName;
import observer.Subject;
import strategy.behavior.attack.AttackBehavior;
import strategy.behavior.movement.MovementBehavior;
import strategy.behavior.weapon.WeaponBehavior;
import strategy.function.GenerateRandomPosition;
import strategy.unit.Unit;

public abstract class TeamUnit extends Unit{
	public String teamMessage;
	public String teamName;
	TeamInfo teamInfo;
	
	
//	public AttackBehavior attack = null;
//	public MovementBehavior movement = null;
//	public WeaponBehavior weapon=null;
//	
//	public String type="";
//	public int locationX=GenerateRandomPosition.generate(), locationY=GenerateRandomPosition.generate();
//	public int health=0;
//	
	
	
	
	public abstract void prepare();
	

	public TeamUnit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TeamUnit(Unit u){
		
	}


	public TeamUnit(String type) {
		super(type);
		// TODO Auto-generated constructor stub
	}


	public TeamUnit(Subject weatherData) {
		super(weatherData);
		// TODO Auto-generated constructor stub
	}


	public void createTeamInfo() {
		// TODO Auto-generated method stub
		
	}

//	public void print() {
//		// TODO Auto-generated method stub
//		System.out.println("Name: " + name);
//		System.out.println("Type: " + type);
//		System.out.println(("location: ("+locationX+","+locationY+ ")"));
//		System.out.println(("health: "+health + "\n"));
//	}
}
