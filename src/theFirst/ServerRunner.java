package theFirst;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ServerRunner implements Runnable{
	private Thread t;
	private String threadName;
	private boolean conflict;

	public ServerRunner(String name, boolean conflict){
		threadName = name;
		this.conflict = conflict;
		System.out.println("Creating ServerRunner Thread");
	}
	@Override
	public void run() {
		String cmd = "java -jar MPDeclareMonitoring.jar ";
		if (conflict)
			cmd = cmd + "-conflictCheck";
        try {
        	ProcessBuilder pb = new ProcessBuilder(cmd.split(" "));        	
    		Process p = pb.start();
    		BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
    		String line = null;
    		while ( (line = reader.readLine()) != null) {
    			System.out.println(line);
    		}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}		
	}
	public void start () {
		System.out.println("Starting " +  threadName );
		if (t == null) {
			t = new Thread (this, threadName);
		    t.start ();
		    }
		}
}
