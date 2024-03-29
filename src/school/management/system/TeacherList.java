/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.management.system;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author RK Anik
 */
public class TeacherList extends javax.swing.JFrame {

    /**
     * Creates new form TeacherList
     */
    public TeacherList() {
        initComponents();
    }
    Connection conn = null;
    int xx,xy;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        Shadow = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableTeacher = new javax.swing.JTable();
        rank = new javax.swing.JComboBox<>();
        show = new javax.swing.JLabel();
        copyright = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 70));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));

        jPanel2.setBackground(new java.awt.Color(49, 59, 60));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));
        jPanel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel6MouseDragged(evt);
            }
        });
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel6MousePressed(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Teacher List");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 370, 30));

        minimize.setBackground(new java.awt.Color(0, 153, 153));
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimize.png"))); // NOI18N
        minimize.setOpaque(true);
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel6.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 30, 30));

        back.setBackground(new java.awt.Color(0, 153, 153));
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        back.setOpaque(true);
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel6.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 30));

        close.setBackground(new java.awt.Color(0, 153, 153));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close.png"))); // NOI18N
        close.setOpaque(true);
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel6.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 40, 30));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));

        Shadow.setBackground(new java.awt.Color(0, 123, 123));
        Shadow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(Shadow, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 710, 7));

        TableTeacher.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TableTeacher.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Teacher Id", "Name of Teacher", "Designation", "Qualification", "Goot at", "Date of Join"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableTeacher.setGridColor(new java.awt.Color(255, 255, 255));
        TableTeacher.setRowHeight(30);
        jScrollPane1.setViewportView(TableTeacher);
        if (TableTeacher.getColumnModel().getColumnCount() > 0) {
            TableTeacher.getColumnModel().getColumn(0).setResizable(false);
            TableTeacher.getColumnModel().getColumn(0).setPreferredWidth(20);
            TableTeacher.getColumnModel().getColumn(1).setResizable(false);
            TableTeacher.getColumnModel().getColumn(2).setResizable(false);
            TableTeacher.getColumnModel().getColumn(3).setResizable(false);
            TableTeacher.getColumnModel().getColumn(4).setResizable(false);
            TableTeacher.getColumnModel().getColumn(5).setResizable(false);
            TableTeacher.getColumnModel().getColumn(5).setPreferredWidth(20);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 690, 300));

        rank.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rank.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Show All", "Head_Teacher", "Assistant_Head_Teacher", "Senior_Teacher", "Teacher", "Librarian", "Others" }));
        jPanel2.add(rank, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 240, 30));

        show.setBackground(new java.awt.Color(0, 123, 123));
        show.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        show.setForeground(new java.awt.Color(255, 255, 255));
        show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show.setText("Show");
        show.setOpaque(true);
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                showMouseReleased(evt);
            }
        });
        jPanel2.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 300, 32));

        copyright.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        copyright.setForeground(new java.awt.Color(153, 153, 153));
        copyright.setText("All Rights Reserved © Kochi lnc. 2018");
        jPanel2.add(copyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 433, 210, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx , y - xy );
    }//GEN-LAST:event_jPanel6MouseDragged

    private void jPanel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel6MousePressed

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        try{
            conn = DatabaseConnection.ConnectDB();
            int i = rank.getSelectedIndex();
            if( i == 0 ){
            String q = "select ta.Teacher_Id,Teacher_Name,Rank_Name as Designation,\n" +
                "Qualification,Extra_Ordinary as Good_at,DateOfJoin as Date_of_Join\n" +
                "from TeacherAccademicInfo ta inner join TeacherPersonalInfo tp on \n" +
                "ta.Teacher_Id=tp.Teacher_Id inner join Designation d \n" +
                "on ta.Rank_Id = d.Rank_Id where d.Rank_Id between 1 and 7";
            PreparedStatement pst2 = conn.prepareStatement(q);
            ResultSet rs2 = pst2.executeQuery();
            TableTeacher.setModel(DbUtils.resultSetToTableModel(rs2));
            }else if( i == 6 ){
                String q = "select ta.Worker_Id,Worker_Name,Rank_Name as Designation,\n" +
                    "ExtraOrdinary as Good_at,DateOfJoin as Date_of_Join\n" +
                    "from WorkerAccademicInfo ta inner join WorkerPersonalInfo tp on \n" +
                    "ta.Worker_Id=tp.Worker_Id inner join Designation d \n" +
                    "on ta.Rank_Id = d.Rank_Id where ta.Rank_Id != 10";
                PreparedStatement pst2 = conn.prepareStatement(q);
                ResultSet rs2 = pst2.executeQuery();
                TableTeacher.setModel(DbUtils.resultSetToTableModel(rs2));
            }else if( i == 5 ){
                String q = "select ta.Worker_Id,Worker_Name,Rank_Name as Designation,\n" +
                    "ExtraOrdinary as Good_at,DateOfJoin as Date_of_Join\n" +
                    "from WorkerAccademicInfo ta inner join WorkerPersonalInfo tp on \n" +
                    "ta.Worker_Id=tp.Worker_Id inner join Designation d \n" +
                    "on ta.Rank_Id = d.Rank_Id where ta.Rank_Id = 10";
                PreparedStatement pst2 = conn.prepareStatement(q);
                ResultSet rs2 = pst2.executeQuery();
                TableTeacher.setModel(DbUtils.resultSetToTableModel(rs2));
            }else{
                String q3 = "select Rank_Id from Designation where Rank_Name = '"+rank.getSelectedItem()+"'";
                PreparedStatement pst3 = conn.prepareStatement(q3);
                ResultSet rs3 = pst3.executeQuery();
                int rid = 0 ;
                if(rs3.next()){
                    rid = rs3.getInt("Rank_Id");
                }
            String q = "select ta.Teacher_Id,Teacher_Name,Rank_Name as Designation,"+
                "Qualification,Extra_Ordinary as Good_at,DateOfJoin as Date_of_Join\n" +
                "from TeacherAccademicInfo ta inner join TeacherPersonalInfo tp on "+
                "ta.Teacher_Id=tp.Teacher_Id\n" +
                "inner join Designation d on ta.Rank_Id = d.Rank_Id where ta.Rank_Id = "+rid+"";
                PreparedStatement pst2 = conn.prepareStatement(q);
                ResultSet rs2 = pst2.executeQuery();
                TableTeacher.setModel(DbUtils.resultSetToTableModel(rs2));
            }
          
        }catch( Exception e ) {JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_showMouseClicked

    private void showMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMousePressed
        show.setBackground(new java.awt.Color(0,122,244));
    }//GEN-LAST:event_showMousePressed

    private void showMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseReleased
        show.setBackground(new java.awt.Color(51,153,255));
    }//GEN-LAST:event_showMouseReleased

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        dispose();
    }//GEN-LAST:event_minimizeMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        dispose();
        DashBoard dash = new DashBoard();
        dash.setVisible(true);
    }//GEN-LAST:event_backMouseClicked

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
            java.util.logging.Logger.getLogger(TeacherList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Shadow;
    private javax.swing.JTable TableTeacher;
    private javax.swing.JLabel back;
    private javax.swing.JLabel close;
    private javax.swing.JLabel copyright;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel minimize;
    private javax.swing.JComboBox<String> rank;
    private javax.swing.JLabel show;
    // End of variables declaration//GEN-END:variables
}
