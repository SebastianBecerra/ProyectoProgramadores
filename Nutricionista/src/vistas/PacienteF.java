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
import nutricionista.modelos.Conexion;
import nutricionista.modelos.Dieta;
import nutricionista.modelos.DietaComidaData;
import nutricionista.modelos.DietaData;
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
        btAtras = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setClosable(true);
        setForeground(new java.awt.Color(240, 240, 240));
        setPreferredSize(new java.awt.Dimension(895, 625));

        Lpaciente.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        Lpaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lpaciente.setText("-PACIENTE-");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("NOMBRE Y APELLIDO");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("DOCUMENTO DE IDENTIDAD");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("DIRECCION");

        TFid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFidKeyTyped(evt);
            }
        });

        TFnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFnombreKeyTyped(evt);
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

        TFdireccion.setToolTipText("");
        TFdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFdireccionKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("CELULAR");

        TFcelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFcelularActionPerformed(evt);
            }
        });
        TFcelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFcelularKeyTyped(evt);
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

        Blimpiar.setBackground(java.awt.SystemColor.activeCaption);
        Blimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoLimpiar.png"))); // NOI18N
        Blimpiar.setText("Limpiar");
        Blimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlimpiarActionPerformed(evt);
            }
        });

        Bborrar.setBackground(java.awt.SystemColor.activeCaption);
        Bborrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoBorrar.png"))); // NOI18N
        Bborrar.setText("Borrar");
        Bborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BborrarActionPerformed(evt);
            }
        });

        Bactualizar.setBackground(java.awt.SystemColor.activeCaption);
        Bactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoActualizar.png"))); // NOI18N
        Bactualizar.setText("Actualizar");
        Bactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BactualizarActionPerformed(evt);
            }
        });

        Bbuscar.setBackground(java.awt.SystemColor.activeCaption);
        Bbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoBuscar.png"))); // NOI18N
        Bbuscar.setText("Buscar");
        Bbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbuscarActionPerformed(evt);
            }
        });

        Bguardar.setBackground(java.awt.SystemColor.activeCaption);
        Bguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoGuardar.png"))); // NOI18N
        Bguardar.setText("Guardar");
        Bguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BguardarActionPerformed(evt);
            }
        });

        BbuscarTodo.setBackground(java.awt.SystemColor.activeCaption);
        BbuscarTodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoBuscar.png"))); // NOI18N
        BbuscarTodo.setText("BUSCAR TODO");
        BbuscarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbuscarTodoActionPerformed(evt);
            }
        });

        btAtras.setBackground(new java.awt.Color(255, 255, 255));
        btAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoAtras.png"))); // NOI18N
        btAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtrasActionPerformed(evt);
            }
        });

        jLabel7.setText("Campo Obligatorio");

        jLabel8.setText("Campo Obligatorio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 100, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Lpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TFdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TFcelular, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TFdni, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TFnombre)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TFid, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Bbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BbuscarTodo)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(Bguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(Bborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Blimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(Bactualizar)
                        .addGap(7, 7, 7)))
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Lpaciente)
                    .addComponent(btAtras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TFid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bbuscar)
                    .addComponent(BbuscarTodo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFnombre)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TFdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TFdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TFcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Blimpiar)
                    .addComponent(Bborrar)
                    .addComponent(Bguardar)
                    .addComponent(Bactualizar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
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
     try { if(TFid.getText().length()>0){
         Conexion con = new Conexion();
         PacienteData pd = new PacienteData(con);
         DietaData dd = new DietaData(con);
         DietaComidaData dcd = new DietaComidaData(con);
         Dieta aux = new Dieta();
         aux = dd.buscarDietaporPaciente(Integer.parseInt(TFid.getText()));
         if(aux != null)
         {
          dcd.borrarDietaComida(aux.getId());
          dd.borrarDieta2(aux.getId());
          pd.borrarPaciente(Integer.parseInt(TFid.getText()));
         System.out.println("1");

         }
         else
         {                                     
          pd.borrarPaciente(Integer.parseInt(TFid.getText()));
           System.out.println("2");

         }
         
         
     }
     else{
     getToolkit().beep();
         JOptionPane.showMessageDialog(rootPane, "Para borrar Ingrese una ID valida");
             
     
     }
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
        try { if(TFid.getText().length()>0){//si en la caja de texto contiene un digito, realizada lo siquiente
            borrarFilas();
            Conexion con = new Conexion();
            PacienteData pd = new PacienteData(con);
            Paciente nuevo = new Paciente();
            if(pd.buscarPaciente(Integer.parseInt(TFid.getText()))== null){ /* otra exepcion, si el metodo buscar paciente retorna
                                                                                   un paciente vacio (null) lanza la siguiente exepcion*/
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "No se encontro Paciente Con ese ID");
            }
            else{
              nuevo = pd.buscarPaciente(Integer.parseInt(TFid.getText())); /* si el buscar paciente no retorna un paciente vacio realizara
                                                                            la siguiente operacion  */
            
            TFnombre.setText(nuevo.getNombre());
            TFdni.setText(nuevo.getDni());
            TFdireccion.setText(nuevo.getDomicilio());
            TFcelular.setText(nuevo.getCelular());        
            modelo.addRow(new Object[]{nuevo.getIdPaciente() ,nuevo.getNombre(),nuevo.getDni(), nuevo.getDomicilio(),nuevo.getCelular()});
    
            }
        }
        else{ // si la caja de texto no tiene un digito lanzara la siguiente exprecion 
        getToolkit().beep();
        JOptionPane.showMessageDialog(rootPane, "Ingrese Una ID Para Buscar");
        
        
        }
    }
        catch (ClassNotFoundException ex) {
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
            if(TFnombre.getText().length()>4 && TFdni.getText().length()>7){/* si la caja de texto nombre tiene mas 4 letras y la caja de dni tiene mas
                                                                             de 7 digitos entonces se podra guardar un paciente, con esto
                                                                             estoy obligando a que el nutricionista almenos tenga el nombre y el DNI*/
            Conexion con = new Conexion();
            PacienteData pd = new PacienteData(con);
            Paciente nuevo = new Paciente();
            nuevo.setNombre(TFnombre.getText());
            nuevo.setDni (TFdni.getText());
            nuevo.setDomicilio(TFdireccion.getText());
            nuevo.setCelular(TFcelular.getText());
            pd.guardarPaciente(nuevo);
            TFid.setText(String.valueOf(nuevo.getIdPaciente()));
            }
            else{ // si no se cumple lanzara la guiente exepcicion 
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Datos Insuficientes para Guardar un Paciente. Ingrese Nombre y DNI");
            
            }
          
            
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

    private void btAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtrasActionPerformed
        this.setVisible(false);
        this.moveToBack();
       
    }//GEN-LAST:event_btAtrasActionPerformed

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

    private void TFdireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFdireccionKeyTyped
      
    }//GEN-LAST:event_TFdireccionKeyTyped

    private void TFcelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFcelularKeyTyped
      if(Character.isLetter(evt.getKeyChar())){ /*si en el campo de tecto para id lo que se ingresa es una letra lanza la siguiente
                                                       exepcion*/
          
      getToolkit().beep();
      evt.consume();
          JOptionPane.showMessageDialog(rootPane,"Ingrese Solo Numeros");
      }
      else{//caso contrario no hace nada 
      
      
      }
    }//GEN-LAST:event_TFcelularKeyTyped


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
    private javax.swing.JButton btAtras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
