/**
 * En Java, `printf()` permite mostrar información por pantalla con un
 * formato determinado. Es especialmente útil cuando queremos controlar 
 * el número de decimales, el ancho de los campos, alinear datos o 
 * combinar texto y variables.

## 1. Sintaxis básica

```java
System.out.printf("formato", valores);
```

Por ejemplo:

```java
String nombre = "Juan";
int edad = 20;

System.out.printf("Nombre: %s, Edad: %d%n", nombre, edad);
```

Salida:

```text
Nombre: Juan, Edad: 20
```

La diferencia fundamental con `println()` es que `printf()` permite indicar **cómo queremos representar cada valor**.

---

# 2. Especificadores de formato

Los más importantes para empezar son:

| Especificador | Tipo           | Ejemplo  |
| ------------- | -------------- | -------- |
| `%d`          | Enteros        | `25`     |
| `%f`          | Decimales      | `3.14`   |
| `%s`          | String         | `"Hola"` |
| `%c`          | Carácter       | `'A'`    |
| `%b`          | Boolean        | `true`   |
| `%n`          | Salto de línea | —        |

### `%d` → enteros

```java
int edad = 25;

System.out.printf("Edad: %d%n", edad);
```

Salida:

```text
Edad: 25
```

---

### `%f` → números decimales

```java
double precio = 19.95;

System.out.printf("Precio: %f%n", precio);
```

Salida:

```text
Precio: 19.950000
```

Por defecto, `%f` muestra **6 decimales**.

Podemos controlar los decimales:

```java
System.out.printf("Precio: %.2f%n", precio);
```

Salida:

```text
Precio: 19.95
```

La estructura:

```text
%.2f
```

significa:

* `%` → comienza el especificador.
* `.2` → queremos 2 decimales.
* `f` → número decimal.

Por ejemplo:

```java
double numero = 12.345678;

System.out.printf("%.2f%n", numero);
System.out.printf("%.3f%n", numero);
System.out.printf("%.4f%n", numero);
```

Salida:

```text
12.35
12.346
12.3457
```

---

# 3. `%s` → cadenas de texto

```java
String nombre = "María";

System.out.printf("Hola %s%n", nombre);
```

Salida:

```text
Hola María
```

Podemos utilizar varios valores:

```java
String nombre = "María";
String ciudad = "Madrid";

System.out.printf("%s vive en %s%n", nombre, ciudad);
```

Salida:

```text
María vive en Madrid
```

---

# 4. `%c` → caracteres

```java
char letra = 'A';

System.out.printf("La letra es %c%n", letra);
```

Salida:

```text
La letra es A
```

---

# 5. `%b` → booleanos

```java
boolean mayorEdad = true;

System.out.printf("¿Es mayor de edad? %b%n", mayorEdad);
```

Salida:

```text
¿Es mayor de edad? true
```

---

# 6. Salto de línea: `%n`

Podríamos utilizar:

```java
System.out.printf("Hola%n");
System.out.printf("Adiós%n");
```

Resultado:

```text
Hola
Adiós
```

En `printf()` es recomendable utilizar `%n` para el salto de línea en lugar de escribir `\n`, especialmente cuando queremos código independiente del sistema operativo.

---

# 7. Varios valores

Una de las principales ventajas de `printf()` es que podemos colocar varias variables en una misma cadena:

```java
String nombre = "Carlos";
int edad = 25;
double altura = 1.80;

System.out.printf(
    "Nombre: %s, Edad: %d, Altura: %.2f m%n",
    nombre, edad, altura
);
```

Salida:

```text
Nombre: Carlos, Edad: 25, Altura: 1.80 m
```

El **orden es importante**:

```text
%s  → nombre
%d  → edad
%.2f → altura
```

---

# 8. Anchura del campo

También podemos indicar cuánto espacio queremos reservar.

Por ejemplo:

```java
System.out.printf("%10s%n", "Hola");
```

Salida:

```text
      Hola
```

Se reserva un espacio de **10 caracteres** y el texto se coloca normalmente alineado a la derecha.

Esto es muy útil para crear tablas.

Por ejemplo:

```java
System.out.printf("%10s %5d%n", "Juan", 20);
System.out.printf("%10s %5d%n", "Ana", 25);
System.out.printf("%10s %5d%n", "Pedro", 30);
```

Resultado aproximado:

```text
      Juan    20
       Ana    25
     Pedro    30
```

---

# 9. Alineación a la izquierda

Podemos utilizar `-`:

```java
System.out.printf("%-10s %5d%n", "Juan", 20);
System.out.printf("%-10s %5d%n", "Ana", 25);
System.out.printf("%-10s %5d%n", "Pedro", 30);
```

Resultado:

```text
Juan          20
Ana           25
Pedro         30
```

`%-10s` significa:

* `-` → alineación a la izquierda.
* `10` → ancho de 10 caracteres.
* `s` → String.

---

# 10. Rellenar con ceros

También podemos utilizar `0`.

```java
int numero = 25;

System.out.printf("%05d%n", numero);
```

Salida:

```text
00025
```

`%05d` significa:

```text
%  → especificador
0  → rellenar con ceros
5  → ancho de 5 caracteres
d  → entero
```

Otro ejemplo:

```java
System.out.printf("%08d%n", 123);
```

Salida:

```text
00000123
```

---

# 11. Separadores de miles

Podemos utilizar `,`:

```java
int numero = 1234567;

System.out.printf("%,d%n", numero);
```

Dependiendo de la configuración regional, veremos un formato como:

```text
1,234,567
```

Si queremos utilizar formato español, podemos trabajar con `Locale`:

```java
import java.util.Locale;

System.out.printf(
    Locale.forLanguageTag("es-ES"),
    "%,.2f%n",
    1234567.89
);
```

Esto permite adaptar el formato numérico a la configuración regional.

---

# 12. Porcentajes

Aquí hay una particularidad importante.

Para imprimir el símbolo `%` debemos escribir:

```java
%%
```

Por ejemplo:

```java
double porcentaje = 85.5;

System.out.printf("Porcentaje: %.1f%%%n", porcentaje);
```

Salida:

```text
Porcentaje: 85.5%
```

¿Por qué?

```text
%.1f  → número decimal
%%    → símbolo %
%n    → salto de línea
```

---

# 13. Ejemplo práctico: tabla de alumnos

`printf()` es especialmente interesante para crear tablas:

```java
System.out.printf("%-15s %5s %10s%n",
        "Nombre", "Edad", "Nota");

System.out.printf("%-15s %5d %10.2f%n",
        "Juan", 20, 8.50);

System.out.printf("%-15s %5d %10.2f%n",
        "María", 19, 9.25);

System.out.printf("%-15s %5d %10.2f%n",
        "Pedro", 21, 6.75);
```

Salida:

```text
Nombre           Edad       Nota
Juan               20       8.50
María              19       9.25
Pedro              21       6.75
```

Aquí se empieza a ver una de las principales ventajas de `printf()`: **podemos controlar perfectamente la presentación de los datos**.

---

## 14. Los formatos que yo enseñaría primero

Para un curso inicial de Java, puedes centrarte inicialmente en estos:

| Formato | Utilidad                 | Ejemplo     |
| ------- | ------------------------ | ----------- |
| `%d`    | Enteros                  | `25`        |
| `%f`    | Decimales                | `3.140000`  |
| `%.2f`  | Decimales con 2 cifras   | `3.14`      |
| `%s`    | Strings                  | `Hola`      |
| `%c`    | Caracteres               | `A`         |
| `%b`    | Booleanos                | `true`      |
| `%n`    | Salto de línea           | —           |
| `%10s`  | Campo de 10 caracteres   | `     Hola` |
| `%-10s` | Campo alineado izquierda | `Hola     ` |
| `%05d`  | Entero con ceros         | `00025`     |
| `%%`    | Símbolo `%`              | `%`         |

### La estructura general

Una forma sencilla de que los alumnos lo recuerden es:

```text
%[opciones][ancho][.precisión]tipo
```

Por ejemplo:

```java
System.out.printf("%-10s %05d %.2f%n", nombre, numero, precio);
```

Se puede interpretar como:

```text
%-10s  → String, 10 posiciones, izquierda
%05d   → entero, 5 posiciones, rellenado con 0
%.2f   → decimal, 2 decimales
%n     → salto de línea
```

**Idea clave:** `printf()` no cambia el valor de la variable; **solo controla cómo se muestra en pantalla**.

 */

public class _11_FormatoVisualizacion
{
    public static void main(String[] args)
    {
        int edad = 21;
        String nombre = "Pedro";
        final double PI = 3.14159523464356;
        
        System.out.printf("Tu edad es %d años y te llamas %s\n",edad,nombre);
        System.out.printf("El valor de la constante PI es %.2f\n",PI);
        System.out.print("El campo nombre tiene de tamaño 20 caracteres\n");
        System.out.printf("%10s | %10s | %2s\n","NOMBRE","APELLIDO","EDAD");
        System.out.printf("%10s | %10s | %2s\n","Pepe","Cano","23");
        System.out.printf("%10s | %10s | %2s\n","JuanRamón","López","28");
        
        
        
    }
}
