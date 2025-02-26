# 🎟️ Sistema de Eventos - Juntare

## 📌 Sobre o Projeto

O **Sistema de Eventos**, chamado **"Juntare"**, vem do italiano e significa "reunir". Este projeto foi desenvolvido para a disciplina de **Programação Orientada a Objetos (POO)**, utilizando **Java**, sob orientação do professor **Leonardo Lucena**. O sistema permite a gestão de eventos, com funcionalidades como cadastro de eventos, participantes e palestrantes, além da venda de ingressos.

## 🚀 Funcionalidades

✅ Cadastro, edição, exclusão e consulta de eventos.
✅ Registro de participantes e palestrantes.
✅ Venda de ingressos com controle de lotes.
✅ Emissão de certificados.
✅ Geração de relatórios sobre eventos e participantes.

## 🛠️ Tecnologias Utilizadas

- **Java** (JDK 17+)
- **Collections Framework** (ArrayList, HashMap)
- **Tratamento de Exceções**
- **Persistência de Dados** (Arquivos `.txt`)
- **Swing** para Interface Gráfica

## 📌 Requisitos para Execução

- **Java Development Kit (JDK 17 ou superior)**
- **IDE compatível** (IntelliJ, Eclipse, VS Code) ou execução via **terminal**

## 🏃‍♂️ Como Executar o Projeto

### 📌 Via Terminal

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

---

## 🎨 Executando a Interface Gráfica (MainGUI)

### 📌 Pré-requisitos

- **JDK 17+ instalado**
- **Código-fonte do projeto clonado**

### 📌 Passos

1. Abra o terminal ou prompt de comando.
2. Acesse a pasta do projeto:
   ```bash
   cd SistemaDeEventos
   ```
3. Compile e execute a interface gráfica:
   ```bash
   java -cp bin MainGUI
   ```

### ⚠️ Possíveis Problemas

- **Erro de classe não encontrada?** Verifique se o caminho do classpath está correto.
- **Interface não aparece?** Confirme se o sistema suporta Java Swing.
- **Arquivos de dados não carregam?** Confira se os arquivos `.txt` estão corretamente salvos na pasta do projeto.

---

## 📂 Estrutura do Projeto

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

---

## 🎓 Autor

Desenvolvido por **Tâmara Thais Lourenço de Carvalho** ([rubythais](https://github.com/rubythais)) como parte do curso de **Análise e Desenvolvimento de Sistemas** no **IFRN - Campus Natal Central**.

📌 **Observação:** O sistema salva os dados em **arquivos `.txt`**, garantindo persistência entre execuções. Caso encontre problemas, verifique sua **versão do Java**!

🔗 **Dúvidas ou sugestões?** Contribua com o projeto no GitHub! 😃


