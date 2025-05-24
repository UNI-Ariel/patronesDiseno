## Explicación de los métodos utilizados de Patrones de diseño

### Factory Method:
Se utiliza en la clase Character, qué es la base para la interfaz CharacterFactory que declara la interfaz createCharacter, RandomCharacterFactory crea personajes con atributos estáticos enfocados en la fuerza, FastCharacterFactory crea personajes enfocados en la agilidad y RandomCharacterFactory crea personajes aleatorios cuyos atributos están dentro un rango limitado.

### Template Method:
La clase Entity define las fórmulas generales de cómo se calcula el daño y la defensa, dichos métodos utilizan métodos abstractos para realizar el cálculo, los cuales deben ser implementados en las subclases que en este caso es la clase Character.

## Comando para ejecutar en consola

### java main.java

El comando imprime la creación de 3 personajes, 1 por cada tipo de Factory y tambien muestra el calculo del daño y defensa que puede tener cada personaje.
