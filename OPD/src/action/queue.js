"use strict"

import { queueService } from '../_services';

export function get(){
    return function(dispatch){
        queueService.getGetMyQueue(id)
            .then(function(response){
                dispatch({type:"GET_MY_QUEUE", payload:response})
            })
            .catch(function(err){
                dispatch({type:"GET_MY_QUEUE_REJECTED", payload:err})
            })
    }
}

export function add(details){
    return function(dispatch){
        queueService.addPatientToQueue(details)
            .then(function(response){
                dispatch({type:"ADD_TO_QUEUE", payload:response.data})
            })
            .catch(function(err){
                dispatch({type:"ADD_TO_QUEUE_REJECTED", payload:err})
            })
    }
}