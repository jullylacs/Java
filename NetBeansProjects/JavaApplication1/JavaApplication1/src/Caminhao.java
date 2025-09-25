/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CursoJava
 */
public class Caminhao extends Veiculo {
    
    public String carreta;
    public String QuantidadePortas;
    
        // Construtor que chama o construtor da classe mãe (super)
    public Caminhao(String marca, String modelo) {
        super(marca, modelo);
    }

    // Implementação obrigatória do método abstrato da classe mãe
    @Override
    public void emitirSom() {
        System.out.println(getModelo() + " faz: Bibi!");
    }
}

    // --- MÉTODOS DE ACESSO (GETTERS E SETTERS) ---

    public String getCarreta() {
        return carreta;
    }
    public void setCarreta(String pCarreta) {
    this.carreta = pCarreta;
    }
    