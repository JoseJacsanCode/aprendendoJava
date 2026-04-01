# Aprendendo Java - Exercícios Comuns

Este repositório contém uma coleção de exercícios básicos em Java desenvolvidos para praticar conceitos fundamentais como entrada e saída de dados, processamento aritmético e formatação de valores.

## 🚀 Tecnologias Utilizadas

*   **Java JDK 8+**
*   **Scanner API** (para entrada de dados)
*   **Locale** (para padronização de casas decimais)

## 📁 Estrutura do Projeto

Os arquivos estão localizados no pacote `exerciciosComuns` e cobrem agluns dos seguintes problemas:

1.  **`LerInteiros.java`**: Um programa simples que lê dois valores inteiros e exibe a soma entre eles.
2.  **`AreaCirculo.java`**: Calcula a área de um círculo dado o valor do raio, utilizando a fórmula `área = π . raio²` com π = 3.14159. Apresenta o resultado com quatro casas decimais.
3.  **`DiferencaEntreInteiros.java`**: Lê quatro valores (A, B, C, D) e calcula a diferença do produto de A e B pelo produto de C e D (`A * B - C * D`).
4.  **`DadosDoFuncionario.java`**: Lê o número de um funcionário, horas trabalhadas e valor por hora, calculando o salário final com duas casas decimais.
5.  **`ProblemasDePecas.java`**: Lê o código, a quantidade e o valor unitário de duas peças diferentes, calculando o valor total a ser pago.

## 🛠️ Como Executar

Para compilar e executar qualquer um dos exercícios, utilize o terminal na raiz do projeto:

1.  **Compilar:**
    ```bash
    javac exerciciosComuns/*.java
    ```

2.  **Executar (Exemplo com AreaCirculo):**
    ```bash
    java exerciciosComuns.AreaCirculo
    ```

## 📝 Exemplos de Entrada e Saída

### Cálculo de Salário
*   **Entrada:** `25`, `100`, `5.50`
*   **Saída:** `NUMBER = 25`, `SALARY = U$ 550.00`

### Cálculo de Peças
*   **Entrada:** 
    *   `12 1 5.30`
    *   `16 2 5.10`
*   **Saída:** `VALOR A PAGAR: R$ 15.50`

---
Este projeto serve como base de estudos para lógica de programação em Java.