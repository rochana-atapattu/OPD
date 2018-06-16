'use strict';

import React, {Component} from 'react';

class SummaryView extends Component {
    constructor(props) {
        super(props);
    }

    render() {
        return <div>

            <h5>Summary View</h5>

            <table>

                <tr>
                    <td>Name</td>
                    <td> </td>
                </tr>
                <tr>
                    <td># of patients</td>
                    <td> </td>
                </tr>
                <tr>
                    <td>Queue status</td>
                    <td> </td>
                </tr>
                <tr>
                    <td># of treated patients</td>
                    <td> </td>
                </tr>
                <tr>
                    <td>Queue type</td>
                    <td> </td>
                </tr>

            </table>
        </div>;
    }
}

export default SummaryView;
