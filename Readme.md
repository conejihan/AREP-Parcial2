# Parcial 2 AREP
## Descripción
Diseñe un prototipo de calculadora de microservicios que tenga un servicios de matemáticas con al menos dos funciones implementadas y desplegadas en al menos dos instancias virtuales de EC2. Además debe implementar un service proxy que recibe las solicitudes de servicios y se las delega a las dos instancias usando un algoritmo de round-robin. Asegúrese que se pueden configurar las direcciones y puertos de las instancias en el porxy usando variables de entorno del sistema operativo. Cada estudiante debe seleccionar para desarrollar dos funciones matemáticas de acuerdo a los dos últimos dígitos de su cédula como se especifica en la lista (Si sus dos últimos dígitos de su cédula son el mismo use el siguiente dígito que sea diferente). Todas las funciones reciben un solo parámetro de tipo "Double" y retornan una parámetro de tipo "Double".
Las operaciones fueron las siguientes:

1.ln

7.atan

## Prerrequisitos
Para la realización y ejecución tanto del programa como de las pruebas de este, se requieren ser instalados los siguientes programas:
* Maven
* Git

## Instalación
Para descargar el proyecto de GitHub, primero debemos clonar este repositorio.

```
git clone https://github.com/conejihan/AREP-Parcial2
```

## Ejecución
Para compilar el proyecto se utilizara el siguiente comando:

```
mvn package
```

##AWS

Para ejecutarlo en EC2 primero se necesita entrar en AWS y elegir la opción EC2, le damos en continuar, cuando nos pida las llaves, colocamos la opción de crear estas, las descargamos y continuamos. Se tiene que esperar un breve tiempo mientras las instancias se crean.
Cuando ya esten listas se va a conectar a cada una y se les va a transferir a cada uno el servidor y servicio correspondiente.

