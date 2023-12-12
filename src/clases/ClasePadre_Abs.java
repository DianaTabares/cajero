
package clases;
import java.util.Scanner;

public abstract class ClasePadre_Abs {
    
    protected int transacciones, retiro, deposito;
    private static int saldo;
    Scanner entrada = new Scanner(System.in);
    
    public void Operaciones(){
        int bandera = 0;
        int seleccion = 0;
        do{
            do{
                System.out.println("Por favor seleccion una opcion:" );
                System.out.println("    1. Consulta de saldo." );
                System.out.println("    2. Retiro de efectivo." );
                System.out.println("    3. Deposito de efectivo." );
                System.out.println("    4. Salir." );
                seleccion = entrada.nextInt();

                if(seleccion >= 1 && seleccion <=4){
                    bandera = 1;
                }else{
                    System.out.println("---------------------------------------------------");
                    System.out.println("Opcion no disponible, vuelva a intentar por favor. ");
                }
            }while(bandera == 0);
            
            if(seleccion == 1){
                ClasePadre_Abs mensajero = new ClaseHija_Consulta();
                mensajero.Trasacciones();  
            }else if(seleccion == 2){
                ClasePadre_Abs mensajero = new ClaseHija_Retiro();
                mensajero.Trasacciones();
            }else if(seleccion == 3){
                ClasePadre_Abs mensajero = new ClaseHija_Deposito();
                mensajero.Trasacciones();  
            }else if(seleccion == 4){
                System.out.println("-------------------------");
                System.out.println("!Gracias¡, vuelva pronto.");
                System.out.println("-------------------------");
                bandera = 2;
            }
        }while(bandera != 2);   
    }
    
    //Metodo para solicitar cantidad de retiro
    public void Retiro(){
        retiro = entrada.nextInt();
    }
    
    //Metodo para solicitar deposito
    public void Deposito(){
        deposito = entrada.nextInt();
    }
    
    //Metodo abstract
    public abstract void Trasacciones(); 
    
    //Metodos setter y getter

    public static int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
}
