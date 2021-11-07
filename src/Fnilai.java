
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Fnilai extends javax.swing.JFrame {

    /**
     * Creates new form Fnilai
     */
    public Fnilai() {
        initComponents();
    }

    //Khilyatus Sufriyah_201851123_5C
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        txtmakul = new javax.swing.JTextField();
        cbonilai = new javax.swing.JComboBox<>();
        cmdsave = new javax.swing.JButton();
        cmdupdate = new javax.swing.JButton();
        cmddelete = new javax.swing.JButton();
        cmdcancel = new javax.swing.JButton();
        cbonim = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtcari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tnilai = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("DATA NILAI MATA KULIAH");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("NIM");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("NAMA");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("MAKUL");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("NILAI");

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });

        cbonilai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "A", "AB", "B", "BC", "C", "CD", "D", "E" }));

        cmdsave.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cmdsave.setText("SAVE");
        cmdsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdsaveActionPerformed(evt);
            }
        });

        cmdupdate.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cmdupdate.setText("UPDATE");
        cmdupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdupdateActionPerformed(evt);
            }
        });

        cmddelete.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cmddelete.setText("DELETE");
        cmddelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmddeleteActionPerformed(evt);
            }
        });

        cmdcancel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cmdcancel.setText("CANCEL");
        cmdcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcancelActionPerformed(evt);
            }
        });

        cbonim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbonimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbonilai, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbonim, 0, 193, Short.MAX_VALUE)
                            .addComponent(txtnama)
                            .addComponent(txtmakul))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cmdsave)
                        .addGap(18, 18, 18)
                        .addComponent(cmdupdate)
                        .addGap(18, 18, 18)
                        .addComponent(cmddelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdcancel)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbonim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtmakul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbonilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdsave)
                    .addComponent(cmdupdate)
                    .addComponent(cmddelete)
                    .addComponent(cmdcancel))
                .addGap(54, 54, 54))
        );

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("SEARCH");

        txtcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcariActionPerformed(evt);
            }
        });
        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcariKeyPressed(evt);
            }
        });

        tnilai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tnilai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tnilaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tnilai);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel6)
                                .addGap(26, 26, 26)
                                .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(321, 321, 321)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
String koneksi = "jdbc:mysql://localhost/dbakademik";
String user="root";
String pass="";
Connection connection;
Statement statement;
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
try 
{
     Class.forName("com.mysql.jdbc.Driver");
     koneksi = "jdbc:mysql://localhost/dbakademik";
     connection = (Connection) DriverManager.getConnection(koneksi,user,pass);
     statement=(Statement) connection.createStatement();
     
}
catch (Exception DBException)
{
    JOptionPane.showMessageDialog(this,"koneksi gagal","Error",JOptionPane.ERROR_MESSAGE);
        System.err.println("Error:" +DBException);
}
bersih();
loaddata();
    }//GEN-LAST:event_formWindowOpened

    
    private void cmdsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsaveActionPerformed
        try{                                      
   String sql;
   {
         sql="insert into nilaimakul values('";
         sql+="','"+cbonim.getSelectedItem();
         sql+=txtmakul.getText()+"','";
         sql+=cbonilai.getSelectedItem()+"')";
   }
   statement.executeUpdate(sql);
      JOptionPane.showMessageDialog(this,"Simpan data berhasil","Informasi",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_cmdsaveActionPerformed
catch(Exception DBException){
      JOptionPane.showMessageDialog(this,"Simpan data gagal","Error",JOptionPane.ERROR_MESSAGE);
      System.err.println("Error:" +DBException);
    }                                       
    bersih();
    loaddata();
    }
    private void cmdupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdupdateActionPerformed
    try{
        String sql;
      {
            sql="update nilaimakul set makul='";
            sql+=txtmakul.getText()+"',nilai='";
            sql+=cbonilai.getSelectedItem()+"'";
            sql+="where nim='"+cbonim.getSelectedItem()+"'";
      }
   statement.executeUpdate(sql);
      JOptionPane.showMessageDialog(this,"Update data berhasil","Informasi",JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_cmdupdateActionPerformed
    catch(Exception DBException){
      JOptionPane.showMessageDialog(this,"Update data gagal","Error",JOptionPane.ERROR_MESSAGE);
      System.err.println("Error:" +DBException);
    }
    bersih();
    loaddata();
    }
    private void cmddeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmddeleteActionPerformed
    try{
        int replay=JOptionPane.showConfirmDialog(this,
                "Apakah anda yakin akan menghapus data ini?",
                "Konfirmasi",JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
        if (replay==JOptionPane.YES_OPTION) {
            String sql="delete from nilaimakul where nim='"+cbonim.getSelectedItem()+"'";
            statement.executeUpdate(sql);
        }
    }catch(Exception DBException){
        JOptionPane.showMessageDialog(this,"Hapus data gagal","Error",JOptionPane.ERROR_MESSAGE);
        System.err.println("Error"+DBException);
    }
    bersih();
    loaddata();
    }//GEN-LAST:event_cmddeleteActionPerformed

    private void cmdcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcancelActionPerformed
        dispose();
    }//GEN-LAST:event_cmdcancelActionPerformed

    private void tnilaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tnilaiMouseClicked
    cbonim.setSelectedItem(tnilai.getValueAt(tnilai.getSelectedRow(),0).toString());
    txtmakul.setText(tnilai.getValueAt(tnilai.getSelectedRow(),2).toString());
    cbonilai.setSelectedItem(tnilai.getValueAt(tnilai.getSelectedRow(),3).toString());
    cmdupdate.setEnabled(true);
    cmddelete.setEnabled(true);
    cbonim.setEditable(false);
    cmdsave.setEnabled(false);
    
    }//GEN-LAST:event_tnilaiMouseClicked

    private void txtcariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyPressed
         DefaultTableModel tabel = new DefaultTableModel();
            tabel.addColumn("NIM");
            tabel.addColumn("NAMA");
            tabel.addColumn("MAKUL");
            tabel.addColumn("NILAI");
    try{
    String sql = "SELECT id_nilai, nim, makul, nilai "
                    + "FROM nilaimakul nm "
                    + "LEFT JOIN mahasiswa mhs "
                    + "ON mhs.nim=nm.nim "
                    + "WHERE id_nilai LIKE '%"+txtcari.getText()+"%' "
                    + "OR nim LIKE '%"+txtcari.getText()+"%'"
                    + "OR makul LIKE '%"+txtcari.getText()+"%'"
                    + "OR nilai LIKE '%"+txtcari.getText()+"%'";
    ResultSet rs= statement.executeQuery(sql);
    while (rs.next()) {
    tabel.addRow(new Object[]{
        rs.getString(1),
        rs.getString(2),
        rs.getString(3),
        rs.getString(4),
    });
    } tnilai.setModel(tabel);
    }catch (Exception DBException) {
        System.err.println("Error=" + DBException);
        }
    }//GEN-LAST:event_txtcariKeyPressed

    private void txtcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcariActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_txtcariActionPerformed
