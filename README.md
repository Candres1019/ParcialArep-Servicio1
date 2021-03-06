# Parcial Primer Tercio - Servidor De calculo.

Aplicativo Web diseñado en Java que hace uso de Spark, para realizar los calculos de seno, coseno y tangente

## Información Del Proyecto

* La documentación del las clases y los metodos del proyecto se encuentran en el directorio adjunto /Javadoc/apidocs.

### Pre-Requisitos

Para correr este proyecto necesita los siguientes programas instalados, se adjuntan los links de como descargarlos:

> * [Como Instalar Java 8](https://www.oracle.com/co/java/technologies/javase/javase-jdk8-downloads.html)
> * [Como Instalar Apache Maven](http://maven.apache.org/download.html#Installation)

Adicionalmente se recomienda tener descargado los siguientes programas:

> * [Como Instalar Git](http://git-scm.com/book/en/v2/Getting-Started-Installing-Git)

### Despliegue en Heroku

[![Deployed to Heroku](https://www.herokucdn.com/deploy/button.png)](https://andrescalderonservidorcalc.herokuapp.com/calculador?valor=5&funcion=tan)

### Instalación

1. Clonación o Descarga del Proyecto:

    * Para **Clonar** el proyecto utilice el siguiente comando en la ventana de comandos:

   ```
   git clone https://github.com/Candres1019/ParcialArep-Servicio1.git
   ```

    * Para **Descargar** el proyecto de
      click [aquí](https://github.com/Candres1019/ParcialArep-Servicio1/archive/master.zip), la descarga comenzara de
      manera automática.

2. En una ventana de comandos ejecute el siguiente comando, dentro de la carpeta principal del proyecto:

   ```
    mvn package
    ```

3. Para ejecutar la aplicación de manera local utilizamos en la ventana de comandos el siguiente comando:

   > * Distribuciones Linux y MacOs:
   > ```
    > java $JAVA_OPTS -cp target/classes:target/dependency/* edu.escuelaing.arep.ParcialPrimerTercio.app.SparkWebServiceCalculator
    > ```
   > * Distribuciones Windows:
   > ```
    > java -cp target/classes;target/dependency/* edu.escuelaing.arep.ParcialPrimerTercio.app.SparkWebServiceCalculator
    > ```

4. Para ver el aplicativo web de manera local ingresaremos por la siguiente URI

   > Nota: en la parte de funcion solo se acepta "sin", "cos" y "tan"

   > ```
    > http://localhost:4568/calculador?valor={valor}&funcion={funcion}
    > ```

5. Por defecto se creó la documentación JavaDoc y fue dejada en el directorio /Javadoc, si desea generar uno nuevo
   utilice el siguiente comando, esta documentación quedará en el directorio /target/site/apidocs :

   > ```
   > mvn javadoc:javadoc
   > ```

## Construido Con

* [Java 8](https://www.java.com/es/) - Lenguaje de Programación.
* [JUnit](https://junit.org/junit5/) - Pruebas de Unidad.
* [Maven](https://maven.apache.org/) - Manejo de dependecias.
* [IntelliJ IDEA](https://www.jetbrains.com/es-es/idea/) - Entorno de Desarrollo.

## Authors

* **Andres Mateo Calderón Ortega** - [Candres1019](https://github.com/Candres1019)

# Licencia

Este proyecto está licenciado bajo la GNU v3.0 - ver el archivo [LICENSE.md](./LICENSE) para más detalles