package arraylist;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class VentanaBuscarAlumno extends javax.swing.JFrame {

    // BASE DATOS
    List<Alumno> alumnos_al = new ArrayList<>();
    DefaultListModel<String> modeloListaID = new DefaultListModel<>();
    DefaultListModel<String> modeloListaNOMBRE = new DefaultListModel<>();

    public VentanaBuscarAlumno() {
        initComponents();
        personalizarVentana();
        anadirPorDefecto();
        lstAsignaturasID.setModel(modeloListaID);
        lstResultadosAsignatura.setModel(modeloListaID); // Añadir este modelo para los resultados de búsqueda por asignatura
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
        ImageIcon icono = new ImageIcon("image/cross");
        setIconImage(icono.getImage());
    }

    private void cmdBuscarAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {
        modeloListaID.clear();  // Limpiar la lista anterior
        String asignaturaBuscar = txtBuscarAsignatura.getText();
        List<Alumno> alumnosPorAsignatura = buscarPorAsignatura(asignaturaBuscar);

        if (alumnosPorAsignatura.size() > 0) {
            for (Alumno alumno : alumnosPorAsignatura) {
                modeloListaID.addElement(alumno.getIdAlumno() + " - " + alumno.getNombre() + " " + alumno.getApellido());
            }
        } else {
            JOptionPane.showMessageDialog(null, "NO EXISTE ALUMNOS CON DICHA ASIGNATURA", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public List<Alumno> buscarPorAsignatura(String asignatura) {
        List<Alumno> alumnosPorAsignatura = new ArrayList<>();
        for (Alumno alumno : alumnos_al) {
            if (alumno.getAsignaturas_al().contains(asignatura)) {
                alumnosPorAsignatura.add(alumno);
            }
        }
        return alumnosPorAsignatura;
    }

    // Método initComponents y otras partes del código (omitido por brevedad)
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jtpPESTANIA = new javax.swing.JTabbedPane();
        jpID = new javax.swing.JPanel();
        lblBuscarID = new javax.swing.JLabel();
        txtBuscarID = new javax.swing.JTextField();
        cmdBuscarID = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstAsignaturasID = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaMostrarID = new javax.swing.JTextArea();
        jpNOMBRE = new javax.swing.JPanel();
        lblBuscarNOMBRE = new javax.swing.JLabel();
        txtBuscarNOMBRE = new javax.swing.JTextField();
        cmdBuscarNOMBRE = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstAsignaturasNOMBRE = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        txaMostrarNOMBRE = new javax.swing.JTextArea();
        jpASIGNATURA = new javax.swing.JPanel();
        lblBuscarAsignatura = new javax.swing.JLabel();
        txtBuscarAsignatura = new javax.swing.JTextField();
        cmdBuscarAsignatura = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstResultadosAsignatura = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BUSCAR ALUMNO");

        lblBuscarID.setText("BUSCAR POR ID");

        txtBuscarID.setFont(new java.awt.Font("Courier New", 0, 12));
        txtBuscarID.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cmdBuscarID.setText("BUSCAR");
        cmdBuscarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarIDActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lstAsignaturasID);

        txaMostrarID.setEditable(false);
        txaMostrarID.setColumns(20);
        txaMostrarID.setFont(new java.awt.Font("Courier New", 0, 12));
        txaMostrarID.setForeground(new java.awt.Color(51, 51, 255));
        txaMostrarID.setRows(5);
        jScrollPane2.setViewportView(txaMostrarID);

        javax.swing.GroupLayout jpIDLayout = new javax.swing.GroupLayout(jpID);
        jpID.setLayout(jpIDLayout);
        jpIDLayout.setHorizontalGroup(
                jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpIDLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2)
                                        .addGroup(jpIDLayout.createSequentialGroup()
                                                .addComponent(lblBuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtBuscarID))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpIDLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(cmdBuscarID))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jpIDLayout.setVerticalGroup(
                jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpIDLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jpIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblBuscarID)
                                        .addComponent(txtBuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmdBuscarID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jtpPESTANIA.addTab("ID", jpID);

        lblBuscarNOMBRE.setText("BUSCAR POR NOMBRE");

        txtBuscarNOMBRE.setFont(new java.awt.Font("Courier New", 0, 12));
        txtBuscarNOMBRE.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cmdBuscarNOMBRE.setText("BUSCAR");
        cmdBuscarNOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarNOMBREActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(lstAsignaturasNOMBRE);

        txaMostrarNOMBRE.setEditable(false);
        txaMostrarNOMBRE.setColumns(20);
        txaMostrarNOMBRE.setFont(new java.awt.Font("Courier New", 0, 12));
        txaMostrarNOMBRE.setForeground(new java.awt.Color(51, 51, 255));
        txaMostrarNOMBRE.setRows(5);
        jScrollPane4.setViewportView(txaMostrarNOMBRE);

        javax.swing.GroupLayout jpNOMBRELayout = new javax.swing.GroupLayout(jpNOMBRE);
        jpNOMBRE.setLayout(jpNOMBRELayout);
        jpNOMBRELayout.setHorizontalGroup(
                jpNOMBRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpNOMBRELayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jpNOMBRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane4)
                                        .addGroup(jpNOMBRELayout.createSequentialGroup()
                                                .addComponent(lblBuscarNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtBuscarNOMBRE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpNOMBRELayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(cmdBuscarNOMBRE))
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jpNOMBRELayout.setVerticalGroup(
                jpNOMBRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpNOMBRELayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jpNOMBRELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblBuscarNOMBRE)
                                        .addComponent(txtBuscarNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmdBuscarNOMBRE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jtpPESTANIA.addTab("NOMBRE", jpNOMBRE);

        lblBuscarAsignatura.setText("BUSCAR POR ASIGNATURA");

        txtBuscarAsignatura.setFont(new java.awt.Font("Courier New", 0, 12));
        txtBuscarAsignatura.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cmdBuscarAsignatura.setText("BUSCAR");
        cmdBuscarAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarAsignaturaActionPerformed(evt);
            }
        });

        jScrollPane5.setViewportView(lstResultadosAsignatura);

        javax.swing.GroupLayout jpASIGNATURALayout = new javax.swing.GroupLayout(jpASIGNATURA);
        jpASIGNATURA.setLayout(jpASIGNATURALayout);
        jpASIGNATURALayout.setHorizontalGroup(
                jpASIGNATURALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpASIGNATURALayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jpASIGNATURALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane5)
                                        .addGroup(jpASIGNATURALayout.createSequentialGroup()
                                                .addComponent(lblBuscarAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtBuscarAsignatura))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpASIGNATURALayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(cmdBuscarAsignatura)))
                                .addContainerGap())
        );
        jpASIGNATURALayout.setVerticalGroup(
                jpASIGNATURALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpASIGNATURALayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jpASIGNATURALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblBuscarAsignatura)
                                        .addComponent(txtBuscarAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmdBuscarAsignatura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jtpPESTANIA.addTab("ASIGNATURA", jpASIGNATURA);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtpPESTANIA)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtpPESTANIA)
        );

        pack();
    }

    private void cmdBuscarIDActionPerformed(java.awt.event.ActionEvent evt) {
        // Implementación del método para buscar por ID
    }

    private void cmdBuscarNOMBREActionPerformed(java.awt.event.ActionEvent evt) {
        // Implementación del método para buscar por nombre
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaBuscarAlumno().setVisible(true);
            }
        });
    }

    private javax.swing.JButton cmdBuscarAsignatura;
    private javax.swing.JButton cmdBuscarID;
    private javax.swing.JButton cmdBuscarNOMBRE;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPanel jpASIGNATURA;
    private javax.swing.JPanel jpID;
    private javax.swing.JPanel jpNOMBRE;
    private javax.swing.JTabbedPane jtpPESTANIA;
    private javax.swing.JLabel lblBuscarAsignatura;
    private javax.swing.JLabel lblBuscarID;
    private javax.swing.JLabel lblBuscarNOMBRE;
    private javax.swing.JList<String> lstAsignaturasID;
    private javax.swing.JList<String> lstAsignaturasNOMBRE;
    private javax.swing.JList<String> lstResultadosAsignatura;
    private javax.swing.JTextArea txaMostrarID;
    private javax.swing.JTextArea txaMostrarNOMBRE;
    private javax.swing.JTextField txtBuscarAsignatura;
    private javax.swing.JTextField txtBuscarID;
    private javax.swing.JTextField txtBuscarNOMBRE;
}