private void nama()
{
    try {
        String  sql;
            sql = "SELECT nama FROM mahasiswa WHERE nim = "+cbonim.getSelectedItem()+" ";
            ResultSet rs = statement.executeQuery(sql);
                int n=1;
           while(rs.next()){
//                     Object[] ob=new Object[1];
//                    ob[0]= rs.getString(1);
                    String nim=rs.getString("nim");
                    txtnama.setText("nama");
                }
                
            rs.last();
            int jumlahdata = rs.getRow();
            rs.first();
            
          
            
        } catch (Exception e) {
          
        }
}
    private void cbonimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbonimActionPerformed
//        // TODO add your handling code here:

         
    }//GEN-LAST:event_cbonimActionPerformed
private void getiSelectItem()
{
}
    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtnamaActionPerformed
       private void getnim()
   {
       try {
            String  sql;
            sql = "SELECT nim FROM mahasiswa";
            ResultSet rs = statement.executeQuery(sql);
                int n=1;
           while(rs.next()){
//                     Object[] ob=new Object[1];
//                    ob[0]= rs.getString(1);
                    String nim=rs.getString("nim");
                    cbonim.addItem(nim);
                }
                
            rs.last();
            int jumlahdata = rs.getRow();
            rs.first();
            
          
            
        } catch (Exception e) {
          
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
            java.util.logging.Logger.getLogger(Fnilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fnilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fnilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fnilai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fnilai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbonilai;
    private javax.swing.JComboBox<String> cbonim;
    private javax.swing.JButton cmdcancel;
    private javax.swing.JButton cmddelete;
    private javax.swing.JButton cmdsave;
    private javax.swing.JButton cmdupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tnilai;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtmakul;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables

    private void bersih() {
        txtmakul.setText("");
        cbonilai.setSelectedIndex(0);
     try{
         String sql="select mahasiswa.nim, mahasiswa.nama, nilaimakul.makul, nilaimakul.nilai"
                 + " from mahasiswa, nilaimakul where mahasiswa.nim=nilaimakul.nim";
        ResultSet rs=statement.executeQuery(sql);
        final String[] header={"NIM","NAMA","MAKUL","NILAI"};
        rs.last();
        int n=rs.getRow();
        Object[][] data=new Object[n][4];
        int p=0;
        rs.beforeFirst();
        while (rs.next()){
            data [p][0]=rs.getString(1);
            data [p][1]=rs.getString(2);
            data [p][2]=rs.getString(3);
            data [p][3]=rs.getString(4);
            p++;
     }   
        tnilai.setModel(new javax.swing.table.DefaultTableModel(data,header));
        tnilai.setAlignmentX(CENTER_ALIGNMENT);
    }catch(Exception DBException){
        System.err.println("Error=" +DBException);
    }
    }


    private void loaddata(){
try{
        String sql="select nim from mahasiswa order by nim asc";
        ResultSet rs=statement.executeQuery(sql);
        while(rs.next()){
            Object[] ob=new Object[3];
            ob [0]= rs.getString(1);
            cbonim.addItem((String) ob[0]);
        }
        rs.close();
}catch(SQLException e){
    System.out.println("terjadi kesalahan");
}
}

    private void tampil() {
    try{
        String sql="select nim from mahasiswa where nim='"+cbonim.getSelectedItem()+"'";
        ResultSet rs=statement.executeQuery(sql);
        int p=0;
        while(rs.next()){
            Object[] ob=new Object[0];
            ob[0]= rs.getString(1);
            txtnama.setText((String) ob[0]);
            p++;
    }
        rs.close();
    }catch(SQLException e){
        System.out.println("terjadi kesalahan");
    }
    }
}

