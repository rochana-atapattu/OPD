"use strict"

import { patientService } from '../_services';

export function getPatientHistory(){
    return function(dispatch){
        patientRecordService.getPatientHistory(id)
            .then(function(response){
                dispatch({type:"GET_PATIENT_HISTORY", payload:response})
            })
            .catch(function(err){
                dispatch({type:"GET_PATIENT_HISTORY_REJECTED", payload:err})
            })
    }
}

export function addPatientRecord(patientRecord){
    return function(dispatch){
        patientRecordService.addPatientRecord(patientRecord)
            .then(function(response){
                dispatch({type:"ADD_PATIENT_RECORD", payload:response.data})
            })
            .catch(function(err){
                dispatch({type:"ADD_PATIENT_RECORD_REJECTED", payload:err})
            })
    }
}