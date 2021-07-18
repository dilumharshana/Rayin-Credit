package rayin.credit;

import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;
//Logger.getLogger(settings.class.getName()).log(Level.SEVERE, null, e);

public class settings extends javax.swing.JFrame implements Runnable {

    public settings() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
        Thread time = new Thread(this);
        time.start();

    }

    boolean forgetpass = false;
    dbConnector connect = new dbConnector(); // 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ctime = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cdate = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        analizeBiz = new javax.swing.JButton();
        notify = new javax.swing.JLabel();
        delasstock = new javax.swing.JButton();
        changePannel = new javax.swing.JPanel();
        Change = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        c_p_retypePass = new javax.swing.JPasswordField();
        c_p_newPass = new javax.swing.JPasswordField();
        evonpass = new javax.swing.JLabel();

        jButton3.setBackground(new java.awt.Color(102, 102, 0));
        jButton3.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jButton3.setText("CREATE BILL");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(102, 102, 0));
        jButton5.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jButton5.setText("STORE");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(0, 153, 153));
        jButton12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("History");
        jButton12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton12.setBorderPainted(false);
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(0, 153, 153));
        jButton14.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("History");
        jButton14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton14.setBorderPainted(false);
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Settings");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hi Admin ... ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 358, -1));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(21, 22, 26));

        ctime.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        ctime.setForeground(new java.awt.Color(255, 255, 255));
        ctime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ctime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ctimeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ctime, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ctime, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, -1, -1));

        jPanel3.setBackground(new java.awt.Color(21, 21, 23));
        jPanel3.setForeground(new java.awt.Color(37, 34, 39));

        cdate.setBackground(new java.awt.Color(255, 255, 255));
        cdate.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        cdate.setForeground(new java.awt.Color(255, 255, 255));
        cdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cdateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 20, -1, 36));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 0));

        analizeBiz.setBackground(new java.awt.Color(0, 153, 255));
        analizeBiz.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        analizeBiz.setForeground(new java.awt.Color(255, 255, 255));
        analizeBiz.setText("ANALIZE MY BIZ");
        analizeBiz.setToolTipText("Get Report About Your Income");
        analizeBiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analizeBizActionPerformed(evt);
            }
        });
        jPanel1.add(analizeBiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 182, 0, -1));

        notify.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        notify.setForeground(new java.awt.Color(255, 255, 255));
        notify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notifyMouseClicked(evt);
            }
        });
        jPanel1.add(notify, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 450, 20));

        delasstock.setBackground(new java.awt.Color(204, 0, 0));
        delasstock.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        delasstock.setForeground(new java.awt.Color(255, 255, 255));
        delasstock.setText(" MY DEALS");
        delasstock.setToolTipText("See All Deals");
        delasstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delasstockActionPerformed(evt);
            }
        });
        jPanel1.add(delasstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 129, 0, 48));

        changePannel.setBackground(new java.awt.Color(0, 51, 51));
        changePannel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));

        Change.setBackground(new java.awt.Color(255, 0, 0));
        Change.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Change.setForeground(new java.awt.Color(255, 255, 255));
        Change.setText("CHANGE");
        Change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CHANGE PASSWORD");

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CLOSE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("New Password :");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Re-Type Password :");

        c_p_retypePass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c_p_retypePassKeyTyped(evt);
            }
        });

        c_p_newPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c_p_newPassKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout changePannelLayout = new javax.swing.GroupLayout(changePannel);
        changePannel.setLayout(changePannelLayout);
        changePannelLayout.setHorizontalGroup(
            changePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, changePannelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(changePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, changePannelLayout.createSequentialGroup()
                        .addComponent(Change, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(c_p_retypePass, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, changePannelLayout.createSequentialGroup()
                        .addGroup(changePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(c_p_newPass, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        changePannelLayout.setVerticalGroup(
            changePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, changePannelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(c_p_newPass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(c_p_retypePass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(changePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Change, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
        );

        jPanel1.add(changePannel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 280, 270));

        evonpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rayin/credit/evon apps.jpg"))); // NOI18N
        evonpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(evonpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void delasstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delasstockActionPerformed
        //visibeling deal panel

    }//GEN-LAST:event_delasstockActionPerformed

    private void analizeBizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analizeBizActionPerformed


    }//GEN-LAST:event_analizeBizActionPerformed

    private void c_p_newPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c_p_newPassKeyTyped
        int lenth = String.copyValueOf(c_p_newPass.getPassword()).length();
        if (lenth == 254) {

            evt.consume();
        }
    }//GEN-LAST:event_c_p_newPassKeyTyped

    private void c_p_retypePassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c_p_retypePassKeyTyped
        int lenth = String.copyValueOf(c_p_retypePass.getPassword()).length();
        if (lenth == 254) {

            evt.consume();
        }
    }//GEN-LAST:event_c_p_retypePassKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        c_p_newPass.setText("");
        c_p_retypePass.setText("");
        changePannel.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeActionPerformed


        String np = String.valueOf(c_p_newPass.getPassword()); //getting new passowrd
        String rp = String.valueOf(c_p_retypePass.getPassword()); //getting retyped password

        Encoder encode = new Encoder();

        if (!np.isEmpty() && !rp.isEmpty()) //CHEKING IS EVERY FIELD HAS BEEN FILED
        {
            try {

                    if (String.valueOf(c_p_newPass.getPassword()).equals(String.valueOf(c_p_retypePass.getPassword()))) {

                        String newPass = encode.getMd5(String.valueOf(rp));
                        connect.changePass("", String.valueOf(newPass));

                        c_p_newPass.setText("");
                        c_p_retypePass.setText("");
                        Adimin_login open =new Adimin_login();
                        open.setVisible(true);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "  New password dosent match ! ");
                    }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, " Something went wrong - Settings#825! ");
            }

        } else {
            JOptionPane.showMessageDialog(null, " Please fill every field ! ");
        }
    }//GEN-LAST:event_ChangeActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        System.gc();
    }//GEN-LAST:event_formWindowClosing

    private void cdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cdateMouseClicked
                
        try {
            Process restore = null;
            String[] path = new String[]{"C:/Program Files/MySQL/MySQL Server 5.7/bin/mysql.exe", "--user=" + "root", "--password=" + "papapapa", "-e", "source " + "C:/Users/Dilum/Documents/backup.sql"};
            restore = Runtime.getRuntime().exec(path);

            if (restore.waitFor() == 0) {
                notify.setText("Restored !");
            }
            else
             {//trying to access other backup
                    path = new String[]{"C:/Program Files/MySQL/MySQL Server 5.7/bin/mysql.exe", "--user=" + "root", "--password=" + "papapapa", "-e", "source " + "C:/ProgramData/backup.sql"};
                    restore = Runtime.getRuntime().exec(path);

                    if (restore.waitFor() == 0) {
                          notify.setText("Restored !");
                     }
                    else
                        {
                            notify.setText("Sorry unable to backup your data !");
                        }
             }
        } catch (Exception e) {
            
                notify.setText("Sorry unable to backup your data !, restart your PC and try again .");    
         }
    }//GEN-LAST:event_cdateMouseClicked

    private void notifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notifyMouseClicked
        notify.setText("");
    }//GEN-LAST:event_notifyMouseClicked

    private void ctimeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ctimeMouseClicked
        int clearOk = JOptionPane.showConfirmDialog(null, "You need to clear all data ?", "Clear All Deals..", JOptionPane.ERROR_MESSAGE, JOptionPane.OK_CANCEL_OPTION);

        if (clearOk == 0) {
            try {
                //creating a backup
                notify.setText("Creating Backup ... !");
                notify.setText("Done !");

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, " Something went wrong - Settings#863! ");
            }
        }
    }//GEN-LAST:event_ctimeMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new settings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Change;
    private javax.swing.JButton analizeBiz;
    private javax.swing.JPasswordField c_p_newPass;
    private javax.swing.JPasswordField c_p_retypePass;
    private javax.swing.JLabel cdate;
    private javax.swing.JPanel changePannel;
    private javax.swing.JLabel ctime;
    private javax.swing.JButton delasstock;
    private javax.swing.JLabel evonpass;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel notify;
    // End of variables declaration//GEN-END:variables

    private void DateFormat(String hhmmssaa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    


    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        while (true) {
            // CODE FOR TIME 
            try {
                Calendar cal = Calendar.getInstance();

                SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss aa");
                Date time = cal.getTime();
                String timeok = sdf.format(time);
                ctime.setText(timeok);

                // CODE FOR DATE
                LocalDate date = LocalDate.now();
                String dateok = date.toString();
                cdate.setText(dateok);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, " Something went wrong - Settings#984! ");

            }

        }
    }

}
