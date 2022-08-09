package by.mtereshchenko.Lesson29;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class FilesExample {
    public static void main(String[] args) throws IOException {
        // Path, Paths, StandardOpenOption

//        Path pom = Paths.get("C:\\Users\\teres\\IdeaProjects\\new-hard-skillss\\pom.xml");
//        System.out.println(pom.isAbsolute());
//        System.out.println(pom.toAbsolutePath());

//        pom.toRealPath();
//        Path root = pom.getRoot();
//        System.out.println(root);

//        System.out.println(pom.getParent());
//        System.out.println(pom.getFileName());
//        System.out.println(pom.getFileSystem().getRootDirectories());

//       FileStore fileStore = Files.getFileStore(Paths.get("C:\\"));
//        System.out.println(fileStore.type());
//        System.out.println(fileStore.getTotalSpace());
//        System.out.println(fileStore.getUnallocatedSpace());
//        System.out.println(fileStore.getUsableSpace());

//        Path pom = Paths.get("pom2.xml");
//        Files.createFile(pom);

//        Path newFolder = Paths.get("newFolder");
//        Files.delete(newFolder);
//        Files.createDirectory(newFolder);

//        Path idea = Paths.get(".idea");
//        DirectoryStream<Path> paths = Files.newDirectoryStream(idea);
//        paths.forEach(System.out::println);
//        Stream<Path> list = Files.list(idea);
//        list.forEach(System.out::println);

//        System.out.println(Files.exists(idea));

//        Path pom = Paths.get("pom.xml");
//        System.out.println(Files.size(idea));
//        System.out.println(Files.isHidden(idea));
//        System.out.println(Files.getLastModifiedTime(idea));

//        Path idea = Paths.get(".idea");
//        System.out.println(Files.isSameFile(pom, idea));

//        System.out.println(Files.isReadable(pom));
//        System.out.println(Files.isWritable(pom));
//        System.out.println(Files.isExecutable(pom));
//        Path src = Paths.get("src");
//        Files.walk(idea, 2)
//                .forEach(System.out::println);

//        Files.find(src, 3, (file, attr)-> file.toString().endsWith(".html"))
//                .forEach(e-> System.out.println(e));

        Path pom2 = Paths.get("pom2.xml");
//        Files.write(pom2, "Helloooooo!! :)".getBytes(), StandardOpenOption.APPEND);
//        Files.write(pom2, "\n".getBytes(), StandardOpenOption.APPEND);
//        List<String> names = List.of("Oleg", "Sergey", "Marina");
//        Files.write(pom2, names, StandardOpenOption.APPEND);

//        System.out.println(Files.readString(pom2));

//        System.out.println(System.getProperty("os.name"));
//        System.out.println(System.getProperty("user.name"));
//        System.out.println(System.getProperty("user.dir"));
//        System.out.println(System.getProperty("java.vm.version"));

//        Set<String> propertyNames = System.getProperties().stringPropertyNames();
//        System.out.println(propertyNames);
    }
}
