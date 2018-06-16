var Express =require('express');
var router=Express.Router();
var QueueController=require('./QueueController');
var app=Express();

router.post('/',function (req,res) {
    QueueController.insertPatientToQueue(req.body).then(function (data) {
        res.status(data.status).send({message:data.message});

    }).catch(function (err) {
        res.status(data.status).send({message:err.message});
    })
});

module.exports=router;