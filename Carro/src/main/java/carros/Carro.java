
package carros;

public class Carro {

    // Atributos privados
    private String modelo;
    private String cor;
    private int vel;

    // Construtor
    public Carro(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
        this.vel = 0; // carro está parado
    }

    // Velocidade do carro
    public void acelerar() {
        if (vel < 200) { // Limite de segurança
            vel += 10;
             System.out.println("Acelerando! Velocidade atual: "  + vel + " Km/h");
        } else {
        System.out.println("Velocidade maxima atingida");}

       } 

    public void frear(){
        if(vel >0){
        vel -= 10;
        System.out.println("Freando! Velocidade atual: " + vel + " Km/h");
        } else{
        System.out.println("O carro já está parado.");
        }
}
}


