# **Estudo de Polimorfismo e Interfaces**

## **Descrição do Código**
Este código exemplifica o uso de **polimorfismo por herança** e **polimorfismo por interface** no contexto de diferentes tipos de veículos (carros, bicicletas e barcos). Sendo criado para demonstrar a flexibilidade e a eficiência do polimorfismo, permitindo que o comportamento de classes derivadas seja definido ou sobrescrito conforme necessário.

### **Estrutura do Código**
1. **Interface `Veiculo`:**
   - Define dois métodos obrigatórios: 
     - `acelerar()` - cada veículo implementa de forma diferente.
     - `interagir()` - usado para interações específicas sem a necessidade de verificar o tipo do objeto.

2. **Classe abstrata `VeiculoTerrestre`:**
   - Implementa a interface `Veiculo`.
   - Representa um veículo terrestre genérico e fornece uma funcionalidade padrão (método `interagir`).

3. **Classes concretas `Carro` e `Bicicleta`:**
   - Herdam de `VeiculoTerrestre` (demonstrando **polimorfismo por herança**).
   - Implementam ou sobrescrevem os métodos da interface conforme necessário.

4. **Classe concreta `Barco`:**
   - Implementa a interface `Veiculo` diretamente (demonstrando **polimorfismo por interface**).
   - Define seu próprio comportamento específico para os métodos.

5. **Classe principal `PolimorfismoSimples`:**
   - Cria uma lista de veículos usando a interface `Veiculo`.
   - Usa loops para demonstrar as funcionalidades comuns (`acelerar`) e específicas (`interagir`) sem a necessidade de `instanceof`.

---

## **Execução do Código**
Ao executar o programa:
1. Os veículos na lista são acelerados, com cada um apresentando seu comportamento específico, demonstrando o uso do polimorfismo.
2. Em seguida, são chamadas interações específicas para cada tipo de veículo, resolvidas de forma dinâmica pelo método `interagir`.

---

## **Defesa e Explicação dos Tipos de Polimorfismo**

### **1. Polimorfismo por Herança**
- **Explicação:**
  - O polimorfismo por herança é demonstrado nas classes `Carro` e `Bicicleta`, que herdam da classe base `VeiculoTerrestre`.
  - Métodos como `interagir` são herdados, e `acelerar` é sobrescrito para personalizar o comportamento.

- **Vantagens no Código:**
  - **Reutilização de Código:** A lógica comum (como o método `estacionar`) está centralizada na classe base, evitando duplicação.
  - **Extensibilidade:** Adicionar novos veículos terrestres requer apenas a criação de novas subclasses que herdam de `VeiculoTerrestre`.
  - **Organização:** A hierarquia entre classes reflete a relação "é um" ("Carro é um VeiculoTerrestre").

---

### **2. Polimorfismo por Interface**
- **Explicação:**
  - Todas as classes (`Carro`, `Bicicleta`, `Barco`) implementam a interface `Veiculo`.
  - Métodos como `acelerar` e `interagir` são definidos pela interface e implementados de forma específica em cada classe.

- **Vantagens no Código:**
  - **Flexibilidade:** A interface permite que classes sem relação direta (como `Barco` e `VeiculoTerrestre`) compartilhem um contrato comum, garantindo que todas possam ser tratadas como `Veiculo`.
  - **Generalização:** O programa pode operar sobre um array de `Veiculo` sem se preocupar com os tipos específicos.
  - **Facilidade de Expansão:** Novos tipos de veículos podem ser adicionados facilmente, desde que implementem a interface.

---
