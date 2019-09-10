
package vehiculo.pkg1;

import javax.swing.JOptionPane;
import java.util.Scanner;
public class Vehiculo1 {
private  int modelo,opc;
   float kilometraje;
   String marca;
   boolean estado;
   Scanner sc=new Scanner(System.in);
   public void ingresardatos(){
       
        modelo= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el modelo "));
        marca= JOptionPane.showInputDialog("Ingrese el marca ");
        kilometraje=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el kilometraje "));
        estado= Boolean.parseBoolean(JOptionPane.showInputDialog("Ingrese el estado "));
    }
   
   public void mostrardatosVehiculo(){
       
       
    JOptionPane.showMessageDialog(null,"modelo= " +modelo);
       JOptionPane.showMessageDialog(null,"marca= " +marca);
       JOptionPane.showMessageDialog(null,"kilometraje= " +kilometraje);
       JOptionPane.showMessageDialog(null,"estado=" +estado);
   }
   public void encenderVehiculo(){
    if(estado){
        JOptionPane.showMessageDialog(null,"¡ERROR! El Vehiculo esta encendido","Datos Vehiculo",JOptionPane.ERROR_MESSAGE);
    }
    else{
        estado=true;
    }
   
   
   }
   public void apagarVehiculo(){
       if(estado){
           estado=false;
   }
       else{
       JOptionPane.showMessageDialog(null,"¡ERROR! El vehiculo esta apagado","Datos Vehiculo",JOptionPane.ERROR_MESSAGE);
       }
       
       
   }
   public void kilometroreco(float kilom){
   kilometraje= kilometraje+kilom;
   mostrarkilometros();
   
   }
   public void mostrarkilometros()
   {
       JOptionPane.showMessageDialog(null,"El vehicuo ha recorrido:"+kilometraje +"km","estado del vehiculo", JOptionPane.ERROR_MESSAGE);
   }
   public void mostrarEstado(){
   if(estado){
        JOptionPane.showMessageDialog(null," El Vehiculo esta encendido","Estado del Vehiculo",JOptionPane.ERROR_MESSAGE);
    }
    else{
       JOptionPane.showMessageDialog(null," El vehiculo esta apagado","Estado del Vehiculo",JOptionPane.ERROR_MESSAGE);
    }
   }
    public static void main(String[] args) {
       Vehiculo1 veh1= new Vehiculo1();
       usuario clave= new usuario();
       int opc;
       String contrasena;
       boolean contra;
       clave.setname();
       contrasena=JOptionPane.showInputDialog(null,"ingrese contraseña");
       contra=clave.ValidacionContraseña(contrasena);
       if(clave.ValidacionContraseña(contra)==true)
       {
        String[] menu={"ingresar datos",
         "ENCENDER",
         "APAGAR",
         "KILOMETROS A RECORRER",
         "MOSTRAR ESTADO",
         "MOSTRAR DATOS",
         "TERMINAR",
         
    };
        do{
         opc=JOptionPane.showOptionDialog(null,"Seleccione un opcion para seguir el proceso","Ejercicio Vehiculo",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null,menu,menu[0]);
       
         
             switch(opc){
            case 0:
                veh1.ingresardatos();
                break;
            case 1:  
                veh1.encenderVehiculo();
                break;
            case 2:
                 veh1.apagarVehiculo();
                break;
            case 3:
                float kilom;
                kilom=Float.parseFloat(JOptionPane.showInputDialog("ingrese kilometraje arecorrer"));
                veh1.kilometroreco(kilom);
                break;
            case 4:
                veh1.mostrarEstado();
                break;
            case 5:
                veh1.mostrardatosVehiculo();
                break;
            case 6:
                JOptionPane.showMessageDialog(null,"FIN");
                break;
               
        }
         }while(opc!=6);
       
       }
       else{
           JOptionPane.showInputDialog(null,"ingrese la contraseña correcta");
           
       } 
    }
    
}
