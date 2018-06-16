
var Express=require('express');
var router=Express.Router();
var UserController=require('./UserController');

router.post('/',function (req,res) {
    UserController.insertUser(req.body).then(function (data) {
        res.status(data.status).send({message:data.message});
    }).catch(function (err) {
        res.status(data.status).send({message:err.message});
    });
});
router.post('/login',function (req,res) {
    UserController.checkUserLogin(req.body.username, req.body.password).then(function (data) {
        console.log(data);
        res.status(data.status).send({data:data.userSearched})
    })
});

module.exports=router;