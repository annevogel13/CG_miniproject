import java.util.Date;

public class Participant {

    String Name ;
    int timeH ;
    int timeM;
    Date date;

    Participant(String n1, int t_h, int t_m){
        this.Name = n1;
        this.timeH = t_h;
        this.timeM = t_m ;
    }

    // TODO need to figure out if there exist default assignment to parameters
    void show_participant(boolean indent){

        System.out.println("\tParticipant " + this.Name + " at time " + this.timeH + ":" + this.timeM);

    }

    void show_participant(){

        System.out.println("Participant " + this.Name + " at time " + this.timeH + ":" + this.timeM);

    }
}
