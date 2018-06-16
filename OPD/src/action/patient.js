"use strict"

import { patientService } from '../service';

export function getPatient(){
    return function(dispatch){
        patientService.getPatient(id)
            .then(function(response){
                dispatch({type:"GET_PATIENT", payload:response})
            })
            .catch(function(err){
                dispatch({type:"GET_PATIENT_REJECTED", payload:err})
            })
    }
}

export function addPatient(patient){
    return function(dispatch){
        patientService.addPatient(food)
            .then(function(response){
                dispatch({type:"ADD_PATIENT", payload:response.data})
            })
            .catch(function(err){
                dispatch({type:"ADD_PATIENT_REJECTED", payload:err})
            })
    }
}