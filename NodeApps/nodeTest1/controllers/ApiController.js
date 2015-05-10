var url = require('../public/APIURL.js');

function dayOfWeekAsString(dayIndex) {
	return ["Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"][dayIndex];
}
home = function (req, res, next) {
	res.render('index', {
		title : 'Express'
	});
}
helloWorld = function (req, res) {
	//var query = require('url').parse(req.url,true).query;
	console.log(req.query);
	res.render('helloworld', {
		title : 'Hello, World! vijay',
		para : req.query.id
	});
}

placeSearch = function (req, res) {
	// var query = require('url').parse(req.url,true).query;
	var query = req.query;
	var Client = require('node-rest-client').Client;

	client = new Client();
	var args = {
		data : {
			test : "hello"
		},
		headers : {
			"Accept" : "application/json"
		}
	};
	var DisplayContent;
	// direct way
	client.get(url.placeSearch + "/" + query.crop + "/" + query.subcrop, args, function (data, response) {
		// parsed response body as js object
		console.log(data);
		DisplayContent = data;
		// raw response
		console.log("response ::::" + response);
		console.log(DisplayContent['give']);
		res.render('placeSearch', {
			title : "placeSearch",
			response : DisplayContent
		})
		//console.log("content of json is "+JSON.stringify(DisplayContent));
	});

}

cropSearch = function (req, res) {
	var Client = require('node-rest-client').Client;
	// var query = require('url').parse(req.url,true).query;
	var query = req.query;
	client = new Client();
	var args = {
		data : {
			test : "hello"
		},
		headers : {
			"Accept" : "application/json"
		}
	};
	var DisplayContent;
	// direct way
	console.log(url.cropSearch);
	client.get(url.cropSearch + "/" + query.district + "/" + query.area + "/" + query.year, args, function (data, response) {
		// parsed response body as js object
		console.log(data);
		DisplayContent = data;
		// raw response
		console.log("response ::::" + response);
		console.log(DisplayContent['places']);
		res.render('cropSearch', {
			title : "cropSearch",
			response : DisplayContent

		})
		//console.log("content of json is "+JSON.stringify(DisplayContent));
	});

}

weather = function (req, res) {

	var Client = require('node-rest-client').Client;

	client = new Client();
	client2=new Client();
	var args = {
		data : {
			test : "hello"
		},
		headers : {
			"Accept" : "application/json"
		}
	};
	var DisplayContent;
	var humidity="",temp="",wind="",weather="";
	// direct way  var q=13.082,80.270;
	var requestUrl = url.requestUrl_1 + "q=13.082,80.270" + url.requestUrl_2;
	client.get(requestUrl, function (data, response) {
		// parsed response body as js object
		console.log("data is "+data);

		DisplayContent = JSON.parse(data);
		// raw response
		console.log("humidity ::::" + DisplayContent.data.current_condition[0].humidity);
		humidity=DisplayContent.data.current_condition[0].humidity;
		console.log("temp ::::" + DisplayContent.data.weather[0].hourly[0].chanceofhightemp);
		 temp=DisplayContent.data.weather[0].hourly[0].chanceofhightemp;
		console.log("wind  ::::" + DisplayContent.data.weather[0].hourly[0].chanceofwindy);
		wind=DisplayContent.data.weather[0].hourly[0].chanceofwindy;
		console.log("weather ::::" + DisplayContent.data.current_condition[0].weatherDesc[0].value);
		weather=DisplayContent.data.current_condition[0].weatherDesc[0].value;
		//  client.get(requestUrl, function(data, response){
		
		//});
var ResultValues;
	var restReq=url.mod3+"/"+weather+"/"+humidity+"/"+temp+"/"+wind;
	console.log(restReq);
	client2.get(restReq, function (data2, response2) {
		// parsed response body as js object
		console.log("data is "+JSON.stringify(data2));
		
		res.render('weather', {
			title : "weather",
			response : data2

		});

	});
	
	
	});
	

}

fetchVariety = function (req, res) {
	var Client = require('node-rest-client').Client;
	// var query = require('url').parse(req.url,true).query;
	var query = req.query;
	client = new Client();
	var args = {
		data : {
			test : "hello"
		},
		headers : {
			"Accept" : "application/json"
		}
	};
	try{
	var DisplayContent;
	// direct way
	var requestor=url.fetchVariety+ "/" + query.crop;
	console.log(requestor);
	client.get(requestor, args, function (data, response) {
		// parsed response body as js object
		console.log(data);
		DisplayContent = data;
		// raw response
		console.log("response ::::" + response);
		DisplayContent.requestCrop=query.crop;
		res.render('subcrops', {
			title : "subcrops",
			response : DisplayContent

		});
		//console.log("content of json is "+JSON.stringify(DisplayContent));
	});}
	catch(e)
	{
	console.log(e);
	}

}
module.exports.fetchVariety=fetchVariety;
module.exports.weather = weather;
module.exports.cropSearch = cropSearch;
module.exports.placeSearch = placeSearch;
module.exports.helloWorld = helloWorld;
module.exports.home = home;