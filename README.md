link al repositorio: https://github.com/siraglez/entregaUd11TP.git

# Ejercicio: Gestión de Códigos de Productos

El código proporcionado es una implementación en Java de una clase llamada `ClaseCodigoProducto`, que tiene un método estático llamado `GeneraCodigo` y un método `main` para realizar pruebas unitarias.

## Aquí está el funcionamiento del código:

- Se importa la clase `HashMap` del paquete `java.util` para utilizarla en el seguimiento de los códigos generados.
- Se define la clase `ClaseCodigoProducto`, que contiene un `HashMap` llamado `codigoCounter`. Este mapa se utiliza para llevar un registro de cuántos códigos se han generado para cada combinación de descripción y categoría.
- El método estático `GeneraCodigo` toma dos argumentos de tipo `String`: `descripcion` y `categoria`. Este método genera un código único para un producto basado en la descripción y la categoría dadas.
- Se verifica si la descripción o la categoría son nulas o están vacías. En tal caso, el método devuelve una cadena vacía.
- Se divide la descripción y la categoría en palabras, convirtiéndolas a mayúsculas para garantizar que las letras iniciales de las palabras sean consistentes.
- Se concatenan las primeras letras de las palabras clave de la descripción y la categoría, separadas por un guion (-), para formar la parte principal del código.
- Se incrementa el contador de códigos para la combinación de descripción y categoría actual y se guarda en el `HashMap`.
- Se agrega el número secuencial único al código, utilizando el valor del contador formateado con tres dígitos, para garantizar que siempre tenga la misma longitud.
- Se devuelve el código generado como una cadena.
- En el método `main`, se realizan varias pruebas unitarias para verificar el correcto funcionamiento del método `GeneraCodigo`. Estas pruebas incluyen la generación de códigos para diferentes combinaciones de descripción y categoría, así como la manipulación adecuada de entradas incorrectas o vacías.

En resumen, el código proporcionado implementa un método para generar códigos únicos de productos basados en la descripción y la categoría, y proporciona pruebas unitarias para verificar su correcto funcionamiento.

# Pseudocódigo

```java
Función GeneraCodigo(descripcion, categoria)
    Si descripcion es nula o vacía o categoria es nula o vacía, entonces
        Devolver una cadena vacía
    Fin Si
  
    palabrasDescripcion = dividir(descripcion en palabras)
    palabrasCategoria = dividir(categoria en palabras)
  
    codigo = ""
  
    Para cada palabra en palabrasDescripcion hacer
        Si la palabra no está vacía entonces
            Agregar la primera letra de la palabra al código
        Fin Si
    Fin Para
  
    Agregar "-" al código
  
    Para cada palabra en palabrasCategoria hacer
        Si la palabra no está vacía entonces
            Agregar la primera letra de la palabra al código
        Fin Si
    Fin Para
  
    Incrementar el contador de códigos para la combinación de descripción y categoría
    Formatear el contador con tres dígitos y agregarlo al código
  
    Devolver el código generado
Fin Función

```
