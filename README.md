﻿# distributed-labs

### Lab 1

### Ex 1.1

•Client:  
• Reads address and port number of the server service from command line  
• Reads two numbers from standard input and sends them to the server  
• Receives and prints the response from the server  
• Server:  
• Reads the port number of the service from command line  
• Prints address and port number of the connecting clients  
• Receives two integers from each client, computes the sum and sends back the  
response with the result  
• You have to handle the possible exceptions  
•Develop both an iterative and a multi-threaded version of the server

### Ex 1.2

•Service to book theatre tickets  
•Assumptions: a single show, a single type of ticket  
•It must be developed as a concurrent server  
•Issue: you mustn’t sell more than the available tickets  
•You have to create the classes necessary for the multi-thread  
communication, and a class ‘‘Reservations’’ with a method without  
parameters that check if there are free seats:  
• If there are, it returns the number of the reserved seat  
• If there are not, it returns zero  
•Check if the synchronization problems are solved by using  
Thread.sleep()

## Lab 2

### Ex 2.1

A veterinarian has a waiting room that can contain only dogs and cats  
• A cat can’t enter in the waiting room if there is already a dog or a cat  
• A dog can’t enter in the waiting room if there is a cat  
• There can’t be more than four dogs together  
•The animals stay in the waiting room for a random interval of time  
•The animals that can’t enter in the waiting room have to wait as  
necessary  
•The problem must be solved by using synchronized, wait and notify  
• You have to develop two methods: enterRoom and exitRoom  
• Each animal is represented by a randomly generated thread from which you  
will call these methods

### Ex 2.2

Build a chat service through sockets  
•Each user writes the messages to be sent with the keyboard  
•The communication is asynchronous: each user can send  
messagges indipendently from the other users  
•The threads must communicate through a shared buffer  
•Two variations:

1. Chat between only two users (one is the server, the other is the  
   client)
2. Chat-room: a server receives connections from several users and  
   forwards the messages to all the participants

## Lab4
## Ex 4.1 - REST
Exercise: Rest Dictionary
• Create a REST service that allows managing a words dictionary. It should
enable the user to:
• Enter a word and its definition
• Change the definition of a word
• Given a word, view its definition.
• Delete a word
• Manage errors with appropriate HTTP responses (word already entered, the
word does not exist,...)
• Pay attention to synchronization problems!
• One way to test a REST server on the fly is by using tools like Advanced REST
Client (plugin for Chrome)


### Ex 4.2 - MQTT

Create 3 processes that simulate a temperature sensor that every 5 seconds
publishes a random temperature value (between 18 and 22 degrees) to the topic
“home/sensors/temp”
• Create a process that subscribes to the topic “home/sensors/temp” and computes
the average of the last 5 sensors measurements. If that average temperature
exceeds 20 degrees, it sends a message to the topic “home/controllers/temp” that
signals to turn off the heaters. Otherwise, it signals to turn them on.
• Create one process that simulates a heater which subscribes to the topic
“home/controllers/temp” and that prints in the console when it turns on or off.
