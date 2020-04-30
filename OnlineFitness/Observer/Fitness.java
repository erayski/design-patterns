package Observer;

import java.util.ArrayList;
import java.util.List;

public class Fitness implements Observable {
 
	private List<Observer> observers = new ArrayList<Observer>();
	private String training ; 

	public void setTraining(String training) {
		this.training = training;
		this.notifyObservers();
	}

	
	
	public String getUpdate() {
		return training;
	}

	
	public void subscribe(Observer observer) {
		observer.setFitness(this);
		this.observers.add(observer);
		
	}

	
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() 
	  {
		for(Observer observer: this.observers)
		{
			observer.update();		
		}
	  }
	}
