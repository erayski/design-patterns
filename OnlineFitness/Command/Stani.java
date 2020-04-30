package Command;

public class Stani implements Command {
private Fitness fitness;
	
	public Stani(Fitness fitness) {
		this.fitness = fitness;
	}
	@Override
	public void execute() {
		fitness.setTraining("Stani");
	}
}