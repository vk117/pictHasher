import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

/**
 * pictHasher - PictHasherGUI
 *
 * This program is the GUI for the project. It also
 * checks if the selected picture generates a long
 *enough password. If the password is too long, the
 * string is shortened to 12 elements. If a successful
 * password is generated, the resulting string is stored
 * in the user's clipboard.
 *
 * @author Vikram Pasumarti, vpasuma@purdue.edu
 * @version 23 October 2016
 */
public class PictHasherGUI extends JFrame {

    private RGBPixelData rg;
    private int passNum = 1;
    private String sumString;
    private JTextField author;
    private JTextField chooseANumberText;
    private JButton generatePassword;
    private JButton imageSelect;
    private JPanel panel1;
    private JPanel panel2;
    private JComboBox<String> passChoice;
    private JTextField title;
    private JTextField versionNum;

    private PictHasherGUI() {
        panel1 = new JPanel();
        panel2 = new JPanel();
        title = new JTextField();
        imageSelect = new JButton();
        chooseANumberText = new JTextField();
        passChoice = new JComboBox<>();
        generatePassword = new JButton();
        author = new JTextField();
        versionNum = new JTextField();

        GroupLayout panel1Layout = new GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(255, 255, 255));
        panel2.setBackground(new Color(255, 255, 255));
        panel2.setBorder(BorderFactory.createEtchedBorder());
        title.setEditable(false);
        title.setBackground(new Color(255, 255, 255));
        title.setFont(new Font("Georgia", 0, 36)); // NOI18N
        title.setText("pictHasher");
        title.setBorder(null);

        imageSelect.setText("Select an Image");
        imageSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JFileChooser jfc = new JFileChooser();
                int fileChoose = jfc.showOpenDialog(new JFrame());
                if (fileChoose == JFileChooser.APPROVE_OPTION) {
                    String imageFile = jfc.getSelectedFile().getAbsolutePath();
                    rg = new RGBPixelData(imageFile);
                    sumString = Long.toString(rg.sum);
                    System.out.println("success");
                    if (sumString.length() < 12) {
                        JOptionPane.showMessageDialog(null, "Please choose another image", "Image too Small",
                                JOptionPane.PLAIN_MESSAGE);
                        generatePassword.setEnabled(false);
                    }
                    else if(sumString.length() > 12) {
                        sumString = sumString.substring(0,12);
                        generatePassword.setEnabled(true);
                    }
                    else {
                        generatePassword.setEnabled(true);
                    }

                } else if (fileChoose == JFileChooser.CANCEL_OPTION) {
                    System.out.println("\nNo new file selected\n");

                }
            }
        });
        chooseANumberText.setEditable(false);
        chooseANumberText.setBackground(new Color(255, 255, 255));
        chooseANumberText.setFont(new Font("Verdana", 0, 14)); // NOI18N
        chooseANumberText.setText("Choose a Number");
        chooseANumberText.setBorder(null);

        passChoice.setModel(new DefaultComboBoxModel<>(new String[]{"1", "2", "3", "4", "5", "6", "7",
                "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
        passChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String temp = (String) passChoice.getSelectedItem();
                passNum = Integer.parseInt(temp);
            }
        });

        generatePassword.setText("Generate Password");
        generatePassword.setEnabled(false);
        generatePassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                for (int i = 1; i <= 24; i++) {
                    System.out.println(i);
                    System.out.println(rg.setOrder(i, sumString));
                }
                char[] passArray = rg.setOrder(passNum, sumString);
                String pass = "";
                for (int j = 0; j < passArray.length; j++) {
                    pass = pass + passArray[j];
                }
                StringSelection s = new StringSelection(pass);
                Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
                c.setContents(s, s);
                JOptionPane.showMessageDialog(null , "Password is now in your clipboard", "Success",
                        JOptionPane.PLAIN_MESSAGE);
            }
        });

        author.setEditable(false);
        author.setBackground(new Color(255, 255, 255));
        author.setFont(new Font("Verdana", 0, 8));
        author.setText("@author Vikram Pasumarti");
        author.setBorder(null);

        versionNum.setEditable(false);
        versionNum.setBackground(new Color(255, 255, 255));
        versionNum.setFont(new Font("Verdana", 0, 8));
        versionNum.setText("@version 23 October 2016");
        versionNum.setBorder(null);

        GroupLayout panel2Layout = new GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panel2Layout.createSequentialGroup()
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(panel2Layout.createSequentialGroup()
                                                .addComponent(author, GroupLayout.PREFERRED_SIZE,
                                                        GroupLayout.DEFAULT_SIZE,
                                                        GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(versionNum, GroupLayout.PREFERRED_SIZE,
                                                        GroupLayout.DEFAULT_SIZE,
                                                        GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panel2Layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(imageSelect)
                                                        .addComponent(chooseANumberText,
                                                                GroupLayout.PREFERRED_SIZE,
                                                                GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(panel2Layout.createSequentialGroup()
                                                .addGap(80, 80, 80)
                                                .addComponent(passChoice, GroupLayout.PREFERRED_SIZE,
                                                        47, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panel2Layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(title, GroupLayout.PREFERRED_SIZE,
                                                                GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(panel2Layout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addComponent(generatePassword)))))
                                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panel2Layout.createSequentialGroup()
                                .addComponent(title, GroupLayout.PREFERRED_SIZE,
                                        GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(imageSelect)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chooseANumberText, GroupLayout.PREFERRED_SIZE,
                                        GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passChoice, GroupLayout.PREFERRED_SIZE,
                                        GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(generatePassword)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addGroup(panel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(author, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(versionNum, GroupLayout.PREFERRED_SIZE,
                                                GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE)))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panel2, GroupLayout.DEFAULT_SIZE,
                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panel2, GroupLayout.DEFAULT_SIZE,
                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }


    public static void main(String args[]) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PictHasherGUI().setVisible(true);
            }
        });
    }
}
