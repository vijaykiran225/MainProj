var Client = require('node-rest-client').Client;
 
client = new Client();
 var args = {
  data: { test: "hello" },
  headers:{"Accept": "application/json"} 
};
var DisplayContent;
// direct way 
client.get("http://localhost:8080/jerseytest/rs/agro/placeSearch/rice/tkm12",args, function(data, response){
            // parsed response body as js object 
            console.log(data);
			DisplayContent=data;
            // raw response 
           console.log("response ::::"+response);
           console.log(DisplayContent['give']);
           //console.log("content of json is "+JSON.stringify(DisplayContent));
        });



