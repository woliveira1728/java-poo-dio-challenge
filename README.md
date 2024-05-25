# Desafio DIO JAVA POO

Este projeto em Java demonstra o uso de diferentes módulos, como MusicPlayer, Telephone e Browser, tanto individualmente quanto através da classe IPhone. O projeto é estruturado de maneira a mostrar o uso de interfaces e a implementação de polimorfismo.

## Sumário

- [Introdução](#introdução)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Instalação](#instalação)
- [Uso](#uso)
- [Classes e Interfaces](#classes-e-interfaces)

## Introdução

Este projeto demonstra a funcionalidade de diferentes aplicações, como MusicPlayer, Telephone e Browser. As mesmas funcionalidades também são acessíveis através da classe IPhone, demonstrando polimorfismo e encapsulamento em Java.

## Estrutura do Projeto

.
├── src\
│ ├── IPhone\
│ │ └── Iphone.java\
│ ├── browser\
│ │ └── Browser.java\
│ ├── player\
│ │ └── MusicPlayer.java\
│ └── telephone\
│ └── Telephone.java\
│ ├── Principal.java\
├── README.md


## Instalação

Para executar este projeto, você precisa ter o Java Development Kit (JDK) instalado na sua máquina. Siga estes passos para configurar e executar o projeto:

1. Clone o repositório:
   ```sh
   git clone https://github.com/seuusuario/seu-repo.git
2. Navegue até o diretório do projeto:
   ```sh
   cd seu-repo
3. Compile os arquivos Java:
   ```sh
   javac -d bin src/**/*.java
4. Execute a aplicação:
   ```sh
   java -cp bin Principal

## Uso
### Esta aplicação demonstra as seguintes funcionalidades:

1. Executando o módulo MusicPlayer:
   - Selecionando uma faixa de música
   - Reproduzindo a música
   - Pausando a música

2. Executando o módulo Telephone:
   - Fazendo uma chamada
   - Atendendo uma chamada
   - Iniciando a caixa postal

3. Executando o módulo Browser:
   - Exibindo uma página web
   - Adicionando uma nova aba
   - Atualizando a página

4. Executando as mesmas funcionalidades através da classe IPhone, que integra todos os módulos.

## Classes e Interfaces

### Principal.java
#### A classe principal que executa os diferentes módulos individualmente e através da classe IPhone.

### IPhone/Iphone.java
#### Esta classe integra as funcionalidades de MusicPlayer, Telephone e Browser, implementando as interfaces correspondentes.

Métodos:

 - selectMusic(String music)
 - play()
 - pause()
 - call(String number)
 - toMeet()
 - startVoiceMail()
 - displayPage(String url)
 - addNewTab()
 - updatePage()

### browser/Browser.java
#### Implementa a interface IBrowser para gerenciar a navegação web.

Métodos:

 - displayPage(String url)
 - addNewTab()
 - updatePage()

### player/MusicPlayer.java
#### Implementa a interface IMusicPlayer para gerenciar a reprodução de música.

Métodos:

 - selectMusic(String music)
 - play()
 - pause()

### telephone/Telephone.java
#### Implementa a interface ITelephone para gerenciar chamadas telefônicas.

Métodos:

 - call(String number)
 - toMeet()
 - startVoiceMail()
