
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
        if(upperCaseCB.isSelected())
            passwordChars += upperCaseChars;
        if(lowerCaseCB.isSelected())
            passwordChars += lowerCaseChars;
        if(numberCB.isSelected())
            passwordChars += numberChars;
        if(specialChractersCB.isSelected())
            passwordChars += specialChars;
        int passwordLength = Integer.parseInt(passwordLengthText.getText());
        for(int i = 0; i < passwordLength; i++)
            password += passwordChars.charAt(random.nextInt(passwordChars.length()));
        passwordOutput.setText(password);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        passwordLengthText = new javax.swing.JTextField();
        lowerCaseCB = new javax.swing.JCheckBox();
        upperCaseCB = new javax.swing.JCheckBox();
        numberCB = new javax.swing.JCheckBox();
        specialChractersCB = new javax.swing.JCheckBox();
        generateButton = new javax.swing.JButton();
        passwordOutput = new javax.swing.JTextField();
        copyButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RANDOM PASSWORD GENERATOR");
        setBounds(new java.awt.Rectangle(300, 200, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Password Length :");

        passwordLengthText.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        lowerCaseCB.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lowerCaseCB.setText("Lower Case");

        upperCaseCB.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        upperCaseCB.setText("Upper Case");

        numberCB.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        numberCB.setText("Number");

        specialChractersCB.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        specialChractersCB.setText("Special Characters");

        generateButton.setBackground(new java.awt.Color(102, 0, 0));
        generateButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        generateButton.setText("Generate");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        passwordOutput.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        copyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/copyBlack.png"))); // NOI18N
        copyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(passwordLengthText, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lowerCaseCB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(upperCaseCB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numberCB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(specialChractersCB)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(generateButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(passwordOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(copyButton)))
                .addGap(103, 103, 103))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLengthText))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lowerCaseCB)
                    .addComponent(upperCaseCB)
                    .addComponent(numberCB)
                    .addComponent(specialChractersCB))
                .addGap(18, 18, 18)
                .addComponent(generateButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(copyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        if(passwordLengthText.getText().equals(""))
            JOptionPane.showMessageDialog(this, "Password length cannot be blank.");
        else if(Integer.parseInt(passwordLengthText.getText()) <= 0)
            JOptionPane.showMessageDialog(this, "Please enter a valid number.");
        else if(!lowerCaseCB.isSelected() && !upperCaseCB.isSelected() && !numberCB.isSelected() && !specialChractersCB.isSelected())
            JOptionPane.showMessageDialog(this, "Please select one of the types.");
        else
            generatePassword();
    }//GEN-LAST:event_generateButtonActionPerformed

    private void copyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyButtonActionPerformed
        StringSelection stringSelection = new StringSelection(passwordOutput.getText());
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
        JOptionPane.showMessageDialog(this, "Is copied.");
    }//GEN-LAST:event_copyButtonActionPerformed

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
    private javax.swing.JButton copyButton;
    private javax.swing.JButton generateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox lowerCaseCB;
    private javax.swing.JCheckBox numberCB;
    private javax.swing.JTextField passwordLengthText;
    private javax.swing.JTextField passwordOutput;
    private javax.swing.JCheckBox specialChractersCB;
    private javax.swing.JCheckBox upperCaseCB;
    // End of variables declaration//GEN-END:variables
}
