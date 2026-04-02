# Matrix Zeroes - Desafio técnico

Implementação do problema **Set Matrix Zeroes**, onde, dado uma matriz `m x n`, se um elemento for `0`, toda sua linha e coluna devem ser definidas como `0`.

---

## Abordagem

A solução foi implementada com foco em **otimização de espaço**, utilizando a própria matriz como estrutura auxiliar.

### Estratégia:

1. Verificar se a **primeira linha** e **primeira coluna** possuem zeros
2. Usar a primeira linha e coluna como **marcadores**
3. Percorrer a matriz marcando quais linhas/colunas devem ser zeradas
4. Aplicar as marcações
5. Ajustar a primeira linha e coluna, se necessário

---

## Complexidade

* **Tempo:** `O(m × n)`
* **Espaço:** `O(1)`

> Não é possível melhorar a complexidade de tempo, pois é necessário percorrer toda a matriz ao menos uma vez.

---

## Testes

Os testes foram implementados utilizando **JUnit 5**, cobrindo diversos cenários:

* Caso básico
*  Zero na primeira linha
* Zero na primeira coluna
* Múltiplos zeros
* Nenhum zero
* Todos os elementos zero
* Matrizes degeneradas (1xN e Nx1)

---

## Estrutura do Projeto

```
src/
 ├── main/java/
 │   └── MatrixZeroes.java
 │
 └── test/java/
     └── MatrixZeroesTest.java
```

---

## Como Executar os Testes

```bash
mvn test
```

---

## Exemplo

### Entrada:

```
[
 [1,1,1],
 [1,0,1],
 [1,1,1]
]
```

### Saída:

```
[
 [1,0,1],
 [0,0,0],
 [1,0,1]
]
```

---





## Autor

Desenvolvido por **Davi Huffenbaecher**
