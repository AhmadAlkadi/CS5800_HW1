package com.mycompany.composition;
import java.util.*;

public class Folder {
    private String folderName;
    private Folder mainFolder;
    private ArrayList<Folder> subFolder = new ArrayList<Folder>();
    private ArrayList<File> files = new ArrayList<File>();
    
    public Folder(){
        folderName = null;
    }
    
    public Folder(String folderName){
        this.folderName = folderName;
    }
    
    public void addSubFolder(Folder newFolder){
        newFolder.mainFolder = this;
        subFolder.add(newFolder);
    }
    
    public void addSubFile(File newFile){
        files.add(newFile);
    }
    
    public String getFolderName(){
        return this.folderName;
    }
    
    public void deleteFolder(Folder folder){
        subFolder.remove(folder);
    }
    
    public void deleteFile(File file){
        files.remove(file);
    }
    
    public void print(){
        if(subFolder.isEmpty() == false){
            System.out.println("-"+folderName);
        }
        else{
            System.out.println("+"+folderName);
        }
        for(int i = 0; i < subFolder.size(); i++){
            subFolder.get(i).subPrint(1);
        }
    }
    
    public void subPrint(int  numOfIndent){
        String indentation = null;
        String output = null;
        if(subFolder.isEmpty() == false){
            indentation = "-"+folderName;
            output = indentation.indent(numOfIndent);
            System.out.print(output);
        }
        else{
            indentation = "+"+folderName;
            output = indentation.indent(numOfIndent);
            System.out.print(output);
        }
        
        
        
        ++numOfIndent;
        for(int i = 0; i < subFolder.size(); i++){
            subFolder.get(i).subPrint(numOfIndent);
        }
        
        for(int i = 0; i < files.size(); i++){
            indentation = files.get(i).getFileName();
            output = indentation.indent(numOfIndent);
            System.out.print(output);
        }
    }
}
