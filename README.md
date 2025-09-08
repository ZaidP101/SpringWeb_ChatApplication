# Modern Chat Application

This is a real-time chat application built using Java Spring Boot on the backend and HTML, CSS, JavaScript with WebSocket (STOMP over SockJS) on the frontend. It demonstrates the integration of WebSockets in a Spring application for real-time, bidirectional communication between clients.

![Chat Application UI](img/Chat-Application.PNG)

## Working of the Project

- When a user opens the chat page, a WebSocket connection is established to the endpoint `/chat` using SockJS and STOMP protocols.
- The frontend subscribes to the `/topic/message` topic to receive real-time broadcast messages from the server.
- When a user types a message and clicks the "Send" button:
  - The message is sent to the server via `/app/sendMessage`.
  - The server receives it in `ChatController` and broadcasts it to all subscribers of `/topic/message`.
  - All connected clients receive the message and display it in their chat window.
- Messages are visually distinguished between sent and received using different styles for better user experience.

## Technologies Used

### Frontend

- HTML5 & CSS3
- Bootstrap 5
- JavaScript (DOM manipulation, STOMP, SockJS)

### Backend

- Java 17+
- Spring Boot
- Spring WebSocket (STOMP over SockJS)
- Spring MVC

## Key Features

- Real-time two-way messaging using WebSockets
- Clean, responsive UI with Bootstrap
- Message differentiation based on sender
- Automatically scrolls to the latest message
