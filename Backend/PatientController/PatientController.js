var mongoose        = require('../DBSchema/PatientSchema');
var patientschema   =   mongoose.model('Patient');

var PatientController = function () {

    this.registerPatient = (data) => {
        return new Promise(function (resolve, reject) {
            var patient = patientschema({

                id:Date.now(),
                title:data.title,
                fullname:data.fullname,
                othername:data.othername,
                dob:data.dob,
                gender:data.gender,
                cstatus:data.cstatus,
                years:data.years,
                months:data.months,
                days:data.days,
                nic:data.nic,
                passport:data.passport,
                citizenship:data.citizenship,
                planguage:data.planguage,
                bloodgrp:data.bloodgrp,
                add1:data.add1,
                add2:data.add2,
                village:data.village,
                phone:data.phone,
                guadian:data.guadian,
                guadiantp:data.guadiantp,
                remark:data.remark,
                allergies:[
                    {
                        allergyName:"none",
                        remarks:"none",
                        state:"none"
                    }
                ]//update this when adding allergies


            })

            patient.save().then(function () {
                resolve({status:200,message:"New Patient registered..!"})
            }).catch(function (err) {
                reject({status:500,message:"Error :"+err})
            })
        })
    }

    this.searchPatient = function (ID) {
        return new Promise(function (resolve, reject) {
            patientschema.findOne({id:ID}).then(function (data) {
                resolve({status:200,message:data})
            }).catch(function (err) {
                reject({status:500,message:"Error :"+err})
            })
        })
    }

    this.updatePatient = (ID, data) => {
        return new Promise(function (resolve, reject) {
            patientschema.update({id:ID},data).then(function(){
                resolve({status:200,message:"Updated Patient"});
            }).catch(function(err){
                reject({status:500,message:"Error "+err})
            })
        })
    }

}

module.exports = new PatientController();