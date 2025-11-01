# ARSW-WebSockets
 
Este proyecto es un ejercicio práctico para comprender el uso de WebSockets en Java, utilizando Spring Boot. Permite la comunicación en tiempo real entre el servidor y los clientes web, enviando mensajes periódicos a través de un endpoint WebSocket.

## Estructura del proyecto

- `src/main/java/co/edu/escuelaing/websocketprimer/`
	- `App.java`: Clase principal para iniciar la aplicación Spring Boot.
	- `WSStartApp.java`: Configuración y arranque del servidor WebSocket.
	- `WebController.java`: Controlador web para servir la página principal.
	- `components/TimedMessageBroker.java`: Componente encargado de enviar mensajes periódicos a los clientes conectados.
	- `configuration/WSConfigurator.java`: Configuración personalizada para el endpoint WebSocket.
	- `endpoints/TimerEndpoint.java`: Endpoint WebSocket que gestiona la conexión y envío de mensajes.
- `src/main/resources/static/`
	- `index.html`: Página web principal que se conecta al WebSocket.
	- `js/WsComponent.jsx`: Componente JavaScript para manejar la comunicación WebSocket en el frontend.
- `src/test/java/co/edu/escuelaing/websocketprimer/AppTest.java`: Pruebas unitarias.

## ¿Cómo funciona?

1. El usuario accede a la página web (`index.html`).
2. El frontend se conecta al endpoint WebSocket.
3. El servidor envía mensajes periódicos a todos los clientes conectados.
4. Los mensajes se muestran en tiempo real en la interfaz web.

## Ejecución

1. Clona el repositorio.
2. Compila y empaqueta el proyecto:
	```powershell
	mvn clean package
	```
3. Ejecuta el proyecto:
	```powershell
	mvn spring-boot:run
	```
	O bien, ejecuta el archivo JAR generado:
	```powershell
	java -jar target/ARSW-WebSockets-1.0-SNAPSHOT.jar
	```
4. Accede a `http://localhost:8080` en tu navegador.

## Requisitos
- Java 8 o superior
- Maven
