package arraylist;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
//import javax.swing.JTextField;

public class VentanaBuscarAlumno extends javax.swing.JFrame {

    //BASE DATOS
    List<Alumno> alumnos_al = new ArrayList<>();
    DefaultListModel<String> modeloLista = new DefaultListModel<>();

    public VentanaBuscarAlumno() {
        initComponents();
        personalizarVentana();
        anadirPorDefecto();
        lstAsignaturas.setModel(modeloLista);
    }

    public void anadirPorDefecto() {
        List<String> asignaturas_al = new ArrayList<>();
        asignaturas_al.add("Física");
        asignaturas_al.add("Química");

        Alumno alumno = new Alumno("A1", "Luis", "Roncal", 15, asignaturas_al);

        List<String> asignaturas1_al = new ArrayList<>();
        asignaturas1_al.add("Física");

        Alumno alumno1 = new Alumno("A2", "Luis", "Lescano", 17, asignaturas1_al);
        Alumno alumno2 = new Alumno("A3", "Antonio", "Lopez", 17, asignaturas1_al);
        Alumno alumno3 = new Alumno("A4", "Maria", "Martín", 35, asignaturas1_al);
        Alumno alumno4 = new Alumno("A5", "Elisa", "Enfant", 93, asignaturas1_al);
        Alumno alumno5 = new Alumno("A6", "Julian", "Soler", 40, asignaturas1_al);
        Alumno alumno6 = new Alumno("A7", "Julian", "Uzumaki", 34, asignaturas1_al);
        Alumno alumno7 = new Alumno("A8", "Julian", "Entiria", 9, asignaturas1_al);
        Alumno alumno8 = new Alumno("A9", "Julian", "Martinez", 40, asignaturas1_al);

        alumnos_al.add(alumno);
        alumnos_al.add(alumno1);
        alumnos_al.add(alumno2);
        alumnos_al.add(alumno3);
        alumnos_al.add(alumno4);
        alumnos_al.add(alumno5);
        alumnos_al.add(alumno6);
        alumnos_al.add(alumno7);
        alumnos_al.add(alumno8);
    }

