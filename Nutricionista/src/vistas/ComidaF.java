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
        this.getContentPane().setBackground( Color.RED );
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

        TFnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFnombreActionPerformed(evt);
            }
        });

        TFcalorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFcaloriasActionPerformed(evt);
            }
        });

        TFdetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFdetallesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Kcal");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Detalles");

        BguardarC.setText("Guardar");
        BguardarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BguardarCActionPerformed(evt);
            }
        });

        Bbuscar.setText("Buscar");
        Bbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbuscarActionPerformed(evt);
            }
        });

        Bbuscartodo.setText("Buscar Todo");
        Bbuscartodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbuscartodoActionPerformed(evt);
            }
        });

        Bborrar.setText("Borrar");
        Bborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BborrarActionPerformed(evt);
            }
        });

        Bactualizar.setText("Actualizar");
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

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("ID");

        Blimpiar.setText("Limpiar");
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

        BbuscarAccion.setText("BUSCAR");
        BbuscarAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbuscarAccionActionPerformed(evt);
            }
        });

        Batras.setText("ATRas");
        Batras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Bbuscar)
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(Bbuscartodo)
                                        .addGap(63, 63, 63)
                                        .addComponent(Bborrar)
                                        .addGap(56, 56, 56)
                                        .addComponent(Bactualizar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(114, 114, 114)
                                        .addComponent(BguardarC))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Batras, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(TFid, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jLabel4)
                                .addGap(64, 64, 64)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1))
                            .addComponent(TFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel2))
                            .addComponent(TFcalorias, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(TFdetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Blimpiar))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TFcaloriasMenores, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BbuscarAccion)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFdetalles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFcalorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Blimpiar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(BguardarC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bbuscartodo)
                            .addComponent(Bbuscar)
                            .addComponent(Bborrar)
                            .addComponent(Bactualizar))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TFcaloriasMenores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BbuscarAccion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Batras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );

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
        Conexion con = new Conexion();
        ComidaData cd = new ComidaData(con);
        Comida nueva = new Comida();
        nueva.setNombre(TFnombre.getText());
        nueva.setCalorias(Integer.parseInt(TFcalorias.getText()));
        nueva.setDetalle(TFdetalles.getText());
        cd.guardarComida(nueva);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(ComidaF.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_BguardarCActionPerformed

    private void BbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbuscarActionPerformed
    try {
        borrarFilas();
        Conexion con = new Conexion();
        ComidaData cd = new ComidaData(con);
        Comida nueva = new Comida();
        nueva = cd.buscarComida3(Integer.parseInt(TFid.getText()));
        
        TFnombre.setText(nueva.getNombre());
        TFcalorias.setText(Double.toString(nueva.getCalorias()));
        TFdetalles.setText(nueva.getDetalle());
        
        modelo.addRow(new Object[]{nueva.getId(),nueva.getNombre(),nueva.getCalorias(), nueva.getDetalle()});
    } catch (ClassNotFoundException ex) {
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
    try {
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
    } catch (ClassNotFoundException ex) {
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
    try {
        borrarFilas();
        Conexion con = new Conexion();
        ComidaData cd = new ComidaData(con);
        List<Comida> lista = cd.obtenerComidas2(Double.parseDouble(TFcaloriasMenores.getText()));
         for(Comida m:lista){
            modelo.addRow(new Object[]{m.getId(),m.getNombre(),m.getCalorias(),m.getDetalle()});
            
        }   

        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(ComidaF.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_BbuscarAccionActionPerformed

    private void TFcaloriasMenoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFcaloriasMenoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFcaloriasMenoresActionPerformed

    private void BatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatrasActionPerformed
       
    }//GEN-LAST:event_BatrasActionPerformed

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
