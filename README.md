# ClockJava

A desktop clock in **Java Swing**. It shows the time, the day of the week, and the date, and refreshes them while the window is open.

## What it does

- Time in 12-hour format (`hh:mm:ss a`).
- Day of the week and date (`MM/dd/yyyy`).
- Fixed 350×200 window, black background, and green time text.

## Stack

- Java
- Swing (`JFrame`, `JLabel`)
- `Calendar` and `SimpleDateFormat`
- NetBeans project (`build.xml`, `nbproject`)

## Layout

```
src/Main.java      # entry point
src/MyFrame.java   # window and clock labels
```

## How to run

Open the project in NetBeans and run `Main`.

```bash
javac -d out src/Main.java src/MyFrame.java
java -cp out Main
```
