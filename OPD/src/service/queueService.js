
export const queueService = {
    addPatientToQueue,
    getGetMyQueue
};

function addPatientToQueue(details){
    const requestOptions = {
        method: 'POST',
        headers: {'Content-Type': 'application/json' },
        body: JSON.stringify({record })
    };

    return fetch('http://localhost:8080/queue', requestOptions).then(handleResponse);

}

function getGetMyQueue(id){

    const requestOptions = {
        method: 'GET',
        headers: {'Content-Type': 'application/json'},

    }

    return fetch('http://localhost:8080/queue/'+id, requestOptions).then(handleResponse);

}
function handleResponse(response) {
    if (!response.ok) {
        return Promise.reject(response.statusText);
    }

    return response.json();
}
