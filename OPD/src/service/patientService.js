
export const patienService = {
    addPatient,
    getAllPatients,
    editPatient
};

function addPatient(patient){
    const requestOptions = {
        method: 'POST',
        headers: {'Content-Type': 'application/json' },
        body: JSON.stringify({patient })
    };

    return fetch('http://localhost:8080/patient', requestOptions).then(handleResponse);

}
function editPatient(patient){
    const requestOptions = {
        method: 'PUT',
        headers: {'Content-Type': 'application/json' },
        body: JSON.stringify({patient })
    };
    const id=patient.id;
    console.log("food " +patient +" body  "+ requestOptions.body)
    return fetch('http://localhost:8080/patient/'+id, requestOptions).then(handleResponse);

}

function getAllPatients(){

    const requestOptions = {
        method: 'GET',
        headers: {'Content-Type': 'application/json'},

    }

    return fetch('http://localhost:8080/patient', requestOptions).then(handleResponse);

}
function handleResponse(response) {
    if (!response.ok) {
        return Promise.reject(response.statusText);
    }

    return response.json();
}
