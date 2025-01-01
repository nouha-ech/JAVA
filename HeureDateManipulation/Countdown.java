package time;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Countdown {

	public static void main(String[] args) {
		
		// instantier timer et importer
		
		Timer timer = new Timer();

		//  importer scan
		Scanner sc = new Scanner(System.in);
		
		 System.out.print("combien de second vous voulez compter :  ");
	        int res = sc.nextInt();
	        
	     // instantier timertask et importer
		TimerTask task = new TimerTask() {
			int count = res;
		
		public void run() {
			   System.out.println(count);
               count--;
               if(count < 0){
                   System.out.println("STOOP!");
                   timer.cancel();  // to stop program from counting neg seconds
		}
	}
		 };

	        timer.scheduleAtFixedRate(task, 0, 500); //500ms

	        sc.close();
	    }
	}


