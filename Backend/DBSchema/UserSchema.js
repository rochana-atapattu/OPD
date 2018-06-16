var mongoose=require('mongoose');
const Schema=mongoose.Schema;

const UserSchema=new Schema({
    username:{
        type:String,
        require:true
    },
    password:{
        type:String,
        require:true
    }
});

mongoose.model('User',UserSchema);
module.exports=mongoose;