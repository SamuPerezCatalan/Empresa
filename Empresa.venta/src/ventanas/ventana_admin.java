/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ventana_admin extends javax.swing.JFrame {

 Conectar con = new Conectar();
 Connection cn= con.Conexion();

   
   
    public ventana_admin() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        
        consultadatos();
        consultadatos2();
        consultadatos3();
        consultadatos4();
       
    }
 void consultadatos()
    {
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("id");
    modelo.addColumn("nombre");
    modelo.addColumn("apepat");
    modelo.addColumn("apemat");
    modelo.addColumn("rut"); 
    modelo.addColumn("edad");
    modelo.addColumn("sueldo");
    Empletabla.setModel(modelo);
    
    String sql= "Select * from empleado";
    
    String datos[]= new String[7];
    Statement st;
    try
    {
        st= cn.createStatement();
        ResultSet rs= st.executeQuery(sql);
        while(rs.next())
        {
          datos[0]=rs.getString(1);
          datos[1]=rs.getString(2);
          datos[2]=rs.getString(3);
          datos[3]=rs.getString(4);
          datos[4]=rs.getString(5);
          datos[5]=rs.getString(6);
          datos[6]=rs.getString(7);
          modelo.addRow(datos);
       
        }
        
        Empletabla.setModel(modelo);
    }
   
     catch(Exception e)
     {
     
     }
    
    }
    void consultadatos2()
    {
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("id");
    modelo.addColumn("proveedor");
    modelo.addColumn("nombre");
    modelo.addColumn("estado");
    modelo.addColumn("precio"); 
    modelo.addColumn("stock");
    pro_tabla.setModel(modelo);
    
    String sql2= "Select * from producto";
    
    String datos2[]= new String[6];
    Statement st;
    try
    {
        st= cn.createStatement();
        ResultSet rs= st.executeQuery(sql2);
        while(rs.next())
        {
          datos2[0]=rs.getString(1);
          datos2[1]=rs.getString(2);
          datos2[2]=rs.getString(3);
          datos2[3]=rs.getString(4);
          datos2[4]=rs.getString(5);
          datos2[5]=rs.getString(6);
           modelo.addRow(datos2);
       
        }
        
        pro_tabla.setModel(modelo);
    }
   
     catch(Exception e)
     {
     
     }
    
    }
    
     void consultadatos3()
    {
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("id");
    modelo.addColumn("nombre");
    modelo.addColumn("direccion");
    modelo.addColumn("telefono"); 
    prove_tabla.setModel(modelo);
    
    String sql3= "Select * from proveedor";
    
    String datos3[]= new String[4];
    Statement st;
    try
    {
        st= cn.createStatement();
        ResultSet rs= st.executeQuery(sql3);
        while(rs.next())
        {
          datos3[0]=rs.getString(1);
          datos3[1]=rs.getString(2);
          datos3[2]=rs.getString(3);
          datos3[3]=rs.getString(4);
      
           modelo.addRow(datos3);
       
        }
        
        prove_tabla.setModel(modelo);
    }
   
     catch(Exception e)
     {
     
     }
    
    }
    
        void consultadatos4()
    {
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("id");
    modelo.addColumn("id_venta");
    modelo.addColumn("id_producto");
    modelo.addColumn("cantidad"); 
    modelo.addColumn("MontoTotal");
    venta_tabla.setModel(modelo);
    
    String sql4= "Select * from detalle_venta";
    
    String datos4[]= new String[5];
    Statement st;
    try
    {
        st= cn.createStatement();
        ResultSet rs= st.executeQuery(sql4);
        while(rs.next())
        {
          datos4[0]=rs.getString(1);
          datos4[1]=rs.getString(2);
          datos4[2]=rs.getString(3);
          datos4[3]=rs.getString(4);
          datos4[4]=rs.getString(5);      
           modelo.addRow(datos4);
       
        }
        
        venta_tabla.setModel(modelo);
    }
   
     catch(Exception e)
     {
     
     }
    
    } 
    /**
     * 
     * 
     * 
     * 
     * 
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cerrarsesion = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        administrador_txt = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        get_nom = new javax.swing.JTextField();
        get_apat = new javax.swing.JTextField();
        get_amat = new javax.swing.JTextField();
        get_rut = new javax.swing.JTextField();
        get_edad = new javax.swing.JTextField();
        get_sueldo = new javax.swing.JTextField();
        em_agregar = new javax.swing.JButton();
        em_select = new javax.swing.JButton();
        em_elim = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Empletabla = new javax.swing.JTable();
        em_modi = new javax.swing.JButton();
        buscar = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        get_nomprod = new javax.swing.JTextField();
        get_estado = new javax.swing.JTextField();
        get_precio = new javax.swing.JTextField();
        get_stock = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        pro_selec = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        pro_tabla = new javax.swing.JTable();
        buscar2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        get_idprov = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        prove_tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        prove_nom = new javax.swing.JTextField();
        prove_di = new javax.swing.JTextField();
        prove_te = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        venta_tabla = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zen_by_dimage.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zen_by_dimage.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cerrarsesion.setText("Cerrar Sesión");
        cerrarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarsesionActionPerformed(evt);
            }
        });
        getContentPane().add(cerrarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, -1, -1));

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, -1, -1));

        administrador_txt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        administrador_txt.setText("Administrador");
        getContentPane().add(administrador_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 100, 30));

        jTabbedPane2.setBackground(new java.awt.Color(0, 153, 153));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Nombre :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 70, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Apellido Paterno :");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Apellido Materno:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 120, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Rut : ");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Edad : ");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Sueldo :");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));
        jPanel3.add(get_nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 180, -1));
        jPanel3.add(get_apat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 180, -1));
        jPanel3.add(get_amat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 180, -1));
        jPanel3.add(get_rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 180, -1));
        jPanel3.add(get_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 180, -1));
        jPanel3.add(get_sueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 180, -1));

        em_agregar.setText("Agregar");
        em_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                em_agregarActionPerformed(evt);
            }
        });
        jPanel3.add(em_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 90, 40));

        em_select.setText("Seleccionar");
        em_select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                em_selectActionPerformed(evt);
            }
        });
        jPanel3.add(em_select, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 120, 40));

        em_elim.setText("Eliminar");
        em_elim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                em_elimActionPerformed(evt);
            }
        });
        jPanel3.add(em_elim, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, 120, 40));

        Empletabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Empletabla);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 440, 250));

        em_modi.setText("Modificar");
        em_modi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                em_modiActionPerformed(evt);
            }
        });
        jPanel3.add(em_modi, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 120, 40));
        jPanel3.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 200, -1));

        jTabbedPane2.addTab("Empleados", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Nombre :");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Estado :");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Precio :");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Stock :");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));
        jPanel4.add(get_nomprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 190, -1));
        jPanel4.add(get_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 190, -1));
        jPanel4.add(get_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 190, -1));
        jPanel4.add(get_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 190, -1));

        jButton4.setText("Ingresar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 90, 50));

        jButton5.setText("Modificar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 90, 50));

        jButton6.setText("Eliiminar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, 90, 50));

        pro_selec.setText("Seleccionar");
        pro_selec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pro_selecActionPerformed(evt);
            }
        });
        jPanel4.add(pro_selec, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 100, 50));

        pro_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(pro_tabla);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 440, 320));
        jPanel4.add(buscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 70, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("id_proveedor");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));
        jPanel4.add(get_idprov, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 190, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zen_by_dimage.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-510, -170, 1340, -1));

        jTabbedPane2.addTab("Productos", jPanel4);

        prove_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(prove_tabla);

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Nombre : ");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Dirección :");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("telefono :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prove_nom)
                    .addComponent(prove_di)
                    .addComponent(prove_te, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(prove_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(prove_di, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(prove_te, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        jTabbedPane2.addTab("Proveedor", jPanel1);

        venta_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(venta_tabla);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Ventas del Mes ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel18)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Ventas", jPanel2);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 790, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarsesionActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cerrarsesionActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       
        
        try{

            PreparedStatement pps= cn.prepareStatement("Delete from producto where id_producto='"+buscar2.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dato Eliminado");
            consultadatos2();

            buscar2.setText("");
            get_idprov.setText("");
            get_nomprod.setText("");
            get_estado.setText("");
            get_precio.setText("");
            get_stock.setText("");
        }

        catch(Exception e)
        {

        }  
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        try{

            PreparedStatement pps= cn.prepareStatement("Update producto set id_proveedor='"+get_idprov.getText()+"',nombre='"+get_nomprod.getText()+"',estado ='"+get_estado.getText()+"', precio='"+get_precio.getText()+"',stock='"+get_stock.getText()+"' where id_producto='"+buscar2.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Actualizados");
            consultadatos2();
            buscar2.setText("");
            get_idprov.setText("");
            get_nomprod.setText("");
            get_estado.setText("");
            get_precio.setText("");
            get_stock.setText("");
        }
        catch(Exception e)
        {

        }

        
        
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        try
        {
         Conectar cot = new Conectar();
         Connection ut= cot.Conexion();
         
           PreparedStatement pss = ut.prepareStatement("insert into producto (id_proveedor,nombre, estado , precio, stock) values(?,?,?,?,?)");
           
           pss.setString(1,get_idprov.getText().trim());
            pss.setString(2, get_nomprod.getText().trim() );
            pss.setString(3, get_estado.getText().trim());
            pss.setString(4, get_precio.getText().trim());
            pss.setString(5, get_stock.getText().trim());
            pss.executeUpdate();

            JOptionPane.showMessageDialog(null,"Datos Guardados");
             consultadatos2();
            get_idprov.setText("");
            get_nomprod.setText("");
            get_estado.setText("");
            get_precio.setText("");
            get_stock.setText("");

        }
        catch(Exception e)
        {

        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void em_modiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_em_modiActionPerformed

        try{

            PreparedStatement pps= cn.prepareStatement("Update empleado set nombre='"+get_nom.getText()+"',apepat='"+get_apat.getText()+"', apemat='"+get_amat.getText()+"',rut='"+get_rut.getText()+"', edad= '"+get_edad.getText()+"',sueldo='"+get_sueldo.getText()+"' where id_empleado='"+buscar.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Actualizados");
            consultadatos();
            buscar.setText("");
            get_nom.setText("");
            get_apat.setText("");
            get_amat.setText("");
            get_rut.setText("");
            get_edad.setText("");
            get_sueldo.setText("");
        }
        catch(Exception e)
        {

        }

    }//GEN-LAST:event_em_modiActionPerformed

    private void em_elimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_em_elimActionPerformed

        try{

            PreparedStatement pps= cn.prepareStatement("Delete from empleado where id_empleado='"+buscar.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dato Eliminado");
            consultadatos();

            buscar.setText("");
            get_nom.setText("");
            get_apat.setText("");
            get_amat.setText("");
            get_rut.setText("");
            get_edad.setText("");
            get_sueldo.setText("");
        }

        catch(Exception e)
        {

        }

    }//GEN-LAST:event_em_elimActionPerformed

    private void em_selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_em_selectActionPerformed

        int fila = Empletabla.getSelectedRow();

        if(fila>=0)
        {
            buscar.setText(Empletabla.getValueAt(fila, 0).toString());
            get_nom.setText(Empletabla.getValueAt(fila, 1).toString());
            get_apat.setText(Empletabla.getValueAt(fila, 2).toString());
            get_amat.setText(Empletabla.getValueAt(fila, 3).toString());
            get_rut.setText(Empletabla.getValueAt(fila, 4).toString());
            get_edad.setText(Empletabla.getValueAt(fila, 5).toString());
            get_sueldo.setText(Empletabla.getValueAt(fila, 6).toString());

        }
        else
        {
            JOptionPane.showMessageDialog(null,"Seleccione una fila");

        }

    }//GEN-LAST:event_em_selectActionPerformed

    private void em_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_em_agregarActionPerformed

        try
        {

            PreparedStatement pst = cn.prepareStatement("insert into empleado (nombre,apepat, apemat, rut, edad, sueldo) values(?,?,?,?,?,?)");

            pst.setString(1, get_nom.getText().trim() );
            pst.setString(2, get_apat.getText().trim());
            pst.setString(3, get_amat.getText().trim());
            pst.setString(4, get_rut.getText().trim());
            pst.setString(5, get_edad.getText().trim());
            pst.setString(6, get_sueldo.getText().trim());
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null,"Datos Guardados");

            get_nom.setText("");
            get_apat.setText("");
            get_amat.setText("");
            get_rut.setText("");
            get_edad.setText("");
            get_sueldo.setText("");
            consultadatos();
        }
        catch(Exception e)
        {

        }

    }//GEN-LAST:event_em_agregarActionPerformed

    private void pro_selecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pro_selecActionPerformed
        
         int fila = pro_tabla.getSelectedRow();

        if(fila>=0)
        {
            buscar2.setText(pro_tabla.getValueAt(fila, 0).toString());
            get_idprov.setText(pro_tabla.getValueAt(fila, 1).toString());
            get_nomprod.setText(pro_tabla.getValueAt(fila, 2).toString());
            get_estado.setText(pro_tabla.getValueAt(fila, 3).toString());
            get_precio.setText(pro_tabla.getValueAt(fila, 4).toString());
            get_stock.setText(pro_tabla.getValueAt(fila, 5).toString());
            
            

        }
        else
        {
            JOptionPane.showMessageDialog(null,"Seleccione una fila");

        }

    }//GEN-LAST:event_pro_selecActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        
          try
        {
          Conectar coy = new Conectar();
         Connection ur= coy.Conexion();
         
            PreparedStatement psu = ur.prepareStatement("Insert into proveedor (nombre,direccion,telefono)values(?,?,?)");

            psu.setString(1, prove_nom.getText().trim() );
            psu.setString(2, prove_di.getText().trim());
            psu.setString(3, prove_te.getText().trim());
        
            psu.executeUpdate();

            JOptionPane.showMessageDialog(null,"Datos Guardados");

            prove_nom.setText("");
            prove_di.setText("");
            prove_te.setText("");
     
            consultadatos3();
        }
        catch(Exception e)
        {

        }

        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
       login u = new login();
       u.setVisible(true);
       this.dispose();
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ventana_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ventana_admin().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ventana_admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Empletabla;
    private javax.swing.JLabel administrador_txt;
    private javax.swing.JTextField buscar;
    private javax.swing.JTextField buscar2;
    private javax.swing.JButton cerrarsesion;
    private javax.swing.JButton em_agregar;
    private javax.swing.JButton em_elim;
    private javax.swing.JButton em_modi;
    private javax.swing.JButton em_select;
    private javax.swing.JTextField get_amat;
    private javax.swing.JTextField get_apat;
    private javax.swing.JTextField get_edad;
    private javax.swing.JTextField get_estado;
    private javax.swing.JTextField get_idprov;
    private javax.swing.JTextField get_nom;
    private javax.swing.JTextField get_nomprod;
    private javax.swing.JTextField get_precio;
    private javax.swing.JTextField get_rut;
    private javax.swing.JTextField get_stock;
    private javax.swing.JTextField get_sueldo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JButton pro_selec;
    private javax.swing.JTable pro_tabla;
    private javax.swing.JTextField prove_di;
    private javax.swing.JTextField prove_nom;
    private javax.swing.JTable prove_tabla;
    private javax.swing.JTextField prove_te;
    private javax.swing.JTable venta_tabla;
    // End of variables declaration//GEN-END:variables
}
