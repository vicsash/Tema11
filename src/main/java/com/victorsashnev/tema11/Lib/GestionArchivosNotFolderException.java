package com.victorsashnev.tema11.Lib;

import java.nio.file.NoSuchFileException;

public class GestionArchivosNotFolderException extends NoSuchFileException {
    public GestionArchivosNotFolderException(String message){super(message);}
}
