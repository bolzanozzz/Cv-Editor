package FrontEnd;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

        private JPanel contentPane;

        /**
         * Launch the application.
         */
        public static void main(String[] args) {
                EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                try {
                                        MainFrame frame = new MainFrame();
                                        frame.setVisible(true);
                                } catch (Exception e) {
                                        e.printStackTrace();
                                }
                        }
                });
        }

        /**
         * Create the frame.
         */
        public MainFrame() {
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setBounds(100, 100, 450, 300);
                contentPane = new JPanel();
                contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
                contentPane.setLayout(new BorderLayout(0, 0));
                setContentPane(contentPane);

                JButton btnXaxa = new JButton("xaxa");

                btnXaxa.addActionListener(
                                new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                                if (e.getSource() == btnXaxa) {
                                                        JFileChooser fc = new JFileChooser();
                                            int returnVal = fc.showOpenDialog(null);
                                            if (returnVal == JFileChooser.APPROVE_OPTION) {
                                                File file = fc.getSelectedFile();
                                                System.out.println(file.getName());
                                            }
                                                }
                                }
                                }
                                );
                contentPane.add(btnXaxa, BorderLayout.WEST);
        }

}


