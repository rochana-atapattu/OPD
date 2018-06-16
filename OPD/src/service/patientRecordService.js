
export const patienRecordService = {
    addPatientRecord,
    getPatientRecord
};

function addPatientRecord(record){
    const requestOptions = {
        method: 'POST',
        headers: {'Content-Type': 'application/json' },
        body: JSON.stringify({record })
    };

    return fetch('http://localhost:8080/api/patientrecords', requestOptions).then(handleResponse);

}

function getPatientRecord(id){

    const requestOptions = {
        method: 'GET',
        headers: {'Content-Type': 'application/json'},

    }

    return fetch('http://localhost:8080/api/patienthistory'+id, requestOptions).then(handleResponse);

}
function handleResponse(response) {
    if (!response.ok) {
        return Promise.reject(response.statusText);
    }

    return response.json();
}
