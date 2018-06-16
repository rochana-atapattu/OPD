
let user = JSON.parse(localStorage.getItem('patient'));
const initialState = user ? { loggedIn: true, user } : {};

export function authentication(state = initialState, action) {
    switch (action.type) {
        case "LOGIN_REQUEST":
            return {
                loggingIn: true,
                user: action.patient
            };
        case "LOGIN_SUCCESS":
            return {
                loggedIn: true,
                user: action.patient
            };
        case "":
            return {};
        case "LOGOUT":
            return {};
        default:
            return state
    }
}