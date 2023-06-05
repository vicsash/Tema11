package com.victorsashnev.tema11.Lib;

import java.io.*;
import java.util.Objects;

public class FileUtilities {
    public static String confirmIfFile_Or_Directory(File f){
        StringBuilder sb = new StringBuilder();
        for(File fil : Objects.requireNonNull(f.listFiles())){
            if(fil.isFile())
               sb.append("Es un file");
            if(fil.isDirectory())
                sb.append("Es un directorio");
        }
        return sb.toString();
    }
    public static String details_Of_File(File f){
        StringBuilder sb = new StringBuilder();
        sb.append(f.getName()).append("\n");
        sb.append(f.getAbsolutePath()).append("\n");
        sb.append(f.canRead()).append("\n");
        sb.append(f.canWrite()).append("\n");
        return sb.toString();
    }
    public static String details_Of_File_In_Directory(File[]list){
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < list.length; i++ ){
            sb.append(list[i].getName()).append("\n");;
            sb.append(list[i].getAbsolutePath()).append("\n");;
            sb.append((list[i].isHidden())).append("\n");;
            sb.append(list[i].canRead()).append("\n");;
            sb.append(list[i].canWrite()).append("\n");;
            //sb.append(dateFormat.format(fileTime)).append("\n");;
            sb.append(list[i].length()).append("\n");;
            sb.append("---------------------------").append("\n");
        }
        return sb.toString();
    }
    public boolean creteArchive(String directory, String archive) throws IOException {
        File newFile = new File(directory + File.separator +archive );
        if(newFile.createNewFile()){
            System.out.println("File created");
        }
        return true;
    }
    public void listDirectory(String directorio){
        File files = new File(directorio);
        for(File fil : files.listFiles()){
            if(files.exists()){
                if(fil.isDirectory()){
                    System.out.println("d" + files.length() +
                            "  " +files.canRead() + "  " +files.canWrite());
                }
                if(fil.isFile()){
                    System.out.println("f" + files.length() +
                            "  " +files.canRead() + "  " +files.canWrite());
                }
            }
        }
    }
    public void seeInfo(String directory, String archive ){
        File file = new File(directory + File.separator +archive);
        if(file.exists()){
            System.out.println(file.getName() + " "
                    + file.canRead() + " " + file.canWrite()
                    + " " + file.isDirectory()
                    + " "+ file.isFile());
        }
    }
    public void readText(String path){
        StringBuilder sb = new StringBuilder();
        try(FileReader fil = new FileReader(path)) {
            int text;
            // tiene que ser dentro para qu e null no sea el primera cosa que sale el null
            //si no esta dentro vamos a tener null y texto
            //Despues no poner en el while
            while(( text= fil.read())>=0){
                sb.append((char)text);
            }
        } catch(FileNotFoundException e){
            throw new RuntimeException(e);
        } catch(IOException e){
            throw new RuntimeException(e);
        }
        System.out.println(sb);
    }

    public void textToHexa(String path){
        /*Inputsteam es para leer binario
         *FilerReader para leer 'texto'
         * para hexadecimal es ma esficiente el inputstream
         *
         */
        StringBuilder sb = new StringBuilder();
        try(FileReader fil = new FileReader(path)) {
            int text;
            while(( text= fil.read())>=0){
                sb.append(String.format("%02X",text));
                //printf("%c",(char)c) para convertir de byte a char
                //conversion peligrosa
                //
                sb.append(" ");
            }
        } catch(FileNotFoundException e){
            throw new RuntimeException(e);
        } catch(IOException e){
            throw new RuntimeException(e);
        }
        System.out.println(sb);
    }
    public void insertarAlumnos(String [] aray,String path) throws IOException {
        FileWriter writer = new FileWriter(path);
        //Do with try
        BufferedWriter output = new BufferedWriter(writer);
        for (String s : aray) {
            output.write(s+"\n");
        }
        output.close();
    }
    public void ecribirArchivo(String path, String text) throws IOException {
        FileWriter writer = new FileWriter(path);
        //Do with try
        BufferedWriter output = new BufferedWriter(writer);
        output.write(text);

        output.close();
    }

    public static boolean compareTwoFilesText(File one, File two){
        try(
                //Can use buffered reader and other buffered functions
                BufferedReader fil = new BufferedReader(new FileReader(one.getPath()));
                BufferedReader filDos = new BufferedReader(new FileReader(two.getPath()));) {
            int text1;
            int text2;
            //Loop to compare the files
            while( (text1= fil.read())>=0 && ( text2= filDos.read())>=0 ){
                text1 = fil.read();
                text2 = filDos.read();
                //If there are any differences the loop is broken
                if(text1 != text2){
                    System.out.println("These files are not the same");
                    return false;
                }
            }
        } catch(IOException e){
            throw new RuntimeException(e);
        }
        return true;
    }
    public static boolean compareTwoFilesTextAsBin(File one, File two)  {
        try (FileInputStream frst = new FileInputStream(one);
             FileInputStream scnd = new FileInputStream(two);) {
            int text1;
            int text2;
            while((text1 = frst.read()) != -1 && (text2 = scnd.read()) != -1 ) {
                if(text1 != text2)
                    return false;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
    public static boolean setFoulders(File one, File two) throws GestionArchivosNotFolderException {
        if(!one.exists() || !two.exists()) {
            throw new GestionArchivosNotFolderException("One of the folders doesn't exist");
        }
        return true;
    }
    public void writeInFile(File f){
        String text;
        boolean confirmOcp = true;
        if (f.exists()){
            do{
                System.out.println("Introduce a number to confirm if it is prime.");
                System.out.println("Introduce 0 to end the process");
                try(BufferedWriter writer = new BufferedWriter(new FileWriter(f,true))){
                    text = scanUtil.scanString("Inset text to write in file");
                    if(text.equalsIgnoreCase("End"))
                        writer.write(text);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }while(!text.equalsIgnoreCase("End"));
        }else System.out.println("The archive does not exist");
    }
}
