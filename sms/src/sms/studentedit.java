/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sms;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author Hasib
 */
/**
 * edit student
 * done by admin panel
 */
public class studentedit extends javax.swing.JFrame {

    /** Creates new form studentedit */
    public studentedit() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        gn = new javax.swing.JTextField();
        sc = new javax.swing.JTextField();
        gc = new javax.swing.JTextField();
        sid = new javax.swing.JTextField();
        cla = new javax.swing.JTextField();
        sp = new javax.swing.JTextField();
        rl = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sn = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("EDIT of a student");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 420, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setText("Guardian's Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel3.setText("Id:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel4.setText("Student's cell no:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel5.setText("Guardian's cell no:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel7.setText("Present Address:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel8.setText("Roll:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, -1, -1));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel9.setText("Class:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, -1, -1));

        gn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(gn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 297, -1));

        sc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(sc, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 297, -1));

        gc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(gc, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 297, -1));

        sid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 300, -1));

        cla.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(cla, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 297, -1));

        sp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(sp, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 297, -1));

        rl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(rl, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 520, 297, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 51));
        jLabel11.setText("Back");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 68, -1));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel6.setText("Name:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        sn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(sn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 300, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms/4.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, -1, 200));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setText("Update");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 560, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        jLabel12.setText("Close");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 40, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        welcome frame =new welcome();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel11MouseClicked
/**
 * edit student
 */
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String id = sid.getText();
        String name= sn.getText();
        String fname= gn.getText();
        String cl=cla.getText();
        String cell=sc.getText();
        String fcell= gc.getText();
        String address= sp.getText();
        String rll= rl.getText();




        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/scl","root","");
        //String sql = "update `studreg` SET `fname`='"+gn+"',`name`='"+sn+"',`cla`='"+cl+"',`cell`='"+sc+",`fcell`='"+gc+"',`roll`='"+rl+"',`address`='"+sp+"'WHERE id '= '"+id+"'";
        String sql="update `studreg` SET `fname`='"+fname+"',`name`='"+name+"',`roll`='"+rll+"',`class`='"+cl+"',`cell`='"+cell+"'WHERE id = '"+id+"'";
        PreparedStatement ptst= conn.prepareStatement(sql);
        ptst.execute();
        
        JOptionPane.showMessageDialog(null, "Record has been updated successfully!");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_jLabel12MouseClicked

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
            java.util.logging.Logger.getLogger(studentedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentedit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cla;
    private javax.swing.JTextField gc;
    private javax.swing.JTextField gn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField rl;
    private javax.swing.JTextField sc;
    private javax.swing.JTextField sid;
    private javax.swing.JTextField sn;
    private javax.swing.JTextField sp;
    // End of variables declaration//GEN-END:variables

}
