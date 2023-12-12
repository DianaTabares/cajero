
package clases;

public class ClaseHija_Retiro extends ClasePadre_Abs {
    
    @Override
    public void Trasacciones(){
        System.out.print("cuanto desea retirar: ");
        Retiro();
        if(retiro<= getSaldo()){
            transacciones = getSaldo();
            setSaldo(transacciones - retiro);
            System.out.println("-----------------------------------");
            System.out.println("Retiraste: " + retiro);
            System.out.println("Tu saldo actual es: " + getSaldo());
            System.out.println("-----------------------------------");
        }else{
            System.out.println("---------------------");
            System.out.println("Saldo insuficiente");
            System.out.println("---------------------");
        }
    }
}
