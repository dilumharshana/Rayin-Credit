package rayin.credit;

import java.awt.Toolkit;
import java.sql.Connection;
import java.util.HashMap;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

//Logger.getLogger(borrowers.class.getName()).log(Level.SEVERE, null, ex);
public class repDetails extends javax.swing.JFrame {

    String repId ;
    public static String total;
    public repDetails(String repname , String repIdIs) {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
           rep.setText("REP - "+repname+" credits");
        try {
            connect.search_all_repData(repIdIs);
            repId = repIdIs;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong");

        }

    }

    dbConnector connect = new dbConnector();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        delete = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        newBorrower = new javax.swing.JButton();
        update = new javax.swing.JButton();
        rep = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        foodTable = new javax.swing.JTable();
        deleteBtn = new javax.swing.JButton();
        amount = new javax.swing.JLabel();

        delete.setBackground(new java.awt.Color(153, 255, 153));
        delete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(0, 0, 0));
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Deals");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        newBorrower.setBackground(new java.awt.Color(255, 255, 255));
        newBorrower.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        newBorrower.setForeground(new java.awt.Color(0, 0, 0));
        newBorrower.setText("PRINT");
        newBorrower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBorrowerActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(153, 255, 153));
        update.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        update.setForeground(new java.awt.Color(0, 0, 0));
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        rep.setBackground(new java.awt.Color(255, 255, 255));
        rep.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 28)); // NOI18N
        rep.setForeground(new java.awt.Color(0, 51, 204));

        foodTable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        foodTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Date", "Invoice Number", "Customer", "Route", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        foodTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foodTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(foodTable);

        deleteBtn.setBackground(new java.awt.Color(255, 0, 0));
        deleteBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        amount.setBackground(new java.awt.Color(255, 255, 255));
        amount.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 28)); // NOI18N
        amount.setForeground(new java.awt.Color(51, 51, 51));
        amount.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newBorrower, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(rep, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                        .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rep, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(newBorrower, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(deleteBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            DefaultTableModel delas = (DefaultTableModel) foodTable.getModel();
            int row = foodTable.getSelectedRow();

            String repid = repId;
            String pk = String.valueOf(delas.getValueAt(row, 1));
            String date = String.valueOf(delas.getValueAt(row, 0));
            String customer = String.valueOf(delas.getValueAt(row, 2));
            String route = String.valueOf(delas.getValueAt(row, 3));
            String amount = String.valueOf(delas.getValueAt(row, 4));

            updateDetails open = new updateDetails(repId,pk, date, customer, route , amount);
            open.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please select a Rep !");

        }
    }//GEN-LAST:event_updateActionPerformed

    private void foodTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foodTableMouseClicked

    }//GEN-LAST:event_foodTableMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        System.gc();
    }//GEN-LAST:event_formWindowClosing

    private void newBorrowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBorrowerActionPerformed

try{
            connect.updateTotal(repId , total);
            //generating bill by jasper report
                Connection con = connect.getConnection();
                HashMap map = new HashMap();
                map.put( "repid" , repId); 
                JasperDesign pdf  = null;
                    try
                        {
                              pdf = JRXmlLoader.load("C:\\ProgramData\\riyanBill\\report.jrxml");
                        }
                    catch(Exception e)
                        {
                            pdf = JRXmlLoader.load("C:\\ProgramData\\riyanBill2\\report.jrxml");
                            JOptionPane.showMessageDialog(null,"Your fills have been deleted please restore files !");
                        }
                JasperReport bill = JasperCompileManager.compileReport(pdf);
                JasperPrint print = JasperFillManager.fillReport(bill,map,con);
                JasperPrintManager.printReport(print, false);
        }
        catch(Exception e){
//                JOptionPane.showMessageDialog(null,"");
        }
//        recod("Opend New Debtor window");
    }//GEN-LAST:event_newBorrowerActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed


    }//GEN-LAST:event_deleteActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        try {
            DefaultTableModel delas = (DefaultTableModel) foodTable.getModel();

            int row = foodTable.getSelectedRow();
            String primary = String.valueOf(foodTable.getValueAt(row, 1));

            try {
                connect.clearRepData(primary);
                JOptionPane.showMessageDialog(null, "Rep Data deleted successfully ");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Something went wrong ");
            }

            connect.search_all_repData(repId);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please select a Rep !");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

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
                new repDetails("" , "").setVisible(true);
            }
        });
    }

    public static void clearTable() {
        DefaultTableModel delas = (DefaultTableModel) foodTable.getModel();

        while (delas.getRowCount() > 0) {
            delas.removeRow(0);
        }
    }

    //THIS METHOD WILL ADD A NEW ROWTO J TABLE USING dealdata ARRAY WHICH IS PASSED BY Search_Every_Field METHOD
    public static void dealItemsToTable(String[] dealData) {
        DefaultTableModel delas = (DefaultTableModel) foodTable.getModel();
        String [] space = {"","","","",""};
        delas.addRow(space);
        delas.addRow(dealData);

    }

    //btns disabling
    static void brnhandler() {
        newBorrower.setEnabled(false);
        update.setEnabled(false);

    }

    //database backup  
    void saveDB() {

        //backup database  
        try {

            Process backup = null;
            Runtime getDB = Runtime.getRuntime();

            backup = getDB.exec("C:/Program Files/MySQL/MySQL Server 5.7/bin/mysqldump.exe -uroot -ppapapapa --add-drop-database -B bookshop -r C:/Users/Dilum/Documents/backup.sql");
            backup = getDB.exec("C:/Program Files/MySQL/MySQL Server 5.7/bin/mysqldump.exe -uroot -ppapapapa --add-drop-database -B bookshop -r C:/ProgramData/backup.sql");

        } catch (Exception e) {

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel amount;
    private static javax.swing.JButton delete;
    private static javax.swing.JButton deleteBtn;
    public static javax.swing.JTable foodTable;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JButton newBorrower;
    private javax.swing.JLabel rep;
    private static javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
