package com.jeferson.arquivos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFolder {

    /** Caminho para criar uma pasta **/
    public static void createDirectory(String path){
        File directory = new File(path);
        if (!directory.exists()) {
            directory.mkdir();
        }
    }

    /** Caminho para apagar uma pasta. main deve ser 'deleteFolder(new File(path) **/
    public static void deleteFolder(File file) throws IOException {
        Files.delete(file.toPath());
    }

    /** Caminho para apagar um arquivo **/
    public static void deleteFile(String path) throws IOException {
        Path directoryDelete = Paths.get(path);
        boolean isDelete = Files.deleteIfExists(directoryDelete);

        if (isDelete) {
            System.out.println("Arquivo apagado com sucesso");
        } else {
            System.out.println("Arquivo não encontrado");
        }
    }

    /** Caminho para apagar uma pasta e todos os arquivos dentro dela. main deve ser 'deleteDirectoryRecursively(new File(path) **/
    public static void deleteDirectoryRecursively(File file) throws IOException {
        if (file.isDirectory()) {
            File[] entries = file.listFiles();
            if (entries != null) {
                for (File entry : entries) {
                    deleteDirectoryRecursively(entry);
                }
            }
        }
        Files.delete(file.toPath());
    }

}