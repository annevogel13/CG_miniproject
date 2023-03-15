import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class RangList extends JFrame {
    // element in the panel
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

    public void GUI_rewriteParticipants() {

        String str_collection_of_participants = "";

        for (int i = 0; i < CP.nb_participants; i++) {
            str_collection_of_participants += CP.collection[i].Name + " on time " + CP.collection[i].timeH + ":" + CP.collection[i].timeM + "\n";
        }

        outputParticipants.setText(str_collection_of_participants);

    }

    public void GUI_set_form_to_empty() {
        inputName.setText("Write here a new name");
        inputMin.setValue(12);
        inputHour.setValue(12);
    }

    public void GUI_validate_form() {

        String n = inputName.getText();
        int input_h = (int) inputHour.getValue();
        int input_m = (int) inputMin.getValue();

        if ((input_h > 24 || input_h < 0) || (input_m > 60 || input_m < 0)) {
            warnings.setText("The given time is not within the right bounds");
            inputMin.setValue(12);
            inputHour.setValue(12);

        } else if ((Objects.equals(n, "Write here a new name")) || (Objects.equals(n, "")) || (Objects.equals(n, " "))) {
            warnings.setText("The given name is not valid");
            inputName.setText("Write here your name");
        } else {

            Participant P_tmp = new Participant(n, input_h, input_m);
            System.out.print("Added : ");
            P_tmp.show_participant();
            CP.add_participant(P_tmp);

            warnings.setText("The participant was added ");
            GUI_rewriteParticipants();
            GUI_set_form_to_empty();
        }

    }


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


