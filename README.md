# **Estudo de Polimorfismo e Interface.**

## **Descrição do Código**
Este programa demonstra o uso de **polimorfismo por herança** e **polimorfismo por interface** com o exemplo de diferentes veículos: **carro**, **bicicleta** e **barco**. O objetivo é mostrar como esses dois tipos de polimorfismo ajudam a organizar, simplificar e tornar o código mais flexível e reutilizável.

### **Estrutura do Código**

1. **Interface `Veiculo`:**
   - Define dois métodos que todos os veículos devem implementar:
     - **`acelerar()`**: Representa como cada veículo acelera, de forma específica.
     - **`interagir()`**: Representa uma ação particular de cada veículo, como estacionar ou navegar.

2. **Classe Abstrata `VeiculoTerrestre`:**
   - Representa veículos terrestres genéricos.
   - Implementa a interface `Veiculo` e fornece uma implementação padrão para algumas ações, como estacionar.
   - Serve de base para veículos terrestres como **carro** e **bicicleta**.

3. **Classes Específicas `Carro` e `Bicicleta`:**
   - Herdam de `VeiculoTerrestre`, demonstrando **polimorfismo por herança**.
   - Personalizam comportamentos, como a forma de acelerar.

4. **Classe Específica `Barco`:**
   - Implementa diretamente a interface `Veiculo`, demonstrando **polimorfismo por interface**.
   - Possui comportamentos únicos, como navegar.

5. **Classe Principal `PolimorfismoSimples`:**
   - Usa uma lista de veículos (independentemente de serem terrestres ou aquáticos).
   - Demonstra como o polimorfismo permite que métodos como `acelerar` e `interagir` sejam chamados de forma uniforme, sem verificar o tipo de cada veículo.

---

## **Como o Programa Funciona**

1. O programa cria uma lista de veículos, incluindo um carro, uma bicicleta e um barco.
2. Todos os veículos compartilham os métodos `acelerar` e `interagir`. A chamada desses métodos é feita sem se preocupar com o tipo específico do veículo, pois o Java resolve isso de forma dinamica.
3. O método `interagir` realiza ações específicas de cada veículo:
   - Carros e bicicletas estacionam.
   - Barcos navegam.

---

## **O Que É Polimorfismo?**

O polimorfismo é um dos pilares da programação orientada a objetos. Ele permite que objetos de diferentes tipos respondam a chamadas de métodos de maneira única, mesmo que esses métodos tenham o mesmo nome.

### **Polimorfismo por Herança**
  - Quando classes filhas (como `Carro` e `Bicicleta`) herdam de uma classe base (como `VeiculoTerrestre`).
  - As classes filhas podem reutilizar comportamentos da classe base ou sobrescrevê-los para implementar algo único.

- **Como é usado no código?**
  - `Carro` e `Bicicleta` herdam o método `interagir()` de `VeiculoTerrestre` e o comportamento padrão de estacionar.
  - Cada classe sobrescreve o método `acelerar()` para exibir a forma específica como acelera.

- **Vantagens:**
  - **Reaproveitamento de código:** O comportamento de estacionar está definido apenas na classe base, economizando esforço.
  - **Facilidade de expansão:** Para adicionar outro veículo terrestre, basta criar uma nova classe que herda de `VeiculoTerrestre`.
  - **Organização:** A separação de comportamentos comuns e específicos torna o código mais limpo.

---

### **Polimorfismo por Interface**
  - Quando classes diferentes implementam a mesma interface (como `Veiculo`), garantindo que têm os mesmos métodos.
  - Cada classe pode implementar os métodos de maneira diferente.

- **Como é usado no código?**
  - `Carro`, `Bicicleta` e `Barco` implementam a interface `Veiculo`, garantindo que possuem os métodos `acelerar` e `interagir`.
  - `Barco` implementa diretamente a interface e define um comportamento exclusivo (navegar em vez de estacionar).

- **Vantagens:**
  - **1.** Objetos completamente diferentes (como carros e barcos) podem ser tratados da mesma forma ao serem adicionados a uma lista de `Veiculo`.
  - **2.** Não há dependência entre as classes que implementam a interface. Isso mantém o código mais modular e organizado.
  - **3.** Adicionar novos tipos de veículos é simples, bastando implementar a interface.

---

## **Vantagens do Polimorfismo no Código**

1. **Código Simples e Limpo:**
   - Não há necessidade de verificar manualmente o tipo do veículo.
   - Os métodos `acelerar` e `interagir` são chamados de forma uniforme, e o comportamento correto é executado automaticamente.

2. **Reutilização e Redução de Código:**
   - Com o polimorfismo por herança, comportamentos comuns estão centralizados na classe base, evitando duplicação.

3. **Facilidade de Adição de Novos Tipos:**
   - Novos tipos de veículos podem ser facilmente integrados sem alterar o código existente, apenas implementando a interface ou herdando da classe base.

4. **Organização:**
   - O código segue uma estrutura clara, separando responsabilidades entre classes, interface e métodos.

---
