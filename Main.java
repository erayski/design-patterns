package Command;

public class Main {
	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		Fitness fitness = new Fitness();
		
		Zritel zritel1 = new Zritel();
		Zritel zritel2 = new Zritel();
		Zritel zritel3 = new Zritel();
		
		fitness.subscribe(zritel1);
		fitness.subscribe(zritel2);
		fitness.subscribe(zritel3);
		
		
		Command changeTrainingToLegni = new Legni(fitness);
		Command changeTrainingToStani = new Stani(fitness); 
		
		instructor.setCommand(changeTrainingToLegni);
		instructor.ChangeTraining();
		
		instructor.setCommand(changeTrainingToStani);
		instructor.ChangeTraining();
		
	}

}
