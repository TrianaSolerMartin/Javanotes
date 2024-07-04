
 /* @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}*/
package arraylist;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
//import javax.swing.JTextField;

public class VentanaBuscarAlumno extends javax.swing.JFrame {

    //BASE DATOS
    List<Alumno> alumnos_al = new ArrayList<>();
    DefaultListModel<String> modeloListaID = new DefaultListModel<>();
    DefaultListModel<String> modeloListaNOMBRE = new DefaultListModel<>();

    public VentanaBuscarAlumno() {
        initComponents();
        personalizarVentana();
        anadirPorDefecto();
        lstAsignaturasID.setModel(modeloListaID);
        llenarComboBox();
    }
    
    public void llenarComboBox() {
       for(Alumno alumno: alumnos_al){
           cboMostrarNumeros.addItem(alumno.getIdAlumno());
        }
    }

    public void anadirPorDefecto() {
        List<String> asignaturas1_al = new ArrayList<>();
        asignaturas1_al.add("Física");
        asignaturas1_al.add("Química");
        Alumno alumno1 = new Alumno("A1", "Luis", "Roncal", 15, asignaturas1_al);

        Alumno alumno2 = new Alumno("A2", "Miguel", "Alva", 17, new ArrayList<>(Arrays.asList("Religión", "Matemática", "Física", "Química")));
        Alumno alumno3 = new Alumno("A3", "Luis", "Zuñiga", 18, new ArrayList<>(Arrays.asList("Literatura", "Matemática", "Física", "Química")));
        Alumno alumno4 = new Alumno("A4", "Carmen", "Cuba", 19, new ArrayList<>(Arrays.asList("Arte", "Matemática", "Física", "Química")));
        Alumno alumno5 = new Alumno("A5", "María", "Rodriguez", 18, new ArrayList<>(Arrays.asList("Arte", "Matemática", "Física", "Química")));
        Alumno alumno6 = new Alumno("A6", "Arturo", "Alcantara", 17, new ArrayList<>(Arrays.asList("Arte", "Matemática", "Química")));
        Alumno alumno7 = new Alumno("A7", "Ismael", "Lescano", 16, new ArrayList<>(Arrays.asList("Arte", "Matemática", "Historia", "Laboral")));
        Alumno alumno8 = new Alumno("A8", "Julieta", "Jauregui", 15, new ArrayList<>(Arrays.asList("Arte", "Matemática", "Ciencias Naturales", "Laboral")));
        Alumno alumno9 = new Alumno("A9", "Silvia", "Jauregui", 15, new ArrayList<>(Arrays.asList("Arte", "Biología", "Ciencias Naturales", "Laboral")));
        Alumno alumno10 = new Alumno("A10", "Luis", "Párraga", 16, new ArrayList<>(Arrays.asList("Arte", "Biología", "Historia", "Laboral")));

        alumnos_al.add(alumno1);
        alumnos_al.add(alumno2);
        alumnos_al.add(alumno3);
        alumnos_al.add(alumno4);
        alumnos_al.add(alumno5);
        alumnos_al.add(alumno6);
        alumnos_al.add(alumno7);
        alumnos_al.add(alumno8);
        alumnos_al.add(alumno9);
        alumnos_al.add(alumno10);
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
        cmdNuevoId = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtTodo = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        cmdBuscarId = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstAsignaturasID = new javax.swing.JList<>();
        jpNOMBRE = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaMostrar = new javax.swing.JTextArea();
        txtBuscarNombre = new javax.swing.JTextField();
        lblBuscarNombre = new javax.swing.JLabel();
        cmdBuscarNombre = new javax.swing.JButton();
        cmdNuevoNombre = new javax.swing.JButton();
        jpAPELLIDO = new javax.swing.JPanel();
        lblAsignatura = new javax.swing.JLabel();
        txtAsignatura = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaMostrarAlumnosXasignatura = new javax.swing.JTextArea();
        cmdBuscarAlumnosXAsignatura = new javax.swing.JButton();
        cmdNuevoAlumnosXasignatura = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        cboMostrarNumeros = new javax.swing.JComboBox<>();
        txtIdAlumnoComboBox = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblIdAlumno.setText("INGRESAR IDALUMNO (EJEMPLO A1)?");

        txtIdAlumno.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtIdAlumno.setForeground(new java.awt.Color(0, 0, 255));
        txtIdAlumno.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cmdNuevoId.setText("NUEVO");
        cmdNuevoId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNuevoIdActionPerformed(evt);
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

        cmdBuscarId.setText("BUSCAR");
        cmdBuscarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarIdActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(lstAsignaturasID);

        javax.swing.GroupLayout jpIDLayout = new javax.swing.GroupLayout(jpID);
        jpID.setLayout(jpIDLayout);
        jpIDLayout.setHorizontalGroup(
            jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIDLayout.createSequentialGroup()
                .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpIDLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(lblIdAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpIDLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(cmdBuscarId)
                        .addGap(46, 46, 46)
                        .addComponent(cmdNuevoId)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpIDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(jpIDLayout.createSequentialGroup()
                .addComponent(txtTodo)
                .addContainerGap())
        );
        jpIDLayout.setVerticalGroup(
            jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIDLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdAlumno)
                    .addComponent(txtIdAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtTodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdBuscarId)
                    .addComponent(cmdNuevoId))
                .addGap(32, 32, 32))
        );

        jtpPESTANIA.addTab("ID", jpID);

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

        cmdBuscarNombre.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cmdBuscarNombre.setText("BUSCAR");
        cmdBuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarNombreActionPerformed(evt);
            }
        });

        cmdNuevoNombre.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cmdNuevoNombre.setText("NUEVO");
        cmdNuevoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNuevoNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpNOMBRELayout = new javax.swing.GroupLayout(jpNOMBRE);
        jpNOMBRE.setLayout(jpNOMBRELayout);
        jpNOMBRELayout.setHorizontalGroup(
            jpNOMBRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpNOMBRELayout.createSequentialGroup()
                .addGroup(jpNOMBRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpNOMBRELayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(cmdBuscarNombre))
                    .addGroup(jpNOMBRELayout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(cmdNuevoNombre))
                    .addGroup(jpNOMBRELayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(lblBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpNOMBRELayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jpNOMBRELayout.setVerticalGroup(
            jpNOMBRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNOMBRELayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpNOMBRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBuscarNombre))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jpNOMBRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdBuscarNombre)
                    .addComponent(cmdNuevoNombre))
                .addGap(28, 28, 28))
        );

        jtpPESTANIA.addTab("NOMBRE", jpNOMBRE);

        lblAsignatura.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        lblAsignatura.setText("INGREAR ASIGINATURA?");

        txtAsignatura.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtAsignatura.setForeground(new java.awt.Color(51, 0, 255));
        txtAsignatura.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txaMostrarAlumnosXasignatura.setColumns(20);
        txaMostrarAlumnosXasignatura.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txaMostrarAlumnosXasignatura.setRows(5);
        jScrollPane2.setViewportView(txaMostrarAlumnosXasignatura);

        cmdBuscarAlumnosXAsignatura.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cmdBuscarAlumnosXAsignatura.setText("BUSCAR");
        cmdBuscarAlumnosXAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarAlumnosXAsignaturaActionPerformed(evt);
            }
        });

        cmdNuevoAlumnosXasignatura.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        cmdNuevoAlumnosXasignatura.setText("NUEVO");
        cmdNuevoAlumnosXasignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNuevoAlumnosXasignaturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpAPELLIDOLayout = new javax.swing.GroupLayout(jpAPELLIDO);
        jpAPELLIDO.setLayout(jpAPELLIDOLayout);
        jpAPELLIDOLayout.setHorizontalGroup(
            jpAPELLIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAPELLIDOLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(jpAPELLIDOLayout.createSequentialGroup()
                .addGroup(jpAPELLIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAPELLIDOLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(lblAsignatura)
                        .addGap(18, 18, 18)
                        .addComponent(txtAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpAPELLIDOLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(cmdBuscarAlumnosXAsignatura)
                        .addGap(31, 31, 31)
                        .addComponent(cmdNuevoAlumnosXasignatura)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpAPELLIDOLayout.setVerticalGroup(
            jpAPELLIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAPELLIDOLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jpAPELLIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAsignatura)
                    .addComponent(txtAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jpAPELLIDOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdBuscarAlumnosXAsignatura)
                    .addComponent(cmdNuevoAlumnosXasignatura))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jtpPESTANIA.addTab("ALUMNOS X ASIGNATURA", jpAPELLIDO);

        cboMostrarNumeros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cboMostrarNumeros.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboMostrarNumerosItemStateChanged(evt);
            }
        });
        cboMostrarNumeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMostrarNumerosActionPerformed(evt);
            }
        });

        txtIdAlumnoComboBox.setEditable(false);
        txtIdAlumnoComboBox.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(cboMostrarNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(txtIdAlumnoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboMostrarNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdAlumnoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(211, Short.MAX_VALUE))
        );

        jtpPESTANIA.addTab("ID COMBOBOX", jPanel1);

        lblTitulo.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 51, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("BUSCAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jtpPESTANIA, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void cmdNuevoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevoIdActionPerformed
        txtIdAlumno.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        modeloListaID.clear();
        cmdBuscarId.setEnabled(true);
    }//GEN-LAST:event_cmdNuevoIdActionPerformed

    private void cmdBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarNombreActionPerformed
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
                    modeloListaNOMBRE.addElement(asi);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "NO EXISTE ALUMNOS CON DICHO NOMBRE", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        cmdBuscarNombre.setEnabled(false);
    }//GEN-LAST:event_cmdBuscarNombreActionPerformed

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
            }
        } else {
            JOptionPane.showMessageDialog(null, "NO EXISTE ALUMNOS CON DICHO NOMBRE", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtBuscarNombreActionPerformed

    private void cmdNuevoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevoNombreActionPerformed
        txtBuscarNombre.setText("");
        txaMostrar.setText("");
        modeloListaNOMBRE.clear();
        cmdBuscarNombre.setEnabled(true);
    }//GEN-LAST:event_cmdNuevoNombreActionPerformed

    private void cmdBuscarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarIdActionPerformed
        String idAlumno = txtIdAlumno.getText().toLowerCase().trim();
        boolean encontro = false;
        if (alumnos_al.size() > 0) {
            for (Alumno a : alumnos_al) {
                if (a.getIdAlumno().toLowerCase().equals(idAlumno)) {
                    encontro = true;
                    txtTodo.setText(a.toString());
                    txtNombre.setText(a.getNombre());
                    txtApellido.setText(a.getApellido());
                    txtEdad.setText(a.getEdad() + "");
                    List<String> asignaturas_al = a.getAsignaturas_al();
                    for (String asig : asignaturas_al) {
                        modeloListaID.addElement(asig);
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "LISTA ALUMNOS VACIA", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        if (!encontro) {
            JOptionPane.showMessageDialog(null, "ALUMNO NO EXISTE", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        cmdBuscarId.setEnabled(false);
    }//GEN-LAST:event_cmdBuscarIdActionPerformed
    private void cmdBuscarAlumnosXAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarAlumnosXAsignaturaActionPerformed
        String asignatura = txtAsignatura.getText().toLowerCase().trim();
        int encontrado = 0;
        int i = 0;
        for (Alumno a : alumnos_al) {
            List<String> asignaturas_al = a.getAsignaturas_al();
            for (String asig : asignaturas_al) {
                if (asig.toLowerCase().equals(asignatura)) {
                    if (i == 0) {
                        txaMostrarAlumnosXasignatura.append(Alumno.cabecera());
                        txaMostrarAlumnosXasignatura.append(Alumno.subrrayadoCabecera());
                        i++;
                    }
                    txaMostrarAlumnosXasignatura.append(a.cuerpo());
                    encontrado++;
                    break;
                }
            }
        }
        if (encontrado == 0) {
            JOptionPane.showMessageDialog(null, "ALUMNO NO EXISTE", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        cmdBuscarAlumnosXAsignatura.setEnabled(false);
    }//GEN-LAST:event_cmdBuscarAlumnosXAsignaturaActionPerformed

    private void cmdNuevoAlumnosXasignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevoAlumnosXasignaturaActionPerformed
        txtAsignatura.setText("");
        txaMostrarAlumnosXasignatura.setText("");
        cmdBuscarAlumnosXAsignatura.setEnabled(true);
    }//GEN-LAST:event_cmdNuevoAlumnosXasignaturaActionPerformed

    private void cboMostrarNumerosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboMostrarNumerosItemStateChanged
        String idAlumno = (String)cboMostrarNumeros.getSelectedItem();
        //System.out.println(idAlumno);
        txtIdAlumnoComboBox.setText(idAlumno);
    }//GEN-LAST:event_cboMostrarNumerosItemStateChanged

    private void cboMostrarNumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMostrarNumerosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboMostrarNumerosActionPerformed

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
    private javax.swing.JComboBox<String> cboMostrarNumeros;
    private javax.swing.JButton cmdBuscarAlumnosXAsignatura;
    private javax.swing.JButton cmdBuscarId;
    private javax.swing.JButton cmdBuscarNombre;
    private javax.swing.JButton cmdNuevoAlumnosXasignatura;
    private javax.swing.JButton cmdNuevoId;
    private javax.swing.JButton cmdNuevoNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel jpAPELLIDO;
    private javax.swing.JPanel jpID;
    private javax.swing.JPanel jpNOMBRE;
    private javax.swing.JTabbedPane jtpPESTANIA;
    private javax.swing.JLabel lblAsignatura;
    private javax.swing.JLabel lblBuscarNombre;
    private javax.swing.JLabel lblIdAlumno;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> lstAsignaturasID;
    private javax.swing.JTextArea txaMostrar;
    private javax.swing.JTextArea txaMostrarAlumnosXasignatura;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtAsignatura;
    private javax.swing.JTextField txtBuscarNombre;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtIdAlumno;
    private javax.swing.JTextField txtIdAlumnoComboBox;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTodo;
    // End of variables declaration//GEN-END:variables
}