# Sistema de Eventos

## Sobre o Projeto

O **Sistema de Eventos** é um projeto desenvolvido para a disciplina de Programação Orientada a Objetos, usando a linguagem Java, proposto pelo professor Leonardo Lucena. O sistema permite o gerenciamento de eventos, incluindo cadastro de eventos, participantes e palestrantes, além da venda de ingressos.

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
- Tâmara Thais Lourenço de Carvalho
Desenvolvido por [rubythais](https://github.com/rubythais) como parte do curso de Análise e Desenvolvimento de Sistemas no IFRN - Campus Natal Central.
