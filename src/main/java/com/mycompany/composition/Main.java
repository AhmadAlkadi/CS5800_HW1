package com.mycompany.composition;

public class Main {

    public static void main(String[] args) {
        Folder demo1Folder = new Folder("demo1");
        Folder sourceFilesFolder = new Folder("Source Files");
        Folder phalconFolder = new Folder(".phalcon");
        Folder appFolder = new Folder("app");
        Folder configFolder = new Folder("config");
        Folder controllersFolder = new Folder("controllers");
        Folder libraryFolder = new Folder("library");
        Folder migrationsFolder = new Folder("migrations");
        Folder modelsFolder = new Folder("models");
        Folder viewsFolder = new Folder("views");
        Folder cacheFolder = new Folder("cache");
        Folder publicFolder = new Folder("public");
        Folder includePathFolder = new Folder("Include Path");
        Folder RemoteFilesFolder = new Folder("Remote Files");
        
        File htaccessFile = new File(".htaccess");
        File htrouterPhpFile = new File(".htrouter.php");
        File indexFile = new File(".index.html");
        publicFolder.addSubFile(htaccessFile);
        publicFolder.addSubFile(htrouterPhpFile);
        publicFolder.addSubFile(indexFile);
        
        demo1Folder.addSubFolder(sourceFilesFolder);
        sourceFilesFolder.addSubFolder(phalconFolder);
        sourceFilesFolder.addSubFolder(appFolder);
        appFolder.addSubFolder(configFolder);
        appFolder.addSubFolder(controllersFolder);
        appFolder.addSubFolder(libraryFolder);
        appFolder.addSubFolder(migrationsFolder);
        appFolder.addSubFolder(modelsFolder);
        appFolder.addSubFolder(viewsFolder);
        sourceFilesFolder.addSubFolder(cacheFolder);
        sourceFilesFolder.addSubFolder(publicFolder);
        demo1Folder.addSubFolder(includePathFolder);
        demo1Folder.addSubFolder(RemoteFilesFolder);
                
        demo1Folder.print();
        System.out.println();
        
        sourceFilesFolder.deleteFolder(appFolder);
        
        demo1Folder.print();
        System.out.println();
        
        sourceFilesFolder.deleteFolder(publicFolder);
        
        demo1Folder.print();
        System.out.println();
    }
    
}
