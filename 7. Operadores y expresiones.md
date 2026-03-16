# Operadores y expresiones

## 1. Operadores aritméticos  
Permiten realizar operaciones matemáticas básicas entre valores numéricos.

- **`+` suma:** Suma dos valores.  
- **`-` resta:** Resta un valor de otro.  
- **`*` multiplicación:** Multiplica dos valores.  
- **`/` división:** Divide un valor entre otro.  
- **`%` módulo:** Devuelve el residuo de una división (funciona con enteros y decimales).

```java
int r1 = 10 % 3;
float r2 = 10.5f % 3.2f;
```

## 2. Expresiones en Java  
Son combinaciones de valores, variables y operadores que producen un resultado.

```java
int x = 5 + 3 * 2;
double y = (10 + 2) / 3.0;
```

## 3. Incremento y decremento  
Permiten aumentar o disminuir una variable en 1.

- **`++x` pre-incremento:** Incrementa antes de usar el valor.  
- **`x++` post-incremento:** Usa el valor y luego incrementa.  
- **`--x` pre-decremento:** Decrementa antes de usar el valor.  
- **`x--` post-decremento:** Usa el valor y luego decrementa.

```java
int a = 5;
a++;
--a;
```

## 4. Operadores de bit  
Realizan operaciones a nivel binario sobre números enteros.

- **`&` AND:** El bit es 1 solo si ambos bits son 1.  
- **`|` OR:** El bit es 1 si al menos uno es 1.  
- **`^` XOR:** El bit es 1 si los bits son diferentes.  
- **`~` NOT:** Invierte todos los bits.  
- **`<<` desplazamiento izquierda:** Mueve los bits a la izquierda (multiplica por 2).  
- **`>>` desplazamiento derecha con signo:** Desplaza manteniendo el signo.  
- **`>>>` desplazamiento derecha sin signo:** Desplaza sin conservar el signo.

```java
int b1 = 5 & 3;
```

## 5. Operadores relacionales  
Comparan valores y devuelven true o false.

- **`==` igual:** Compara si dos valores son iguales.  
- **`!=` diferente:** Compara si dos valores son distintos.  
- **`>` mayor que:** Verifica si un valor es mayor que otro.  
- **`<` menor que:** Verifica si un valor es menor que otro.  
- **`>=` mayor o igual:** Comprueba si un valor es mayor o igual.  
- **`<=` menor o igual:** Comprueba si un valor es menor o igual.

```java
boolean r = 5 > 3;
```

## 6. Operadores lógicos  
Permiten combinar o invertir condiciones booleanas.

- **`&&` AND lógico:** Verdadero solo si ambas condiciones son verdaderas.  
- **`||` OR lógico:** Verdadero si al menos una condición es verdadera.  
- **`!` NOT lógico:** Invierte el valor booleano.

```java
boolean r = (5 > 3) && (2 < 4);
```

## 7. Resultado de operaciones según el tipo de dato  
Java convierte el resultado al tipo más grande involucrado en la operación.

```java
byte   bA = 5,    bB = 2;
short  sA = 10,   sB = 3;
int    iA = 20,   iB = 6;
long   lA = 100L, lB = 30L;
float  fA = 5.5f, fB = 2.0f;
double dA = 7.2,  dB = 3.1;
char   cA = 'A';

int    rByte  = bA + bB;
int    rShort = sA - sB;
int    rInt   = iA / iB;
long   rLong  = lA % lB;
float  rFloat = fA * fB;
double rDoub  = dA + dB;
int    rChar  = cA + 5;
double rMix   = iA * dB;
```

## 8. Precedencia de operadores en Java (resumen)

De mayor a menor prioridad:

1. **Paréntesis** — `()`
2. **Unarios** — `++` `--` `+` `-` `!` `~` `(tipo)`
3. **Multiplicativos** — `*` `/` `%`
4. **Aditivos** — `+` `-`
5. **Desplazamientos** — `<<` `>>` `>>>`
6. **Relacionales** — `<` `>` `<=` `>=` `instanceof`
7. **Igualdad** — `==` `!=`
8. **AND bit a bit** — `&`
9. **XOR bit a bit** — `^`
10. **OR bit a bit** — `|`
11. **AND lógico** — `&&`
12. **OR lógico** — `||`
13. **Ternario** — `?:`
14. **Asignación** — `=` `+=` `-=` `*=` `/=` `%=` `&=` `|=` `^=` `<<=` `>>=` `>>>=`

## 9. Casteo (Casting)  
Permite convertir un tipo de dato en otro.

- **Casteo implícito:** Conversión automática a un tipo más grande.  
- **Casteo explícito:** Conversión forzada a un tipo más pequeño.

```java
int x = 10;
double y = x;

double a = 9.7;
int b = (int) a;

int rCast1 = (int) 5.8 + 2;
double rCast2 = 5 / (double) 2;
```
