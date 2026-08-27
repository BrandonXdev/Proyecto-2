/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Vista;

import Controlador.Controlador;
import Modelo.Cliente;
import Modelo.Contrato;
import Modelo.Espacio;
import java.time.LocalDate;
import java.util.Iterator;

/**
 *
 * @author brand
 */
public class DlgContrato extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(DlgContrato.class.getName());

    private Controlador controlador;
    private Cliente clienteSeleccionado;
    private Espacio espacioSeleccionado;
    public DlgContrato(java.awt.Frame parent, boolean modal, Controlador controlador) {
        super(parent, modal);
        initComponents();
        this.controlador = controlador;
        
        Iterator espacios = controlador.getEspacios().getAll();

        while (espacios != null && espacios.hasNext()) {
            Espacio espacio = (Espacio) espacios.next();
            cbxEspacio.addItem(String.valueOf(espacio.getNumeroEspacio()));
        }
    }

    private void calcularDuracion() {
        if (jDateChooser1.getDate() == null || jDateChooser2.getDate() == null) {
            return;
        }
        long dias = (jDateChooser2.getDate().getTime() - jDateChooser1.getDate().getTime())
        / (1000 * 60 * 60 * 24);
        lblDuracion.setText(
        "Duración: " + dias + " días");
        
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        btnValidar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        lblClienteEncontrato = new javax.swing.JLabel();
        cbxEspacio = new javax.swing.JComboBox<>();
        lblDisponibles = new javax.swing.JLabel();
        lblEspacioAsignado = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        lblDuracion = new javax.swing.JLabel();
        jPanelServiciosAdicionales = new javax.swing.JPanel();
        checkSeguro = new javax.swing.JCheckBox();
        checkTransporte = new javax.swing.JCheckBox();
        checkEmbalaje = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanelCostos = new javax.swing.JPanel();
        lblTotal = new javax.swing.JLabel();
        lblSubtotal1 = new javax.swing.JLabel();
        lblImpuestos = new javax.swing.JLabel();
        btnCalcularCostos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 102));
        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Nuevo Contrato");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Cliente");

        txtCliente.setBackground(new java.awt.Color(204, 204, 204));
        txtCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Espacio");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Fechas");

        jDateChooser1.setBackground(new java.awt.Color(204, 204, 204));
        jDateChooser1.setForeground(new java.awt.Color(0, 0, 153));
        jDateChooser1.setOpaque(false);

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setForeground(java.awt.Color.red);

        btnValidar.setBackground(new java.awt.Color(255, 204, 0));
        btnValidar.setForeground(new java.awt.Color(0, 0, 0));
        btnValidar.setText("Validar");
        btnValidar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnValidar.addActionListener(this::btnValidarActionPerformed);

        jButton6.setBackground(java.awt.Color.red);
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText("Cancelar");
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        btnGuardar.setBackground(new java.awt.Color(255, 204, 0));
        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setText("Guardar");
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnGuardar.addActionListener(this::btnGuardarActionPerformed);

        lblClienteEncontrato.setForeground(java.awt.Color.green);

        cbxEspacio.setBackground(new java.awt.Color(204, 204, 204));

        lblDisponibles.setBackground(new java.awt.Color(204, 204, 204));
        lblDisponibles.setForeground(new java.awt.Color(153, 153, 153));

        lblEspacioAsignado.setBackground(new java.awt.Color(204, 204, 204));
        lblEspacioAsignado.setForeground(new java.awt.Color(0, 0, 153));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Fecha Inicio");

        jDateChooser2.setBackground(new java.awt.Color(204, 204, 204));
        jDateChooser2.setForeground(new java.awt.Color(0, 0, 153));
        jDateChooser2.setOpaque(false);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Fecha Final");

        lblDuracion.setBackground(new java.awt.Color(204, 204, 204));
        lblDuracion.setForeground(new java.awt.Color(153, 153, 153));

        jPanelServiciosAdicionales.setBackground(new java.awt.Color(255, 255, 255));
        jPanelServiciosAdicionales.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        checkSeguro.setForeground(new java.awt.Color(255, 204, 0));
        checkSeguro.setText("Seguro");

        checkTransporte.setForeground(new java.awt.Color(255, 204, 0));
        checkTransporte.setText("Transporte");

        checkEmbalaje.setForeground(new java.awt.Color(255, 204, 0));
        checkEmbalaje.setText("Embalaje");

        javax.swing.GroupLayout jPanelServiciosAdicionalesLayout = new javax.swing.GroupLayout(jPanelServiciosAdicionales);
        jPanelServiciosAdicionales.setLayout(jPanelServiciosAdicionalesLayout);
        jPanelServiciosAdicionalesLayout.setHorizontalGroup(
            jPanelServiciosAdicionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelServiciosAdicionalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelServiciosAdicionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelServiciosAdicionalesLayout.createSequentialGroup()
                        .addGroup(jPanelServiciosAdicionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkSeguro)
                            .addComponent(checkTransporte)
                            .addComponent(checkEmbalaje))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        jPanelServiciosAdicionalesLayout.setVerticalGroup(
            jPanelServiciosAdicionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelServiciosAdicionalesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkSeguro)
                .addGap(21, 21, 21)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(checkTransporte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkEmbalaje)
                .addGap(24, 24, 24))
        );

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("Servicios Adicionales");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 153));
        jLabel11.setText("Costos");

        jPanelCostos.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCostos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        lblTotal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(153, 153, 153));

        lblSubtotal1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblSubtotal1.setForeground(new java.awt.Color(153, 153, 153));

        lblImpuestos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblImpuestos.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanelCostosLayout = new javax.swing.GroupLayout(jPanelCostos);
        jPanelCostos.setLayout(jPanelCostosLayout);
        jPanelCostosLayout.setHorizontalGroup(
            jPanelCostosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCostosLayout.createSequentialGroup()
                .addGroup(jPanelCostosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCostosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblSubtotal1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE))
                    .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblImpuestos, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelCostosLayout.setVerticalGroup(
            jPanelCostosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCostosLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblSubtotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(lblImpuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        btnCalcularCostos.setBackground(new java.awt.Color(255, 204, 0));
        btnCalcularCostos.setForeground(new java.awt.Color(0, 0, 0));
        btnCalcularCostos.setText("Calcular Costos");
        btnCalcularCostos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCalcularCostos.addActionListener(this::btnCalcularCostosActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanelServiciosAdicionales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCalcularCostos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnValidar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(13, 13, 13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblClienteEncontrato, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbxEspacio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEspacioAsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(92, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jPanelCostos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnValidar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblClienteEncontrato, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDisponibles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxEspacio, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEspacioAsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelServiciosAdicionales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jPanelCostos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(btnCalcularCostos)
                    .addComponent(btnGuardar))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarActionPerformed
       
        String identificacion = txtCliente.getText();

        Cliente cliente = controlador.buscarCliente(identificacion);

        if (cliente != null) {clienteSeleccionado = cliente; 
            lblClienteEncontrato.setText(cliente.getNombre());
        
        } else {
            lblClienteEncontrato.setText("Cliente no encontrado");
}
    }//GEN-LAST:event_btnValidarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        java.util.Date fechaInicioDate = jDateChooser1.getDate();
        java.util.Date fechaFinalDate = jDateChooser2.getDate();
        LocalDate fechaInicio = fechaInicioDate.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaFinal = fechaFinalDate.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        
        Espacio espacio = obtenerEspacioSeleccionado();
        Contrato contrato =new Contrato(clienteSeleccionado, espacio, fechaInicio, fechaFinal,
                controlador.generarNumeroContrato());
        controlador.agregarContrato(contrato);
        dispose();
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCalcularCostosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularCostosActionPerformed
        

        double subtotal = 0;

        if (checkSeguro.isSelected()) {
        subtotal += 5000;
    }

        if (checkTransporte.isSelected()) {
        subtotal += 10000;
    }

        if (checkEmbalaje.isSelected()) {
        subtotal += 8000;
    }

        double impuestos = subtotal * 0.13;

        double total = subtotal + impuestos;

        lblSubtotal1.setText("Subtotal: ₡" + subtotal);
        lblImpuestos.setText("Impuestos: ₡" + impuestos);
        lblTotal.setText("Total: ₡" + total);

    }//GEN-LAST:event_btnCalcularCostosActionPerformed
    
    private Espacio obtenerEspacioSeleccionado() {
        int numero = Integer.parseInt(cbxEspacio.getSelectedItem().toString());
        return controlador.buscarEspacio(numero);
}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularCostos;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnValidar;
    private javax.swing.JComboBox<String> cbxEspacio;
    private javax.swing.JCheckBox checkEmbalaje;
    private javax.swing.JCheckBox checkSeguro;
    private javax.swing.JCheckBox checkTransporte;
    private javax.swing.JButton jButton6;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCostos;
    private javax.swing.JPanel jPanelServiciosAdicionales;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblClienteEncontrato;
    private javax.swing.JLabel lblDisponibles;
    private javax.swing.JLabel lblDuracion;
    private javax.swing.JLabel lblEspacioAsignado;
    private javax.swing.JLabel lblImpuestos;
    private javax.swing.JLabel lblSubtotal1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField txtCliente;
    // End of variables declaration//GEN-END:variables
}
