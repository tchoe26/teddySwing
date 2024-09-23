import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class hard1 implements ActionListener {
    private JFrame mainFrame;
    private JLabel statusLabel;
    private JPanel controlPanel;
    private JPanel controlPanel2;
    private JPanel controlPanel3;
    private JPanel controlPanel4;
    private JPanel controlPanel5;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;
    private JTextArea ta; //typing area
    private int WIDTH=800;
    private int HEIGHT=700;


    public hard1() {
        prepareGUI();
    }

    public static void main(String[] args) {
        hard1 test = new hard1();
        test.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("teddy learning swing");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new GridLayout(2, 1));

        statusLabel = new JLabel("bro", JLabel.CENTER);

        //menu at top
        cut = new JMenuItem("cut");
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");
        selectAll = new JMenuItem("selectAll");
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);

        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);

        //end menu at top


        mainFrame.add(mb);  //add menu bar
        mainFrame.setJMenuBar(mb); //set menu bar



        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        controlPanel = new JPanel();
        controlPanel2 = new JPanel();
        controlPanel3 = new JPanel();
        controlPanel4 = new JPanel();
        controlPanel5 = new JPanel();

        controlPanel.setLayout(new GridLayout(1, 2)); //set the layout of the pannel
        controlPanel2.setLayout(new BorderLayout());
        controlPanel3.setLayout(new GridLayout(3, 3));
        controlPanel4.setLayout(new GridLayout(2, 1));
        controlPanel5.setLayout(new GridLayout(1,9));



        mainFrame.setVisible(true);

    }

    private void showEventDemo() {

        JButton okButton = new JButton("OK");
        JButton submitButton = new JButton("Submit");
        JButton cancelButton = new JButton("Cancel");



        JLabel label1 = new JLabel("top 0", JLabel.CENTER);
        JLabel label2 = new JLabel("top 0", JLabel.CENTER);
        JLabel label3 = new JLabel("top 0", JLabel.CENTER);
        JLabel label4 = new JLabel("top 0", JLabel.CENTER);
        JLabel label5 = new JLabel("top 0", JLabel.CENTER);
        JLabel label6 = new JLabel("top right", JLabel.CENTER);
        JLabel label7 = new JLabel("0",JLabel.CENTER);
        JLabel label8 = new JLabel("0",JLabel.CENTER);
        JLabel label9 = new JLabel("0",JLabel.CENTER);
        JLabel label10 = new JLabel("0",JLabel.CENTER);
        JLabel label11 = new JLabel("0",JLabel.CENTER);
        JLabel label12 = new JLabel("0",JLabel.CENTER);

        JButton button1 = new JButton("top 1");
        JButton button2 = new JButton("top 2");
        JButton button3 = new JButton("top 3");
        JButton button4 = new JButton("top 4");
        JButton button5 = new JButton("1");
        JButton button6 = new JButton("1");
        JButton button7 = new JButton("2");
        JButton button8 = new JButton("3");
        JButton button9 = new JButton("4");


        okButton.setActionCommand("OK");
        submitButton.setActionCommand("Submit");
        cancelButton.setActionCommand("Cancel");

        okButton.addActionListener(new ButtonClickListener());
        submitButton.addActionListener(new ButtonClickListener());
        cancelButton.addActionListener(new ButtonClickListener());

        //easy 1
       /* mainFrame.add(button1);
        mainFrame.add(button2);
        mainFrame.add(button3);
        mainFrame.add(button4);
        mainFrame.add(button5);*/

        //easy 2
        mainFrame.add(controlPanel);

        controlPanel.add(controlPanel3);
        controlPanel3.add(label1);
        controlPanel3.add(button1);
        controlPanel3.add(label2);
        controlPanel3.add(button2);
        controlPanel3.add(label3);
        controlPanel3.add(button3);
        controlPanel3.add(label4);
        controlPanel3.add(button4);
        controlPanel3.add(label5);

        controlPanel.add(controlPanel4);
        controlPanel4.add(label6);
        controlPanel4.add(button5);


        mainFrame.add(controlPanel2);

        controlPanel2.add(controlPanel5, BorderLayout.SOUTH);
        controlPanel5.add(label7);
        controlPanel5.add(button6);
        controlPanel5.add(label8);
        controlPanel5.add(button7);
        controlPanel5.add(label9);
        controlPanel5.add(button8);
        controlPanel5.add(label10);
        controlPanel5.add(button9);
        controlPanel5.add(label11);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.equals("OK")) {
                statusLabel.setText("Ok Button clicked.");
            } else if (command.equals("Submit")) {
                statusLabel.setText("Submit Button clicked.");
            } else {
                statusLabel.setText("Cancel Button clicked.");
            }
        }
    }
}
