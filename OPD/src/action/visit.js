

export const visitAction = {
    visit,
    addVisit,
    addExamination,
    addLabTest,
    addPrescription,
    addVaccine,
    addTreatment
};

function addVisit(visit) {
    return dispatch => {
        dispatch({type: "ADD_VISIT", visit});

    }
}
function addExamination(exam) {
    return dispatch => {
        dispatch({type: "UPDATE_VISIT", exam});

    }
}
function addLabTest(labTest) {
    return dispatch => {
        dispatch({type: "UPDATE_VISIT", labTest});

    }
}
function addPrescription(prescription) {
    return dispatch => {
        dispatch({type: "UPDATE_VISIT", prescription});

    }
}
function addVaccine(vaccine) {
    return dispatch => {
        dispatch({type: "UPDATE_VISIT", vaccine});

    }
}

function addTreatment(treatment) {
    return dispatch => {
        dispatch({type: "UPDATE_VISIT", treatment});

    }
}