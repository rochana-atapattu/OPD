var mongoose=require('mongoose');
const Schema=mongoose.Schema;

const QueueSchema=new Schema({
    assignTo:{
        type:String,
        require:true
    },
    dateAndTime:{
        type:String,
        requre:true,
    },
    assignBy:{
        type:String,
        require:true
    },
    remarks:{
        type:String,
        require:true
    }
});

mongoose.model('Queue',QueueSchema);
mongoose.connect('mongodb://127.0.0.1:27017/opd',function (err) {
    if(err){
        console.log(err);
        process.exit(-1);
    }
    console.log("DB connected Sucessfully");
});

module.exports=mongoose;