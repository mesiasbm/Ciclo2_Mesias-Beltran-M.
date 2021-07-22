/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyec_hogar_comunitario_g42;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author FAMILIA
 */
public class Proyec_hogar_comunitario_G42 {

    private static Object inst_fecha_actual;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date inst_fecha_actual = new Date();
        SimpleDateFormat isnt_cambiar_formato = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(isnt_cambiar_formato.format(inst_fecha_actual));
        String fecha= isnt_cambiar_formato.format(inst_fecha_actual);
    
        Hogar_ComunitarioClass isnt_Hogar = new Hogar_ComunitarioClass("Juan",'M',fecha,true,"Andres Rodriguez", "101105");
        System.out.println(isnt_Hogar.funcion_consultar_info_hogar());
    }
    
    
}
