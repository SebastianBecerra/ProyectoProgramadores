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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import nutricionista.modelos.Conexion;
import nutricionista.modelos.Dieta;
import nutricionista.modelos.DietaComidaData;
import nutricionista.modelos.DietaComidaPacienteComida;
import nutricionista.modelos.DietaData;
import nutricionista.modelos.Paciente;
import nutricionista.modelos.PacienteData;


public class dietaF extends javax.swing.JInternalFrame {

     private DefaultTableModel modelo;
     private DefaultTableModel modelo2;

     private boolean aux  ;   // 
     private PacienteData pd ;
     private  List<Paciente> lista = null;
     
     /**
     
     * Creates new form dietaF
     */
    public dietaF() {
         try {
             Conexion con = new Conexion();
             pd = new PacienteData(con);
             initComponents();
             modelo = new DefaultTableModel();
             modelo2 = new DefaultTableModel();
             armarCabezeraTabla();
             armarCabezaTabla2();
             
             
             List<Paciente>lista  = pd.obtenerPaciente();  // obtiene pacientes y los agrega al ComboBox
 
             for(Paciente it:lista){
                 CBid.addItem(it.getNombre());
                 CBid.setSelectedItem(null);
                 
             }

             
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(dietaF.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTresultadosPaciente = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        CBid = new javax.swing.JComboBox<>();

        setClosable(true);

        TFidDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFidDietaActionPerformed(evt);
            }
        });
        TFidDieta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFidDietaKeyTyped(evt);
            }
        });

        TFidPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFidPacienteActionPerformed(evt);
            }
        });
        TFidPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFidPacienteKeyTyped(evt);
            }
        });

        TFfechaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFfechaInicialActionPerformed(evt);
            }
        });
        TFfechaInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFfechaInicialKeyTyped(evt);
            }
        });

        TFfechaFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFfechaFinalKeyTyped(evt);
            }
        });

        TFpesoInicial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TFpesoInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFpesoInicialActionPerformed(evt);
            }
        });
        TFpesoInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFpesoInicialKeyTyped(evt);
            }
        });

        TFpesoBuscado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFpesoBuscadoKeyTyped(evt);
            }
        });

        Bbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoBuscar.png"))); // NOI18N
        Bbuscar.setText("Buscar");
        Bbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbuscarActionPerformed(evt);
            }
        });

        Bactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoActualizar.png"))); // NOI18N
        Bactualizar.setText("Actualizar");
        Bactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BactualizarActionPerformed(evt);
            }
        });

        Bborrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoBorrar.png"))); // NOI18N
        Bborrar.setText("Borrar");
        Bborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BborrarActionPerformed(evt);
            }
        });

        Bguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoGuardar.png"))); // NOI18N
        Bguardar.setText("Guardar");
        Bguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BguardarActionPerformed(evt);
            }
        });

        BbuscarTodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoBuscar.png"))); // NOI18N
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

        Blimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoLimpiar.png"))); // NOI18N
        Blimpiar.setText("Limpiar");
        Blimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlimpiarActionPerformed(evt);
            }
        });

        Batras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoAtras.png"))); // NOI18N
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
        TFcomportamiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFcomportamientoKeyTyped(evt);
            }
        });

        Bcomportamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoBuscar.png"))); // NOI18N
        Bcomportamiento.setText("BUSCAR");
        Bcomportamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcomportamientoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jLabel9.setText("-Dieta-");

        JTresultadosPaciente.setModel(new javax.swing.table.DefaultTableModel(
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
                true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(JTresultadosPaciente);
        if (JTresultadosPaciente.getColumnModel().getColumnCount() > 0) {
            JTresultadosPaciente.getColumnModel().getColumn(0).setResizable(false);
            JTresultadosPaciente.getColumnModel().getColumn(1).setResizable(false);
            JTresultadosPaciente.getColumnModel().getColumn(2).setResizable(false);
            JTresultadosPaciente.getColumnModel().getColumn(3).setResizable(false);
        }

        jSeparator1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N

        CBid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(Batras)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Bcomportamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TFcomportamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Bguardar)
                                    .addGap(384, 384, 384)
                                    .addComponent(Blimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(TFfechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(9, 9, 9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(34, 34, 34)
                                            .addComponent(Bborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(4, 4, 4)
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18)
                                            .addComponent(TFfechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(24, 24, 24)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TFpesoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(Bactualizar)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TFpesoBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(CBid, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TFidPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(TFidDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(40, 40, 40)
                                    .addComponent(Bbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(40, 40, 40)
                                    .addComponent(BbuscarTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jLabel9)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(Batras))
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TFidPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bbuscar)
                    .addComponent(BbuscarTodo)
                    .addComponent(CBid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(TFidDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TFfechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(TFfechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(TFpesoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(TFpesoBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bguardar)
                    .addComponent(Bborrar)
                    .addComponent(Bactualizar)
                    .addComponent(Blimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 12, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TFcomportamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bcomportamiento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        setBounds(0, 0, 895, 625);
    }// </editor-fold>//GEN-END:initComponents

    private void BcomportamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcomportamientoActionPerformed
        try {
            borrarFilas2();
                
           // armarCabezaTabla23();
            Conexion con = new Conexion();
            DietaData dd = new DietaData(con);
            List<Paciente> lista = dd.buscarPacientesQueDebenBajar5(Integer.parseInt(TFcomportamiento.getText()));
             for(Paciente m:lista){
                modelo2.addRow(new Object[]{m.getIdPaciente(), m.getNombre(),m.getDni(),m.getDomicilio(),m.getCelular()});

            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dietaF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BcomportamientoActionPerformed

    private void TFcomportamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFcomportamientoActionPerformed

    }//GEN-LAST:event_TFcomportamientoActionPerformed

    private void BatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatrasActionPerformed

        this.moveToBack();
        this.setVisible(false);

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
            DietaComidaData dc = new DietaComidaData(con);
            List<DietaComidaPacienteComida> DCD = null;
            DCD = dc.buscarDietaComidaPorIdDieta(Integer.parseInt(TFidDieta.getText()));
            if(DCD != null)
            {
                dc.borrarDietaComida(Integer.parseInt(TFidDieta.getText()));
                dd.borrarDieta2(Integer.parseInt(TFidDieta.getText()));
            }
            else
            {
               dd.borrarDieta2(Integer.parseInt(TFidDieta.getText())); 
            }
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
            nueva = dd.buscarDietaporPaciente(Integer.parseInt(TFidPaciente.getText()));
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

    private void TFidDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFidDietaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFidDietaActionPerformed

    private void TFidDietaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFidDietaKeyTyped
        
        if(Character.isLetter(evt.getKeyChar())){ /*si en el campo de tecto para id lo que se ingresa es una letra lanza la siguiente
                                                       exepcion*/
          
      getToolkit().beep();
      evt.consume();
          JOptionPane.showMessageDialog(rootPane,"Ingrese Solo Numeros");
      }
      else{//caso contrario no hace nada 
      
      
      }
        
        
        
        
        
        
    }//GEN-LAST:event_TFidDietaKeyTyped

    private void TFidPacienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFidPacienteKeyTyped
        
        if(Character.isLetter(evt.getKeyChar())){ /*si en el campo de tecto para id lo que se ingresa es una letra lanza la siguiente
                                                       exepcion*/
          
      getToolkit().beep();
      evt.consume();
          JOptionPane.showMessageDialog(rootPane,"Ingrese Solo Numeros");
      }
      else{//caso contrario no hace nada 
      
      
      }
        
        
        
    }//GEN-LAST:event_TFidPacienteKeyTyped

    private void TFfechaInicialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFfechaInicialKeyTyped
       if(Character.isLetter(evt.getKeyChar())){ /*si en el campo de tecto para id lo que se ingresa es una letra lanza la siguiente
                                                       exepcion*/
          
      getToolkit().beep();
      evt.consume();
          JOptionPane.showMessageDialog(rootPane,"Ingrese Solo Numeros");
      }
      else{//caso contrario no hace nada 
      
      
      }
    }//GEN-LAST:event_TFfechaInicialKeyTyped

    private void TFfechaFinalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFfechaFinalKeyTyped
      if(Character.isLetter(evt.getKeyChar())){ /*si en el campo de tecto para id lo que se ingresa es una letra lanza la siguiente
                                                       exepcion*/
          
      getToolkit().beep();
      evt.consume();
          JOptionPane.showMessageDialog(rootPane,"Ingrese Solo Numeros");
      }
      else{//caso contrario no hace nada 
      
      
      }
    }//GEN-LAST:event_TFfechaFinalKeyTyped

    private void TFpesoInicialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFpesoInicialKeyTyped
     if(Character.isLetter(evt.getKeyChar())){ /*si en el campo de tecto para id lo que se ingresa es una letra lanza la siguiente
                                                       exepcion*/
          
      getToolkit().beep();
      evt.consume();
          JOptionPane.showMessageDialog(rootPane,"Ingrese Solo Numeros");
      }
      else{//caso contrario no hace nada 
      
      
      }
    }//GEN-LAST:event_TFpesoInicialKeyTyped

    private void TFpesoBuscadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFpesoBuscadoKeyTyped
     if(Character.isLetter(evt.getKeyChar())){ /*si en el campo de tecto para id lo que se ingresa es una letra lanza la siguiente
                                                       exepcion*/
          
      getToolkit().beep();
      evt.consume();
          JOptionPane.showMessageDialog(rootPane,"Ingrese Solo Numeros");
      }
      else{//caso contrario no hace nada 
      
      
      }
    }//GEN-LAST:event_TFpesoBuscadoKeyTyped

    private void TFcomportamientoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFcomportamientoKeyTyped
      if(Character.isLetter(evt.getKeyChar())){ /*si en el campo de tecto para id lo que se ingresa es una letra lanza la siguiente
                                                       exepcion*/
          
      getToolkit().beep();
      evt.consume();
          JOptionPane.showMessageDialog(rootPane,"Ingrese Solo Numeros");
      }
      else{//caso contrario no hace nada 
      
      
      }
    }//GEN-LAST:event_TFcomportamientoKeyTyped

    private void CBidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBidActionPerformed
      if(CBid.getSelectedItem() != null) // Si el ComboBox tiene seleccionado algo
       {  
              Paciente auxPaciente = new Paciente();
              auxPaciente = pd.buscarPacienteNombre(CBid.getSelectedItem().toString());
              TFidPaciente.setText(Integer.toString(auxPaciente.getIdPaciente()));

       }
      else
      {
           TFidPaciente.setText(null);
      }
      
     
    }//GEN-LAST:event_CBidActionPerformed

public void armarCabezeraTabla()
    {
        ArrayList<Object> columnas = new ArrayList<Object>();
        
        columnas.add("idDieta");
        columnas.add("idPaciente");
        columnas.add("Fecha Inicio");    // Arma cabezera
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
public void armarCabezaTabla2()
{
        ArrayList<Object> columnas = new ArrayList<Object>();
      
        
        columnas.add("idPaciente");
        columnas.add("nombre");
        columnas.add("dni");
        columnas.add("domicilio");
        columnas.add("celular");
        
         for(Object it:columnas)
         {
            modelo2.addColumn(it);
            
         }
         JTresultadosPaciente.setModel(modelo2);
         Class<?> col_class = JTresultadosPaciente.getColumnClass(4);
         JTresultadosPaciente.setDefaultEditor(col_class, null);



}
public void borrarFilas()
     {
     int a = modelo.getRowCount()-1;
      for(int i = a;i>=0;i--){
      modelo.removeRow(i);
      }
    }
public void borrarFilas2()
     {
     int a = modelo2.getRowCount()-1;
      for(int i = a;i>=0;i--){
      modelo2.removeRow(i);
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
    private javax.swing.JComboBox<String> CBid;
    private javax.swing.JTable JTresultadosDieta;
    private javax.swing.JTable JTresultadosPaciente;
    private javax.swing.JTextField TFcomportamiento;
    private javax.swing.JTextField TFfechaFinal;
    private javax.swing.JTextField TFfechaInicial;
    private javax.swing.JTextField TFidDieta;
    private javax.swing.JTextField TFidPaciente;
    private javax.swing.JTextField TFpesoBuscado;
    private javax.swing.JTextField TFpesoInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
