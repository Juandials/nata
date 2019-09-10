
package vehiculo.pkg1;

import javax.swing.JOptionPane;
import java.util.Scanner;
public class usuario {
    String contra;
    Scanner sc=new Scanner(System.in);
   
        String name, contrasena;
 public void clave(){
contrasena="malia1804";
}
 
     public void setname(){
    name=JOptionPane.showInputDialog("ingrese nombre");
 
  }
      public boolean ValidacionContraseña(String contra){
         
          return (contrasena.equals(contra));

      }
}
