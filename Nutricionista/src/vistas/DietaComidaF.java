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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import nutricionista.modelos.Comida;
import nutricionista.modelos.ComidaData;
import nutricionista.modelos.Conexion;
import nutricionista.modelos.Dieta;
import nutricionista.modelos.DietaComida;
import nutricionista.modelos.DietaComidaData;
import nutricionista.modelos.DietaComidaPacienteComida;
import nutricionista.modelos.DietaData;
import nutricionista.modelos.Paciente;
import nutricionista.modelos.PacienteData;

/**
 *
 * @author RealEnvido
 */
public class DietaComidaF extends javax.swing.JInternalFrame {
private DefaultTableModel modelo;
private ComidaData cd;
    /**
     * Creates new form DietaComidaF
     */
    public DietaComidaF() {
    try {
        initComponents();
        Conexion con = new Conexion();
        cd = new ComidaData(con);
        modelo = new DefaultTableModel();
        armarCabezeraTabla();
        List<Comida> lista = cd.obtenerTodasLasComidas();
        for(Comida it:lista){
           CBcomidas.addItem(it.getNombre());
            
        }
        CBcomidas.setSelectedItem(null);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(DietaComidaF.class.getName()).log(Level.SEVERE, null, ex);
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

        CBcomidas = new javax.swing.JComboBox<>();
        TFnombre = new javax.swing.JTextField();
        TFcalorias = new javax.swing.JTextField();
        TFdetalles = new javax.swing.JTextField();
        TFsumaCalorias = new javax.swing.JTextField();
        BsumaCalorias = new javax.swing.JButton();
        Bagregar = new javax.swing.JButton();
        TFdni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTresutadosDietaComida = new javax.swing.JTable();
        Bbuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        LidDieta = new javax.swing.JLabel();
        TFborrarNombre = new javax.swing.JTextField();
        TFborrarCalorias = new javax.swing.JTextField();
        TFborrarDetalles = new javax.swing.JTextField();
        Bborrar = new javax.swing.JButton();
        TFborrarId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tiquetaNombre = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(895, 625));

        CBcomidas.setMaximumRowCount(100);
        CBcomidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBcomidasActionPerformed(evt);
            }
        });

        TFnombre.setEditable(false);
        TFnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFnombreActionPerformed(evt);
            }
        });

        TFcalorias.setEditable(false);

        TFdetalles.setEditable(false);

        TFsumaCalorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFsumaCaloriasActionPerformed(evt);
            }
        });

        BsumaCalorias.setBackground(java.awt.SystemColor.activeCaption);
        BsumaCalorias.setText("Sumar Calorias de la Dieta");
        BsumaCalorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsumaCaloriasActionPerformed(evt);
            }
        });

        Bagregar.setBackground(java.awt.SystemColor.activeCaption);
        Bagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoAgregarComida.png"))); // NOI18N
        Bagregar.setText("Agregar Comida");
        Bagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BagregarActionPerformed(evt);
            }
        });

        TFdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFdniActionPerformed(evt);
            }
        });
        TFdni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFdniKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("DNI PACIENTE:");

        JTresutadosDietaComida.setModel(new javax.swing.table.DefaultTableModel(
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
        JTresutadosDietaComida.setPreferredSize(new java.awt.Dimension(895, 625));
        JTresutadosDietaComida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTresutadosDietaComidaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTresutadosDietaComida);

        Bbuscar.setBackground(java.awt.SystemColor.activeCaption);
        Bbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoBuscar.png"))); // NOI18N
        Bbuscar.setText("BUSCAR");
        Bbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbuscarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("ID de Dieta:");

        LidDieta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        TFborrarCalorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFborrarCaloriasActionPerformed(evt);
            }
        });

        Bborrar.setBackground(java.awt.SystemColor.activeCaption);
        Bborrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoBorrar.png"))); // NOI18N
        Bborrar.setText("Borrar Comida");
        Bborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BborrarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Detalles:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Calorias:");

        tiquetaNombre.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Nombre:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoAtras.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jLabel9.setText("-Agregar Comida a Dieta-");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/filete.png"))); // NOI18N

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lechuga.png"))); // NOI18N

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/queso.png"))); // NOI18N

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sopa.png"))); // NOI18N

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pescado.png"))); // NOI18N

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/manzana.png"))); // NOI18N

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sandwich.png"))); // NOI18N

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/filete.png"))); // NOI18N

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pizza.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 201, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(CBcomidas, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Bagregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TFcalorias)
                                    .addComponent(TFdetalles)
                                    .addComponent(TFnombre)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TFborrarId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(TFborrarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TFborrarCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(BsumaCalorias))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TFborrarDetalles, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                    .addComponent(TFsumaCalorias))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Bborrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(206, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LidDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tiquetaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TFdni, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11))
                                    .addComponent(Bbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel15)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel13)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel14))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel10)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel12))))))
                        .addGap(0, 286, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(TFdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Bbuscar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(tiquetaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(LidDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Bagregar)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TFnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CBcomidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(TFdetalles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel12)))
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TFcalorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addComponent(jLabel13)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(64, 64, 64)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BsumaCalorias)
                    .addComponent(TFsumaCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFborrarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFborrarCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFborrarDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bborrar)
                    .addComponent(TFborrarId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFdniActionPerformed
        
    }//GEN-LAST:event_TFdniActionPerformed

    private void BbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbuscarActionPerformed
    try {
        borrarFilas();
        Conexion con = new Conexion();
        DietaData dd = new DietaData(con);
        DietaComidaData dcd = new DietaComidaData(con);
        PacienteData pc = new PacienteData(con);
        Paciente nuevo = pc.buscarPacienteDNI(TFdni.getText());
       tiquetaNombre.setText(nuevo.getNombre());
        List<DietaComidaPacienteComida> dietas = null;
        dietas = dcd.buscarDietaComidaPorPaciente8(TFdni.getText());
        LidDieta.setText(Integer.toString(dd.buscarDietaIDcondni(TFdni.getText()).getId()));
        
        for(DietaComidaPacienteComida m:dietas){
           
           modelo.addRow(new Object[]{m.getIdDieta(),m.getIdComida(),m.getNombreComida(),m.getCalorias(),m.getDetalles()});
            //System.out.println(m.getNombreComida());
          }  
       
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(DietaComidaF.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_BbuscarActionPerformed

    private void CBcomidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBcomidasActionPerformed
       if(CBcomidas.getSelectedItem() != null)
       {
           try {
               Conexion con = new Conexion();
               ComidaData cc = new ComidaData(con);
               TFnombre.setText(CBcomidas.getSelectedItem().toString());
               TFcalorias.setText(Double.toString(cc.buscarComidaPorNombre(CBcomidas.getSelectedItem().toString()).getCalorias()));
               TFdetalles.setText(cc.buscarComidaPorNombre(CBcomidas.getSelectedItem().toString()).getDetalle());
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(DietaComidaF.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       else{
        TFnombre.setText(null);
        TFcalorias.setText(null);
        TFdetalles.setText(null);
       }
    }//GEN-LAST:event_CBcomidasActionPerformed

    private void TFnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFnombreActionPerformed

    private void BagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BagregarActionPerformed
    try {
        
        Conexion con = new Conexion();
        DietaComidaData dcd = new DietaComidaData(con);
        ComidaData cc = new ComidaData(con);
        DietaData dd = new DietaData(con);
        Dieta dieta = new Dieta();
        Comida comida = new Comida();
        DietaComida dietacomida = new DietaComida();
        
   
        comida = cd.buscarComidaPorNombre(TFnombre.getText());
        dietacomida.setIdDieta(Integer.parseInt(LidDieta.getText()));
        dietacomida.setIdComida(comida.getId());
        System.out.println(dieta.getId());
        System.out.println(comida.getNombre());


        dcd.guardarDietaComida(dietacomida);
        
        
        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(DietaComidaF.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_BagregarActionPerformed

    private void TFsumaCaloriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFsumaCaloriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFsumaCaloriasActionPerformed

    private void BsumaCaloriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsumaCaloriasActionPerformed
    try {
        Conexion con = new Conexion();
        DietaData dd = new DietaData(con);
        ComidaData cd = new ComidaData(con);
        List <Comida> listaSumarCalorias;
        int caloriasTotales = 0;
        listaSumarCalorias = dd.CantidadCaloriasDieta4(Integer.parseInt((LidDieta.getText())));
        caloriasTotales = cd.sumaDeCaloriasComidas(listaSumarCalorias);
        TFsumaCalorias.setText(Integer.toString(caloriasTotales));
       
        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(DietaComidaF.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_BsumaCaloriasActionPerformed

    private void TFborrarCaloriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFborrarCaloriasActionPerformed
     
    }//GEN-LAST:event_TFborrarCaloriasActionPerformed

    private void JTresutadosDietaComidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTresutadosDietaComidaMouseClicked
        int index = JTresutadosDietaComida.getSelectedRow();
        TableModel model = JTresutadosDietaComida.getModel();
        String value4 = model.getValueAt(index, 1).toString();
        String value1 = model.getValueAt(index, 2).toString();
        String value2 = model.getValueAt(index, 3).toString();
        String value3 = model.getValueAt(index, 4).toString();    
        
        TFborrarNombre.setText(value1);
        TFborrarCalorias.setText(value2);
        TFborrarDetalles.setText(value3);
        TFborrarId.setText(value4);
        
    }//GEN-LAST:event_JTresutadosDietaComidaMouseClicked

    private void BborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BborrarActionPerformed
   try {
        Conexion con = new Conexion();
        DietaComidaData dd = new DietaComidaData(con);
        dd.borrarDietaComida2(Integer.parseInt(TFborrarId.getText()));
         
        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(DietaComidaF.class.getName()).log(Level.SEVERE, null, ex);
    }        // TODO add your handling code here:
    }//GEN-LAST:event_BborrarActionPerformed

    private void TFdniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFdniKeyTyped
       if(Character.isLetter(evt.getKeyChar())){ /*si en el campo de tecto para id lo que se ingresa es una letra lanza la siguiente
                                                       exepcion*/
          
      getToolkit().beep();
      evt.consume();
          JOptionPane.showMessageDialog(rootPane,"Ingrese Solo Numeros");
      }
      else{//caso contrario no hace nada 
      
      
      }
    }//GEN-LAST:event_TFdniKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.setVisible(false);
       this.moveToBack();
    }//GEN-LAST:event_jButton1ActionPerformed
     public void armarCabezeraTabla()
    {
        ArrayList<Object> columnas = new ArrayList<Object>();
        columnas.add("idDieta");
        columnas.add("idComida");
        columnas.add("Comida");
        columnas.add("Calorias");
        columnas.add("Detalles");
         for(Object it:columnas)
         {
            modelo.addColumn(it);
            
         }
         JTresutadosDietaComida.setModel(modelo);
    }
      public void borrarFilas()
     {
     int a = modelo.getRowCount()-1;
      for(int i = a;i>=0;i--){
      modelo.removeRow(i);
      }
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bagregar;
    private javax.swing.JButton Bborrar;
    private javax.swing.JButton Bbuscar;
    private javax.swing.JButton BsumaCalorias;
    private javax.swing.JComboBox<String> CBcomidas;
    private javax.swing.JTable JTresutadosDietaComida;
    private javax.swing.JLabel LidDieta;
    private javax.swing.JTextField TFborrarCalorias;
    private javax.swing.JTextField TFborrarDetalles;
    private javax.swing.JTextField TFborrarId;
    private javax.swing.JTextField TFborrarNombre;
    private javax.swing.JTextField TFcalorias;
    private javax.swing.JTextField TFdetalles;
    private javax.swing.JTextField TFdni;
    private javax.swing.JTextField TFnombre;
    private javax.swing.JTextField TFsumaCalorias;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tiquetaNombre;
    // End of variables declaration//GEN-END:variables
}