    public void personalizarVentana() {
        ImageIcon icono = new ImageIcon("image/cross1.png");
        Image image = icono.getImage();
        this.setIconImage(image);//Cambiar el icono de la ventana

        this.setTitle("CRUD");
        this.setResizable(false); //No se redimensione
        this.setLocationRelativeTo(null);//Colocar la ventana en el centro de la pantalla
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jtpPESTANIA = new javax.swing.JTabbedPane();
        jpID = new javax.swing.JPanel();
        lblIdAlumno = new javax.swing.JLabel();
        txtIdAlumno = new javax.swing.JTextField();
        cmdBuscar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtTodo = new javax.swing.JTextField();
        txtAsignatura = new javax.swing.JTextField();
        jpAPELLIDO = new javax.swing.JPanel();
        jpNOMBRE = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaMostrar = new javax.swing.JTextArea();
        txtBuscarNombre = new javax.swing.JTextField();
        lblBuscarNombre = new javax.swing.JLabel();
        botBuscarNombre = new javax.swing.JButton();
        botNuevo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstAsignaturas = new javax.swing.JList<>();
        lblTitulo = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblIdAlumno.setText("INGRESAR IDALUMNO (EJEMPLO A1)?");

        txtIdAlumno.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtIdAlumno.setForeground(new java.awt.Color(0, 0, 255));
        txtIdAlumno.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cmdBuscar.setText("BUSCAR");
        cmdBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 255));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtApellido.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(0, 0, 255));
        txtApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtEdad.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtEdad.setForeground(new java.awt.Color(0, 0, 255));
        txtEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtAsignatura.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jpIDLayout = new javax.swing.GroupLayout(jpID);
        jpID.setLayout(jpIDLayout);
        jpIDLayout.setHorizontalGroup(
            jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTodo)
                    .addGroup(jpIDLayout.createSequentialGroup()
                        .addComponent(lblIdAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmdBuscar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jpIDLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpIDLayout.createSequentialGroup()
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpIDLayout.createSequentialGroup()
                        .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpIDLayout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(txtAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jpIDLayout.setVerticalGroup(
            jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIDLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdAlumno)
                    .addComponent(txtIdAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(txtTodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jtpPESTANIA.addTab("ID", jpID);

        javax.swing.GroupLayout jpAPELLIDOLayout = new javax.swing.GroupLayout(jpAPELLIDO);
        jpAPELLIDO.setLayout(jpAPELLIDOLayout);
        jpAPELLIDOLayout.setHorizontalGroup(
            jpAPELLIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
        );
        jpAPELLIDOLayout.setVerticalGroup(
            jpAPELLIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );

        jtpPESTANIA.addTab("APELLIDO", jpAPELLIDO);

        txaMostrar.setEditable(false);
        txaMostrar.setColumns(20);
        txaMostrar.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txaMostrar.setForeground(new java.awt.Color(51, 51, 255));
        txaMostrar.setRows(5);
        jScrollPane1.setViewportView(txaMostrar);

        txtBuscarNombre.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtBuscarNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarNombreActionPerformed(evt);
            }
        });

        lblBuscarNombre.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblBuscarNombre.setText("BUSCAR POR NOMBRE?");

        botBuscarNombre.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        botBuscarNombre.setText("BUSCAR");
        botBuscarNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botBuscarNombreMouseEntered(evt);
            }
        });
        botBuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botBuscarNombreActionPerformed(evt);
            }
        });

        botNuevo.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        botNuevo.setText("NUEVO");
        botNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botNuevoActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(lstAsignaturas);

        javax.swing.GroupLayout jpNOMBRELayout = new javax.swing.GroupLayout(jpNOMBRE);
        jpNOMBRE.setLayout(jpNOMBRELayout);
        jpNOMBRELayout.setHorizontalGroup(
            jpNOMBRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNOMBRELayout.createSequentialGroup()
                .addGroup(jpNOMBRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpNOMBRELayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(botBuscarNombre))
                    .addGroup(jpNOMBRELayout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(botNuevo))
                    .addGroup(jpNOMBRELayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jpNOMBRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpNOMBRELayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jpNOMBRELayout.createSequentialGroup()
                                .addComponent(lblBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        jpNOMBRELayout.setVerticalGroup(
            jpNOMBRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNOMBRELayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpNOMBRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBuscarNombre))
                .addGap(18, 18, 18)
                .addGroup(jpNOMBRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jpNOMBRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botBuscarNombre)
                    .addComponent(botNuevo))
                .addGap(28, 28, 28))
        );

        jtpPESTANIA.addTab("NOMBRE", jpNOMBRE);

        lblTitulo.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 51, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("BUSCAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtpPESTANIA)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtpPESTANIA))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarActionPerformed
        String idAlumnoBuscar = txtIdAlumno.getText();
        for (Alumno alumno : alumnos_al) {
            if (alumno.getIdAlumno().equals(idAlumnoBuscar)) {
                //System.out.println(alumno);
                txtTodo.setText(alumno.toString());
                txtNombre.setText(alumno.getNombre());
                txtApellido.setText(alumno.getApellido());
                txtEdad.setText(alumno.getEdad() + "");
                txtAsignatura.setText(alumno.getAsignaturas_al().toString());
            }
        }
    }//GEN-LAST:event_cmdBuscarActionPerformed

    private void botBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botBuscarNombreActionPerformed
        txaMostrar.setText("");
        String nombre = txtBuscarNombre.getText();
        List<Alumno> alumnosaux_al = obtenerListaNombres(nombre);
        if (alumnosaux_al.size() > 0) {
            txaMostrar.append(Alumno.cabecera());
            txaMostrar.append(Alumno.subrrayadoCabecera());
            for (Alumno a : alumnosaux_al) {
                //txaMostrar.append(a.toString() + "\n");
                txaMostrar.append(a.cuerpo());
                List<String> asignaturas_al = a.getAsignaturas_al();
                for (String asi : asignaturas_al) {
                    modeloLista.addElement(asi);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "NO EXISTE ALUMNOS CON DICHO NOMBRE", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        botBuscarNombre.setEnabled(false);
    }//GEN-LAST:event_botBuscarNombreActionPerformed

    private void txtBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarNombreActionPerformed
        txaMostrar.setText("");
        String nombre = txtBuscarNombre.getText();
        List<Alumno> alumnosaux_al = obtenerListaNombres(nombre);
        if (alumnosaux_al.size() > 0) {
            txaMostrar.append(Alumno.cabecera());
            txaMostrar.append(Alumno.subrrayadoCabecera());
            for (Alumno a : alumnosaux_al) {
                //txaMostrar.append(a.toString() + "\n");
                txaMostrar.append(a.cuerpo());
                List<String> asignaturas_al = a.getAsignaturas_al();
                for (String asi : asignaturas_al) {
                    modeloLista.addElement(asi);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "NO EXISTE ALUMNOS CON DICHO NOMBRE", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtBuscarNombreActionPerformed

    private void botNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botNuevoActionPerformed
        txtBuscarNombre.setText("");
        txaMostrar.setText("");
        modeloLista.clear();
        botBuscarNombre.setEnabled(true);
    }//GEN-LAST:event_botNuevoActionPerformed

    private void botBuscarNombreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botBuscarNombreMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_botBuscarNombreMouseEntered

    public List<Alumno> obtenerListaNombres(String nombre) {
        List<Alumno> alumnosaux_al = new ArrayList<>();
        for (Alumno a : alumnos_al) {
            if (a.getNombre().toLowerCase().equals(nombre.toLowerCase())) {
                alumnosaux_al.add(a);

            }
        }
        return alumnosaux_al;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaBuscarAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botBuscarNombre;
    private javax.swing.JButton botNuevo;
    private javax.swing.JButton cmdBuscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel jpAPELLIDO;
    private javax.swing.JPanel jpID;
    private javax.swing.JPanel jpNOMBRE;
    private javax.swing.JTabbedPane jtpPESTANIA;
    private javax.swing.JLabel lblBuscarNombre;
    private javax.swing.JLabel lblIdAlumno;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> lstAsignaturas;
    private javax.swing.JTextArea txaMostrar;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtAsignatura;
    private javax.swing.JTextField txtBuscarNombre;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtIdAlumno;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTodo;
    // End of variables declaration//GEN-END:variables
}
