/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import negocio.ControlBalances;
import negocio.ControlClientes;
import negocio.ControlProductos;
import negocio.ControlProductosVentas;
import negocio.ControlVentas;
import negocio.ControlVistas;
import objetosNegocio.Balance;
import objetosNegocio.Cliente;
import objetosNegocio.Empleado;
import objetosNegocio.Producto;
import objetosNegocio.ProductoVenta;
import objetosNegocio.Venta;

/**
 *
 * @author GPE
 */
public class FrmPuntoDeVenta extends javax.swing.JFrame {

    Empleado empleado;
    JFrame jframe;
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Date date = new Date();
    Date date1;
    Cliente cliente;

    /**
     * Creates new form FrmPuntoDeVenta
     *
     * @param empleado
     * @throws java.text.ParseException
     */
    public FrmPuntoDeVenta(Empleado empleado) throws ParseException {
        this.date1 = dateFormat.parse(this.date.getYear() + "-" + this.date.getMonth() + "-" + this.date.getDay());
        this.jframe = this;
        this.empleado = empleado;
        initComponents();
        this.cargarBanner();
        this.setLocationRelativeTo(null);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBanner = new javax.swing.JLabel();
        lblEncabezado = new javax.swing.JLabel();
        scrollTabla = new javax.swing.JScrollPane();
        tblProductosVenta = new javax.swing.JTable();
        lblPanda = new javax.swing.JLabel();
        lblJMJR = new javax.swing.JLabel();
        lblTitulo1 = new javax.swing.JLabel();
        txtBascula = new javax.swing.JTextField();
        txtCodBarras = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        btnCobrar = new javax.swing.JButton();
        lblMenuSupervisor = new javax.swing.JLabel();
        lblSoporte = new javax.swing.JLabel();
        lblCodBarras = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        lblBascula = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Punto de Venta \"Abarrotes el Panda\"");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBanner.setBackground(new java.awt.Color(255, 255, 255));
        lblBanner.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblBanner.setForeground(new java.awt.Color(0, 51, 255));
        lblBanner.setText("Hola");
        getContentPane().add(lblBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1000, 30));

        lblEncabezado.setBackground(new java.awt.Color(255, 255, 255));
        lblEncabezado.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblEncabezado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/banner.png"))); // NOI18N
        getContentPane().add(lblEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 30));

        tblProductosVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo de Barras", "Cantidad", "Descripción", "Precio", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class
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
        scrollTabla.setViewportView(tblProductosVenta);

        getContentPane().add(scrollTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 720, 510));

        lblPanda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.png"))); // NOI18N
        getContentPane().add(lblPanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 50, -1, -1));

        lblJMJR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/panda.jpg"))); // NOI18N
        getContentPane().add(lblJMJR, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 170, -1, -1));

        lblTitulo1.setFont(new java.awt.Font("Gigi", 3, 30)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo1.setText("Abarrotes el Panda");
        getContentPane().add(lblTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, 300, 30));

        txtBascula.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        txtBascula.setForeground(new java.awt.Color(0, 51, 255));
        txtBascula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBascula.setText("1");
        txtBascula.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtBascula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBasculaActionPerformed(evt);
            }
        });
        txtBascula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBasculaKeyTyped(evt);
            }
        });
        getContentPane().add(txtBascula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 140, 40));

        txtCodBarras.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        txtCodBarras.setForeground(new java.awt.Color(0, 51, 255));
        txtCodBarras.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCodBarras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodBarrasKeyReleased(evt);
            }
        });
        getContentPane().add(txtCodBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, 260, 40));

        lblTotal.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblTotal.setText("Total:");
        getContentPane().add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 340, -1, -1));

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(0, 51, 255));
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal.setText("0.00");
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 390, 220, 70));

        txtCantidad.setEditable(false);
        txtCantidad.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(0, 51, 255));
        txtCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidad.setText("0");
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 550, 160, 40));

        btnCobrar.setText("F1-COBRAR");
        btnCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCobrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCobrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 480, 100, 40));

        lblMenuSupervisor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMenuSupervisor.setForeground(new java.awt.Color(204, 0, 0));
        lblMenuSupervisor.setText("F3- Menu Administrador.");
        getContentPane().add(lblMenuSupervisor, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 570, -1, -1));

        lblSoporte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSoporte.setForeground(new java.awt.Color(204, 0, 0));
        lblSoporte.setText("F2- Ayuda o Soporte");
        getContentPane().add(lblSoporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 540, -1, -1));

        lblCodBarras.setText("Codigo de Barras");
        getContentPane().add(lblCodBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 590, -1, -1));

        lblCantidad.setText("Cantidad");
        getContentPane().add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 590, -1, -1));

        lblBascula.setText("Bascula");
        getContentPane().add(lblBascula, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 590, -1, -1));

        lblFondo.setFont(new java.awt.Font("Sylfaen", 3, 36)); // NOI18N
        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoPV.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBasculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBasculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBasculaActionPerformed

    private void txtCodBarrasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodBarrasKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                this.leerCampoCodigoBarras();
            } catch (SQLException ex) {
                Logger.getLogger(FrmPuntoDeVenta.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(FrmPuntoDeVenta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_F2) {
            controlVistas.despliegaVistaDeayuda(this);
        }
        if (evt.getKeyCode() == KeyEvent.VK_F3) {
            controlVistas.despliegaMenuSupervisor();
        }
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            try {
                controlVistas.despliegaVistaDePago(this, txtTotal.getText(), this.empleado);
            } catch (ParseException ex) {
                Logger.getLogger(FrmPuntoDeVenta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_F4) {
            controlVistas.despliegaBuscadorDeProductos(this);
        }
        if (evt.getKeyCode() == KeyEvent.VK_F5) {
            try {
                this.eliminarProducto();
            } catch (SQLException ex) {
                Logger.getLogger(FrmPuntoDeVenta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_F6) {
            try {
                this.cancelarCompra();
            } catch (SQLException ex) {
                Logger.getLogger(FrmPuntoDeVenta.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_txtCodBarrasKeyReleased

    private void btnCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCobrarActionPerformed
        try {
            controlVistas.despliegaVistaDePago(this, txtTotal.getText(), this.empleado);
        } catch (ParseException ex) {
            Logger.getLogger(FrmPuntoDeVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCobrarActionPerformed

    private void txtBasculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBasculaKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo puedes ingresar numeros  ", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtBasculaKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (this.empleado.getTipo().equalsIgnoreCase("Administrador")) {
            FrmAbarrotesElPanda frmAbarrotesElPanda = new FrmAbarrotesElPanda(empleado);
        } else {
            FrmLogin frmLogin = new FrmLogin();
            frmLogin.setVisible(true);
        }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        if (this.empleado.getTipo().equalsIgnoreCase("Administrador")) {
            FrmAbarrotesElPanda frmAbarrotesElPanda = new FrmAbarrotesElPanda(empleado);
        } else {
            FrmLogin frmLogin = new FrmLogin();
            frmLogin.setVisible(true);
        }    }//GEN-LAST:event_formWindowClosed
    private void leerCampoCodigoBarras() throws SQLException, ParseException {
        String textoCodigoDeBarras = txtCodBarras.getText();
        if (textoCodigoDeBarras.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Este campo no puede estar vacio.", "Error En Datos", JOptionPane.ERROR_MESSAGE);
        } else if (textoCodigoDeBarras.charAt(textoCodigoDeBarras.length() - 1) == 'E' || textoCodigoDeBarras.charAt(textoCodigoDeBarras.length() - 1) == 'e') {
            this.cobrarEfectivoConsola();
        } else if (textoCodigoDeBarras.charAt(textoCodigoDeBarras.length() - 1) == 'T' || textoCodigoDeBarras.charAt(textoCodigoDeBarras.length() - 1) == 't') {
            this.cobrarEnTarjeta();
        } else if (textoCodigoDeBarras.charAt(textoCodigoDeBarras.length() - 1) == 'c' || textoCodigoDeBarras.charAt(textoCodigoDeBarras.length() - 1) == 'C') {
            DlgAutorizacionCiente dlgAutorizacionCiente = new DlgAutorizacionCiente(this);
            dlgAutorizacionCiente.setVisible(true);
        } else if (textoCodigoDeBarras.charAt(textoCodigoDeBarras.length() - 1) == 'Q' || textoCodigoDeBarras.charAt(textoCodigoDeBarras.length() - 1) == 'q') {
            this.eliminarProducto();
        } else if (textoCodigoDeBarras.charAt(textoCodigoDeBarras.length() - 1) == 'B' || textoCodigoDeBarras.charAt(textoCodigoDeBarras.length() - 1) == 'b') {
            controlVistas.despliegaBuscadorDeProductos(this);
        } else if (textoCodigoDeBarras.charAt(textoCodigoDeBarras.length() - 1) == 'x' || textoCodigoDeBarras.charAt(textoCodigoDeBarras.length() - 1) == 'X' || textoCodigoDeBarras.charAt(textoCodigoDeBarras.length() - 1) == '*') {
            this.multiplicador(textoCodigoDeBarras);
        } else {
            Float cantidad = Float.parseFloat("0" + txtBascula.getText());
            if (cantidad > 0) {
                this.escanearProducto();
            } else {
                JOptionPane.showMessageDialog(null, "La bascula debe tener un valor mayor a 0", "Error En Datos", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    private boolean isFloat(String cadena) {
        try {
            Float.parseFloat(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    private void multiplicador(String textoCodigoDeBarras) {
        String cadena = txtCodBarras.getText() + "";
        char x = (char) (textoCodigoDeBarras.length() - 1);
        System.out.println(x);
        String[] opc1 = cadena.split("x");
        String[] opc2 = cadena.split("X");
        if (isFloat(opc1[0])) {
            txtBascula.setText(opc1[0]);
            txtCodBarras.setText("");
        }
        if (isFloat(opc2[0])) {
            txtBascula.setText(opc2[0]);
            txtCodBarras.setText("");
        }
    }

    private void actualizarStock(String codBarras) throws SQLException {
//        Producto producto;
//        producto = this.controlProductos.obtenerProductoCodBarras(codBarras);
//        producto.setStock(producto.getStock() - 1);
//        this.controlProductos.actualizarStock(producto.getId(), producto);

    }

    private void agregarProducto(String codBarras) throws SQLException {
        Producto producto = this.controlProductos.obtenerProductoCodBarras(codBarras);
        producto.setStock(producto.getStock() - 1);
        this.controlProductos.actualizarStock(producto.getId(), producto);
    }

    private void cargarBanner() {
        String banner = "Caja 1                            Empleado:" + this.empleado.getId() + "                          Tipo:" + this.empleado.getTipo() + "                             Estado: En Linea                                 " + new Date() + "";
        lblBanner.setText(banner);
    }

    public boolean verificacionDeCamposVenta() {
        return !(txtTotal.getText().equalsIgnoreCase("") || tblProductosVenta.getRowCount() == 0);
    }

    public void limpiarFormulario() {
        txtTotal.setText("0");
        txtBascula.setText("1");
        txtCantidad.setText("0");
        txtCodBarras.setText("");
        DefaultTableModel modelo = (DefaultTableModel) tblProductosVenta.getModel();
        modelo.setRowCount(0);
    }

    private void registrarVenta() throws SQLException {
        if (this.verificacionDeCamposVenta()) {
            Venta venta = new Venta();
            venta.setFecha(new Date());
            venta.setEmpleado(empleado);
            venta.setTotal(Float.parseFloat(txtTotal.getText()));
            venta.setCliente(cliente);
            this.controlVentas.agregarVenta(venta);

            List<ProductoVenta> productosVentas = new ArrayList<>();
            DefaultTableModel modelo = (DefaultTableModel) this.tblProductosVenta.getModel();

            for (int i = 0; i < tblProductosVenta.getRowCount(); i++) {
                ProductoVenta productoVenta = new ProductoVenta();
                String codBarras = (String) modelo.getValueAt(i, 0);
                Producto producto = controlProductos.obtenerProductoCodBarras(codBarras);

                if (producto != null) {
                    productoVenta.setPrecio(producto.getPrecioActual());
                    productoVenta.setCantidad((Float) modelo.getValueAt(i, 1));
                    productoVenta.setCodBarras((String) modelo.getValueAt(i, 0));
                    productoVenta.setMontoTotal(productoVenta.getCantidad() * productoVenta.getPrecio());
                } else {
                    JOptionPane.showMessageDialog(this, "NO SE REGISTRO LA VENTA.",
                            "Alerta", JOptionPane.WARNING_MESSAGE);
                }

                producto.addVenta(productoVenta);
                venta.addProducto(productoVenta);
                this.controlProductosVentas.agregarProductoVenta(productoVenta);
            }

            JOptionPane.showMessageDialog(null, "Se registro la VENTA correctamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se permiten campos vacios ni productos seleccionados para la venta.", "Error En Datos", JOptionPane.ERROR_MESSAGE);
            this.cancelarCompra();
        }
    }

    private void cancelarCompra() throws SQLException {
        int input = JOptionPane.showConfirmDialog(null, "Estas seguro que deseas cancelar la compra?");
        if (input == 0) {
            Integer fila = tblProductosVenta.getSelectedRow();
            if (tblProductosVenta.getRowCount() <= 0) {
                DefaultTableModel modeloSeleccionados = (DefaultTableModel) tblProductosVenta.getModel();
                modeloSeleccionados.setRowCount(0);
                limpiarFormulario();
            } else {
                JOptionPane.showMessageDialog(null, "Los campos de la venta no pueden estar vacios", "Información", JOptionPane.ERROR_MESSAGE);
            }
//        for (int i = 0; i < modeloSeleccionados.getRowCount(); i++) {
//            Integer idProducto = (Integer) modeloSeleccionados.getValueAt(i, 0);
//            Producto producto = this.controlProductos.obtenerPorId(idProducto);
//            Integer cantidad = (Integer) modeloSeleccionados.getValueAt(i, 3);
////            producto.setStock((producto.getStock() + cantidad));
////            this.controlProductos.actualizarStock(idProducto, producto);
        }
    }

    private void eliminarProducto() throws SQLException {
        Integer fila = tblProductosVenta.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un PRODUCTO",
                    "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int input = JOptionPane.showConfirmDialog(null, "Estas seguro que deseas cancelar el producto?");
            if (input == 0) {
                DefaultTableModel modeloSeleccionados = (DefaultTableModel) tblProductosVenta.getModel();
                String codBarras = (String) modeloSeleccionados.getValueAt(fila, 0);
                Producto producto = this.controlProductos.obtenerProductoCodBarras(codBarras);
                //producto.setStock(producto.getStock() + (Integer) modeloSeleccionados.getValueAt(fila, 3));
                //this.controlProductos.actualizarStock(idProducto, producto);
                modeloSeleccionados.removeRow(fila);
                this.actualizarCampos();
            }
        }
    }

    private void escanearProducto() throws SQLException {
        DefaultTableModel modeloEscaneados = (DefaultTableModel) tblProductosVenta.getModel();
        ProductoVenta productos = new ProductoVenta();
        String codBarras = txtCodBarras.getText();
        this.actualizarStock(codBarras);
        Producto producto;
        Boolean noStock = false;
        try {
            producto = controlProductos.obtenerProductoCodBarras(codBarras);
            if (producto != null) {
                if (Float.parseFloat(txtBascula.getText()) <= producto.getStock()) {
                    for (int i = 0; i < modeloEscaneados.getRowCount(); i++) {
                        if (codBarras.equals(modeloEscaneados.getValueAt(i, 0) + "")) {
                            Float cantidad = (Float) modeloEscaneados.getValueAt(i, 1) + Float.parseFloat(txtBascula.getText());
                            if (cantidad <= producto.getStock()) {
                                producto.setStock(producto.getStock() - 1);
                                Float montoTotal = producto.getPrecioActual() * cantidad;
                                modeloEscaneados.setValueAt(cantidad, i, 1);
                                modeloEscaneados.setValueAt(montoTotal, i, 4);
                                this.actualizarCampos();
                                return;
                            } else {

                                noStock = true;
                            }
                        }
                    }

                    if (!noStock) {
                        productos.setProducto(producto);
                        productos.setPrecio(producto.getPrecioActual());
                        productos.setCantidad(Float.parseFloat(txtBascula.getText()));
                        productos.setMontoTotal(productos.getPrecio() * productos.getCantidad());
                        modeloEscaneados.addRow(productos.toArray());
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay stock suficiente en el inventario.", "Información", JOptionPane.ERROR_MESSAGE);
                    }
                } else {

                    JOptionPane.showMessageDialog(null, "No hay stock suficiente en el inventario.", "Información", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "El producto escaneado no existe en la base de datos", "Información", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FrmPuntoDeVenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.actualizarCampos();
    }

    private void actualizarCampos() {
        DefaultTableModel modeloEscaneados = (DefaultTableModel) tblProductosVenta.getModel();
        Float subtotal = 0F;
        Float cantidad = 0F;
        for (int i = 0; i < modeloEscaneados.getRowCount(); i++) {
            subtotal += (Float) modeloEscaneados.getValueAt(i, 4);
            cantidad += (Float) modeloEscaneados.getValueAt(i, 1);
        }
        txtTotal.setText(subtotal + "");
        txtCantidad.setText(cantidad + "0");
        txtBascula.setText("1");
        txtCodBarras.setText("");
    }

    public void cobrarEfectivoConsola() throws SQLException {
        if (verificacionDeCamposVenta()) {
            if (!txtTotal.getText().equalsIgnoreCase("0"));
            String respuesta = "0";
            if (!txtTotal.getText().equalsIgnoreCase("0")) {
                do {
                    respuesta = JOptionPane.showInputDialog(null, "Ingrese el monto del pago");
                    if (!isFloat(respuesta)) {
                        respuesta = "0";
                    }
                    if (Float.parseFloat(respuesta) < Float.parseFloat(txtTotal.getText())) {
                        JOptionPane.showMessageDialog(this, "El monto de la compra es mayor a la cantidad ingresada ", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } while (Float.parseFloat(respuesta) < Float.parseFloat(txtTotal.getText()));
            }
            Float cambio = Float.parseFloat(respuesta) - Float.parseFloat(txtTotal.getText());
            JOptionPane.showMessageDialog(this, "Su cambio es -> " + cambio, "Informacion", JOptionPane.INFORMATION_MESSAGE);
            Balance balance2 = this.controlBalances.obtenerBalancePorEmpleado(this.date1, this.date1, this.empleado);
            if (balance2 != null) {
                balance2.setEfectivoIngresado(balance2.getEfectivoIngresado() + Float.parseFloat(txtTotal.getText()));
                controlBalances.actualizarBalance(balance2);
            }
            try {
                this.registrarVenta();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo registrar la VENTA.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            try {
                Thread.sleep(2 * 1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(FrmAbarrotesElPanda.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Los campos de la venta no pueden estar vacios", "Información", JOptionPane.ERROR_MESSAGE);
        }
        this.limpiarFormulario();

    }

    public void cobrarEfectivoMetodo() throws SQLException {
        Balance balance2 = this.controlBalances.obtenerBalancePorEmpleado(this.date1, this.date1, this.empleado);
        if (balance2 != null) {
            balance2.setEfectivoIngresado(balance2.getEfectivoIngresado() + Float.parseFloat(txtTotal.getText()));
            controlBalances.actualizarBalance(balance2);
        }
        try {
            Thread.sleep(2 * 1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(FrmAbarrotesElPanda.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.limpiarFormulario();
    }

    public void cobrarEnTarjeta() throws SQLException {
        int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cobrar en tarjeta?");
        if (resp == 0) {
            Balance balance2 = this.controlBalances.obtenerBalancePorEmpleado(this.date1, this.date1, this.empleado);
            if (balance2 != null) {
                balance2.setVaucherIngresado(balance2.getVaucherIngresado() + Float.parseFloat(txtTotal.getText()));
                controlBalances.actualizarBalance(balance2);
            }
            try {
                this.registrarVenta();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo registrar la VENTA.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            try {
                Thread.sleep(2 * 1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(FrmAbarrotesElPanda.class.getName()).log(Level.SEVERE, null, ex);
            }

            this.limpiarFormulario();
        } else {
            JOptionPane.showMessageDialog(null, "Operacion Cancelada ", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public boolean cobrarCredito() throws SQLException, ParseException {
        int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cobrar en credito?");
        float adeudo = (float) cliente.getAdeudo();
        if (resp == 0) {
            if (cliente != null && adeudo < cliente.getLimiteCredito()) {
                Balance balance2 = this.controlBalances.obtenerBalancePorEmpleado(this.date1, this.date1, this.empleado);
                if (balance2 != null) {
                    balance2.setCredito(balance2.getCredito() + Float.parseFloat(txtTotal.getText()));
                    controlBalances.actualizarBalance(balance2);
                    cliente.setAdeudo(cliente.getAdeudo() + Float.parseFloat(txtTotal.getText()));
                    controlClientes.actualizarCliente(cliente.getId(), cliente);
                }
                try {
                    this.registrarVenta();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "No se pudo registrar la VENTA.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                try {
                    Thread.sleep(2 * 1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(FrmAbarrotesElPanda.class.getName()).log(Level.SEVERE, null, ex);
                }

                this.limpiarFormulario();
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Limite de credito excedido", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Operacion Cancelada ", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCobrar;
    private javax.swing.JLabel lblBanner;
    private javax.swing.JLabel lblBascula;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCodBarras;
    private javax.swing.JLabel lblEncabezado;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblJMJR;
    private javax.swing.JLabel lblMenuSupervisor;
    private javax.swing.JLabel lblPanda;
    private javax.swing.JLabel lblSoporte;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JScrollPane scrollTabla;
    private javax.swing.JTable tblProductosVenta;
    private javax.swing.JTextField txtBascula;
    private javax.swing.JTextField txtCantidad;
    public javax.swing.JTextField txtCodBarras;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
    private final ControlProductos controlProductos = new ControlProductos();
    private final ControlVistas controlVistas = new ControlVistas();
    private final ControlVentas controlVentas = new ControlVentas();
    private final ControlClientes controlClientes = new ControlClientes();
    private final ControlBalances controlBalances = new ControlBalances();
    private final ControlProductosVentas controlProductosVentas = new ControlProductosVentas();
    private final DlgAutorizacionCiente dlgAutorizacionCiente = new DlgAutorizacionCiente(this);
}
