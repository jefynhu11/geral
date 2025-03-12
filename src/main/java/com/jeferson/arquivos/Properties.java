package com.jeferson.arquivos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Properties {

    private static final String FILE_NAME = "produto.properties";

    public static void salvarProduto(String nome, String preco) {
        java.util.Properties prop = new java.util.Properties();
        try (FileOutputStream out = new FileOutputStream(FILE_NAME)) {
            prop.setProperty("produto.nome", nome);
            prop.setProperty("produto.preco", preco);
            prop.store(out, "Dados do Produto");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void obterProduto() {
        java.util.Properties prop = new java.util.Properties();
        try (FileInputStream in = new FileInputStream(FILE_NAME)) {
            prop.load(in);
            System.out.println("Nome: " + prop.getProperty("produto.nome"));
            System.out.println("Preço: " + prop.getProperty("produto.preco"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
