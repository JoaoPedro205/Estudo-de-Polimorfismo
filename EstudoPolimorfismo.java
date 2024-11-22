// Interface que define um comportamento comum para diferentes tipos de veículos
interface Veiculo {
    void acelerar(); // Todos os veículos devem implementar o método acelerar
    void interagir(); // Método genérico para interações específicas
}

// Classe base para veículos terrestres (demonstração de polimorfismo por herança)
abstract class VeiculoTerrestre implements Veiculo {
    private String nome;

    public VeiculoTerrestre(String nome) {
        this.nome = nome; // Define o nome do veículo
    }

    public String getNome() {
        return nome; // Retorna o nome do veículo
    }

    // Método comum a todos os veículos terrestres
    public void estacionar() {
        System.out.println(getNome() + " está estacionando.");
    }

    // Implementação padrão do método interagir para veículos terrestres
    @Override
    public void interagir() {
        estacionar();
    }
}

// Classe específica para carros, que herda de VeiculoTerrestre
class Carro extends VeiculoTerrestre {
    public Carro(String nome) {
        super(nome); // Passa o nome para a classe base
    }

    // Implementação do método acelerar
    @Override
    public void acelerar() {
        System.out.println(getNome() + " está acelerando rapidamente.");
    }
}

// Classe específica para bicicletas, que também herda de VeiculoTerrestre
class Bicicleta extends VeiculoTerrestre {
    public Bicicleta(String nome) {
        super(nome); // Passa o nome para a classe base
    }

    // Implementação do método acelerar
    @Override
    public void acelerar() {
        System.out.println(getNome() + " está pedalando para ganhar velocidade.");
    }
}

// Classe específica para barcos, que implementam a interface diretamente
class Barco implements Veiculo {
    private String nome;

    public Barco(String nome) {
        this.nome = nome; // Define o nome do barco
    }

    public String getNome() {
        return nome; // Retorna o nome do barco
    }

    // Implementação do método acelerar
    @Override
    public void acelerar() {
        System.out.println(getNome() + " está navegando mais rápido.");
    }

    // Implementação do método interagir para barcos
    @Override
    public void interagir() {
        System.out.println(getNome() + " está navegando em direção ao cais.");
    }
}

// Classe principal para demonstrar o uso do polimorfismo
public class EstudoPolimorfismo {
    public static void main(String[] args) {
        // Criando uma lista de veículos usando polimorfismo por interface
        Veiculo[] veiculos = {
                new Carro("Fusca"),      // Carro herda de VeiculoTerrestre e implementa Veiculo
                new Bicicleta("Caloi"), // Bicicleta herda de VeiculoTerrestre e implementa Veiculo
                new Barco("Lancha")     // Barco implementa Veiculo diretamente
        };

        // Demonstrando polimorfismo: chamada ao método acelerar
        System.out.println("Acelerando veículos:");
        for (Veiculo veiculo : veiculos) {
            veiculo.acelerar(); // Polimorfismo em ação: cada veículo acelera de uma maneira específica
        }

        // Demonstrando interações específicas
        System.out.println("\nInterações específicas:");
        for (Veiculo veiculo : veiculos) {
            veiculo.interagir(); // Polimorfismo resolve dinamicamente a interação correta
        }
    }
}