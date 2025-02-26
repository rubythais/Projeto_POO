package repository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArquivoRepository {
    private static final String DIRETORIO = "dados/";

    public void salvar(Object objeto) {
        String nomeArquivo = DIRETORIO + objeto.getClass().getSimpleName() + ".dat";
        List<Object> objetos = carregarTodos(objeto.getClass());
        objetos.add(objeto);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            oos.writeObject(objetos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public <T> List<T> carregarTodos(Class<T> classe) {
        String nomeArquivo = DIRETORIO + classe.getSimpleName() + ".dat";
        List<T> objetos = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            objetos = (List<T>) ois.readObject();
        } catch (FileNotFoundException e) {
            // Arquivo ainda não existe, retorna lista vazia
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return objetos;
    }

    // Outros métodos conforme necessário
}
