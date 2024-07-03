package arraylist;

import java.util.List;


public class Util {
   
    
    public static boolean existeIdAlumno(String idAlumno, List<Alumno> alumnos_al) {
       boolean existe = false;
       for(Alumno a: alumnos_al)  {
           if(a.getIdAlumno().equals(idAlumno)) {
              existe = true;
              break;
           }
       }
       return existe;
    }
    
    
}