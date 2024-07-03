package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alumno {

    //VARIABLES DE INSTANCIA (ATRIBUTOS)
    private String idAlumno;
    private String nombre;
    private String apellido;
    private int edad;
    private List<String> asignaturas_al;

    //CONSTRUCTORES
    public Alumno() {
        this.idAlumno = "";
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
        this.asignaturas_al = null;
    }

    public Alumno(String idAlumno, String nombre, String apellido, int edad, List<String> asignaturas_al) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.asignaturas_al = asignaturas_al;
    }

    //METODOS SET Y GET
    public String getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<String> getAsignaturas_al() {
        return asignaturas_al;
    }

    public void setAsignaturas_al(List<String> asignaturas_al) {
        this.asignaturas_al = asignaturas_al;
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", asignaturas_al=" + asignaturas_al + '}';
    }

    //OTROS METODOS
    public void entrada(List<Alumno>alumnos_al) {
        Scanner sc = new Scanner(System.in);
        List<String> aux_al = new ArrayList<>();
        System.out.print("INGRESAR IDALUMNO?");
        idAlumno = sc.next();
        if (!Util.existeIdAlumno(idAlumno, alumnos_al)) {
            System.out.print("INGRESAR NOMMBRE?");
            nombre = sc.next();
            System.out.print("INGRESAR APELLIDO?");
            apellido = sc.next();
            System.out.print("INGRESAR EDAD?");
            edad = sc.nextInt();
            System.out.print("CUANTAS ASIGNATURAS DESEA INGRESAR?");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println("INGRESE ASIGNATURA? ");
                aux_al.add(sc.next());
            }
            asignaturas_al = aux_al;
        } else {
            System.out.println("Error alumno existe");
        }
        
    
}
}