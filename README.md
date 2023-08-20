# Projeto de Funcionalidades de um iPhone utilizando Diagramação de Classes em Java

Este repositório contém um projeto de implementação das funcionalidades de um iPhone utilizando o paradigma de Programação Orientada a Objetos (POO) e a linguagem Java. O objetivo desse projeto é demonstrar a criação e organização de classes para simular as diversas características e recursos presentes em um iPhone.

## Funcionalidades Implementadas

O projeto inclui a implementação de várias funcionalidades inspiradas em um iPhone, incluindo:

1. **Ligação:** Um sistema simples para atender, correio de voz e verifica correio de voz.
2. **Navegador:** A capacidade de abrir páginas, visualizar páginas e atualizar páginas.
3. **Aplicativos:** Um conjunto de aplicativos fictícios, cada um representado por uma classe, demonstrando a estrutura de herança e polimorfismo.
4. **Música:** Funcionalidade para armazenar e reproduzir músicas, mostrando a interação entre diferentes classes.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- `src/` : Contém o código-fonte do projeto.
  - `main/` : Contém as classes principais que implementam as funcionalidades do iPhone.
  - `model/` : Contém as classes que representam os diferentes modelos de iPhone.
  - `apps/` : Contém as classes que representam os aplicativos disponíveis no iPhone.
  - `util/` : Contém classes utilitárias, como aquelas relacionadas à manipulação de mensagens, contatos, etc.
- `diagrams/` : Contém diagramas de classes (gerados ou desenhados manualmente) que ilustram a estrutura das classes no projeto.

## Como Executar o Projeto

1. Certifique-se de ter o ambiente Java configurado em sua máquina.
2. Clone este repositório para o seu ambiente local.
3. Navegue até o diretório onde você clonou o repositório.
4. Compile as classes principais e suas dependências:
   ```bash
   javac src/main/*.java src/model/*.java src/apps/*.java src/util/*.java
   ```
5. Execute o programa principal:
   ```bash
   java src/main/Main
   ```

## Contribuindo

Contribuições são bem-vindas! Se você deseja adicionar mais funcionalidades, corrigir bugs ou melhorar a estrutura do projeto, sinta-se à vontade para abrir uma "issue" e enviar um "pull request".

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

---

Este README fornece uma visão geral do projeto e de como executá-lo. Certifique-se de atualizar as seções conforme necessário para refletir a estrutura e detalhes específicos do seu projeto. Lembre-se de incluir informações suficientes para que outros desenvolvedores possam entender e contribuir facilmente para o seu projeto.
