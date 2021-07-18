package rayin.credit;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
//Logger.getLogger(UpdateBorrowers.class.getName()).log(Level.SEVERE, null, ex);

public class updateDetails extends javax.swing.JFrame {

    /**
     * Creates new form stock_item_display
     */
    int whichPanel = 0; //true for borrower update anf false for cashier update
    String repid;
    boolean dot;

    //BORROWER HUPDATE HANDLING WINDOW
    public updateDetails(String repIdIs , String pk, String dateis, String customeris, String routeis, String amountis) {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));

        displayDate.setText(dateis);
        customer.setText(customeris);
        route.setText(routeis);
        amount.setText(amountis);

        date.setEnabled(false);
        route.setEditable(false);
        customer.setEditable(false);
        amount.setEditable(false);

        dateUpdate.setEnabled(false);
        routetUpdate.setEnabled(false);
        customerUpdate.setEnabled(false);
        amountUpdate.setEnabled(false);

        this.primarykeyofdata = pk;
        this.repid = repIdIs;
    }

    dbConnector connect = new dbConnector();

    String primarykeyofdata;
    String WhatIsCondition;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        panel_name = new javax.swing.JLabel();
        displayDate = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CloseUpdatePannel = new javax.swing.JButton();
        dateedit = new javax.swing.JButton();
        dateUpdate = new javax.swing.JButton();
        routeEdit = new javax.swing.JButton();
        routetUpdate = new javax.swing.JButton();
        route = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        customerEdit = new javax.swing.JButton();
        customerUpdate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        amountEdit = new javax.swing.JButton();
        amountUpdate = new javax.swing.JButton();
        amount = new javax.swing.JTextField();
        customer = new javax.swing.JTextField();
        date = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();

        jTextField9.setText("jTextField1");

        jTextField10.setText("jTextField1");

        jButton6.setText("jButton2");

        jButton8.setText("jButton2");

        jButton19.setText("jButton19");

        setTitle("Item Viewer");
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        panel_name.setBackground(new java.awt.Color(255, 255, 255));
        panel_name.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        panel_name.setForeground(new java.awt.Color(255, 255, 255));
        panel_name.setText("Update Details");

        displayDate.setBackground(new java.awt.Color(255, 255, 255));
        displayDate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        displayDate.setForeground(new java.awt.Color(255, 255, 255));
        displayDate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("ROUTE");

        CloseUpdatePannel.setBackground(new java.awt.Color(0, 102, 51));
        CloseUpdatePannel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CloseUpdatePannel.setForeground(new java.awt.Color(255, 255, 255));
        CloseUpdatePannel.setText("CLOSE  PANNEL");
        CloseUpdatePannel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        CloseUpdatePannel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseUpdatePannelActionPerformed(evt);
            }
        });

        dateedit.setBackground(new java.awt.Color(255, 0, 0));
        dateedit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        dateedit.setForeground(new java.awt.Color(255, 255, 255));
        dateedit.setText("Edit");
        dateedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateeditActionPerformed(evt);
            }
        });

        dateUpdate.setBackground(new java.awt.Color(0, 153, 204));
        dateUpdate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        dateUpdate.setText("UPDATE");
        dateUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateUpdateActionPerformed(evt);
            }
        });

        routeEdit.setBackground(new java.awt.Color(255, 0, 0));
        routeEdit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        routeEdit.setForeground(new java.awt.Color(255, 255, 255));
        routeEdit.setText("Edit");
        routeEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routeEditActionPerformed(evt);
            }
        });

        routetUpdate.setBackground(new java.awt.Color(0, 153, 204));
        routetUpdate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        routetUpdate.setText("UPDATE");
        routetUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routetUpdateActionPerformed(evt);
            }
        });

        route.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        route.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                routeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                routeKeyTyped(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("CUSTOMER");

        customerEdit.setBackground(new java.awt.Color(255, 0, 0));
        customerEdit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        customerEdit.setForeground(new java.awt.Color(255, 255, 255));
        customerEdit.setText("Edit");
        customerEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerEditActionPerformed(evt);
            }
        });

        customerUpdate.setBackground(new java.awt.Color(0, 153, 204));
        customerUpdate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        customerUpdate.setText("UPDATE");
        customerUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerUpdateActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("AMOUNT");

        amountEdit.setBackground(new java.awt.Color(255, 0, 0));
        amountEdit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        amountEdit.setForeground(new java.awt.Color(255, 255, 255));
        amountEdit.setText("Edit");
        amountEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountEditActionPerformed(evt);
            }
        });

        amountUpdate.setBackground(new java.awt.Color(0, 153, 204));
        amountUpdate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        amountUpdate.setText("UPDATE");
        amountUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountUpdateActionPerformed(evt);
            }
        });

        amount.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });
        amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                amountKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amountKeyTyped(evt);
            }
        });

        customer.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerActionPerformed(evt);
            }
        });
        customer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                customerKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                customerKeyTyped(evt);
            }
        });

        date.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                datePropertyChange(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("DATE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(route, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(routeEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CloseUpdatePannel, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(amountEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(amountUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(routetUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(panel_name, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(customer, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(displayDate, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(customerEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(customerUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(dateedit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel_name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(dateUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                        .addComponent(dateedit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(displayDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(customerUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                        .addComponent(customerEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(customer, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(route)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(routeEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(routetUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(amountUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(CloseUpdatePannel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CloseUpdatePannelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseUpdatePannelActionPerformed
        try {

            repDetails.clearTable();
                connect.search_all_repData(repid);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong ");

        }

        System.gc();
        this.dispose();

    }//GEN-LAST:event_CloseUpdatePannelActionPerformed

    private void dateeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateeditActionPerformed
        date.setEnabled(true);
        route.setEditable(false);
        customer.setEditable(false);
        amount.setEditable(false);

        dateUpdate.setEnabled(false);
        routetUpdate.setEnabled(false);
        customerUpdate.setEnabled(false);
        amountUpdate.setEnabled(false);
    }//GEN-LAST:event_dateeditActionPerformed

    private void routeEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routeEditActionPerformed
        date.setEnabled(false);
        route.setEditable(true);
        customer.setEditable(false);
        amount.setEditable(false);

        dateUpdate.setEnabled(false);
        routetUpdate.setEnabled(false);
        customerUpdate.setEnabled(false);
        amountUpdate.setEnabled(false);

    }//GEN-LAST:event_routeEditActionPerformed

    private void dateUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateUpdateActionPerformed
        try {

            DateFormat d1 = new SimpleDateFormat("yyyy-MM-dd");
            String dateis = d1.format(date.getDate());
            connect.updaterepData("Date", dateis, primarykeyofdata);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong ");

        }

        customerUpdate.setEnabled(false);
        dateUpdate.setEnabled(false);
    }//GEN-LAST:event_dateUpdateActionPerformed

    private void routetUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routetUpdateActionPerformed

        try {
            connect.updaterepData("Route", route.getText(), primarykeyofdata);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong ");

        }

        route.setEditable(false);
        routetUpdate.setEnabled(false);

    }//GEN-LAST:event_routetUpdateActionPerformed

    private void routeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_routeKeyReleased
        String lenth = route.getText();

        if (lenth.length() > 0) {
            routetUpdate.setEnabled(true);
        } else {
            routetUpdate.setEnabled(false);
        }


    }//GEN-LAST:event_routeKeyReleased

    private void routeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_routeKeyTyped
        char c = evt.getKeyChar();

        if (route.getText().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_routeKeyTyped

    private void customerEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerEditActionPerformed
        date.setEnabled(false);
        route.setEditable(false);
        customer.setEditable(true);
        amount.setEditable(false);

        dateUpdate.setEnabled(false);
        routetUpdate.setEnabled(false);
        customerUpdate.setEnabled(false);
        amountUpdate.setEnabled(false);
    }//GEN-LAST:event_customerEditActionPerformed

    private void customerUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerUpdateActionPerformed
        try {

            connect.updaterepData("Customer", customer.getText(), primarykeyofdata);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong ");

        }

        customerUpdate.setEnabled(false);
        customer.setEditable(false);
    }//GEN-LAST:event_customerUpdateActionPerformed

    private void amountEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountEditActionPerformed
        date.setEnabled(false);
        route.setEditable(false);
        customer.setEditable(false);
        amount.setEditable(true);

        dateUpdate.setEnabled(false);
        routetUpdate.setEnabled(false);
        customerUpdate.setEnabled(false);
        amountUpdate.setEnabled(false);
    }//GEN-LAST:event_amountEditActionPerformed

    private void amountUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountUpdateActionPerformed
        try {

            connect.updaterepData("Amount", amount.getText(), primarykeyofdata);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong ");

        }

        amountUpdate.setEnabled(false);
        amount.setEditable(false);
    }//GEN-LAST:event_amountUpdateActionPerformed

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountActionPerformed

    private void amountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountKeyTyped

        String lenth = amount.getText().trim();
        char charactor = evt.getKeyChar();

        if (lenth.length() == 16) {
            evt.consume();
        }

        // IF DOT HAS TYPED THIS PART WILL BW RUN
        if (dot == false) {
            if ((Character.isDigit(charactor)) || (Character.isISOControl(charactor)) || charactor == KeyEvent.VK_PERIOD) {
                amount.setEditable(true);

            } else {

                evt.consume();
            }

        } else // IF DOT DOES NOT HAS TYPED THIS PART WILL RUN
        {
            if ((Character.isDigit(charactor)) || (Character.isISOControl(charactor))) {
                if (lenth.length() == lenth.indexOf(".") + 3) {
                    evt.consume();
                }
            } else {
                evt.consume();
            }
        }

        //CHAKING IF ALREADY " . " IN TEXT BOX
        if (!lenth.contains(".")) {
            dot = false;

        }

        //MAKE dot VARIABLE TRUE IF USER PRESSED " . "
        if (charactor == KeyEvent.VK_PERIOD) {
            dot = true;
        }
    }//GEN-LAST:event_amountKeyTyped

    private void customerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customerKeyReleased
         String lenth = customer.getText();

        if (lenth.length() > 0) {
            customerUpdate.setEnabled(true);
        } else {
            customerUpdate.setEnabled(false);
        }
    }//GEN-LAST:event_customerKeyReleased

    private void customerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customerKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_customerKeyTyped

    private void datePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_datePropertyChange
        try {
            DateFormat d1 = new SimpleDateFormat("yyyy-MM-dd");
            String dateis = d1.format(date.getDate()).toString();

            displayDate.setText(dateis);
            dateUpdate.setEnabled(true);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_datePropertyChange

    private void customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerActionPerformed

    private void amountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountKeyReleased
        String lenth = amount.getText();

        if (lenth.length() > 0) {
            amountUpdate.setEnabled(true);
        } else {
            amountUpdate.setEnabled(false);
        }
    }//GEN-LAST:event_amountKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        dbConnector connect = new dbConnector();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong !");

        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new updateDetails("","", "", "", "", "").setVisible(true);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Something went wrong !");
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CloseUpdatePannel;
    private javax.swing.JTextField amount;
    private javax.swing.JButton amountEdit;
    private javax.swing.JButton amountUpdate;
    private javax.swing.JTextField customer;
    private javax.swing.JButton customerEdit;
    private javax.swing.JButton customerUpdate;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JButton dateUpdate;
    private javax.swing.JButton dateedit;
    private javax.swing.JLabel displayDate;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel panel_name;
    private javax.swing.JTextField route;
    private javax.swing.JButton routeEdit;
    private javax.swing.JButton routetUpdate;
    // End of variables declaration//GEN-END:variables
}