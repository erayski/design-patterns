package Observer;

public class Main {
 
	public static void main(String[] args) 
	{
		Fitness fitness = new Fitness();
		FitnessInstructor fitnessintructor = new FitnessInstructor(fitness);
		Observer zritel1= new Zritel();
		Observer zritel2= new Zritel();
		Observer zritel3= new Zritel();
		
		fitness.subscribe(zritel1);
		fitness.subscribe(zritel2);
		fitness.subscribe(zritel3);
		
		fitnessintructor.ChangeTraining("Legni");
		System.out.println();
		fitnessintructor.ChangeTraining("Stani");
	}
	
}
