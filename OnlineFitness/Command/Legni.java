package Command;

public class Legni implements Command {

private Fitness fitness;
	
	public Legni(Fitness fitness) {
		this.fitness = fitness;
	}
	@Override
	public void execute() {
		fitness.setTraining("Legni");
	}
}
