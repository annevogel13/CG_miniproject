import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class RangList extends JFrame {
    // elements in the panel
    private JPanel mainPanel;
    private JButton btnTest;
    private JTextField inputName;
    private JLabel labelName;
    private JLabel labelTime;
    private JSpinner inputMin;
    private JSpinner inputHour;
    private JTextArea outputParticipants;
    private JTextPane warnings;

    // elements
    collection_of_participants CP;

    /**
     * Function that creates the output in the outputParticipants textArea in the .from file
     */
    public void GUI_rewriteParticipants() {

        String str_collection_of_participants = "";

        for (int i = 0; i < CP.nb_participants; i++) {
            str_collection_of_participants += CP.collection[i].Name + " on time " + CP.collection[i].display_time_24h()+ "\n";
        }

        outputParticipants.setText(str_collection_of_participants);

    }

    /**
     * Function that sets the "display values" to the default values
     */
    public void GUI_set_form_to_empty() {
        inputName.setText("Write here a new name");
        inputMin.setValue(12);
        inputHour.setValue(12);
    }

    /**
     * Function that validates the input of the form and checks for wrong input and corrects it
     */
    public void GUI_validate_form() {

        String n = inputName.getText();
        int input_h = (int) inputHour.getValue();
        int input_m = (int) inputMin.getValue();
        String str_warning = warnings.getText();

        if ((input_h > 24 || input_h < 0) || (input_m > 60 || input_m < 0)) {
            warnings.setText(str_warning + "\nThe given time is not within the right bounds");
            inputMin.setValue(12);
            inputHour.setValue(12);

            // objects.equals is a more advanced way of doing str == str
        } else if ((Objects.equals(n, "Write here a new name")) || (Objects.equals(n, "")) || (Objects.equals(n, " "))) {

            warnings.setText(str_warning + "\nThe given name is not valid");
            inputName.setText("Write here a new name");
        } else {

            Participant P_tmp = new Participant(n, input_h, input_m);
            System.out.print("Added : ");
            P_tmp.show_participant();
            CP.add_participant(P_tmp);


            warnings.setText(str_warning + "\nThe participant was added ");
            GUI_rewriteParticipants();
            GUI_set_form_to_empty();
        }

    }

    /**
     * Default constructor
     */
    public RangList() {

        this.CP = new collection_of_participants();

        btnTest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUI_validate_form();
            }
        });

    }


    public static void main(String[] args) {

        RangList RL = new RangList();
        RL.setContentPane(RL.mainPanel);
        RL.setSize(500, 500);
        RL.setVisible(true);


    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

}


