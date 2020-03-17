package com.start.examples.test26ExceptionTest;

import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/**
 * Format Converter
 *
 * @author artem
 * @version 0.1
 * @since 22.11.2019
 */
public class Main {


    public static void main(String[] args) throws IOException {
/*
        String path = "appLang";

        final File jarFile = new File("C:\\GlossaryWork\\GlossaryEditor-OLD\\GlossaryEditor.jar");
        if(jarFile.isFile()) {  // Run with JAR file
            final JarFile jar = new JarFile(jarFile);
            final Enumeration<JarEntry> entries = jar.entries(); //gives ALL entries in jar
            while(entries.hasMoreElements()) {
                final String name = entries.nextElement().getName();
                if (name.startsWith(path + "/")) { //filter according to the path
                    System.out.println(name);
                }
            }
            jar.close();
        }
*/

        final JarFile jarFile = new JarFile(new File("C:\\GlossaryWork\\GlossaryEditor-OLD\\GlossaryEditor.jar"));
 /*       copyDirectoryFromJar(jarFile, "appLang", "C:\\te\\appLang");
         copyDirectoryFromJar(jarFile,"appLang/bg.json","C:\\te\\appLang\\bg.json");
         copyDirectoryFromJar(jarFile,"appLang/bs.json","C:\\te\\appLang\\bs.json");
        copyDirectoryFromJar(jarFile,"langIso.json","C:\\te\\langIso.json");*/
        copyDirectoryFromJar(jarFile,"langIso.json","C:\\te\\langIso.json");


    }


    public static void copyDirectoryFromJar(JarFile jarFile, String source, String target)
            throws IOException {


        Enumeration<JarEntry> entries = jarFile.entries();

        while (entries.hasMoreElements()) {

            JarEntry entry = entries.nextElement();

            if (entry.getName().startsWith(source) && !entry.isDirectory()) {
                File dest;

                if (source.matches(".*\\..*")) {
                    dest = new File(target);
                } else {
                    dest = new File(target, entry.getName().substring(source.length() + 1));
                }

                File parent = dest.getParentFile();
                if (parent != null) {
                    parent.mkdirs();
                }

                try (FileOutputStream out = new FileOutputStream(dest);
                     InputStream in = jarFile.getInputStream(entry)) {

                    byte[] buffer = new byte[1024];
                    int s = 0;
                    while ((s = in.read(buffer)) > 0) {
                        out.write(buffer, 0, s);
                    }

                } catch (IOException e) {
                    throw new IOException("Could not copy asset from jar file", e);
                }

            }
        }




        }





    public static boolean copyJarResourcesRecursively(final File destDir,
                                                      final JarURLConnection jarConnection) throws IOException {

        final JarFile jarFile = jarConnection.getJarFile();

        for (final Enumeration<JarEntry> e = jarFile.entries(); e.hasMoreElements(); ) {
            final JarEntry entry = e.nextElement();
            if (entry.getName().startsWith(jarConnection.getEntryName())) {
                final String filename = StringUtils.removeStart(entry.getName(), //
                        jarConnection.getEntryName());

                final File f = new File(destDir, filename);
                if (!entry.isDirectory()) {
                    final InputStream entryInputStream = jarFile.getInputStream(entry);
                    if (!FileUtils.copyStream(entryInputStream, f)) {
                        return false;
                    }
                    entryInputStream.close();
                } else {
                    if (!FileUtils.ensureDirectoryExists(f)) {
                        throw new IOException("Could not create directory: "
                                + f.getAbsolutePath());
                    }
                }
            }
        }
        return true;
    }


}
