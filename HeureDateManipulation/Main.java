package time;
import java.util.Timer;
import java.util.TimerTask;
public class Main {

	public static void main(String[] args) {
	
		        Timer t= new Timer();
		        TimerTask task = new TimerTask(){

		            @Override
		            public void run(){
		                System.out.println("well");
		            }
		        };
		        
		     // timer can scdule a task 
				// we have 3 params first which task were scheduling 
				//  second when do we want to start
				// third (optional) period of time should pass before repeating it again;

		        t.schedule(task, 0, 2000); 

		    }
		

	}


