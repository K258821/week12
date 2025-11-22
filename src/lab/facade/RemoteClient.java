package lab.facade;

/**
* Simulated Remote Client — demonstrates sending text commands to the RemoteFacade.
* In a real system this would open a socket and send text over the network; here we
* simply call RemoteFacade.processCommand(...) directly to simulate a round-trip.
*/
public class RemoteClient {
public static void main(String[] args) {
// Setup: create the local facade and the remote facade (server-side)
ComputerFacade localFacade = new ComputerFacade();
RemoteFacade remoteServer = new RemoteFacade(localFacade);
// Simulated sequence of commands a client might send:
sendAndPrint(remoteServer, "PING");
sendAndPrint(remoteServer, "START");
// Simulate some client-side logic or delay (kept minimal)
System.out.println("-- Client: doing local work while server runs --\n");
// Finally request shutdown
sendAndPrint(remoteServer, "SHUTDOWN");
// Unknown command demo
sendAndPrint(remoteServer, "FOO");
}
// Helper: emulate sending a command and printing the server response
private static void sendAndPrint(RemoteFacade server, String cmd) {
System.out.println("Client -> Server: \"" + cmd + "\"");
String response = server.processCommand(cmd); // simulated network call
System.out.println("Client <- Server: \"" + response + "\"\n");
}
}