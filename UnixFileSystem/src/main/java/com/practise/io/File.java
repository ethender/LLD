package com.practise.io;


import java.util.HashSet;
import java.util.Set;

public class File {

    private final boolean isDirectory;
    private final int size;
    private final String owner;
    private final String filename;
    private final Set<File> entries = new HashSet<>();

    public File(final boolean isDirectory, final int size, final  String owner, final String filename){
        this.isDirectory = isDirectory;
        this.filename = filename;
        this.size  = size;
        this.owner = owner;
    }

    public Object extract(final FileAttribute attributeName){
        switch (attributeName){
            case SIZE -> {
                return size;
            }
            case OWNER -> {
                return owner;
            }
            case FILENAME -> {
                return filename;
            }
            case IS_DIRECTORY -> {
                return isDirectory;
            }
        }
        throw new IllegalArgumentException("invalid filter criteria type");
    }


    public void addEntry(final File entry){
        entries.add(entry);
    }


    public Set<File> getEntries(){
        return this.entries;
    }

    public boolean isDirectory() {
        return isDirectory;
    }

    public int getSize() {
        return size;
    }

    public String getOwner() {
        return owner;
    }

    public String getFilename() {
        return filename;
    }
}
