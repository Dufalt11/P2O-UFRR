
package testecarro;
import carros.Carro;

public class testecarro {
       public static void main(String[] args) {
        // criando o objeto carro
        Carro meucarro = new Carro("Corolla", "Azul");
        // testando os métodos
        meucarro.acelerar();
        meucarro.acelerar();
        meucarro.frear();
    }
}
