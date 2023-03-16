import java.util.Date;

public class Participant {

    String Name ;
    int timeH ;
    int timeM;


    /**
     * Default construction
     * @param n1 : String that contains the name of the participants
     * @param t_h : int that represent the hour in the time
     * @param t_m : int that represent the minutes in the time
     */
    Participant(String n1, int t_h, int t_m){
        this.Name = n1;
        this.timeH = t_h;
        this.timeM = t_m ;
    }

    // TODO need to figure out if there exist default assignment to parameters
    /**
     * Debug function that shows a participants (indented)
     * @param indent if true then indented otherwise normal display
     */
    void show_participant(boolean indent){
        if(indent){
            System.out.println("\tParticipant " + this.Name + " at time " + this.timeH + ":" + this.timeM);

        }else {
            System.out.println("Participant " + this.Name + " at time " + this.timeH + ":" + this.timeM);

        }

    }

    String display_time_24h(){
        String r = "";
        if(this.timeH < 12){
            r = "0" + this.timeH;
        }else r = String.valueOf(this.timeH);

        if(this.timeM < 12){
            r += ":0" + this.timeM;
        }else r += ":"+String.valueOf(this.timeM);

        return r ;
    }


    /**
     * Debug function that show a participant in the normal way (function has overload with indentation possible)
     */
    void show_participant(){

        System.out.println("Participant " + this.Name + " at time " + display_time_24h());

    }
}
