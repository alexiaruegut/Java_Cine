/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.gui;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.Cine;

/**
 *
 * @author alexiaruegut
 */
public class InterfazCine extends javax.swing.JFrame {

    /**
     * Creates new form InterfazCine
     */
    private ArrayList<Cine> listaCines = new ArrayList<>();

    public InterfazCine() {
        initComponents();

        // Configurar CardLayout en jPanelView
        jPanelView.setLayout(new CardLayout());

// Agregar los paneles con identificadores
        jPanelView.add(new JPanel(), "home");  // Un panel vacío inicial
        jPanelView.add(jPanelFormCine, "formCine");

        jComboBoxCines.removeAllItems(); // Elimina los valores predefinidos

        // Agregar placeholder inicial
        setPlaceholder(jTextFieldNameCine, "Introduce el nombre del cine");
        setPlaceholder(jTextFieldUbiCine, "Introduce la ubicación del cine");
        setPlaceholder(jTextFieldNumSalasCine, "Introduce el número de salas");
        setPlaceholder(jTextFieldPrecioBaseCine, "Introduce el precio base de entradas");

        jTextFieldNameCine.setForeground(new java.awt.Color(150, 150, 150));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAdmin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxCines = new javax.swing.JComboBox<>();
        jButtonAddCine = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanelView = new javax.swing.JPanel();
        jPanelFormCine = new javax.swing.JPanel();
        jLabelnombrecine = new javax.swing.JLabel();
        jLabelubicine = new javax.swing.JLabel();
        jLabelnumsalascine = new javax.swing.JLabel();
        jLabelpreciobasecine = new javax.swing.JLabel();
        jTextFieldNameCine = new javax.swing.JTextField();
        jTextFieldUbiCine = new javax.swing.JTextField();
        jTextFieldNumSalasCine = new javax.swing.JTextField();
        jTextFieldPrecioBaseCine = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName(""); // NOI18N

        jPanelAdmin.setBackground(java.awt.SystemColor.activeCaption);
        jPanelAdmin.setForeground(new java.awt.Color(255, 255, 255));
        jPanelAdmin.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADMINISTRACIÓN");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setName(""); // NOI18N
        jLabel1.setPreferredSize(null);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/admin.png"))); // NOI18N

        jComboBoxCines.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cine 1", "Cine 2", "Cine 3", "Cine 4" }));
        jComboBoxCines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCinesActionPerformed(evt);
            }
        });

        jButtonAddCine.setText("+");
        jButtonAddCine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCineActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("CINES");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout jPanelAdminLayout = new javax.swing.GroupLayout(jPanelAdmin);
        jPanelAdmin.setLayout(jPanelAdminLayout);
        jPanelAdminLayout.setHorizontalGroup(
            jPanelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAdminLayout.createSequentialGroup()
                        .addComponent(jComboBoxCines, 0, 158, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAddCine))
                    .addGroup(jPanelAdminLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelAdminLayout.setVerticalGroup(
            jPanelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCines, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddCine, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelView.setBackground(new java.awt.Color(204, 255, 255));

        jPanelFormCine.setBackground(new java.awt.Color(226, 233, 238));

        jLabelnombrecine.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelnombrecine.setText("NOMBRE CINE");

        jLabelubicine.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelubicine.setText("UBICACIÓN");

        jLabelnumsalascine.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelnumsalascine.setText("Nº SALAS");

        jLabelpreciobasecine.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelpreciobasecine.setText("PRECIO BASE ENTRADAS");

        jTextFieldNameCine.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldNameCine.setToolTipText("");
        jTextFieldNameCine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameCineActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/home.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(91, 137, 186));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("CANCELAR");

        jButton3.setBackground(new java.awt.Color(91, 137, 186));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("CREAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFormCineLayout = new javax.swing.GroupLayout(jPanelFormCine);
        jPanelFormCine.setLayout(jPanelFormCineLayout);
        jPanelFormCineLayout.setHorizontalGroup(
            jPanelFormCineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFormCineLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(jPanelFormCineLayout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(jPanelFormCineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelpreciobasecine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelnumsalascine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelnombrecine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelubicine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldNameCine)
                    .addComponent(jTextFieldUbiCine)
                    .addComponent(jTextFieldNumSalasCine)
                    .addComponent(jTextFieldPrecioBaseCine, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelFormCineLayout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanelFormCineLayout.setVerticalGroup(
            jPanelFormCineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormCineLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(69, 69, 69)
                .addComponent(jLabelnombrecine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNameCine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelubicine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldUbiCine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelnumsalascine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNumSalasCine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelpreciobasecine)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPrecioBaseCine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelFormCineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelViewLayout = new javax.swing.GroupLayout(jPanelView);
        jPanelView.setLayout(jPanelViewLayout);
        jPanelViewLayout.setHorizontalGroup(
            jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelViewLayout.createSequentialGroup()
                .addComponent(jPanelFormCine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelViewLayout.setVerticalGroup(
            jPanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFormCine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButtonAddCineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCineActionPerformed
        CardLayout cl = (CardLayout) jPanelView.getLayout();
        cl.show(jPanelView, "formCine");
    }//GEN-LAST:event_jButtonAddCineActionPerformed

    private void jComboBoxCinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCinesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCinesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CardLayout cl = (CardLayout) jPanelView.getLayout();
        cl.show(jPanelView, "home");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldNameCineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameCineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNameCineActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String nombre = jTextFieldNameCine.getText().trim();
        String ubicacion = jTextFieldUbiCine.getText().trim();
        String numSalasStr = jTextFieldNumSalasCine.getText().trim();
        String precioBaseStr = jTextFieldPrecioBaseCine.getText().trim();

        // 2. Verificar que no queden los placeholders o campos vacíos
        if (nombre.isEmpty() || nombre.equals("Introduce el nombre del cine")
            || ubicacion.isEmpty() || ubicacion.equals("Introduce la ubicación del cine")
            || numSalasStr.isEmpty() || numSalasStr.equals("Introduce el número de salas")
            || precioBaseStr.isEmpty() || precioBaseStr.equals("Introduce el precio base de entradas")) {
            System.out.println("Por favor, completa todos los campos correctamente.");
            return;
        }

        // 3. Convertir los campos numéricos
        int totalSalas, precioBase;
        try {
            totalSalas = Integer.parseInt(numSalasStr);
            precioBase = Integer.parseInt(precioBaseStr);
        } catch (NumberFormatException e) {
            System.out.println("El número de salas y el precio base deben ser numéricos.");
            return;
        }

        // 4. Crear el cine usando el constructor que ya tienes en el modelo
        Cine nuevoCine = new Cine(nombre, ubicacion, totalSalas, precioBase, new ArrayList<>());

        // 5. Agregar el cine a la lista y actualizar el combobox
        listaCines.add(nuevoCine);
        actualizarComboBoxCines(listaCines);

        // 6. Limpiar los campos (opcional) y cambiar la vista a "home"
        jTextFieldNameCine.setText("");
        jTextFieldUbiCine.setText("");
        jTextFieldNumSalasCine.setText("");
        jTextFieldPrecioBaseCine.setText("");

        CardLayout cl = (CardLayout) jPanelView.getLayout();
        cl.show(jPanelView, "home");

        System.out.println("Cine creado con éxito: " + nuevoCine.getNombre());
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazCine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazCine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazCine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazCine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new InterfazCine().setVisible(true);
        });
    }

    public void cambiarFormulario(String nombreFormulario) {
        CardLayout cl = (CardLayout) jPanelView.getLayout();
        cl.show(jPanelView, nombreFormulario);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonAddCine;
    private javax.swing.JComboBox<String> jComboBoxCines;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelnombrecine;
    private javax.swing.JLabel jLabelnumsalascine;
    private javax.swing.JLabel jLabelpreciobasecine;
    private javax.swing.JLabel jLabelubicine;
    private javax.swing.JPanel jPanelAdmin;
    private javax.swing.JPanel jPanelFormCine;
    private javax.swing.JPanel jPanelView;
    private javax.swing.JTextField jTextFieldNameCine;
    private javax.swing.JTextField jTextFieldNumSalasCine;
    private javax.swing.JTextField jTextFieldPrecioBaseCine;
    private javax.swing.JTextField jTextFieldUbiCine;
    // End of variables declaration//GEN-END:variables

    private void setPlaceholder(JTextField textField, String placeholder) {
        textField.setText(placeholder);
        textField.setForeground(new java.awt.Color(150, 150, 150));

        textField.addFocusListener(new java.awt.event.FocusListener() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (textField.getText().equals(placeholder)) {
                    textField.setText("");
                    textField.setForeground(new java.awt.Color(0, 0, 0));
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (textField.getText().trim().isEmpty()) {
                    textField.setText(placeholder);
                    textField.setForeground(new java.awt.Color(150, 150, 150));
                }
            }
        });
    }

    public void actualizarComboBoxCines(ArrayList<Cine> cines) {
        jComboBoxCines.removeAllItems(); // Limpia los valores previos 
        for (Cine cine : cines) {
            jComboBoxCines.addItem(cine.getNombre());
        }
    }
}
