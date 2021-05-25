# JavaPreAssignment

Problem Statement:

Build a class/method capable of receiving any string as its input, handling all potential error conditions, and always returning a Java object that adequately represents the following JSON:
 
{
    "result": ${The sum of the acceptedInputs (see below)},
    "acceptedInputs": ${An array of all the integer values in the string (split at commas)},
    "allInputs": ${An array of all the values in the string (split at commas)}
}
 
For example, calling your method with the input: “1,4,5,NaN,,,,65,32,,,NaN,aString,4,56,99” will produce a Java object reflective of this result:
 
{
    "result": 266,
    "acceptedInputs": [1,4,5,65,32,4,56,99]
    "allInputs": ["1","4","5","NaN","","","","65","32","","","NaN","aString","4","56","99"]
}
 
 
Tips
(1) Try to write with good (easily readable) style and in a manner that will encourage code-reuse.
(2) Write unit tests for your class/method.
(3) In the event that you feel you have extra time remaining, consider integrating your solution into a Spring Boot webapp that has a single GET endpoint that accepts the comma-separated list as a query parameter such that calling it from Google or Postman will return the JSON above (and whatever status code you deem appropriate).
 
