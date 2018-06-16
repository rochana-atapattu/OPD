const Express           = require('express');
var Patientcontroller   = require('./PatientController');
var router              = Express.Router();

router.post('/',function (req,res) {
    Patientcontroller.registerPatient(req.body).then(function (data) {
        res.status(data.status).send(data.message);
    }).catch(function (err) {
        res.status(err.status).send(err.message);
    })
})

router.get('/:id',function (req,res) {
    Patientcontroller.searchPatient(req.params.id).then(function (data) {
        res.status(data.status).send(data.message);
    }).catch(function (err) {
        res.status(err.status).send(err.message);
    })
})

router.put('/:id',function(req,res){
    Patientcontroller.updatePatient(req.params.id,req.body).then(function(data){
        res.status(data.status).send(data.message);
    }).catch(function(err){
        res.status(err.status).send(err.message);
    })
})

module.exports = router;

