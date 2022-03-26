# Desafio DIO - Abstraindo um Bootcamp usando Orientação a Objetos em Java

## Desafio de Projeto
Desenvolva sua capacidade de abstração com um problema real e implemente as evoluções que achar interessantes

## Paradigma de Programação Orientado a Objetos (POO)

A visão de Orientação a Objetos (OO) é aquela de um mundo de objetos que interagem.
Este paradigma é um modelo de análise, projeto e programação baseado na aproximação entre o mundo real e o mundo virtual,
através da criação e interação entre classes, atributos, métodos, objetos, entre outros.
São 4 os pilares principais do POO: ABSTRAÇÃO, ENCAPSULAMENTO, HERANÇA E POLIMORFISMO.

### 1. Abstração
Habilidade de concentrar-se nos aspectos essenciais de um domínio, ignorando características menos importantes ou acidentais.
Nesse contexto, objetos são abstrações de entidades existentes no domínio em questão.

### 2. Encapsulamento
Encapsular significa esconder a implementação dos objetos, criando assim interfaces de uso mais concisas e fáceis de usar/entender.
O encapsulamento favorece principalmente dois aspectos de um sistema: a manutenção e a evolução.

### 3. Herança
Permite que você defina uma classe filha que reutiliza (herda), estende ou modifica o comportamento de uma classe pai.
A classe cujos membros são herdados é chamada de classe base. A classe que herda os membros da classe base é chamada de classe derivada.

### 4. Polimorfismo
Capacidade de um objeto poder ser referenciado de várias formas, ou seja, é capacidade de tratar objetos criados a partir
das classes específicas como objetos de uma classe genérica. Cuidado, polimorfismo não quer dizer que o objeto fica se transformando,
muito pelo contrário, um objeto nasce de um tipo e morre daquele tipo, o que pode mudar é a maneira como nos referimos a ele.

## Representação do POO no projeto

### 1. Abstração
Abstraindo o domínio de um bootcamp, inicialmente foram criadas as classes: Bootcamp, Curso, Mentoria e Dev.
Posteriormente as classes foram modeladas, ou seja, foram criados os atributos e métodos essenciais para um bootcamp.

### 2. Encapsulamento
Para não expor mais do que o necessário, os atibutos das classes são apresentados com o modificador "private",
garantindo a segurança de alterações, sendo somente acessíveis através dos métodos get e set.

### 3. Herança
Como as classes Curso e Mentoria tinha abributos e métodos em comum, para evitar repetição de código
foi criada a superclasse Conteudo para que a mesma fosse herdada através do uso do "extends".

### 4. Polimorfismo
A superclasse Conteudo foi denifida como abstrata e o atributo XP_PADRAO está sendo apresentado com o modificador "protected"
servindo somente como base e tornando-se acessível apenas para as classes que a herdam, não podendo ser instanciada por si só. 

## Extensão do Domínio
Para ampliar o domínio foi criada a classe Ranking e foi implementado a interface Comparable na classe Dev.

## Stack

- Java 11
