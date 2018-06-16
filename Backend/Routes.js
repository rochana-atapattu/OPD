const Express=require('express');

var Routes=Express.Router();


var QueueRoute=require('./QueueController/Queue.Route');
var UserRoute=require('./UserController/User.Route');
var PatientRoute=require('./PatientController/PatientRoute');

Routes.use('/user/',UserRoute);
Routes.use('/queue/',QueueRoute);
Routes.use('/patient',PatientRoute);

module.exports=Routes;