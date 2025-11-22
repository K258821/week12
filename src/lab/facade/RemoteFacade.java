package lab.facade;


/**
* Simulated Remote Facade — accepts simple text commands and invokes the local facade.
* This simulates the 'server side' of a remote facade, but uses direct calls rather than
sockets.
*
* Supported commands (case-insensitive):
* START -> starts the computer via the local facade
* SHUTDOWN -> shuts down the computer via the local facade
* PING -> quick health check (returns "PONG")
*
* Returns simple textual responses suitable for a text-based protocol.
*/
public class RemoteFacade {
private final ComputerFacade facade;
public RemoteFacade(ComputerFacade facade) {
this.facade = facade;
}
/**
* Process a single text command and return a textual response.
* This method simulates the server handling one received command from a client.
*/
public String processCommand(String command) {

if (command == null) return "ERROR: null command";
String cmd = command.trim().toUpperCase();
switch (cmd) {
case "START":
// server executes the real local facade operation
facade.start();
return "OK: STARTED";
case "SHUTDOWN":
facade.shutdown();
return "OK: SHUTDOWN";
case "PING":
return "PONG";
default:
return "ERROR: UNKNOWN COMMAND";
}
}
}