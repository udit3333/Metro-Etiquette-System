# Metro-Etiquette-System

### Introduction ###
* This is a Metro System Interface implementing using Java Language.
* It is written by team of three including me in july-September of 2014 as a part of Object Oriented Programming Course.
* To run the project one need to run the main file named as MetroEtiquettes.java.

### Functionalities ###
* Types of ticket Booking:

  * Tokens- Tokens are used as single journey tickets. These are captured by gates during exit.This function will ask user for name, age, sex and route (from_ to _) and generate the fare and thereby type and number of tokens.      
  
  * Metro Travel Card (Smart Card)- This card stores some amount of money and through this you can travel without buying tokens. Every time you use this that much amount of money (with 10% concession) will get deducted. The card can also be topped up whenever it does not have sufficient amount.This will include registration for new card – asking user for general information, a nominal amount of Rs.50 and generating the card number, loading of tickets in the card, recharge (or top up) of card, present amount inquiry etc. 
  
  * Group Ticket-This is a paper ticket issued for a ‘Group’ of persons less than 25. The Group ticket is a single journey ticket.
This will ask for number of persons and the route and generate the fare at a rate less than normal one and a single ticket (with unique number). 

  * Trip Ticket- It can be used for performing multiple journeys and is specially meant for regular commuters between two fixed stations. A Single journey from one station to the destination station is a TRIP.It will ask for the two stations, the number of days for which the ticket has to be issued (10, 20, 30, 60, 90, 120 or 365) and if applicable for the renewal of ticket. The fare will be generated accordingly.
  
* Metro timings- It will provide the information regarding timing of all the trains according to their route.

* Metro Fares- This will give the fare rate for different tickets, tokens and smartcard.

* Contact- This will provide the address, email ID, fax and telephone number of the inquiry office.

### License ###
[MIT License](https://github.com/udit3333/Metro-Etiquette-System/blob/master/LICENSE)
