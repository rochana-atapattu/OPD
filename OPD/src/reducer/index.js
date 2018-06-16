import { combineReducers } from 'redux';
import {authentication}from './authentication'
import {registration}from './registration'
import {users} from './user'
import {patient} from './patient'
import {patientHistory} from './patientHistory'
import {patientRecord} from './patientRecord'
import {queueReducer} from './queue'

const rootReducer = combineReducers({
    authentication,
    registration,
    users,
    patient,
    patientHistory,
    patientRecord,
    queueReducer
});

export default rootReducer;