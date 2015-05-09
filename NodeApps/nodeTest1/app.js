var express = require('express');
var path = require('path');
var favicon = require('serve-favicon');
var logger = require('morgan');
var cookieParser = require('cookie-parser');
var bodyParser = require('body-parser');
var apiKey = 'aef1f36504e1868fc4289c9151118'; //my weather key added
var routes = require('./routes/index');
var users = require('./routes/users');

var app = express();

// hello view engine setup
app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'jade');

// uncomment after placing your favicon in /public
//app.use(favicon(__dirname + '/public/favicon.ico'));
app.use(logger('dev'));
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: false }));
app.use(cookieParser());
app.use(express.static(path.join(__dirname, 'public')));

app.use('/', routes);
app.use('/users', users);

// catch 404 and forward to error handler
app.use(function(req, res, next) {
  var err = new Error('Not Found');
  err.status = 404;
  next(err);
});

// error handlers

// development error handler
// will print stacktrace
if (app.get('env') === 'development') {
  app.use(function(err, req, res, next) {
    res.status(err.status || 500);
    res.render('error', {
      message: err.message,
      error: err
    });
  });
}

// production error handler
// no stacktraces leaked to user
app.use(function(err, req, res, next) {
  res.status(err.status || 500);
  res.render('error', {
    message: err.message,
    error: {}
  });
});
/*
var requestUrl = 'https://api.worldweatheronline.com/free/v2/weather.ashx?q=new+york&num_of_days=5&key=a7e124b57d3e3d3671960ddcbe467&tp=24&format=json';

function dayOfWeekAsString(dayIndex) {
    return ["Mon","Tue","Wed","Thu","Fri","Sat","Sun"][dayIndex];
}

app.get('/weather', function (req, res) {
    request(requestUrl, function (error, response, body) {
        if (!error && response.statusCode == 200) {

            // parse the json result
            var result = JSON.parse(body);

           // generate a HTML table
           var html = '<table style="font-size: 10px; font-family: Arial, Helvetica, sans-serif">';

           // loop through each row
           for (var i = 0; i < 3; i++) {
               html += "<tr>";

               result.data.weather.forEach(function(weather) {
                   html += "<td>";
                   switch (i) {
                       case 0:
                           html += dayOfWeekAsString(new Date(weather.date).getDay());
                           break;
                       case 1:
                           html += weather.hourly[0].weatherDesc[0].value;
                           break;
                       case 2:
                           var imgSrc = weather.hourly[0].weatherIconUrl[0].value;
                           html += '<img src="'+ imgSrc + '" alt="" />';
                           break;
                  }
                  html += "</td>";
              });
              html += "</tr>";
          }

          res.send(html);
        } else {
           console.log(error, response.statusCode, body);
        }
        res.end("");
    });
});
*/
module.exports = app;
