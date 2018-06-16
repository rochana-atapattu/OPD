"use strict"

export function patientRecord(state={record:{}} ,action){

    switch(action.type){

        case "ADD_PATIENT":
            return {record:action.payload}
            break;
    }
    return state;
}