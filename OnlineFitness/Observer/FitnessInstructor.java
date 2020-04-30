package Observer;

public class FitnessInstructor 
{
	Fitness fitness;
	
	public FitnessInstructor(Fitness fitness)
{
	this.fitness = fitness;
  
}
	public void ChangeTraining(String newTraining)
	{
		this.fitness.setTraining(newTraining);
	}
}
