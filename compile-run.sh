#!/bin/bash

# Cores para saída
GREEN='\033[0;32m'
RED='\033[0;31m'
BLUE='\033[0;34m'
NC='\033[0m' # No Color

# Criar diretório de saída se não existir
mkdir -p bin

# Compilar o projeto
echo -e "${BLUE}Compilando o projeto...${NC}"
javac -d bin -cp src src/Main.java src/MainGUI.java 2> compile_errors.log

# Verificar se a compilação foi bem-sucedida
if [ $? -eq 0 ]; then
    echo -e "${GREEN}Compilação concluída com sucesso!${NC}"
    
    # Perguntar qual versão executar
    echo -e "${BLUE}Qual versão deseja executar?${NC}"
    echo "1. Console (Main)"
    echo "2. Interface Gráfica (MainGUI)"
    read -p "Escolha uma opção (1/2): " opcao
    
    case $opcao in
        1)
            echo -e "${BLUE}Executando versão console...${NC}"
            java -cp bin Main
            ;;
        2)
            echo -e "${BLUE}Executando versão com interface gráfica...${NC}"
            java -cp bin MainGUI
            ;;
        *)
            echo -e "${RED}Opção inválida!${NC}"
            ;;
    esac
else
    echo -e "${RED}Erro na compilação!${NC}"
    cat compile_errors.log
fi
