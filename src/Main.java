
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Random;
import javax.swing.JOptionPane;


public class Main extends javax.swing.JFrame {

    
    
    public Main() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon/padlock.png")));
    }
    Random random = new Random();
    // Character values.
    static String upperCaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String lowerCaseChars = "abcdefghijklmnopqrstuvwxyz";
    static String numberChars = "0123456789";
    static String specialChars = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
    
    // Creating a password as desired.
    public void generatePassword(){
        String passwordChars = "";
        String password = "";
        if(upperCase.isSelected())
            passwordChars += upperCaseChars;
        if(lowerCase.isSelected())
            passwordChars += lowerCaseChars;
        if(number.isSelected())
            passwordChars += numberChars;
        if(specialCharacters.isSelected())
            passwordChars += specialChars;
        int passwordLength = Integer.parseInt(passwordLengthTxt.getText());
        for(int i = 0; i < passwordLength; i++)
            password += passwordChars.charAt(random.nextInt(passwordChars.length()));
        output.setText(password);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        passwordLengthLabel = new javax.swing.JLabel();
        passwordLengthTxt = new javax.swing.JTextField();
        lowerCase = new javax.swing.JCheckBox();
        upperCase = new javax.swing.JCheckBox();
        number = new javax.swing.JCheckBox();
        specialCharacters = new javax.swing.JCheckBox();
        generate = new javax.swing.JButton();
        output = new javax.swing.JTextField();
        coppy = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RANDOM PASSWORD GENERATOR");
        setBackground(new java.awt.Color(255, 0, 51));
        setBounds(new java.awt.Rectangle(300, 200, 600, 260));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(600, 280));
        setPreferredSize(new java.awt.Dimension(600, 300));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 300));
        jPanel1.setLayout(null);

        passwordLengthLabel.setBackground(new java.awt.Color(242, 144, 59));
        passwordLengthLabel.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        passwordLengthLabel.setText("Password Length :");
        passwordLengthLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 0, 4, 0, new java.awt.Color(0, 0, 0)));
        passwordLengthLabel.setOpaque(true);
        jPanel1.add(passwordLengthLabel);
        passwordLengthLabel.setBounds(170, 40, 180, 30);

        passwordLengthTxt.setBackground(new java.awt.Color(242, 144, 59));
        passwordLengthTxt.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        passwordLengthTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 0, 4, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(passwordLengthTxt);
        passwordLengthTxt.setBounds(340, 40, 60, 30);

        lowerCase.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lowerCase.setText("Lower Case");
        lowerCase.setContentAreaFilled(false);
        jPanel1.add(lowerCase);
        lowerCase.setBounds(30, 100, 120, 27);

        upperCase.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        upperCase.setText("Upper Case");
        upperCase.setContentAreaFilled(false);
        jPanel1.add(upperCase);
        upperCase.setBounds(150, 100, 120, 25);

        number.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        number.setText("Number");
        number.setContentAreaFilled(false);
        jPanel1.add(number);
        number.setBounds(270, 100, 87, 27);

        specialCharacters.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        specialCharacters.setText("Special Characters");
        specialCharacters.setContentAreaFilled(false);
        jPanel1.add(specialCharacters);
        specialCharacters.setBounds(360, 100, 170, 27);

        generate.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        generate.setText("GENERATE");
        generate.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(4, 0, 0, 4, new java.awt.Color(243, 20, 20)), javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0))));
        generate.setContentAreaFilled(false);
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });
        jPanel1.add(generate);
        generate.setBounds(210, 140, 140, 29);

        output.setEditable(false);
        output.setBackground(new java.awt.Color(0, 0, 0));
        output.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        output.setForeground(new java.awt.Color(255, 255, 255));
        output.setActionCommand("<Not Set>");
        output.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(243, 20, 20)));
        jPanel1.add(output);
        output.setBounds(170, 200, 220, 40);

        coppy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/copyBlack.png"))); // NOI18N
        coppy.setContentAreaFilled(false);
        coppy.setFocusPainted(false);
        coppy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coppyActionPerformed(evt);
            }
        });
        jPanel1.add(coppy);
        coppy.setBounds(390, 200, 30, 24);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/randomBG.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 262);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
        if(passwordLengthTxt.getText().equals(""))
            JOptionPane.showMessageDialog(this, "Password length cannot be blank.");
        else if(Integer.parseInt(passwordLengthTxt.getText()) <= 0)
            JOptionPane.showMessageDialog(this, "Please enter a valid number.");
        else if(!lowerCase.isSelected() && !upperCase.isSelected() && !number.isSelected() && !specialCharacters.isSelected())
            JOptionPane.showMessageDialog(this, "Please select one of the types.");
        else
            generatePassword();
    }//GEN-LAST:event_generateActionPerformed

    private void coppyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coppyActionPerformed
        StringSelection stringSelection = new StringSelection(output.getText());
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
        JOptionPane.showMessageDialog(this, "Is copied.");
    }//GEN-LAST:event_coppyActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton coppy;
    private javax.swing.JButton generate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox lowerCase;
    private javax.swing.JCheckBox number;
    private javax.swing.JTextField output;
    private javax.swing.JLabel passwordLengthLabel;
    private javax.swing.JTextField passwordLengthTxt;
    private javax.swing.JCheckBox specialCharacters;
    private javax.swing.JCheckBox upperCase;
    // End of variables declaration//GEN-END:variables
}
