var express = require('express');
var router = express.Router();

/* GET home page. */
router.get('/', function(req, res, next) {
  res.render('index', { title: 'Express' });
});

/* GET Hello World page. */
router.get('/helloworld', function(req, res) {
    res.render('helloworld', { title: 'Hello, World! vijay' })
});

/*Get to place search page*/
router.get('/place', function(req, res) {
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
    		res.render('placeSearch', {
    			title:"placeSearch",
		     response: DisplayContent
		 		})
           //console.log("content of json is "+JSON.stringify(DisplayContent));
        });




});

/*Get to crop search page*/
router.get('/crop', function(req, res) {
	var Client = require('node-rest-client').Client;
 
client = new Client();
 var args = {
  data: { test: "hello" },
  headers:{"Accept": "application/json"} 
};
var DisplayContent;
// direct way 
client.get("http://localhost:8080/jerseytest/rs/agro/cropSearch/kanyakumari/rainfed/normal",args, function(data, response){
            // parsed response body as js object 
            console.log(data);
			DisplayContent=data;
            // raw response 
           console.log("response ::::"+response);
           console.log(DisplayContent['places']);
    res.render('cropSearch', {
    	title :"cropSearch", 
    	response: DisplayContent 

    })
           //console.log("content of json is "+JSON.stringify(DisplayContent));
        });


});

module.exports = router;
