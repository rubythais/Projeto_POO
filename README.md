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

###  **Passos para rodar a interface gráfica**

1. **Abra o projeto no seu ambiente de desenvolvimento**.
   - No IntelliJ: Vá em *File* > *Open* e selecione a pasta do projeto.
   - No Eclipse: Vá em *File* > *Open Projects from File System* e escolha a pasta do projeto.

2. **Compile e execute o arquivo `MainGUI.java`**.
   - Se estiver no terminal, use o seguinte comando:
     ```bash
     javac src/view/MainGUI.java
     java -cp src view.MainGUI
     ```

3. **A interface será aberta e você poderá adicionar participantes e eventos**.

---

### ---> **Possíveis Erros e Soluções**

- **Erro: "Could not find or load main class view.MainGUI"**  
  🔹 Certifique-se de que está rodando o comando dentro da pasta correta e que a estrutura do projeto está organizada como `src/view/MainGUI.java`.
  
- **Erro de bibliotecas ausentes**  
  🔹 Se houver bibliotecas externas, configure o classpath corretamente no seu ambiente de desenvolvimento.



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
