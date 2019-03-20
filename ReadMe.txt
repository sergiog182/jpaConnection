Proyecto conexion a base de datos con JPA
=========================================

Se trabajara con la base de datos "jboss_test"

Esa ruta utiliza los datos que se guardaron con la ruta dbConnection y lo carga y genera archivos por orden, que se guardan en files/outgoing.

Para correr el proyecto, desde consola ejecutar:

    mvn celan camel:run

Desde JBoss developer studio, crear un perfil de ejecución:

	clean camel:run