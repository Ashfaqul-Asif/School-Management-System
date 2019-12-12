
package school.management.system;
import java.awt.Color;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author RK Anik
 */
public class SMS_Login extends javax.swing.JFrame{

   Connection connection = null ;
   PreparedStatement statement = null ;
   ResultSet result = null ;
int xx ;
int xy;
    public SMS_Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        close = new javax.swing.JButton();
        minimize = new javax.swing.JButton();
        school = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        copyright = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Label_username = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        Label_pass = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        forgotpass = new javax.swing.JButton();
        wrong = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Administrator_signin = new javax.swing.JLabel();
        SignIN = new javax.swing.JLabel();
        try {
            BackPic =(javax.swing.JLabel)java.beans.Beans.instantiate(getClass().getClassLoader(), "school/management/system.SMS_Login_BackPic");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("School Managenent System");
        setLocation(new java.awt.Point(250, 70));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(0, 153, 204));
        panel.setForeground(new java.awt.Color(0, 153, 153));
        panel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelMouseDragged(evt);
            }
        });
        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMousePressed(evt);
            }
        });
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("R.A.N.T.R.M. High School");
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 510, 40));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close.png"))); // NOI18N
        close.setContentAreaFilled(false);
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        panel.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 26, -1));

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimize.png"))); // NOI18N
        minimize.setContentAreaFilled(false);
        minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizeActionPerformed(evt);
            }
        });
        panel.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 26, -1));

        school.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/school.png"))); // NOI18N
        school.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                schoolMouseDragged(evt);
            }
        });
        school.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                none(evt);
            }
        });
        panel.add(school, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 110, 110));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(225, 225, 225));
        jLabel1.setText("Placed: 1986        Reg. No. : 9874561");
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 280, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(225, 225, 225));
        jLabel3.setText("Email: rantrm@gmail.com   Contact : +8801703577953 , +8801987886450");
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 480, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(225, 225, 225));
        jLabel4.setText("Maznabari, Kumariyabari, Kazipur, Sirajganj");
        panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 350, -1));

        jPanel2.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 120));

        copyright.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        copyright.setForeground(new java.awt.Color(0, 204, 204));
        copyright.setText("All Rights Reserved © Kochi lnc. 2018");
        jPanel2.add(copyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 210, 20));

        jPanel1.setBackground(new java.awt.Color(65, 73, 74));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        jPanel1.setToolTipText("Administrator Sign In");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_username.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        Label_username.setForeground(new java.awt.Color(204, 204, 204));
        Label_username.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/customer-256.png"))); // NOI18N
        Label_username.setText("User Name  :");
        jPanel1.add(Label_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, 30));

        username.setBackground(new java.awt.Color(65, 73, 74));
        username.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        username.setForeground(new java.awt.Color(204, 204, 204));
        username.setBorder(null);
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 230, 30));

        Label_pass.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        Label_pass.setForeground(new java.awt.Color(204, 204, 204));
        Label_pass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lock_512pxGREY.png"))); // NOI18N
        Label_pass.setText("Password    :");
        jPanel1.add(Label_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 100, 30));

        pass.setBackground(new java.awt.Color(65, 73, 74));
        pass.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        pass.setForeground(new java.awt.Color(204, 204, 204));
        pass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 230, 30));

        jPanel4.setBackground(new java.awt.Color(58, 64, 65));

        forgotpass.setBackground(new java.awt.Color(0, 153, 204));
        forgotpass.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        forgotpass.setForeground(new java.awt.Color(255, 255, 255));
        forgotpass.setText("Forgot Password?");
        forgotpass.setToolTipText("");
        forgotpass.setBorder(null);
        forgotpass.setBorderPainted(false);
        forgotpass.setContentAreaFilled(false);
        forgotpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotpassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(forgotpass, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(forgotpass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 190, 30));

        wrong.setEditable(false);
        wrong.setBackground(new java.awt.Color(65, 73, 74));
        wrong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        wrong.setForeground(new java.awt.Color(0, 204, 204));
        wrong.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        wrong.setBorder(null);
        wrong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wrongActionPerformed(evt);
            }
        });
        jPanel1.add(wrong, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 350, 30));

        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("All Rights Reserved © Kochi lnc. 2018");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 190, -1));

        Administrator_signin.setBackground(new java.awt.Color(0, 153, 153));
        Administrator_signin.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Administrator_signin.setForeground(new java.awt.Color(255, 255, 255));
        Administrator_signin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Administrator_signin.setText("Administrator Sign In");
        Administrator_signin.setOpaque(true);
        jPanel1.add(Administrator_signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 25));

        SignIN.setBackground(new java.awt.Color(0, 153, 204));
        SignIN.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        SignIN.setForeground(new java.awt.Color(255, 255, 255));
        SignIN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SignIN.setText("Sign In");
        SignIN.setOpaque(true);
        SignIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignINMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SignINMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SignINMouseReleased(evt);
            }
        });
        jPanel1.add(SignIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 110, 30));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 370, 150));
        jPanel2.add(BackPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 900, 420));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 901, 491));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void forgotpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotpassActionPerformed
        dispose();
        ForgotPass forgotpass = new ForgotPass();
        forgotpass.setVisible(true);
    }//GEN-LAST:event_forgotpassActionPerformed

    private void wrongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wrongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wrongActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeActionPerformed

    private void minimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeActionPerformed

    private void panelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx ,y - xy );
    }//GEN-LAST:event_panelMouseDragged

    private void none(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_none

    }//GEN-LAST:event_none

    private void panelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_panelMousePressed

    private void schoolMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_schoolMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_schoolMouseDragged

    private void SignINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignINMouseClicked
        try{
            connection = DatabaseConnection.ConnectDB();
            String query = ("Select * from Sign_in where username=? and pass=?" );
            statement = connection.prepareStatement(query);
            
            statement.setString(1, username.getText());
            statement.setString(2, pass.getText());
            result = statement.executeQuery();
            
            if( result.next()){
                dispose();
                DashBoard dashboard = new DashBoard();
                dashboard.setVisible(true);
            }else{
                wrong.setText("Wrong Username or Password");
                username.setText("");
                pass.setText("");
            }
            connection.close();
        }catch( Exception e){ JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_SignINMouseClicked

    private void SignINMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignINMousePressed
        SignIN.setBackground(new java.awt.Color(0,122,163));
    }//GEN-LAST:event_SignINMousePressed

    private void SignINMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignINMouseReleased
        SignIN.setBackground(new java.awt.Color(0,153,204));
    }//GEN-LAST:event_SignINMouseReleased

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(SMS_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SMS_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SMS_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SMS_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SMS_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Administrator_signin;
    private javax.swing.JLabel BackPic;
    private javax.swing.JLabel Label_pass;
    private javax.swing.JLabel Label_username;
    private javax.swing.JLabel SignIN;
    private javax.swing.JButton close;
    private javax.swing.JLabel copyright;
    private javax.swing.JButton forgotpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton minimize;
    private javax.swing.JPanel panel;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel school;
    private javax.swing.JTextField username;
    private javax.swing.JTextField wrong;
    // End of variables declaration//GEN-END:variables
}
