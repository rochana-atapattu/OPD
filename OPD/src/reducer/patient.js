"use strict"

export function patient(state={patient:{}} ,action){

    switch(action.type){
        case "GET_PATIENT":
            return {patient:action.payload}
            break;
        case "ADD_PATIENT":
            return {patient:action.payload}
            break;
    }
    return state;
}