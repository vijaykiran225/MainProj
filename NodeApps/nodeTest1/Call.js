var Client = require('node-rest-client').Client;
 
client = new Client();
 
// direct way 
client.get("http://localhost:8080/jerseytest/rs/vijay/show/rice/tkm12", function(data, response){
            // parsed response body as js object 
            console.log(data);
            // raw response 
           // console.log(response);
        });