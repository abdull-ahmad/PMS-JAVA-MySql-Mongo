import javax.swing.*;
import java.sql.*;

/**
 *
 * @author ahmad
 */
public class UpdateMedicine extends javax.swing.JFrame {
    /**
     * Creates new form UpdateMedicine
     */
    public String numberPattern = "^[0-9]*$";
    public String namepattern = "^[a-zA-Z\\s]+";
    private String username= "";
    public UpdateMedicine() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }
    public UpdateMedicine(String tempUser) {
        initComponents();
        username = tempUser;
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        Search_Field = new javax.swing.JTextField();
        Name_Field = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        CompanyName_Field = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Quantity_Field = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        AddQuantity_Field = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        PricePerUnit_Field = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel1.setText("Update Medicine");

        jLabel2.setText("Medicine ID");

        Search_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_FieldActionPerformed(evt);
            }
        });

        Name_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Name_FieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Name");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        CompanyName_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompanyName_FieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Company Name");

        Quantity_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Quantity_FieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Quantity");

        jLabel6.setText("Add Quantity");

        jLabel7.setText("Price Per Unit");

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jSeparator1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(22, 22, 22)
                                                                .addComponent(jButton3)
                                                                .addGap(183, 183, 183)
                                                                .addComponent(jLabel1)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(67, 67, 67)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addComponent(jLabel4)
                                                                                .addGap(55, 55, 55))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel3)
                                                                                        .addComponent(jLabel5)
                                                                                        .addComponent(jLabel6))
                                                                                .addGap(71, 71, 71)))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(CompanyName_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(Name_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(Quantity_Field)
                                                                                .addComponent(AddQuantity_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(PricePerUnit_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jButton2))))
                                                .addGap(1, 1, 1)))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(244, 244, 244)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(54, 54, 54)
                                                .addComponent(Search_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(54, 54, 54)
                                .addComponent(jButton1)
                                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jButton3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(Search_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1))
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Name_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7)
                                        .addComponent(PricePerUnit_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(CompanyName_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Quantity_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(AddQuantity_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2))
                                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void Name_FieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void Search_FieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void CompanyName_FieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void Quantity_FieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String uniqueId = Search_Field.getText();
        String name = Name_Field.getText();
        String companyName = CompanyName_Field.getText();
        String quantity = Quantity_Field.getText();
        String price = PricePerUnit_Field.getText();
        String addQuantity = AddQuantity_Field.getText();

        int totalQuantity = 0;
        if(addQuantity.equals(""))
        {
            totalQuantity = Integer.parseInt(quantity);
        }
        else{
            totalQuantity = Integer.parseInt(quantity) + Integer.parseInt(addQuantity);
        }
        if(uniqueId.equals("")){
            JOptionPane.showMessageDialog(null, "Medicine ID Field is required");
        }
        else if(name.equals("")){
            JOptionPane.showMessageDialog(null, "Name Field is required");
        } else if(!name.matches(namepattern)) {
            JOptionPane.showMessageDialog(null,"Name Field Format is invalid.");
        }else if (companyName.equals("")){
            JOptionPane.showMessageDialog(null,"Company Name is required");
        }else if (!companyName.matches(namepattern)) {
            JOptionPane.showMessageDialog(null,"Company Name is Invalid");
        }
        else if(!addQuantity.matches(numberPattern)){
            JOptionPane.showMessageDialog(null,"Add Quantity Field is invalid");
        } else if (price.equals("")){
            JOptionPane.showMessageDialog(null,"Price Per Unit Field is required");
        }
        else if(!price.matches(numberPattern)){
            JOptionPane.showMessageDialog(null,"Price Per Unit Field is invalid");
        }
        else{
            try{
                Connection con = Connect.getCon();
                PreparedStatement ps = con.prepareStatement("update medicine set name=?,companyName=?,quantity=?,price=? where uniqueId=?");
                ps.setString(1,name);
                ps.setString(2,companyName);
                ps.setInt(3,totalQuantity);
                ps.setString(4,price);
                ps.setInt(5,Integer.parseInt(uniqueId));
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Medicine Updated Successfully");
                setVisible(false);
                new UpdateMedicine().setVisible(true);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        this.dispose();
        new AdminDashboard(username).setVisible(true);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        int checkMedicineExist = 0;
        String uniqueId = Search_Field.getText();
        if(uniqueId.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Medicine ID can't be empty");
        }
        else{
            try{
                Connection con = Connect.getCon();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from medicine where uniqueId='"+uniqueId+"'");
                while(rs.next()){
                    Search_Field.setEditable(false);
                    Name_Field.setText(rs.getString("name"));
                    CompanyName_Field.setText(rs.getString("companyName"));
                    Quantity_Field.setText(rs.getString("quantity"));
                    PricePerUnit_Field.setText(rs.getString("price"));
                    Quantity_Field.setEditable(false);
                    checkMedicineExist = 1;

                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }

            if(checkMedicineExist == 0)
            {
                JOptionPane.showMessageDialog(null,"Medicine ID does not exist.");
            }
        }
    }

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
            java.util.logging.Logger.getLogger(UpdateMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateMedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField AddQuantity_Field;
    private javax.swing.JTextField CompanyName_Field;
    private javax.swing.JTextField Name_Field;
    private javax.swing.JTextField PricePerUnit_Field;
    private javax.swing.JTextField Quantity_Field;
    private javax.swing.JTextField Search_Field;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration                   
}