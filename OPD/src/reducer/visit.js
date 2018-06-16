export function queueReducer(state={visit:{}} ,action){

    switch(action.type){
        case "ADD_VISIT":
            return {visit:action.payload}
            break;
        case "UPDATE_VISIT":
            return {...state,visit:action.payload}
            break;
    }
    return state;
}