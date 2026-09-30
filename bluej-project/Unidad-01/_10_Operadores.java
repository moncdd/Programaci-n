/**
 * En Java, los operadores son símbolos que permiten realizar operaciones 
 * sobre variables y valores. Por ejemplo, sumar, comparar, asignar valores o 
 * combinar condiciones.
 * 1. Operadores aritméticos

Son los utilizados para realizar operaciones matemáticas.

| Operador | Operación      | Ejemplo  | Resultado |
| -------- | -------------- | -------- | --------: |
| `+`      | Suma           | `5 + 3`  |       `8` |
| `-`      | Resta          | `5 - 3`  |       `2` |
| `*`      | Multiplicación | `5 * 3`  |      `15` |
| `/`      | División       | `10 / 3` |       `3` |
| `%`      | Resto          | `10 % 3` |       `1` |

⚠️ **Importante:** si ambos operandos son enteros, la división es entera:

# 2. Operadores de asignación

El operador básico es: =


También existen operadores de asignación compuestos:

| Operador | Equivalente |
| -------- | ----------- |
| `+=`     | `x = x + 5` |
| `-=`     | `x = x - 5` |
| `*=`     | `x = x * 5` |
| `/=`     | `x = x / 5` |
| `%=`     | `x = x % 5` |

Por ejemplo:

int puntos = 10;
puntos += 5;


Es equivalente a:

puntos = puntos + 5;
Ahora `puntos` vale `15`.

# 3. Operadores de incremento y decremento

Tenemos:

++
--


Por ejemplo:

```java
int contador = 5;

contador++;
```

Es equivalente a:

```java
contador = contador + 1;
```

Y:

```java
contador--;
```

equivale a:

```java
contador = contador - 1;
```

Pero hay una diferencia importante entre prefijo y sufijo.

### Postincremento

```java
int x = 5;
int y = x++;
```

Primero se utiliza el valor de `x` y después se incrementa.

Resultado:

```text
x = 6
y = 5
```

### Preincremento

```java
int x = 5;
int y = ++x;
```

Primero se incrementa `x` y después se utiliza su valor.

Resultado:

```text
x = 6
y = 6
```

---

# 4. Operadores relacionales

Permiten **comparar valores**.

El resultado siempre es un `boolean`:

```java
true
```

o

```java
false
```

| Operador | Significado       |
| -------- | ----------------- |
| `==`     | Igual             |
| `!=`     | Distinto          |
| `>`      | Mayor que         |
| `<`      | Menor que         |
| `>=`     | Mayor o igual que |
| `<=`     | Menor o igual que |

Ejemplo:

```java
int edad = 20;

System.out.println(edad >= 18);
```

Resultado:

```text
true
```

### ⚠️ `=` frente a `==`

Es una diferencia fundamental:

```java
edad = 18;
```

significa **asignar**.

Mientras:

```java
edad == 18
```

significa **comparar**.

---

# 5. Operadores lógicos

Se utilizan principalmente para combinar condiciones.

| Operador | Significado |   |    |
| -------- | ----------- | - | -- |
| `&&`     | AND         |   |    |
| `||`     | OR          |   |    |
| `!`      | NOT         |   |    |

### AND `&&`

Las dos condiciones deben cumplirse:

```java
if ((edad >= 18) && (edad <= 65)) {
    System.out.println("Edad laboral");
}
```

### OR `||`

Es suficiente con que se cumpla una:

```java
if (dia == 6 || dia == 7) {
    System.out.println("Fin de semana");
}
```

### NOT `!`

Invierte un `boolean`:

```java
boolean encendido = true;

System.out.println(!encendido);
```

Resultado:

```text
false
```

---

# 6. Operador ternario

El operador ternario permite escribir una condición de forma compacta.

Su sintaxis es:

```java
condicion ? valorSiTrue : valorSiFalse
```

Por ejemplo:

```java
int edad = 20;

String resultado = edad >= 18 ? "Mayor de edad" : "Menor de edad";
```

Es parecido a:

```java
String resultado;

if (edad >= 18) {
    resultado = "Mayor de edad";
} else {
    resultado = "Menor de edad";
}
```

---

# 7. Operadores con `String`

Para concatenar cadenas utilizamos:

```java
+
```

Por ejemplo:

```java
String nombre = "Juan";
int edad = 20;

System.out.println("Me llamo " + nombre + " y tengo " + edad + " años.");
```

Resultado:

```text
Me llamo Juan y tengo 20 años.
```

⚠️ Pero `+` no siempre significa suma.

```java
System.out.println(10 + 20);
```

Resultado:

```text
30
```

Mientras:

```java
System.out.println("Resultado: " + 10 + 20);
```

Resultado:

```text
Resultado: 1020
```

Porque al aparecer un `String`, el `+` pasa a realizar concatenación.

---

# 8. ¿Qué es la precedencia de operadores?

Cuando tenemos varios operadores en una misma expresión, 
Java necesita saber **en qué orden debe realizar las operaciones**.

Por ejemplo:

```java
int resultado = 2 + 3 * 4;
```

¿Es?

```text
(2 + 3) * 4 = 20
```

¿O?

```text
2 + (3 * 4) = 14
```

Java hace primero la multiplicación:

```text
2 + 12 = 14
```

Por tanto:

```java
int resultado = 2 + 3 * 4;
```

produce:

```text
14
```

---

# 9. Precedencia de operadores en Java

De **mayor a menor prioridad**, podemos utilizar esta tabla:

| Prioridad | Operadores              | Ejemplo             |   |    |   |    |
| --------: | ----------------------- | ------------------- | - | -- | - | -- |
|         1 | `()`                    | `(2 + 3)`           |   |    |   |    |
|         2 | `++` `--` `!`           | `++x`, `!activo`    |   |    |   |    |
|         3 | `*` `/` `%`             | `5 * 3`             |   |    |   |    |
|         4 | `+` `-`                 | `5 + 3`             |   |    |   |    |
|         5 | `<` `>` `<=` `>=`       | `x >= 10`           |   |    |   |    |
|         6 | `==` `!=`               | `x == 10`           |   |    |   |    |
|         7 | `&&`                    | `a && b`            |   |    |   |    |
|         8 | `||`                    | `a || b`            |   |    |   |    |
|         9 | `!`                     | `!a                 |   |    |   |    |
|        10 | `?:`                    | `condicion ? a : b` |   |    |   |    |
|        11 | `=` `+=` `-=` `*=` `/=` | `x += 5`            |   |    |   |    |

Esta tabla es una **simplificación didáctica**; Java tiene más niveles y operadores, especialmente cuando entran operadores bit a bit y otros operadores menos habituales.

---

# 10. Ejemplo de precedencia

Tenemos:

```java
int resultado = 10 + 5 * 2;
```

Primero:

```text
5 * 2
```

Después:

```text
10 + 10
```

Resultado:

```text
20
```

Por tanto:

```java
System.out.println(10 + 5 * 2);
```

muestra:

```text
20
```

---

## 11. Los paréntesis permiten cambiar la prioridad

Si queremos que se haga primero la suma:

```java
int resultado = (10 + 5) * 2;
```

Ahora:

```text
10 + 5 = 15
15 * 2 = 30
```

Resultado:

```text
30
```

Por eso una buena regla para los alumnos es:

> **Si una expresión puede generar dudas, utiliza paréntesis.**

---

# 12. Precedencia y asociatividad

Hay otro concepto importante: la **asociatividad**.

Cuando tenemos operadores con la misma precedencia, normalmente Java los evalúa **de izquierda a derecha**.

Por ejemplo:

```java
int resultado = 20 / 5 * 2;
```

`/` y `*` tienen la misma precedencia.

Se hace:

```text
20 / 5 = 4
4 * 2 = 8
```

Por tanto:

```text
resultado = 8
```

No:

```text
20 / (5 * 2) = 2
```

---

# 13. Ejemplo completo

Observa esta expresión:

```java
int resultado = 10 + 2 * 3 - 4 / 2;
```

Podemos resolverla siguiendo la precedencia:

### Primero `*` y `/`

```text
10 + 6 - 2
```

### Después `+` y `-`

De izquierda a derecha:

```text
16 - 2
```

Resultado:

```text
14
```

Por tanto:

```java
System.out.println(resultado);
```

muestra:

```text
14
```

---

## Esquema para recordar

Para las expresiones más habituales de Java, puedes enseñar a los alumnos este orden:

```text
        ()
         ↓
      ++ -- !
         ↓
      * / %
         ↓
       + -
         ↓
   < > <= >=
         ↓
      == !=
         ↓
        &&
         ↓
        ||
         ↓
        ?:
         ↓
      = += -=
```

La idea fundamental es:

**Paréntesis → unarios → multiplicación/división → suma/resta → comparaciones → operadores lógicos → asignación.**

Y ante cualquier duda, **los paréntesis hacen explícito el orden que queremos**.

 */

public class _10_Operadores
{
    public static void main(String[] args)
    {
        // Operador ternario. Simula un bloque de decisión
        
        String stAprobado;
        int nota = 4;
        
        // vble = (condicion) ? valor_si_true : valor_si_false;
        stAprobado = (nota >= 5) ? "He aprobado Yuju!!!" : "He suspendido Snifff";
        
        System.out.println(stAprobado);
        
    }
}
