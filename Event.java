package mm1;

public class Event {
    enum Event_type {arrival, start_service, departure} ;

    public  Event_type type; 
    public  double time;

    public Event(Event_type type, double d){  
        this.type= type; 
        this.time = d;
    }





}
