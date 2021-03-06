/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import nutricionista.modelos.Comida;
import nutricionista.modelos.ComidaData;
import nutricionista.modelos.Conexion;
import nutricionista.modelos.DietaComidaData;
import nutricionista.modelos.DietaComidaPacienteComida;
import nutricionista.modelos.DietaData;

/**
 *
 * @author RealEnvido
 */
public class ComidaF extends javax.swing.JInternalFrame {
private DefaultTableModel modelo;
    /**
     * Creates new form ComidaF
     */
    public ComidaF() {
        initComponents();
        modelo = new DefaultTableModel();
        armarCabezeraTabla();
        borrarFilas();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        TFnombre = new javax.swing.JTextField();
        TFcalorias = new javax.swing.JTextField();
        TFdetalles = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BguardarC = new javax.swing.JButton();
        Bbuscar = new javax.swing.JButton();
        Bbuscartodo = new javax.swing.JButton();
        Bborrar = new javax.swing.JButton();
        Bactualizar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTresultadosComida = new javax.swing.JTable();
        TFid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Blimpiar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        TFcaloriasMenores = new javax.swing.JTextField();
        BbuscarAccion = new javax.swing.JButton();
        Batras = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(895, 625));

        TFnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFnombreActionPerformed(evt);
            }
        });
        TFnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFnombreKeyTyped(evt);
            }
        });

        TFcalorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFcaloriasActionPerformed(evt);
            }
        });
        TFcalorias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFcaloriasKeyTyped(evt);
            }
        });

        TFdetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFdetallesActionPerformed(evt);
            }
        });
        TFdetalles.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFdetallesKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Kcal:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Detalles:");

        BguardarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoGuardar.png"))); // NOI18N
        BguardarC.setText("Guardar");
        BguardarC.setToolTipText("Guardar Comida en la base de datos");
        BguardarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BguardarCActionPerformed(evt);
            }
        });
        BguardarC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BguardarCKeyTyped(evt);
            }
        });

        Bbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoBuscar.png"))); // NOI18N
        Bbuscar.setText("Buscar");
        Bbuscar.setToolTipText("Buscar Comida por ID");
        Bbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbuscarActionPerformed(evt);
            }
        });

        Bbuscartodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoBuscar.png"))); // NOI18N
        Bbuscartodo.setText("Buscar Todo");
        Bbuscartodo.setToolTipText("Mostrar todas las Comidas de la base de datos");
        Bbuscartodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbuscartodoActionPerformed(evt);
            }
        });

        Bborrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoBorrar.png"))); // NOI18N
        Bborrar.setText("Borrar");
        Bborrar.setToolTipText("Borar comida de la base de datos");
        Bborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BborrarActionPerformed(evt);
            }
        });
        Bborrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BborrarKeyTyped(evt);
            }
        });

        Bactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoActualizar.png"))); // NOI18N
        Bactualizar.setText("Actualizar");
        Bactualizar.setToolTipText("Actualizar datos de una comida en la base de datos");
        Bactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BactualizarActionPerformed(evt);
            }
        });

        JTresultadosComida.setModel(new javax.swing.table.DefaultTableModel(
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
        JTresultadosComida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTresultadosComidaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(JTresultadosComida);

        TFid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFidActionPerformed(evt);
            }
        });
        TFid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFidKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("ID:");

        Blimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoLimpiar.png"))); // NOI18N
        Blimpiar.setText("Limpiar");
        Blimpiar.setToolTipText("Limpiar campos");
        Blimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlimpiarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Buscar comidas con calorias menores a:");

        TFcaloriasMenores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFcaloriasMenoresActionPerformed(evt);
            }
        });
        TFcaloriasMenores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFcaloriasMenoresKeyTyped(evt);
            }
        });

        BbuscarAccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoBuscar.png"))); // NOI18N
        BbuscarAccion.setText("BUSCAR");
        BbuscarAccion.setToolTipText("Nuscar Comidas con calorias menores");
        BbuscarAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbuscarAccionActionPerformed(evt);
            }
        });

        Batras.setBackground(java.awt.Color.white);
        Batras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoAtras.png"))); // NOI18N
        Batras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatrasActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("-comidas-");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel7.setText("Campo Obligatorio");

        jLabel8.setText("Campo Obligatorio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Batras, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(BguardarC)
                                .addGap(63, 63, 63)
                                .addComponent(Bborrar))
                            .addComponent(jLabel5))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(TFcaloriasMenores, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(Bactualizar)))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Blimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BbuscarAccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TFid, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(Bbuscar)
                                .addGap(18, 18, 18)
                                .addComponent(Bbuscartodo))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(TFcalorias, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                                    .addComponent(TFnombre)
                                    .addComponent(TFdetalles))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))))))
                .addContainerGap(132, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Batras)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bbuscar)
                    .addComponent(Bbuscartodo)
                    .addComponent(TFid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFcalorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFdetalles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BguardarC)
                    .addComponent(Bborrar)
                    .addComponent(Bactualizar)
                    .addComponent(Blimpiar))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TFcaloriasMenores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BbuscarAccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
        );

        getAccessibleContext().setAccessibleParent(jDesktopPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFcaloriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFcaloriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFcaloriasActionPerformed

    private void TFnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFnombreActionPerformed

    private void TFdetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFdetallesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFdetallesActionPerformed

    private void BguardarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BguardarCActionPerformed
    try {
        if(TFnombre.getText().length()>0){
        Conexion con = new Conexion();
        ComidaData cd = new ComidaData(con);
        Comida nueva = new Comida();
        nueva.setNombre(TFnombre.getText());
        nueva.setCalorias(Double.parseDouble(TFcalorias.getText()));
        nueva.setDetalle(TFdetalles.getText());
     
        cd.guardarComida(nueva);
    }
    
    else{
    getToolkit().beep();
        JOptionPane.showMessageDialog(rootPane,"Datos Insuficientes Para Guardar Comida");
    
    }
    }
    catch (ClassNotFoundException ex) {
        Logger.getLogger(ComidaF.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_BguardarCActionPerformed

    private void BbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbuscarActionPerformed
    try { if(TFid.getText().length()>0){ // si la caja de id contien un digito realizara la siguien opracion
        borrarFilas();
        Conexion con = new Conexion();
        ComidaData cd = new ComidaData(con);
        Comida nueva = new Comida();
        if(cd.buscarComida3(Integer.parseInt(TFid.getText()))==null)//si el metodo buscar  comida retorna algo vacio lanzara la siguiente exepcion
        {
        getToolkit().beep();
        JOptionPane.showMessageDialog(rootPane, "No se Encontro Comida Con esa ID");
        }
        else{ // si el metodo guardar comida no esta vacio realizara la siguiente la siguiente operacion
        nueva = cd.buscarComida3(Integer.parseInt(TFid.getText()));
        
        TFnombre.setText(nueva.getNombre());
        TFcalorias.setText(Double.toString(nueva.getCalorias()));
        TFdetalles.setText(nueva.getDetalle());
        
        modelo.addRow(new Object[]{nueva.getId(),nueva.getNombre(),nueva.getCalorias(), nueva.getDetalle()});
        }
    }
    else{ // si el campo de ID no tiene digito lanzara la siguiente exepcion 
    getToolkit().beep();
    JOptionPane.showMessageDialog(rootPane, "Ingrese una ID Valida");
    
    }
    }
    catch (ClassNotFoundException ex) {
        Logger.getLogger(ComidaF.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }//GEN-LAST:event_BbuscarActionPerformed

    private void TFidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFidActionPerformed

    private void BbuscartodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbuscartodoActionPerformed
    try {
        borrarFilas();
        Conexion con = new Conexion();
        ComidaData cd = new ComidaData(con);
        List<Comida> lista = cd.obtenerTodasLasComidas();
        for(Comida m:lista){
            modelo.addRow(new Object[]{m.getId(),m.getNombre(),m.getCalorias(),m.getDetalle()});
            
        }         // TODO add your handling code here:
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(ComidaF.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_BbuscartodoActionPerformed

    private void BborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BborrarActionPerformed
    try { if(TFid.getText().length()>0){
       
      
        Conexion con = new Conexion();
        ComidaData cd = new ComidaData(con);
        DietaData dd = new DietaData(con);
        DietaComidaData dcd = new DietaComidaData(con);
        List<DietaComidaPacienteComida> aux = dcd.buscarDietaComidaPorcomida(Integer.parseInt(TFid.getText()));
      //  aux = dcd.buscarDietaComidaPorcomida(Integer.parseInt(TFid.getText()));
        if(aux != null)
        {
            for(DietaComidaPacienteComida m:aux)
            {
                dcd.borrarDietaComida2(Integer.parseInt(TFid.getText()));
            }
            
          cd.borrarComida2(Integer.parseInt(TFid.getText()));
             System.out.println("1");

        }
        else
        {
            cd.borrarComida2(Integer.parseInt(TFid.getText()));
             System.out.println("2");

        }
       
       
       }
    else{
    getToolkit().beep();
    JOptionPane.showMessageDialog(rootPane, "Ingrese Una ID valida");
    
    }
    }
    catch (ClassNotFoundException ex) {
        Logger.getLogger(ComidaF.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_BborrarActionPerformed

    private void JTresultadosComidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTresultadosComidaMouseClicked
        int index = JTresultadosComida.getSelectedRow();
        TableModel model = JTresultadosComida.getModel();
        String value1 = model.getValueAt(index, 0).toString();
        String value2 = model.getValueAt(index, 1).toString();
        String value3 = model.getValueAt(index, 2).toString();  
        String value4 = model.getValueAt(index, 3).toString();
        TFid.setText(value1);
        TFnombre.setText(value2);
        TFcalorias.setText(value3);
        TFdetalles.setText(value4);
          
    }//GEN-LAST:event_JTresultadosComidaMouseClicked

    private void BactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BactualizarActionPerformed
    try {
        Conexion con = new Conexion();
        ComidaData cd = new ComidaData(con);
        Comida nueva = new Comida();
        nueva.setId(Integer.parseInt(TFid.getText()));
        nueva.setNombre(TFnombre.getText());
        nueva.setCalorias(Double.parseDouble(TFcalorias.getText()));
        nueva.setDetalle(TFdetalles.getText());
        cd.actualizarComida(nueva);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(ComidaF.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_BactualizarActionPerformed

    private void BlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlimpiarActionPerformed
       borrarFilas();
       TFnombre.setText(null);
       TFcalorias.setText(null);
       TFdetalles.setText(null);
       TFid.setText(null);
    }//GEN-LAST:event_BlimpiarActionPerformed

    private void BbuscarAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbuscarAccionActionPerformed
    try { if(TFcaloriasMenores.getText().length()>0){
        borrarFilas();
        Conexion con = new Conexion();
        ComidaData cd = new ComidaData(con);
        List<Comida> lista = cd.obtenerComidas2(Double.parseDouble(TFcaloriasMenores.getText()));
         for(Comida m:lista){
            modelo.addRow(new Object[]{m.getId(),m.getNombre(),m.getCalorias(),m.getDetalle()});
            
        } 
         
         
         
    }
    else {
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Ingresar Numeros De Calorias");
                 
                 }

        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(ComidaF.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_BbuscarAccionActionPerformed

    private void TFcaloriasMenoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFcaloriasMenoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFcaloriasMenoresActionPerformed

    private void BatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatrasActionPerformed
       this.setVisible(false);
        this.moveToBack();
    }//GEN-LAST:event_BatrasActionPerformed

    private void TFidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFidKeyTyped
       if(Character.isLetter(evt.getKeyChar())){ /*si en el campo de tecto para id lo que se ingresa es una letra lanza la siguiente
                                                       exepcion*/
          
      getToolkit().beep();
      evt.consume();
          JOptionPane.showMessageDialog(rootPane,"Ingrese Solo Numeros");
      }
      else{//caso contrario no hace nada 
      
      
      }
    }//GEN-LAST:event_TFidKeyTyped

    private void TFnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFnombreKeyTyped
      if(Character.isDigit(evt.getKeyChar())){ //si en el campo de texto nombre se ingresaa un numero lanza la siguiente exepcion
          
      getToolkit().beep();
      evt.consume();
          JOptionPane.showMessageDialog(rootPane,"Ingrese Solo Letras");
      
      }
      else{ // caso contrario no hace nada
      
      }
    }//GEN-LAST:event_TFnombreKeyTyped

    private void TFdetallesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFdetallesKeyTyped
       
    }//GEN-LAST:event_TFdetallesKeyTyped

    private void TFcaloriasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFcaloriasKeyTyped
       if(Character.isLetter(evt.getKeyChar())){ /*si en el campo de tecto para id lo que se ingresa es una letra lanza la siguiente
                                                       exepcion*/
          
      getToolkit().beep();
      evt.consume();
          JOptionPane.showMessageDialog(rootPane,"Ingrese Solo Numeros");
      }
      else{//caso contrario no hace nada 
      
      
      }
    }//GEN-LAST:event_TFcaloriasKeyTyped

    private void BborrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BborrarKeyTyped
       
    }//GEN-LAST:event_BborrarKeyTyped

    private void BguardarCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BguardarCKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_BguardarCKeyTyped

    private void TFcaloriasMenoresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFcaloriasMenoresKeyTyped
       if(Character.isLetter(evt.getKeyChar())){ /*si en el campo de tecto para id lo que se ingresa es una letra lanza la siguiente
                                                       exepcion*/
          
      getToolkit().beep();
      evt.consume();
          JOptionPane.showMessageDialog(rootPane,"Ingrese Solo Numeros");
      }
      else{//caso contrario no hace nada 
      
      
      }
    }//GEN-LAST:event_TFcaloriasMenoresKeyTyped

 public void armarCabezeraTabla()
    {
        ArrayList<Object> columnas = new ArrayList<Object>();
        columnas.add("idComida");
        columnas.add("Nombre");
        columnas.add("Calorias");
        columnas.add("Detalles");
       
         for(Object it:columnas)
         {
            modelo.addColumn(it);
            
         }
         JTresultadosComida.setModel(modelo);
    }
  public void borrarFilas()
     {
     int a = modelo.getRowCount()-1;
      for(int i = a;i>=0;i--){
      modelo.removeRow(i);
      }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bactualizar;
    private javax.swing.JButton Batras;
    private javax.swing.JButton Bborrar;
    private javax.swing.JButton Bbuscar;
    private javax.swing.JButton BbuscarAccion;
    private javax.swing.JButton Bbuscartodo;
    private javax.swing.JButton BguardarC;
    private javax.swing.JButton Blimpiar;
    private javax.swing.JTable JTresultadosComida;
    private javax.swing.JTextField TFcalorias;
    private javax.swing.JTextField TFcaloriasMenores;
    private javax.swing.JTextField TFdetalles;
    private javax.swing.JTextField TFid;
    private javax.swing.JTextField TFnombre;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
