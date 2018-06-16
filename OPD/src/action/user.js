import { userService } from '../service';
import { history } from '../helper';

export const userActions = {
    login,
    logout,
};

function login(username, password) {
    return dispatch => {
        dispatch({type: "LOGIN_REQUEST", username});

        userService.login(username, password)
            .then(
                user => {
                    dispatch({type: "LOGIN_SUCCESS", user});
                    history.push('/');
                }
            ).catch(error => {
            dispatch({type: "LOGIN_FAILURE", error});

        })
    }
}

function logout() {
    userService.logout();
    return { type: "LOGOUT" };
}

