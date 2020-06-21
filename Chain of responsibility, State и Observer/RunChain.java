
public class RunChain {
    public static void main(String[] args){
    	

    	Subject subject = new Subject();
    	new ReadyObserver(subject);
        subject.setState(1);

        Context context = new Context();
        StartState startState = new StartState();
        StopState stopState = new StopState();
       
        
        startState.doAction(context);
        System.out.println(context.getState().toString());
                

        Chain chainOrder1 = new OutOfCountry();

        Chain chainOrder2 = new InCountry();

        Chain chainOrder3 = new InTown();

        chainOrder1.setNextChain(chainOrder2);

        chainOrder2.setNextChain(chainOrder3);
       
        Packages request = new Packages("Dubai","Rakia","OutOfCountry");
        Packages request2 = new Packages("Haskovo","document","inCountry");
        Packages request3 = new Packages("Center","Water","InTown");


        chainOrder1.calculate(request);
        chainOrder2.calculate(request2);
        chainOrder3.calculate(request3);
    }
}