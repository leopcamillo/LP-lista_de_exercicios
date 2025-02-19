![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 01: Fluxogramas

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___

> O objetivo desta aula é exercitar o raciocínio lógico para a criação de algoritmos através de fluxogramas.

O fluxo de um algorítmo poder ser representado graficamente através de fluxogramas. Um conjunto de símbolos, representam cada ação realizada pelo programa, além disso, setas conectam estes símbolos uns com os outros indicando a sequencia em que as ações são executadas.

Para mais informações acesse [Aula 01: Fluxogramas.](https://www.notion.so/cainaantunes/Aula-01-Fluxogramas-188bde521b3b80de90f7dbd9407af71e)

***

1. Crie o fluxograma de um programa que solicita que o usuário digite sua nota e em seguida o programa exibe se o aluno foi “Aprovado” ou “Reprovado”. Leve em consideração que a nota deve estar entre 0 e 100 e que a condição para aprovação é ter uma nota igual ou superior à 50.

    ```mermaid
    flowchart TD
        start(( Início )) --> input[\ Digite sua Nota \]
        input --> verification{ Nota >= 50? }
        verification --> |Sim| A[/ Aprovado /]
        verification --> |Não| B[/ Reprovado /]
        A --> finish([ Fim ])
        B --> finish
    ```

2. Altere o exemplo anterior, acrescentando as seguintes condições: para ser o aprovado, o aluno precisar ter nota igual ou superior à 50 e frequência igual ou superior a 75%.

   ```mermaid
   flowchart TD
       start(( Início )) --> input1[\ Digite sua Nota \]
       input1 --> input2[\ Digite sua Frequência \]
       input2 --> verification{Nota >= 50?}
       verification --> |Não| B[/ Reprovado /]
       verification --> |Sim| verification2{Frequência >= 75%?}
       verification2 --> |Não| B
       verification2 --> |Sim| A[/ Aprovado /]
       A --> finish([ Fim ])
       B --> finish
   ```

3. Crie um fluxograma para calcular a soma de dois números fornecidos pelo usuário.

   ```mermaid
   flowchart TD
       start(( Início )) --> input1[\ Digite o primeiro número \]
       input1 --> input2[\ Digite o segundo número \]
       input2 --> calc[/ Soma = num1 + num2 /]
       calc --> output[\ Exibir resultado \]
       output --> finish([ Fim ])
   ```

4. Elabore um fluxograma que leia um número e exiba se ele é positivo ou negativo.

   ```mermaid
   flowchart TD
       start(( Início )) --> input[\ Digite um número \]
       input --> verification{Número >= 0?}
       verification --> |Sim| A[/ Positivo /]
       verification --> |Não| B[/ Negativo /]
       A --> finish([ Fim ])
       B --> finish
   ```

5. Desenvolva um fluxograma que leia a idade de uma pessoa e indique se ela pode votar.

   ```mermaid
   flowchart TD
       inicio(( Início )) --> entrada_1[\ Idade da pessoa \]
       entrada_1 --> verificacao{idade >= 18}
       verificacao --> |Sim| A[/ Pode Votar /]
       verificacao --> |Não| B[/ Não Pode Votar /]
       A --> finish([ Fim ])
       B --> finish
   ```

6. Crie um fluxograma que leia dois números e determine o maior entre eles.

   ```mermaid
   flowchart TD
       start(( Início )) --> input1[\ Digite o primeiro número \]
       input1 --> input2[\ Digite o segundo número \]
       input2 --> verification{num1 > num2?}
       verification --> |Sim| A[/ Maior é num1 /]
       verification --> |Não| B[/ Maior é num2 /]
       A --> finish([ Fim ])
       B --> finish
   ```

7. Crie um fluxograma que leia três números e determine o maior entre eles.

   ```mermaid
   flowchart TD
    G["Sua resposta aqui"] 
   ```

8. Construa um fluxograma para calcular o fatorial de um número fornecido pelo usuário.

   ```mermaid
   flowchart TD
    H["Sua resposta aqui"] 
   ```

9. Elabore um fluxograma para verificar se um número digitado pelo usuário é par.

   ```mermaid
   flowchart TD
      I["Sua resposta aqui"]  
   ```

10. Elabore um fluxograma para verificar se um número digitado pelo usuário é primo.

   ```mermaid
   flowchart TD
      J["Sua resposta aqui"]  
   ```

