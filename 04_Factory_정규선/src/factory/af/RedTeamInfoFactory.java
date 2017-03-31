package factory.af;

public class RedTeamInfoFactory implements AbstractTeamInfoFactory {
	@Override
	public String createTeamName() {
		// TODO Auto-generated method stub
		return "Red Team";
	}

	@Override
	public String createTeamMessage() {
		// TODO Auto-generated method stub
		return "Red Team Message";
	}
}
