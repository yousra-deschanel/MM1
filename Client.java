package mm1;

public class Client {

	    public enum Client_Class {C1, C2, C3} ;

	    public int id; 
	    public Client_Class class_type ;
	    public double t_arrival; 
	    public double t_start_service; 
	    public double service_time;


	    
	    public Client(int id, Client_Class c1, double tnow, float i, double service_time2) {
			this.id = id;
			this.class_type = c1;
			this.t_arrival = tnow;
			this.t_start_service = i;
			this.service_time = service_time2;
		}


	    
	


}
