var express = require('express');
var router = express.Router();
var handlers=require('../controllers/ApiController.js');
/* GET home page. */
router.get('/', handlers.home);

/* GET Hello World page. */
router.get('/helloworld', handlers.helloWorld);

/*Get to place search page*/
router.get('/place', handlers.cropSearch);

/*Get to crop search page*/
router.get('/crop', handlers.placeSearch);

router.get('/fetchplaces', function(req, res, next) {
  res.render('fetchplaces',{});
});

router.get('/pageplaces', function(req, res, next) {
  res.render('pageplaces',{});
});
router.get('/pagehome', function(req, res, next) {
  res.render('pagehome',{});
});



router.get('/fetchVariety', handlers.fetchVariety);

router.get('/weather', handlers.weather);
router.get('/pageweather', function(req, res, next) {
  res.render('pageweather',{});});
module.exports = router;
