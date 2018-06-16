'use strict';
import React, {Component}   from 'react';

export default class Patient extends Component {
    constructor(props) {
        super(props);
        this.patient = this.props.patient;
    }
render() {

    return <tr>
        <td>{this.patient.id}</td>
        <td>{this.patient.name}</td>

    </tr>
}
}
