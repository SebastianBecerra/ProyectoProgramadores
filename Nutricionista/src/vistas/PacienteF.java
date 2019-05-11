/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import nutricionista.modelos.Conexion;
import nutricionista.modelos.Paciente;
import nutricionista.modelos.PacienteData;


/**
 *
 * @author RealEnvido
 */
public class PacienteF extends javax.swing.JInternalFrame {
 private DefaultTableModel modelo;
    /**
     * Creates new form Paciente
     */
    
    public PacienteF() {
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

        Lpaciente = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TFid = new javax.swing.JTextField();
        TFnombre = new javax.swing.JTextField();
        TFdni = new javax.swing.JTextField();
        TFdireccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TFcelular = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTresultado = new javax.swing.JTable();
        Blimpiar = new javax.swing.JButton();
        Bborrar = new javax.swing.JButton();
        Bactualizar = new javax.swing.JButton();
        Bbuscar = new javax.swing.JButton();
        Bguardar = new javax.swing.JButton();
        BbuscarTodo = new javax.swing.JButton();

        setForeground(new java.awt.Color(240, 240, 240));

        Lpaciente.setText("PACIENTE");

        jLabel1.setText("ID");

        jLabel2.setText("NOMBRE Y APELLIDO");

        jLabel3.setText("DOCUMENTO DE IDENTIDAD");

        jLabel4.setText("DIRECCION");

        TFdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFdniActionPerformed(evt);
            }
        });

        TFdireccion.setToolTipText("");

        jLabel5.setText("CELULAR");

        TFcelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFcelularActionPerformed(evt);
            }
        });

        JTresultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTresultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTresultadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTresultado);
        if (JTresultado.getColumnModel().getColumnCount() > 0) {
            JTresultado.getColumnModel().getColumn(0).setResizable(false);
            JTresultado.getColumnModel().getColumn(1).setResizable(false);
            JTresultado.getColumnModel().getColumn(2).setResizable(false);
            JTresultado.getColumnModel().getColumn(3).setResizable(false);
        }

        Blimpiar.setText("Limpiar");
        Blimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlimpiarActionPerformed(evt);
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

        Bbuscar.setText("Buscar");
        Bbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbuscarActionPerformed(evt);
            }
        });

        Bguardar.setText("Guardar");
        Bguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BguardarActionPerformed(evt);
            }
        });

        BbuscarTodo.setText("BUSCAR TODO");
        BbuscarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbuscarTodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TFcelular, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TFdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(317, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TFnombre)
                                    .addComponent(TFdni, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(TFid, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(BbuscarTodo)
                                        .addContainerGap(159, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Bbuscar)
                                        .addGap(184, 184, 184))))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(Lpaciente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(Blimpiar)
                        .addGap(53, 53, 53)
                        .addComponent(Bguardar)
                        .addGap(50, 50, 50)
                        .addComponent(Bborrar)
                        .addGap(54, 54, 54)
                        .addComponent(Bactualizar)))
                .addContainerGap(254, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lpaciente)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TFid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bbuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TFdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BbuscarTodo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TFcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Blimpiar)
                    .addComponent(Bborrar)
                    .addComponent(Bactualizar)
                    .addComponent(Bguardar))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFcelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFcelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFcelularActionPerformed

    private void TFdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFdniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFdniActionPerformed

    private void BlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlimpiarActionPerformed
       borrarFilas();
       TFnombre.setText(null);
       TFdni.setText(null);
       TFdireccion.setText(null);
       TFcelular.setText(null);
       TFid.setText(null);
    }//GEN-LAST:event_BlimpiarActionPerformed

    private void BborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BborrarActionPerformed
     try {
         Conexion con = new Conexion();
         PacienteData pd = new PacienteData(con);
         pd.borrarPaciente(Integer.parseInt(TFid.getText()));
         
         
         
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(PacienteF.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_BborrarActionPerformed

    private void BactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BactualizarActionPerformed
     try {
         Conexion con = new Conexion();
         PacienteData pd = new PacienteData(con);
         Paciente nuevo = new Paciente();
         nuevo.setIdPaciente(Integer.parseInt(TFid.getText()));
         nuevo.setNombre(TFnombre.getText());
         nuevo.setDni(TFdni.getText());
         nuevo.setDomicilio(TFdireccion.getText());
         nuevo.setCelular(TFcelular.getText());
         pd.actualizarPaciente2(nuevo);
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(PacienteF.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_BactualizarActionPerformed

    private void BbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbuscarActionPerformed
        try {
            borrarFilas();
            Conexion con = new Conexion();
            PacienteData pd = new PacienteData(con);
            Paciente nuevo = new Paciente();
            nuevo = pd.buscarPaciente(Integer.parseInt(TFid.getText()));
            TFnombre.setText(nuevo.getNombre());
            TFdni.setText(nuevo.getDni());
            TFdireccion.setText(nuevo.getDomicilio());
            TFcelular.setText(nuevo.getCelular());        
            modelo.addRow(new Object[]{nuevo.getIdPaciente() ,nuevo.getNombre(),nuevo.getDni(), nuevo.getDomicilio(),nuevo.getCelular()});
    
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PacienteF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BbuscarActionPerformed
    public void armarCabezeraTabla()
    {
        ArrayList<Object> columnas = new ArrayList<Object>();
        columnas.add("idPaciente");
        columnas.add("Nombre");
        columnas.add("Dni");
        columnas.add("Domicilio");
        columnas.add("Celular");
         for(Object it:columnas)
         {
            modelo.addColumn(it);
            
         }
         JTresultado.setModel(modelo);
    }
     public void borrarFilas()
     {
     int a = modelo.getRowCount()-1;
      for(int i = a;i>=0;i--){
      modelo.removeRow(i);
      }
    }
    private void BguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BguardarActionPerformed
        try {
            Conexion con = new Conexion();
            PacienteData pd = new PacienteData(con);
            Paciente nuevo = new Paciente();
            nuevo.setNombre(TFnombre.getText());
            nuevo.setDni (TFdni.getText());
            nuevo.setDomicilio(TFdireccion.getText());
            nuevo.setCelular(TFcelular.getText());
            pd.guardarPaciente(nuevo);
          
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PacienteF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BguardarActionPerformed

    private void BbuscarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbuscarTodoActionPerformed
          
     try {
         borrarFilas();
         Conexion con = new Conexion();
         PacienteData pd = new PacienteData(con);
         List<Paciente> lista = pd.obtenerPaciente();
         for(Paciente m:lista){
            modelo.addRow(new Object[]{m.getIdPaciente(),m.getNombre(),m.getDni(),m.getDomicilio(),m.getCelular()});
             
          }  
         
         // TODO add your handling code here:
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(PacienteF.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_BbuscarTodoActionPerformed

    private void JTresultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTresultadoMouseClicked
        int index = JTresultado.getSelectedRow();
        TableModel model = JTresultado.getModel();
        String value1 = model.getValueAt(index, 0).toString();
        String value2 = model.getValueAt(index, 1).toString();
        String value3 = model.getValueAt(index, 2).toString();  
        String value4 = model.getValueAt(index, 3).toString();
        String value5 = model.getValueAt(index, 4).toString();
        TFid.setText(value1);
        TFnombre.setText(value2);
        TFdni.setText(value3);
        TFdireccion.setText(value4);
        TFcelular.setText(value5);   
        
    }//GEN-LAST:event_JTresultadoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bactualizar;
    private javax.swing.JButton Bborrar;
    private javax.swing.JButton Bbuscar;
    private javax.swing.JButton BbuscarTodo;
    private javax.swing.JButton Bguardar;
    private javax.swing.JButton Blimpiar;
    private javax.swing.JTable JTresultado;
    private javax.swing.JLabel Lpaciente;
    private javax.swing.JTextField TFcelular;
    private javax.swing.JTextField TFdireccion;
    private javax.swing.JTextField TFdni;
    private javax.swing.JTextField TFid;
    private javax.swing.JTextField TFnombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
