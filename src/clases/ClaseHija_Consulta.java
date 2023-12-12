
package clases;

public class ClaseHija_Consulta extends ClasePadre_Abs{
    
    @Override
    public void Trasacciones(){
        System.out.println("-----------------------------------");
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.println("-----------------------------------");
    }
            
            
    
    
}
