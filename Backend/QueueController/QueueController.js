var mongoose=require('../DBSchema/DBConfig');
var QueueSchema=mongoose.model('Queue');


var QueueController=function () {
    //To add a user
    this.insertPatientToQueue=function (data) {
        return new Promise(function (resolve, reject) {
            var Queue=new QueueSchema({
                assignTo:data.assignTo,
                dateAndTime:data.dateAndTime,
                assignBy:data.assignBy,
                remarks:data.remarks
            });
            Queue.save().then(function () {
                resolve({status:200,message:"User inserted Sucessfully"});
            }).catch(function (err) {
                reject({status:500,message:"Error "+err});
            })
        })

    }
}

module.exports=new QueueController();