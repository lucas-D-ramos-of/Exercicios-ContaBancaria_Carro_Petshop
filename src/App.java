import java.util.Scanner;
import com.dio.java.banco.ControleClasse;
import com.dio.java.carro.*;
import com.dio.java.petshop.*;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);

        System.out.println("| Menu |");
        System.out.println("| 1- Conta Bancária |");
        System.out.println("| 2 - Carro |");
        System.out.println("| 3 - Petshop |");
        int escolha = entrada.nextInt();

        switch(escolha){

                case 1: 
                ControleClasse controle = new ControleClasse();

                controle.main();
                break; 

                case 2: 
                ControleClasseCarro carro = new ControleClasseCarro(); 

                carro.main();
                break;

                case 3:

                ControleClassePetshop petshop = new ControleClassePetshop();

                petshop.main();
                break;

                default:

        }

    }
}
