package com.patriciaolmedo.poo.redsocial;


import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class RenderProfile {

    /**
     * Genera un fichero HTML con la información del perfil de usuario.
     *
     * @param perfil      PerfilRedSocial que se quiere mostrar en el HTML.
     * @param rutaSalida  Nombre o ruta del fichero HTML de salida
     *                    (por ejemplo: "perfil_maria.html").
     */
    public static void generarHtmlPerfil(Profile profile, String exitRoute) {

        // Fábrica de plantillas Mustache
        MustacheFactory mustacheFactory = new DefaultMustacheFactory();

        // Carga la plantilla "perfil.mustache" desde src/main/resources
        Mustache mustache = mustacheFactory.compile("profile_mustache.html");

        // Escribimos el resultado en el fichero indicado
        try (Writer writer = new FileWriter(exitRoute)) {
            mustache.execute(writer, profile).flush();
            System.out.println("✅ HTML generado correctamente en: " + exitRoute);
        } catch (IOException e) {
            System.out.println("❌ Error al generar el HTML del perfil: " + e.getMessage());
        }
    }
}