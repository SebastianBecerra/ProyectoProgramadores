/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import nutricionista.modelos.Conexion;
import nutricionista.modelos.Dieta;
import nutricionista.modelos.DietaData;
import nutricionista.modelos.Paciente;

/**
 *
 * @author RealEnvido
 */
public class dietaF extends javax.swing.JInternalFrame {

     private DefaultTableModel modelo;
     private boolean aux  ;    
             /**
     
     * Creates new form dietaF
     */
    public dietaF() {
        initComponents();
        modelo = new DefaultTableModel();
        armarCabezeraTabla();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        TFidDieta = new javax.swing.JTextField();
        TFidPaciente = new javax.swing.JTextField();
        TFfechaInicial = new javax.swing.JTextField();
        TFfechaFinal = new javax.swing.JTextField();
        TFpesoInicial = new javax.swing.JTextField();
        TFpesoBuscado = new javax.swing.JTextField();
        Bbuscar = new javax.swing.JButton();
        Bactualizar = new javax.swing.JButton();
        Bborrar = new javax.swing.JButton();
        Bguardar = new javax.swing.JButton();
        BbuscarTodo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTresultadosDieta = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Blimpiar = new javax.swing.JButton();
        Batras = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        TFcomportamiento = new javax.swing.JTextField();
        Bcomportamiento = new javax.swing.JButton();

        TFidDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFidDietaActionPerformed(evt);
            }
        });

        TFidPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFidPacienteActionPerformed(evt);
            }
        });

        TFfechaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFfechaInicialActionPerformed(evt);
            }
        });

        TFpesoInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFpesoInicialActionPerformed(evt);
            }
        });

        Bbuscar.setText("Buscar");
        Bbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbuscarActionPerformed(evt);
            }
        });

        Bactualizar.setText("Actualizar");
        Bactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BactualizarActionPerformed(evt);
            }
        });

        Bborrar.setText("Borrar");
        Bborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BborrarActionPerformed(evt);
            }
        });

        Bguardar.setText("Guardar");
        Bguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BguardarActionPerformed(evt);
            }
        });

        BbuscarTodo.setText("BuscarTodo");
        BbuscarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbuscarTodoActionPerformed(evt);
            }
        });

        JTresultadosDieta.setModel(new javax.swing.table.DefaultTableModel(
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
        JTresultadosDieta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTresultadosDietaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTresultadosDieta);

        jLabel1.setText("idDieta");

        jLabel2.setToolTipText("");

        jLabel3.setText("Fecha Inicial");

        jLabel4.setText("FechaFinal");

        jLabel5.setText("Peso Inicial");

        jLabel6.setText("Peso Buscado");

        jLabel7.setText("idPaciente");

        Blimpiar.setText("Limpiar");
        Blimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlimpiarActionPerformed(evt);
            }
        });

        Batras.setText("Atras");
        Batras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatrasActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("PACIENTES QUE DEBEN BAJAR MAS DE UNA CANTIDAD DE KILOS DADOS");

        TFcomportamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFcomportamientoActionPerformed(evt);
            }
        });

        Bcomportamiento.setText("BUSCAR");
        Bcomportamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcomportamientoActionPerformed(evt);
            }
        });

        escritorio.setLayer(TFidDieta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(TFidPaciente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(TFfechaInicial, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(TFfechaFinal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(TFpesoInicial, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(TFpesoBuscado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(Bbuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(Bactualizar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(Bborrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(Bguardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(BbuscarTodo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(Blimpiar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(Batras, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(TFcomportamiento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(Bcomportamiento, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel1)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel3)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel4)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel5))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(683, 683, 683)
                        .addComponent(Batras))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Bbuscar)
                            .addComponent(TFidDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(escritorioLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(TFidPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TFfechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(escritorioLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(Bactualizar)
                                .addGap(18, 18, 18)
                                .addComponent(Bborrar)))
                        .addGap(14, 14, 14)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFfechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(escritorioLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(Bguardar)))
                        .addGap(18, 18, 18)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(escritorioLayout.createSequentialGroup()
                                .addComponent(TFpesoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TFpesoBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(escritorioLayout.createSequentialGroup()
                                .addComponent(BbuscarTodo)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel6))))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(TFcomportamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Blimpiar)
                            .addComponent(Bcomportamiento))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFfechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFfechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFidPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFpesoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFpesoBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFidDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bbuscar)
                    .addComponent(Bactualizar)
                    .addComponent(Bborrar)
                    .addComponent(Bguardar)
                    .addComponent(BbuscarTodo)
                    .addComponent(Blimpiar))
                .addGap(31, 31, 31)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TFcomportamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bcomportamiento))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(Batras)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(escritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFidDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFidDietaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFidDietaActionPerformed

    private void BcomportamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcomportamientoActionPerformed
        try {
            borrarFilas();

            armarCabezaTabla23();
            Conexion con = new Conexion();
            DietaData dd = new DietaData(con);
            List<Paciente> lista = dd.buscarPacientesQueDebenBajar(Integer.parseInt(TFcomportamiento.getText()));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dietaF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BcomportamientoActionPerformed

    private void TFcomportamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFcomportamientoActionPerformed

    }//GEN-LAST:event_TFcomportamientoActionPerformed

    private void BatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatrasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        principal formulario = new principal();
        formulario.setVisible(true);
        escritorio.add(formulario);
    }//GEN-LAST:event_BatrasActionPerformed

    private void BlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlimpiarActionPerformed
        TFidDieta.setText(null);
        TFidPaciente.setText(null);
        TFfechaInicial.setText(null);
        TFfechaFinal.setText(null);
        TFpesoInicial.setText(null);
        TFpesoBuscado.setText(null);
        borrarFilas();
    }//GEN-LAST:event_BlimpiarActionPerformed

    private void JTresultadosDietaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTresultadosDietaMouseClicked
        int index = JTresultadosDieta.getSelectedRow();
        TableModel model = JTresultadosDieta.getModel();
        String value1 = model.getValueAt(index, 0).toString();
        String value2 = model.getValueAt(index, 1).toString();
        String value3 = model.getValueAt(index, 2).toString();
        String value4 = model.getValueAt(index, 3).toString();
        String value5 = model.getValueAt(index, 4).toString();
        String value6 = model.getValueAt(index, 5).toString();
        TFidDieta.setText(value1);
        TFidPaciente.setText(value2);
        TFfechaInicial.setText(value3);
        TFfechaFinal.setText(value4);
        TFpesoInicial.setText(value5);
        TFpesoBuscado.setText(value6);
    }//GEN-LAST:event_JTresultadosDietaMouseClicked

    private void BbuscarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbuscarTodoActionPerformed
        try {
            borrarFilas();
            Conexion con = new Conexion();
            DietaData dd = new DietaData(con);
            List<Dieta> lista = dd.obtenerDietas3();
            for(Dieta m:lista){
                modelo.addRow(new Object[]{m.getId(),m.getPaciente(),m.getFechaInicial(),m.getFechaFinal(),m.getPesoInicial(),m.getPesoFinal()});

            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dietaF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BbuscarTodoActionPerformed

    private void BguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BguardarActionPerformed
        try {
            Conexion con = new Conexion();
            DietaData dd = new DietaData(con);
            Dieta nueva = new Dieta();
            nueva.setPaciente(Integer.parseInt(TFidPaciente.getText()));
            nueva.setFechaInicial(LocalDate.parse(TFfechaInicial.getText()));
            nueva.setFechaFinal(LocalDate.parse(TFfechaFinal.getText()));
            nueva.setPesoInicial(Float.parseFloat(TFpesoInicial.getText()));
            nueva.setPesoFinal(Float.parseFloat(TFpesoBuscado.getText()));
            dd.guardarDieta(nueva);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dietaF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BguardarActionPerformed

    private void BborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BborrarActionPerformed
        try {
            Conexion con = new Conexion();
            DietaData dd = new DietaData(con);
            dd.borrarDieta2(Integer.parseInt(TFidDieta.getText()));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dietaF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BborrarActionPerformed

    private void BactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BactualizarActionPerformed
        try {
            Conexion con = new Conexion();
            DietaData dd = new DietaData(con);
            Dieta nueva = new Dieta();
            nueva.setId(Integer.parseInt(TFidPaciente.getText()));
            nueva.setPaciente(Integer.parseInt(TFidPaciente.getText()));
            nueva.setFechaInicial(LocalDate.parse(TFfechaInicial.getText()));
            nueva.setFechaFinal(LocalDate.parse(TFfechaFinal.getText()));
            nueva.setPesoInicial(Float.parseFloat(TFpesoInicial.getText()));
            nueva.setPesoFinal(Float.parseFloat(TFpesoBuscado.getText()));

            dd.actualizarDieta(nueva);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dietaF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BactualizarActionPerformed

    private void BbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbuscarActionPerformed
        try {
            borrarFilas();
            Conexion con = new Conexion();
            DietaData dd = new DietaData(con);
            Dieta nueva = new Dieta();
            nueva = dd.buscarDieta(Integer.parseInt(TFidDieta.getText()));
            modelo.addRow(new Object[]{nueva.getId(),nueva.getPaciente(),nueva.getFechaInicial(), nueva.getFechaFinal(),nueva.getPesoInicial(),nueva.getPesoFinal()});

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dietaF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BbuscarActionPerformed

    private void TFpesoInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFpesoInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFpesoInicialActionPerformed

    private void TFfechaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFfechaInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFfechaInicialActionPerformed

    private void TFidPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFidPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFidPacienteActionPerformed

public void armarCabezeraTabla()
    {
        ArrayList<Object> columnas = new ArrayList<Object>();
        
        columnas.add("idDieta");
        columnas.add("idPaciente");
        columnas.add("Fecha Inicio");
        columnas.add("Fecha Final");
        columnas.add("Peso Inicial");
        columnas.add("Peso Buscado");
         for(Object it:columnas)
         {
            modelo.addColumn(it);
            
         }
         JTresultadosDieta.setModel(modelo);
         
         Class<?> col_class = JTresultadosDieta.getColumnClass(4);
         JTresultadosDieta.setDefaultEditor(col_class, null);
         
    }
public void armarCabezaTabla23()
{
        ArrayList<Object> columnas = new ArrayList<Object>();
        columnas.clear();
        
        columnas.add("idPaciente");
        columnas.add("nombre");
        columnas.add("dni");
        columnas.add("domicilio");
        columnas.add("celular");
        
         for(Object it:columnas)
         {
            modelo.addColumn(it);
            
         }
         JTresultadosDieta.setModel(modelo);


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
    private javax.swing.JButton BbuscarTodo;
    private javax.swing.JButton Bcomportamiento;
    private javax.swing.JButton Bguardar;
    private javax.swing.JButton Blimpiar;
    private javax.swing.JTable JTresultadosDieta;
    private javax.swing.JTextField TFcomportamiento;
    private javax.swing.JTextField TFfechaFinal;
    private javax.swing.JTextField TFfechaInicial;
    private javax.swing.JTextField TFidDieta;
    private javax.swing.JTextField TFidPaciente;
    private javax.swing.JTextField TFpesoBuscado;
    private javax.swing.JTextField TFpesoInicial;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}