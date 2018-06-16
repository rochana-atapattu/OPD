"use strict"

export function patientHistory(state={history:[]} ,action){

    switch(action.type){
        case "GET_PATIENT":
            return {...state, history:[...action.payload]}
            break;

    }
    return state;
}