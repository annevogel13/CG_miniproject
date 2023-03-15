
public class collection_of_participants {

    static final int MAX_PARTICIPANTS = 20 ;
    int nb_participants;
    Participant[] collection ;

    collection_of_participants(){
        // we need at least 1 participant to create a collection
        this.collection = new Participant[MAX_PARTICIPANTS];
        this.nb_participants = 0 ;

    }

    /**
     * Function that adds a participant to the collection of participants
     * @param p1 : participant that needs to be added to the collection
     */
    public void add_participant(Participant p1){

        if(this.nb_participants+1 <= MAX_PARTICIPANTS) {
            this.collection[nb_participants] = p1;
            this.nb_participants++;
        }else System.out.println("Too many participants, remove before you can add new ones");
    }

    /**
     * Debug function that shows all the participants in the collection that are not null
     */
    public void show_collection(){
        System.out.println("Participants in this collection : ");
        // can't use the advanced for-each because then it will also try to show the empty places in the collection
        for(int i = 0 ; i < this.nb_participants; i++){
            this.collection[i].show_participant(true);
        }
    }

    public static void main(String[] args) {

        Participant P = new Participant("Merel", 13, 15);
        collection_of_participants CP = new collection_of_participants();

        CP.add_participant(P);
        CP.show_collection();

        System.out.println("hello world");
    }

}
