# **Ejercicios para validar asistencia**

**Curso:** Backend - Makaia <br>
**Realizado por:** Paulina Ocampo Duque

## Explicación de los talleres

En estos proyectos encontrarás los ejercicios resueltos que fueron propuestos por los profesores encargados del curso de programación Backend de la empresa Makaia específicamente de los temas de clases abstractas, principios SOLID, interfaces y patrones de diseño.  (en el código están explicadas las funcionalidades de los métodos)


## Estructura

[Clases abstractas](https://github.com/mpocampod/Asistencia/tree/main/Clases%20abstractas)

Acá podrás encontrar una implementación sencilla de una clase abstracta Figuras, en donde va a actuar como clase padre de las clases Cuadrado y Triángulo; lo que nos facilita la clase Figuras a pesar de que no se puede identificar como algo concreto es que posee características que son comunes en la clase Cuadrado y Triángulo que por ende pueden ser creadas a partir de la clase abstracta.

https://github.com/mpocampod/Asistencia/tree/main/hospital%20Makaia

En este proyecto implementé las clases abstractas, principios SOLID y patrones de diseño en un ejercicio donde se busca automatizar el comportamiento de un usuario para agendar una cita médica dependiendo del tipo de usuario que era.  

Los principios SOLID los utilice con el objetivo de hacer el código más limpio y mantenible en el tiempo. 
En el caso de:
* -Single Responsibility Principle
Se ve aplicado en la clase Hospital en donde tiene la responsabilidad de agendar citas médicas. 
* -Open/Closed Principle 
Se puede ver en la clase Usuario ya que está diseñada para ser extendida por subclases sin necesidad de modificar la clase base. 
* - Liskov Substitution Principle
En las subclases extendidas de Usuario en donde se pueden utilizar estas instancias de cada clase en lugar de una instancia de la clase de Usuario y no va a cambiar el comportamiento.
* -Dependency Inversion Principle
Al garantizar que la clase principal Usuario no depende de las subclases que se extienden de esta clase.

Algunos de los patrones que se pueden ver en este ejercicio son: 
* ‘Strategy’ en el momento en que se clasifica el valor de la cita dependiendo del tipo de usuario que la solicitó 
* ‘Abstract factory’ en donde se utilizó la clase abstracta Usuario y después se crearon tres subclases con el tipo de usuario
* ‘Factory’ para crear diferentes instancias en la clase Main de las especialidades y los usuarios y poder encapsular la creación de estos objetos.



En este último proyecto se pueden encontrar ejercicios con implementaciones sencillas de los principios SOLID con clases abstractas e interfaces en donde se busca eliminar el ‘Smell code’  es decir, muchos parámetros en un solo método, clases largas, códigos duplicados y código spaghetti. 
