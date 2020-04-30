package Observer;




public class Zritel implements Observer {
	private String training;
	private Observable fitness;
	
	
	public Zritel() {
		
	}
	
	
	
	public void update() {
		if(fitness == null) {
			System.out.println("No fitness");
			return;
		}
		training = fitness.getUpdate();
		System.out.println("Zritel changed training to "+ this.training);
	}
	
	
	public void setFitness(Observable fitness) {
		this.fitness = fitness;
	}
	
	public String getTraining() {
		return this.training;
	}

	public void setTraining(String training) {
		this.training = training;
	}
	
}
