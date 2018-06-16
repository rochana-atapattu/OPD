var mongoose=require('../DBSchema/UserSchema');
var UserSchema=mongoose.model('User');


var UserController= function () {
    this.insertUser=function (data) {
        return new Promise(function (resolve, reject) {
            var User=new UserSchema({
                username:data.username,
                password:data.password
            });
            User.save().then(function () {
                resolve({status:200,message:"User inserted Sucessfully"})
            }).catch(function (err) {
                reject({status:500,message:"Error "+err});
            })
        })
    }

    this.checkUserLogin=function (username, password) {
        return new Promise(function (resolve, reject) {
            UserSchema.find({username:username, password: password}).exec().then(function (data) {
                if(data[0] == undefined) {
                    reject({status:404,message:"Not Found ",userSearched:null});
                    //return;

                }
                resolve({status:200,userSearched:data});
            }).catch(function (err) {
                reject({status:404,message:"Not Found ",userSearched:null});
            })
        })
    }
}

module.exports=new UserController();