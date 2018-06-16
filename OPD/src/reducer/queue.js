"use strict"

export function queueReducer(state={queue:[]} ,action){

    switch(action.type){
        case "GET_QUEUE":
            return {...state, history:[...action.payload]}
            break;
        case "ADD_QUEUE":
            return {}
            break;
    }
    return state;
}