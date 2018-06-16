
export const userService = {
    login,
    logout,
    register
};

function login(username, password) {
    const requestOptions = {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ username, password })
    };
    console.log("getting data")

    return fetch('http://localhost:8081/', requestOptions)


        .then(response => {
            // login successful if there's a jwt token in the response
            if (response) {
                // store patient details and jwt token in local storage to keep patient logged in between page refreshes
                localStorage.setItem('patient', JSON.stringify(response.patient));
                console.log(response.patient);
            }

            return response;
        });
}
function logout() {
    // remove patient from local storage to log patient out
    localStorage.removeItem('patient');
}



function handleResponse(response) {
    return response.json().then(data => {
        if (!response.ok) {
            if (response.status === 401) {
                // auto logout if 401 response returned from api
                logout();
                location.reload(true);
            }

            const error = (data && data.error) || response.statusText;
            return Promise.reject(error);
        }

        return data;
    });
}


function register(user) {
    const requestOptions = {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(user)
    };

    return fetch('http://localhost:8080/authentication/register', requestOptions).then(handleResponse);
}


