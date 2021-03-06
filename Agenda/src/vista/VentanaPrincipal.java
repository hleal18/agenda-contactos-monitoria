/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import excepciones.DuplicateContactException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.Agenda;
import logica.Contacto;

/**
 *
 * @author usuario
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    Agenda agenda;
    private String idBusqueda;

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        agenda = new Agenda(10);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabsComponent = new javax.swing.JTabbedPane();
        pnlAgenda = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblContactos = new javax.swing.JTable();
        txtBuscarAgenda = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        pnlAgregarContacto = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdAgregar = new javax.swing.JTextField();
        txtNombreAgregar = new javax.swing.JTextField();
        txtApellidoAgregar = new javax.swing.JTextField();
        txtDireccionAgregar = new javax.swing.JTextField();
        txtTelefonoAgregar = new javax.swing.JTextField();
        pnlModificarEliminarContacto = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        txtNombreMod = new javax.swing.JTextField();
        txtApellidoMod = new javax.swing.JTextField();
        txtDireccionMod = new javax.swing.JTextField();
        txtTelefonoMod = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnModificarMod = new javax.swing.JButton();
        txtBuscarMod = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnBuscarMod = new javax.swing.JButton();
        btnEliminarMod = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabsComponent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabsComponentMouseClicked(evt);
            }
        });

        pnlAgenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlAgendaMouseClicked(evt);
            }
        });

        tblContactos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificación", "Nombre", "Apellido", "Dirección", "Teléfono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblContactos);
        if (tblContactos.getColumnModel().getColumnCount() > 0) {
            tblContactos.getColumnModel().getColumn(0).setResizable(false);
            tblContactos.getColumnModel().getColumn(1).setResizable(false);
            tblContactos.getColumnModel().getColumn(2).setResizable(false);
            tblContactos.getColumnModel().getColumn(3).setResizable(false);
            tblContactos.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setText("Identificación:");

        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReiniciarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlAgendaLayout = new javax.swing.GroupLayout(pnlAgenda);
        pnlAgenda.setLayout(pnlAgendaLayout);
        pnlAgendaLayout.setHorizontalGroup(
            pnlAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAgendaLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAgendaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscarAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(186, 186, 186))))
            .addGroup(pnlAgendaLayout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(btnBuscar)
                .addGap(18, 18, 18)
                .addComponent(btnReiniciar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlAgendaLayout.setVerticalGroup(
            pnlAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAgendaLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(pnlAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(pnlAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnReiniciar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabsComponent.addTab("Agenda", pnlAgenda);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Contacto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        btnAgregar.setText("Agregar");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });

        jLabel2.setText("Identificación:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellido:");

        jLabel5.setText("Dirección:");

        jLabel6.setText("Teléfono:");

        txtIdAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdAgregarActionPerformed(evt);
            }
        });
        txtIdAgregar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdAgregarKeyTyped(evt);
            }
        });

        txtApellidoAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoAgregarActionPerformed(evt);
            }
        });

        txtTelefonoAgregar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoAgregarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(89, 89, 89)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(txtNombreAgregar)
                            .addComponent(txtApellidoAgregar)
                            .addComponent(txtDireccionAgregar)
                            .addComponent(txtTelefonoAgregar)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(btnAgregar)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtApellidoAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDireccionAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTelefonoAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout pnlAgregarContactoLayout = new javax.swing.GroupLayout(pnlAgregarContacto);
        pnlAgregarContacto.setLayout(pnlAgregarContactoLayout);
        pnlAgregarContactoLayout.setHorizontalGroup(
            pnlAgregarContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgregarContactoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlAgregarContactoLayout.setVerticalGroup(
            pnlAgregarContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAgregarContactoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabsComponent.addTab("Agregar Contacto", pnlAgregarContacto);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos a Modificar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel6.setToolTipText("");

        txtTelefonoMod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoModKeyTyped(evt);
            }
        });

        jLabel8.setText("Nombre:");

        jLabel9.setText("Apellido:");

        jLabel10.setText("Dirección:");

        jLabel11.setText("Teléfono:");

        btnModificarMod.setText("Modificar");
        btnModificarMod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarModMouseClicked(evt);
            }
        });

        txtBuscarMod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarModKeyTyped(evt);
            }
        });

        jLabel7.setText("Buscar por identificación:");

        btnBuscarMod.setText("Buscar");
        btnBuscarMod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarModMouseClicked(evt);
            }
        });

        btnEliminarMod.setText("Eliminar");
        btnEliminarMod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarModMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(btnBuscarMod)
                        .addGap(231, 231, 231))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(36, 36, 36)
                                .addComponent(txtBuscarMod, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(btnModificarMod, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTelefonoMod)
                                    .addComponent(txtDireccionMod)
                                    .addComponent(txtApellidoMod)
                                    .addComponent(txtNombreMod, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                    .addComponent(btnEliminarMod, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(138, 138, 138))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscarMod)
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtNombreMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellidoMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDireccionMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefonoMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModificarMod)
                    .addComponent(btnEliminarMod))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlModificarEliminarContactoLayout = new javax.swing.GroupLayout(pnlModificarEliminarContacto);
        pnlModificarEliminarContacto.setLayout(pnlModificarEliminarContactoLayout);
        pnlModificarEliminarContactoLayout.setHorizontalGroup(
            pnlModificarEliminarContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlModificarEliminarContactoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlModificarEliminarContactoLayout.setVerticalGroup(
            pnlModificarEliminarContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlModificarEliminarContactoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabsComponent.addTab("Modificar y Eliminar Contacto", pnlModificarEliminarContacto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabsComponent)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabsComponent)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidoAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoAgregarActionPerformed

    private void txtIdAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdAgregarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        // TODO add your handling code here:
        // Codigo para agregar un nuevo contacto.
        String nombre = this.txtNombreAgregar.getText();
        String apellido = this.txtApellidoAgregar.getText();
        String identificacion = this.txtIdAgregar.getText();
        String telefono = this.txtTelefonoAgregar.getText();
        String direccion = this.txtDireccionAgregar.getText();

        Contacto nuevo = new Contacto(identificacion, nombre, apellido, telefono, direccion);

        try {
            agenda.agregar(nuevo);
            JOptionPane.showMessageDialog(null, "Contacto agregado con exito", "Contacto Agregado", JOptionPane.INFORMATION_MESSAGE);
            rebootPnlAgregar();
        } catch (DuplicateContactException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Contacto Duplicado", JOptionPane.ERROR_MESSAGE);
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Capacidad Máxima", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void txtIdAgregarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdAgregarKeyTyped
        // TODO add your handling code here:
        // Comprueba que el usuario solo introduzca numeros.
        comprobarDigito(evt);
    }//GEN-LAST:event_txtIdAgregarKeyTyped

    private void txtTelefonoAgregarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoAgregarKeyTyped
        // TODO add your handling code here:
        // Comprueba que el usuario solo introduzca numeros.
        comprobarDigito(evt);
    }//GEN-LAST:event_txtTelefonoAgregarKeyTyped

    private void txtBuscarModKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarModKeyTyped
        // TODO add your handling code here:
        // Comprueba que el usuario solo introduzca numeros.
        comprobarDigito(evt);
    }//GEN-LAST:event_txtBuscarModKeyTyped

    private void txtTelefonoModKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoModKeyTyped
        // TODO add your handling code here:
        // Comprueba que el usuario solo introduzca numeros.
        comprobarDigito(evt);
    }//GEN-LAST:event_txtTelefonoModKeyTyped

    private void btnBuscarModMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarModMouseClicked
        // TODO add your handling code here:
        // Buscar contacto.
        String identificacion = this.txtBuscarMod.getText();

        Contacto encontrado = agenda.buscar(identificacion);

        if (encontrado == null) {
            JOptionPane.showMessageDialog(null, "Contacto no Registrado", "Contacto No Encontrado", JOptionPane.ERROR_MESSAGE);
            return;
        }
        this.idBusqueda = identificacion;
        txtNombreMod.setText(encontrado.getNombre());
        txtApellidoMod.setText(encontrado.getApellido());
        txtDireccionMod.setText(encontrado.getDireccion());
        txtTelefonoMod.setText(encontrado.getTelefono());
    }//GEN-LAST:event_btnBuscarModMouseClicked

    private void btnModificarModMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarModMouseClicked
        // TODO add your handling code here:
        // Código para modificar contacto.
        try {
            String nombre = txtNombreMod.getText();
            String apellido = txtApellidoMod.getText();
            String direccion = txtDireccionMod.getText();
            String telefono = txtTelefonoMod.getText();

            agenda.modificar(new Contacto(this.idBusqueda, nombre, apellido, direccion, telefono));
            // Función para reiniciar los campos de texto del tab seleccionado.
            rebootPnlModEl();
            JOptionPane.showMessageDialog(null, "Se modificó con éxito", "Modificación Exitosa", JOptionPane.INFORMATION_MESSAGE);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Contacto No Encontrado", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.idBusqueda = "";
        }
    }//GEN-LAST:event_btnModificarModMouseClicked

    private void btnEliminarModMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarModMouseClicked
        // TODO add your handling code here:
        // Código para eliminar contacto.
        try {
            agenda.eliminar(this.idBusqueda);
            JOptionPane.showMessageDialog(null, "Se eliminó con exito", "Eliminación Exitosa", JOptionPane.INFORMATION_MESSAGE);
            // Función para reiniciar los campos de texto del tab seleccionado.
            rebootPnlModEl();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Contacto No Encontrado", JOptionPane.ERROR_MESSAGE);
        } finally {
            this.idBusqueda = "";
        }
    }//GEN-LAST:event_btnEliminarModMouseClicked

    private void pnlAgendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAgendaMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_pnlAgendaMouseClicked

    private void tabsComponentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabsComponentMouseClicked
        // TODO add your handling code here:
        // Código encargado de rellenar la tabla con contactos registrados al 
        // cambiar de tabs.
        System.out.println("Relenando tabla");
        DefaultTableModel modelo = (DefaultTableModel) this.tblContactos.getModel();
        reiniciarTblContactos();

        Contacto[] contactos = agenda.getContactos();

        for (int i = 0; i < contactos.length && contactos[i] != null; i++) {
            modelo.addRow(new Object[]{contactos[i].getId(), contactos[i].getNombre(), contactos[i].getApellido(), contactos[i].getDireccion(), contactos[i].getTelefono()});
        }
    }//GEN-LAST:event_tabsComponentMouseClicked

    private void btnReiniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReiniciarMouseClicked
        // TODO add your handling code here:
        // Código encargado de rellenar la tabla al clickear botón "Reiniciar"
        System.out.println("Relenando tabla");
        DefaultTableModel modelo = (DefaultTableModel) this.tblContactos.getModel();
        reiniciarTblContactos();

        Contacto[] contactos = agenda.getContactos();

        for (int i = 0; i < contactos.length && contactos[i] != null; i++) {
            modelo.addRow(new Object[]{contactos[i].getId(), contactos[i].getNombre(), contactos[i].getApellido(), contactos[i].getDireccion(), contactos[i].getTelefono()});
        }
    }//GEN-LAST:event_btnReiniciarMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        // TODO add your handling code here:
        String identificacion = this.txtBuscarAgenda.getText();
        // Reiniciar tabla de contactos.
        reiniciarTblContactos();
        DefaultTableModel modelo = (DefaultTableModel) this.tblContactos.getModel();

        Contacto encontrado = agenda.buscar(identificacion);

        if (encontrado == null) {
            JOptionPane.showMessageDialog(null, "Contacto no Registrado", "Contacto No Encontrado", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Agrega una fila a la tabla con los datos del contacto.
        modelo.addRow(new Object[]{encontrado.getId(), encontrado.getNombre(), encontrado.getApellido(), encontrado.getDireccion(), encontrado.getTelefono()});
    }//GEN-LAST:event_btnBuscarMouseClicked

    // Encargado de limpiar la tabla de contactos.
    private void reiniciarTblContactos() {
        DefaultTableModel modelo = (DefaultTableModel) this.tblContactos.getModel();
        if (modelo.getRowCount() >= 0) {
            System.out.println("Filas por borrar: " + modelo.getRowCount());
            modelo.setRowCount(0);
        }
    }

    // Reiniciar los campos de texto y componentes del panel Agregar.
    private void rebootPnlAgregar() {
        this.txtNombreAgregar.setText("");
        this.txtApellidoAgregar.setText("");
        this.txtIdAgregar.setText("");
        this.txtTelefonoAgregar.setText("");
        this.txtDireccionAgregar.setText("");
    }

    // Reinicia los campos de texto y componentes del panel Modificar y Eliminar.
    private void rebootPnlModEl() {
        txtNombreMod.setText("");
        txtApellidoMod.setText("");
        txtDireccionMod.setText("");
        txtTelefonoMod.setText("");
    }

    // Encargado de recibir un evento de tipo KeyEvent, proveniente del teclado.
    // Evalúa si la tecla que se tecleó es un dígito. Si no lo es, lo destruye.
    // Al destruirse no se reflejará en el campo de texto donde se introdujo.
    // Magia.
    private void comprobarDigito(java.awt.event.KeyEvent evt) {
        char caracter = evt.getKeyChar();
        if (!Character.isDigit(caracter)) {
            evt.consume();
        }
    }

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarMod;
    private javax.swing.JButton btnEliminarMod;
    private javax.swing.JButton btnModificarMod;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlAgenda;
    private javax.swing.JPanel pnlAgregarContacto;
    private javax.swing.JPanel pnlModificarEliminarContacto;
    private javax.swing.JTabbedPane tabsComponent;
    private javax.swing.JTable tblContactos;
    private javax.swing.JTextField txtApellidoAgregar;
    private javax.swing.JTextField txtApellidoMod;
    private javax.swing.JTextField txtBuscarAgenda;
    private javax.swing.JTextField txtBuscarMod;
    private javax.swing.JTextField txtDireccionAgregar;
    private javax.swing.JTextField txtDireccionMod;
    private javax.swing.JTextField txtIdAgregar;
    private javax.swing.JTextField txtNombreAgregar;
    private javax.swing.JTextField txtNombreMod;
    private javax.swing.JTextField txtTelefonoAgregar;
    private javax.swing.JTextField txtTelefonoMod;
    // End of variables declaration//GEN-END:variables
}
