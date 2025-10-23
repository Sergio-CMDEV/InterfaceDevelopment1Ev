# MainAnimales

## Qué representa la jerarquía de clases.
Representa una jerarquia simple de animales usando una clase abstracta Animal (atributos comunes: nombre, edad) y varias subclases concretas (Perro, Gato, Pajaro, Pez, Pato).

## Qué métodos se han sobrescrito.
- `hacerSonido()` 
- `mostrarInfo()`

### Preguntas de reflexión
<details>
<summary> 1. ¿Por qué no tiene sentido crear directamente un objeto de tipo Animal? </summary>
Porque Animal es una clase abstracta con métodos abstractos como hacerSonido(). 
Su propósito es definir comportamiento común y contrato para subclases.
</details>
<details>
<summary> 2. ¿Qué ventajas aporta definir comportamientos comunes como interfaces? </summary>
Permiten aplicar varios comportamientos a clases distintas (múltiple herencia), que obligan a implementar 
métodos concretos favoreciendo la programación orientada a interfaces, más flexible y desacoplada.
</details>
<details>
<summary> 3. ¿Qué diferencia hay entre heredar de una clase abstracta e implementar una interfaz? </summary>
</details>
<details>
<summary> 4. ¿Cómo facilita el polimorfismo la extensión del programa con nuevos tipos de animales? </summary>
</details>