/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.management.system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author RK Anik
 */
public class DeleteInfo extends javax.swing.JFrame {

    /**
     * Creates new form DeleteInfo
     */
    public DeleteInfo() {
        initComponents();
        Ldes.setVisible(false);
        Lgoodat.setVisible(false);
        deleteforeever.setVisible(false);
    }
    Connection conn = null ;
    PreparedStatement pst = null ;
    ResultSet rs = null ;
    int xx , xy ;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        close = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        minimize = new javax.swing.JButton();
        Shadow = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Student = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Teacher = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Worker = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        teacher = new javax.swing.JRadioButton();
        worker = new javax.swing.JRadioButton();
        student = new javax.swing.JRadioButton();
        Pdelete = new javax.swing.JPanel();
        delete = new javax.swing.JButton();
        deleteforeever = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        clsordes = new javax.swing.JTextField();
        Lclass = new javax.swing.JLabel();
        secorgood = new javax.swing.JTextField();
        Lsection = new javax.swing.JLabel();
        Ldes = new javax.swing.JLabel();
        Lgoodat = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        currentstatus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 70));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));

        jPanel2.setBackground(new java.awt.Color(49, 59, 60));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close.png"))); // NOI18N
        close.setContentAreaFilled(false);
        close.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                closeMouseMoved(evt);
            }
        });
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
        });
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        jPanel3.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 30, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Which Information Want to Delete");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 290, 30));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel3.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 30));

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimize.png"))); // NOI18N
        minimize.setContentAreaFilled(false);
        minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizeActionPerformed(evt);
            }
        });
        jPanel3.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 30, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        Shadow.setBackground(new java.awt.Color(0, 123, 123));
        Shadow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(Shadow, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 500, 8));

        jPanel4.setBackground(new java.awt.Color(60, 69, 70));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Student.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Student.setForeground(new java.awt.Color(255, 255, 255));
        Student.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Student.png"))); // NOI18N
        Student.setBorder(null);
        Student.setContentAreaFilled(false);
        Student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentActionPerformed(evt);
            }
        });
        jPanel4.add(Student, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, 70));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Student");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 100, 20));

        Teacher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Teacher.png"))); // NOI18N
        Teacher.setContentAreaFilled(false);
        Teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeacherActionPerformed(evt);
            }
        });
        jPanel4.add(Teacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 80, 70));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Teacher");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 90, 20));

        Worker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Worker.png"))); // NOI18N
        Worker.setContentAreaFilled(false);
        Worker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorkerActionPerformed(evt);
            }
        });
        jPanel4.add(Worker, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 80, 70));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Worker");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 110, 20));

        teacher.setBackground(new java.awt.Color(60, 69, 70));
        BG.add(teacher);
        teacher.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        teacher.setMargin(new java.awt.Insets(3, 3, 3, 3));
        teacher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teacherMouseClicked(evt);
            }
        });
        jPanel4.add(teacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, 30));

        worker.setBackground(new java.awt.Color(60, 69, 70));
        BG.add(worker);
        worker.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        worker.setMargin(new java.awt.Insets(3, 3, 3, 3));
        worker.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                workerMouseClicked(evt);
            }
        });
        jPanel4.add(worker, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, 30));

        student.setBackground(new java.awt.Color(60, 69, 70));
        BG.add(student);
        student.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        student.setMargin(new java.awt.Insets(3, 3, 3, 3));
        student.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentMouseClicked(evt);
            }
        });
        jPanel4.add(student, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, 30));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 500, 100));

        Pdelete.setBackground(new java.awt.Color(0, 153, 153));
        Pdelete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        delete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.setContentAreaFilled(false);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        Pdelete.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 120, 30));

        deleteforeever.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deleteforeever.setForeground(new java.awt.Color(255, 255, 255));
        deleteforeever.setText("Click Again to Delete");
        deleteforeever.setContentAreaFilled(false);
        deleteforeever.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteforeeverActionPerformed(evt);
            }
        });
        Pdelete.add(deleteforeever, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 210, 30));

        jPanel2.add(Pdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 310, 30));

        id.setBackground(new java.awt.Color(60, 69, 70));
        id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        id.setForeground(new java.awt.Color(204, 204, 204));
        id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id.setText("Enter ID Here");
        id.setBorder(null);
        id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                idMousePressed(evt);
            }
        });
        jPanel2.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 310, 30));

        name.setEditable(false);
        name.setBackground(new java.awt.Color(60, 69, 70));
        name.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name.setBorder(null);
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 160, 25));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Name :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 40, 20));

        clsordes.setEditable(false);
        clsordes.setBackground(new java.awt.Color(60, 69, 70));
        clsordes.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        clsordes.setForeground(new java.awt.Color(255, 255, 255));
        clsordes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        clsordes.setBorder(null);
        jPanel2.add(clsordes, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 160, 25));

        Lclass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lclass.setForeground(new java.awt.Color(204, 204, 204));
        Lclass.setText("Class :");
        jPanel2.add(Lclass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 40, 20));

        secorgood.setEditable(false);
        secorgood.setBackground(new java.awt.Color(60, 69, 70));
        secorgood.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        secorgood.setForeground(new java.awt.Color(255, 255, 255));
        secorgood.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        secorgood.setBorder(null);
        jPanel2.add(secorgood, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 160, 25));

        Lsection.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lsection.setForeground(new java.awt.Color(204, 204, 204));
        Lsection.setText("Section :");
        jPanel2.add(Lsection, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 70, 20));

        Ldes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Ldes.setForeground(new java.awt.Color(204, 204, 204));
        Ldes.setText("Designation:");
        jPanel2.add(Ldes, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 70, 20));

        Lgoodat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lgoodat.setForeground(new java.awt.Color(204, 204, 204));
        Lgoodat.setText("Good at:");
        jPanel2.add(Lgoodat, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 50, 20));

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));

        currentstatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        currentstatus.setForeground(new java.awt.Color(255, 255, 255));
        currentstatus.setText("Show Current Status");
        currentstatus.setContentAreaFilled(false);
        currentstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentstatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(currentstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(currentstatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 310, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_closeMouseMoved

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered

    }//GEN-LAST:event_closeMouseEntered

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        dispose();
    }//GEN-LAST:event_closeActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
        DashBoard back = new DashBoard();
        back.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx , y - xy );
    }//GEN-LAST:event_jPanel3MouseDragged

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void StudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentActionPerformed
        
    }//GEN-LAST:event_StudentActionPerformed

    private void TeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeacherActionPerformed
        
    }//GEN-LAST:event_TeacherActionPerformed

    private void WorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorkerActionPerformed
        
    }//GEN-LAST:event_WorkerActionPerformed

    private void idMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idMousePressed
        int index = 0;
        if(student.isSelected()){index = 1;}else if(teacher.isSelected()){index = 2;}else if(worker.isSelected()){index = 3;}
        if( index == 0 ){id.setText("");}else if(index == 1 ){id.setText("ST-");}else if(index == 2 ){id.setText("T-");}else if(index == 3 ){id.setText("W-");}
        name.setText("");clsordes.setText("");secorgood.setText("");
    }//GEN-LAST:event_idMousePressed

    private void currentstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentstatusActionPerformed
        deleteforeever.setVisible(false);
        delete.setVisible(true);
        Pdelete.setBackground( new java.awt.Color(0,153,153));
        int index = 0 ;
        if(student.isSelected()){index = 1;}else if(teacher.isSelected()){index = 2;}else if(worker.isSelected()){index = 3;}
        try{
            conn = DatabaseConnection.ConnectDB();
            if( index == 0 ){JOptionPane.showMessageDialog(null,"Please Select a Option \nAnd Enter a ID","Message",2);}
            else if( index == 1 ){
                Ldes.setVisible(false);
                Lgoodat.setVisible(false);
                Lclass.setVisible(true);
                Lsection.setVisible(true);
                
                try{
                    String query = "select Student_Name from StudentPersonalInfo where Student_Id='"+id.getText()+"'";
                    pst = conn.prepareStatement(query);
                    rs = pst.executeQuery();
                    if( rs.next() ){
                        String q = "select Class_Id, Section_Id from StudentAccademicInfo where Student_Id='"+id.getText()+"'";
                        PreparedStatement pst2 = conn.prepareStatement(q);
                        ResultSet rs2 = pst2.executeQuery();
                        if( rs2.next() ){
                            String q2 = "select Class_Name from Class where Class_Id = "+rs2.getInt("Class_Id")+"";
                            PreparedStatement pst3 = conn.prepareStatement(q2);
                            ResultSet rs3 = pst3.executeQuery();
                            if(rs3.next() ){
                                clsordes.setText(rs3.getString("Class_Name"));
                            }
                            String q3 = "select Section_Name from Section where Section_Id = "+rs2.getInt("Section_Id")+"";
                            PreparedStatement pst4 = conn.prepareStatement(q3);
                            ResultSet rs4 = pst4.executeQuery();
                            if(rs4.next() ){
                                secorgood.setText(rs4.getString("Section_Name"));
                            }
                        }
                        name.setText( rs.getString("Student_Name"));
                    }
                    else{
                        name.setText("");clsordes.setText("");secorgood.setText("");
                        JOptionPane.showMessageDialog(null,"Student ID Not Found !!!\nEnter a valid ID","Message",2);
                    }
                }catch(Exception e ){JOptionPane.showMessageDialog(null,e );}
            }
            else if( index == 2 ){
                Lclass.setVisible(false);
                Lsection.setVisible(false);
                Ldes.setVisible(true);
                Lgoodat.setVisible(true);
                
                 try{
                     String query ="select Teacher_Name,Rank_Id,Extra_Ordinary from TeacherAccademicInfo where Teacher_Id = '"+id.getText()+"'";
                     pst = conn.prepareStatement(query);
                     rs = pst.executeQuery();
                     if( rs.next() ){
                         String q = "select Rank_Name from Designation where Rank_Id='"+rs.getInt("Rank_Id")+"'";
                         PreparedStatement pst2 = conn.prepareStatement(q);
                         ResultSet rs2 = pst2.executeQuery();
                         if( rs2.next() ){
                             clsordes.setText( rs2.getString("Rank_Name"));
                         }
                         name.setText( rs.getString("Teacher_Name"));
                         secorgood.setText( rs.getString("Extra_Ordinary"));
                     }
                     else{
                        name.setText("");clsordes.setText("");secorgood.setText("");
                        JOptionPane.showMessageDialog(null,"Teacher ID Not Found !!!\nEnter a valid ID","Message",2);
                     }
                 }catch(Exception e ){JOptionPane.showMessageDialog(null,e );}
            }
            else if( index == 3){
                Lclass.setVisible(false);
                Lsection.setVisible(false);
                Ldes.setVisible(true);
                Lgoodat.setVisible(true);
                
                try{
                     String query ="select Worker_Name,Rank_Id,ExtraOrdinary from WorkerAccademicInfo where Worker_Id = '"+id.getText()+"'";
                     pst = conn.prepareStatement(query);
                     rs = pst.executeQuery();
                     if( rs.next() ){
                         String q = "select Rank_Name from Designation where Rank_Id='"+rs.getInt("Rank_Id")+"'";
                         PreparedStatement pst2 = conn.prepareStatement(q);
                         ResultSet rs2 = pst2.executeQuery();
                         if( rs2.next() ){
                             clsordes.setText( rs2.getString("Rank_Name"));
                         }
                         name.setText( rs.getString("Worker_Name"));
                         secorgood.setText( rs.getString("ExtraOrdinary"));
                     }
                     else{
                        name.setText("");clsordes.setText("");secorgood.setText("");
                        JOptionPane.showMessageDialog(null,"Worker ID Not Found !!!\nEnter a valid ID","Message",2);
                     }
                 }catch(Exception e ){JOptionPane.showMessageDialog(null,e );}
            }
        }catch(Exception e){JOptionPane.showMessageDialog(null, e );}
    }//GEN-LAST:event_currentstatusActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        String check = id.getText() , c = "Enter ID Here";
        if( check.isEmpty() || check.equals(c)){
            JOptionPane.showMessageDialog(null, "Enter a ID First. Then Click \n'Show Current Status'","Message",2);
        }
        else{
            if(name.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter a Valid ID Then Click \n'Show Current Status'","Message",2);
            }
            else{
                delete.setVisible(false);
                Pdelete.setBackground( new java.awt.Color(255,51,51));
                deleteforeever.setVisible(true);
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void deleteforeeverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteforeeverActionPerformed
        try{
            conn = DatabaseConnection.ConnectDB();
            int index = 0 ;
            if(student.isSelected()){index = 1;}else if(teacher.isSelected()){index = 2;}else if(worker.isSelected()){index = 3;}
            if( index == 1 ){
                String q1 = "delete from StudentPersonalInfo where Student_Id = '"+id.getText()+"'";
                String q2 = "delete from StudentAccademicInfo where Student_Id = '"+id.getText()+"'";
                String q3 = "delete from StudentPresentAddress where Student_Id = '"+id.getText()+"'";
                String q4 = "delete from StudentParmanentAddress where Student_Id = '"+id.getText()+"'";
                try{
                    PreparedStatement pst2 = conn.prepareStatement(q1);
                    pst2.execute();
                    PreparedStatement pst3 = conn.prepareStatement(q2);
                    pst3.execute();
                    PreparedStatement pst4 = conn.prepareStatement(q3);
                    pst4.execute();
                    PreparedStatement pst5 = conn.prepareStatement(q4);
                    pst5.execute();
                    
                    JOptionPane.showMessageDialog(null,"Information Successfully Deleted","Success",1);
                }catch(Exception b ){ JOptionPane.showMessageDialog(null, b);}
            }
            if( index == 2 ){
                String q1 = "delete from TeacherAccademicInfo where Teacher_Id = '"+id.getText()+"'";
                String q2 = "delete from TeacherPersonalInfo where Teacher_Id = '"+id.getText()+"'";
                String q3 = "delete from TeacherPresentAddress where Teacher_Id = '"+id.getText()+"'";
                String q4 = "delete from TeacherParmanentAddress where Teacher_Id = '"+id.getText()+"'";
                try{
                    PreparedStatement pst2 = conn.prepareStatement(q1);
                    pst2.execute();
                    PreparedStatement pst3 = conn.prepareStatement(q2);
                    pst3.execute();
                    PreparedStatement pst4 = conn.prepareStatement(q3);
                    pst4.execute();
                    PreparedStatement pst5 = conn.prepareStatement(q4);
                    pst5.execute();
                    
                    JOptionPane.showMessageDialog(null,"Information Successfully Deleted","Success",1);
                }catch(Exception b ){ JOptionPane.showMessageDialog(null, b);}
            }
            if( index == 3 ){
                String q1 = "delete from WorkerAccademicInfo where Worker_Id = '"+id.getText()+"'";
                String q2 = "delete from WorkerPersonalInfo where Worker_Id = '"+id.getText()+"'";
                String q3 = "delete from WorkerPresentAddress where Worker_Id = '"+id.getText()+"'";
                String q4 = "delete from WorkerParmanentAddress where Worker_Id = '"+id.getText()+"'";
                try{
                    PreparedStatement pst2 = conn.prepareStatement(q1);
                    pst2.execute();
                    PreparedStatement pst3 = conn.prepareStatement(q2);
                    pst3.execute();
                    PreparedStatement pst4 = conn.prepareStatement(q3);
                    pst4.execute();
                    PreparedStatement pst5 = conn.prepareStatement(q4);
                    pst5.execute();
                    
                    JOptionPane.showMessageDialog(null,"Information Successfully Deleted","Success",1);
                }catch(Exception b ){ JOptionPane.showMessageDialog(null, b);}
            }
        }catch(Exception a){JOptionPane.showMessageDialog(null, a );}
    }//GEN-LAST:event_deleteforeeverActionPerformed

    private void studentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentMouseClicked
        id.setText("ST-");
    }//GEN-LAST:event_studentMouseClicked

    private void teacherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherMouseClicked
        id.setText("T-");
    }//GEN-LAST:event_teacherMouseClicked

    private void workerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workerMouseClicked
        id.setText("W-");
    }//GEN-LAST:event_workerMouseClicked

    private void idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idMouseClicked

    }//GEN-LAST:event_idMouseClicked

    private void minimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BG;
    private javax.swing.JLabel Lclass;
    private javax.swing.JLabel Ldes;
    private javax.swing.JLabel Lgoodat;
    private javax.swing.JLabel Lsection;
    private javax.swing.JPanel Pdelete;
    private javax.swing.JPanel Shadow;
    private javax.swing.JButton Student;
    private javax.swing.JButton Teacher;
    private javax.swing.JButton Worker;
    private javax.swing.JButton back;
    private javax.swing.JButton close;
    private javax.swing.JTextField clsordes;
    private javax.swing.JButton currentstatus;
    private javax.swing.JButton delete;
    private javax.swing.JButton deleteforeever;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton minimize;
    private javax.swing.JTextField name;
    private javax.swing.JTextField secorgood;
    private javax.swing.JRadioButton student;
    private javax.swing.JRadioButton teacher;
    private javax.swing.JRadioButton worker;
    // End of variables declaration//GEN-END:variables
}
