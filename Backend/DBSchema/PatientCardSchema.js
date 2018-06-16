var mongoose=require('mongoose');
const Schema=mongoose.Schema;

const patientCardSchema=new Schema({
    patientID:{
        type:String,
        require:true
    },
    patientname:{
        type:String,
        require:true
    },
    gender:{
        type:String,
        require:true
    },
    civilstatus:{
        type:String,
        require:true
    },
    dob:{
        type:String,
        require:true
    },
    phone:{
        type:String,
        require:true
    },
    address:{
        type:String,
        require:true
    },
    bloodgroup:{
        type:String,
        require:true
    },
    bmi:{
        type:String,
        require:true
    },
    latestDoctor:{
        type:String,
        require:true
    },
    allergies:[{
        alergyName:String,
        remarks:String,
        state:String,
    }]
});

mongoose.model('PatientC',patientCardSchema);
module.exports=mongoose;