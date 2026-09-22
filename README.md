# ClockJava

Reloj de escritorio en **Java Swing**. Muestra la hora, el día de la semana y la fecha, y los refresca mientras la ventana está abierta.

## Qué hace

- Hora en formato de 12 horas (`hh:mm:ss a`).
- Día de la semana y fecha (`MM/dd/yyyy`).
- Ventana fija de 350×200, fondo negro y hora en verde.

## Stack

- Java
- Swing (`JFrame`, `JLabel`)
- `Calendar` y `SimpleDateFormat`
- Proyecto NetBeans (`build.xml`, `nbproject`)

## Estructura

```
src/Main.java      # punto de entrada
src/MyFrame.java   # ventana y etiquetas del reloj
```

## Cómo ejecutarlo

Abre el proyecto en NetBeans y ejecuta `Main`.

```bash
javac -d out src/Main.java src/MyFrame.java
java -cp out Main
```
