package Command;

import java.util.ArrayList;
import java.util.List;

public class Fitness {
	
		private String training;
		private List<Zritel> zriteli = new ArrayList<Zritel>();

		
		
		public void setTraining(String training)
		{
			this.training = training;
			for(Zritel zritel: this.zriteli) {
				zritel.setTraining(this.training);
			}		
		}
		public void subscribe(Zritel zritel) {
			this.zriteli.add(zritel);		
		}
	}
	