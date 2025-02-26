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

## Executando a Interface Gráfica do Sistema de Eventos

### **Pré-requisitos**
Antes de rodar a interface gráfica, certifique-se de que possui:

- **Java 17 ou superior** instalado.
- **Um ambiente de desenvolvimento Java** (IntelliJ IDEA, Eclipse, VS Code ou NetBeans).
- O repositório do projeto clonado localmente:
  ```bash
  git clone https://github.com/rubythais/SistemaDeEventos.git
  cd SistemaDeEventos
  ```

---

# Executar Interface Gráfica (MainGUI)


## Pré-requisitos

- Java Development Kit (JDK) instalado em seu sistema
- Código-fonte do projeto baixado em seu computador

## Passos para Execução

1. **Abra o Prompt de Comando**
   - No Windows: Pressione `Win + R`, digite `cmd` e pressione Enter
   - No macOS: Abra o Terminal
   - No Linux: Abra o Terminal

2. **Navegue até o Diretório do Projeto**
Substitua `caminho/para/SistemaDeEventos` pelo caminho real do seu projeto.

3. **Compile o Projeto**
```
   cd caminho/para/SistemaDeEventos
  ```
Este comando compila todos os arquivos Java no diretório `src` e seus subdiretórios, colocando os arquivos `.class` resultantes no diretório `bin`.
4. **Execute a Interface Gráfica**
```
   javac -d bin src/*.java src/*/*.java
  ```
Este comando executa a classe MainGUI, que inicia a interface gráfica do sistema.
```
   java -cp bin MainGUI
  ```
## Solução de Problemas

- Se você encontrar um erro de "Classe não encontrada", verifique se o caminho do classpath está correto e se a classe MainGUI está no pacote correto.
- Certifique-se de que todas as dependências necessárias estão no classpath.
- Se a interface gráfica não aparecer, verifique se seu sistema suporta interfaces gráficas Java (Swing).

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
