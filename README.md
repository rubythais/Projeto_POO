# Sistema de Eventos

## Sobre o Projeto

O **Sistema de Eventos** tem por nome ficticio **"Juntare"**, que do italiano, significa “reunir”. O **Juntare** é um projeto desenvolvido para a disciplina de Programação Orientada a Objetos, usando a linguagem Java, proposto pelo professor Leonardo Lucena. O sistema permite o gerenciamento de eventos, incluindo cadastro de eventos, participantes e palestrantes, além da venda de ingressos.

## Funcionalidades

- Cadastro, edição, exclusão e consulta de eventos
- Cadastro de participantes e palestrantes
- Venda de ingressos para eventos
- Geração de relatórios com listagens de eventos e participantes

## Tecnologias Utilizadas

- **Java** (JDK 17+)
- **Collections Framework** (ArrayList, HashMap)
- **Tratamento de Exceções**
- **Persistência de dados** (arquivos .txt)

## Requisitos

- Java Development Kit (JDK) instalado (versão 17 ou superior)
- IDE de sua preferência (IntelliJ, Eclipse, VS Code) ou terminal com Java configurado

## Como Executar o Projeto

### Via Terminal

1. Clone o repositório:
   ```bash
   git clone https://github.com/rubythais/SistemaDeEventos.git
   ```
2. Acesse a pasta do projeto:
   ```bash
   cd SistemaDeEventos
   ```
3. Compile o código:
   ```bash
   javac -d bin src/**/*.java
   ```
4. Execute o sistema:
   ```bash
   java -cp bin Main
   ```
## Executando a Interface Gráfica

Para executar a interface gráfica do Sistema de Gerenciamento de Eventos, siga estes passos:

1. Certifique-se de que você tem o Java Development Kit (JDK) instalado em sua máquina.

2. Abra um terminal ou prompt de comando.

3. Navegue até o diretório raiz do projeto:

4. Compile o projeto:
cd caminho/para/SistemaDeEventos

5. Execute a interface gráfica:
javac -d bin src/*.java src/*/*.java

6. A interface gráfica do Sistema de Gerenciamento de Eventos deve aparecer, permitindo que você interaja com o sistema.
   java -cp bin MainGUI

Nota: Certifique-se de que seu ambiente suporta interfaces gráficas Java (Swing). Em alguns ambientes de desenvolvimento baseados em nuvem, pode não ser possível executar interfaces gráficas.

### Via IDE

1. Importe o projeto na sua IDE.
2. Compile os arquivos-fonte.
3. Execute `Main.java` para rodar o sistema.

## Estrutura do Projeto

```
SistemaDeEventos/
│── src/
│   ├── interfaces/   # Interfaces do sistema
│   ├── model/        # Classes principais (Eventos, Participantes, etc.)
│   ├── repository/   # Persistência de dados
│   ├── service/      # Lógica do sistema
│   ├── utils/        # Funções auxiliares
│   ├── Main.java     # Interface via console
│── bin/              # Arquivos compilados
│── README.md         # Documentação
│── compile-run.sh    # Script para compilar e rodar
```

## Observações

- O sistema salva os dados em arquivos `.txt` dentro do diretório do projeto.
- Caso encontre problemas ao rodar, verifique a versão do Java instalada.

## Autor

- Desenvolvido por Tâmara Thais Lourenço de Carvalho
 ([rubythais](https://github.com/rubythais)) como parte do curso de Análise e Desenvolvimento de Sistemas no IFRN - Campus Natal Central.
