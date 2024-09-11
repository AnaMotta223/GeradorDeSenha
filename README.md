# Gerador de Senhas

Este projeto é um gerador de senhas com uma interface gráfica desenvolvida em Java. Ele permite criar senhas aleatórias com diferentes comprimentos e complexidades, ajudando a proteger suas contas e dados importantes.

## Funcionalidades

- Geração de senhas aleatórias com comprimento definido pelo usuário
- Inclui números, caracteres especiais, letras maiúsculas e minúsculas
- Interface gráfica utilizando `javax.swing`
- Tratamento de exceções para entradas inválidas

## Tecnologias

- **Linguagem:** Java
- **Bibliotecas:** `javax.swing` para a interface gráfica

## Instalação

Para executar o projeto, siga os passos abaixo:

1. Clone o repositório:

    ```bash
    git clone https://github.com/seu-usuario/gerador-de-senhas.git
    ```

2. Compile o código:

    Navegue até o diretório do projeto e compile o arquivo `Main.java`:

    ```bash
    javac Main.java
    ```

3. Execute o programa:

    Após a compilação, execute o programa:

    ```bash
    java Main
    ```

## Uso

Ao executar o programa, uma interface gráfica será exibida solicitando o comprimento da senha desejada. O programa irá gerar e exibir a senha com base nas especificações fornecidas.

- **Digite o tamanho da senha:** Insira um valor inteiro para definir o comprimento da senha. O valor mínimo é 5.
- **Clique em "OK":** Para gerar a senha.
- **Clique em "Sair":** Para encerrar o programa.

## Exceções

O programa trata as seguintes exceções:

- **Caractere inválido:** Caso o usuário insira um valor não numérico.
- **Tamanho inválido:** Se o tamanho inserido for menor que o mínimo permitido (5 caracteres).
