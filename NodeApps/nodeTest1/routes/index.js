var express = require('express');
var router = express.Router();
var handlers=require('../controllers/ApiController.js');
/* GET home page. */
router.get('/', handlers.home);

/* GET Hello World page. */
router.get('/helloworld', handlers.helloWorld);

/*Get to place search page*/
router.get('/place/:crop/:subcrop', handlers.placeSearch);

/*Get to crop search page*/
router.get('/crop/:place/:area/:rain', handlers.cropSearch);

router.get('/prof', function(req, res, next) {
  res.render('prof',{});
});

router.get('/pageplaces', function(req, res, next) {
  res.render('pageplaces',{});
});
router.get('/pagehome', function(req, res, next) {
  res.render('pagehome',{});
});



router.get('/fetchVariety/:crop', handlers.fetchVariety);

router.get('/weather', handlers.weather);

module.exports = router;
