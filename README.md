[JAVA_BADGE]:https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white
[SPRING_BADGE]: https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white


<h1 align="center" style="font-weight: bold;">API para Lista de Jogos 💻</h1>

![spring][SPRING_BADGE]
![java][JAVA_BADGE]


<p align="center">
  <b>Este projeto tem o objetivo de lista games de uma categoria específica como o exemplo que coloquei Jogos de Aventura e RPG ou Jogos de Plataforma, além disso a API é capaz de organizar os games em posições diferentes escolhidas pelo usuário!</b>
</p>

<h2 id="started">🚀 Quer testar?</h2>

Aqui está o passo a passo que você pode fazer para rodar a API localmente

<h3>Pré-requisitos</h3>

Esse é um dos pré-requistos que você precisa para rodar o projeto na sua máquina:

- [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)  
- [Maven](https://maven.apache.org/)  
- [Git](https://git-scm.com/)
  
<h3>Cloning</h3>

Como clonar o projeto

```bash
git clone https://github.com/Victorozana/dslist
```

<h3>Iniciando o projeto</h3>

Como você pode iniciar o meu projeto

```bash
cd dslist
mvn spring-boot:run
``````


<h2 id="routes">📍 API Endpoints</h2>

Here you can list the main routes of your API, and what are their expected request bodies.
Aqui você pode ver alguns exemplos de rotas da API. 
​
| route               | description                                          
|----------------------|-----------------------------------------------------
| <kbd>GET /http://localhost:8080/games</kbd>     | Retorna todos os jogos criados
| <kbd>GET /localhost:8080/lists/2/games</kbd>     | Retorna uma lista pelo ID
| <kbd>GET /localhost:8080/lists</kbd>     | Retorna todos as categorias de jogos criados
| <kbd>GET /localhost:8080/games/1</kbd>     | Retorna o jogo pelo Id 
| <kbd>POST /localhost:8080/lists/2/replacement</kbd>     | Reordena a lista pela posição dos jogos

