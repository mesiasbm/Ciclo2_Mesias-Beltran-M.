 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyec_hogar_comunitario_g42;

/**
 *
 * @author FAMILIA
 */
public class Hogar_ComunitarioClass {
    private String nombre;
    private char sexo;
    private String fecha_nacimiento;
    private boolean esquema_vacunas;
    private String nombre_acudiente;
    private String identificacion_menor;

    public Hogar_ComunitarioClass(String nombre, char sexo, String fecha_nacimiento, boolean esquema_vacunas, String nombre_acudiente, String identificacion_menor) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.fecha_nacimiento = fecha_nacimiento;
        this.esquema_vacunas = esquema_vacunas;
        this.nombre_acudiente = nombre_acudiente;
        this.identificacion_menor = identificacion_menor;
    }

    Hogar_ComunitarioClass() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the fecha_nacimiento
     */
    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    /**
     * @param fecha_nacimiento the fecha_nacimiento to set
     */
    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    /**
     * @return the esquema_vacunas
     */
    public boolean isEsquema_vacunas() {
        return esquema_vacunas;
    }

    /**
     * @param esquema_vacunas the esquema_vacunas to set
     */
    public void setEsquema_vacunas(boolean esquema_vacunas) {
        this.esquema_vacunas = esquema_vacunas;
    }

    /**
     * @return the nombre_acudiente
     */
    public String getNombre_acudiente() {
        return nombre_acudiente;
    }

    /**
     * @param nombre_acudiente the nombre_acudiente to set
     */
    public void setNombre_acudiente(String nombre_acudiente) {
        this.nombre_acudiente = nombre_acudiente;
    }

    /**
     * @return the identificacion_menor
     */
    public String getIdentificacion_menor() {
        return identificacion_menor;
    }

    /**
     * @param identificacion_menor the identificacion_menor to set
     */
    public void setIdentificacion_menor(String identificacion_menor) {
        this.identificacion_menor = identificacion_menor;
    }
    
    
    public String funcion_consultar_info_hogar(){ 
        String Esquema_vacunas;
            
        return "*******Hogar Comunitario Niños del Milenio*******\n Nombre del menor:\n  >>" + getNombre() + "\n    >>Sexo: " + getSexo() + "\n   >>Fecha de nacimiento: " + getFecha_nacimiento() + "\n  >>Vacunas al dia: " + isEsquema_vacunas() + "\n  >>Nombre acudiente: " + getNombre_acudiente() + "\n  >>Identificacion del menor: " + getIdentificacion_menor();
    }
    
    public void metodo_consultar_info_hogar(){ 
        System.out.println("Consultar nombre del menor\n" + getNombre() + " " + getSexo() + " " + getFecha_nacimiento() + " " + isEsquema_vacunas() + " " + getNombre_acudiente() + " " + getIdentificacion_menor()); 
    }  
}
