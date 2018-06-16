'use strict';

import React, {Component} from 'react';
import '../../Css/App.css';

import AddNewPatient from './AddNewPatient'
import {Nav,NavItem} from 'react-bootstrap';


class NurseDashboard extends Component {
    constructor(props) {
        super(props);
    }

    render() {
        return <div>
            <Nav bsStyle="tabs" activeKey="1" onSelect={k => this.handleSelect(k)}>
                <NavItem eventKey="1" href="/home">
                    NavItem 1 content
                </NavItem>
                <NavItem eventKey="2" title="Item">
                    <AddNewPatient/>
                </NavItem>
                <NavItem eventKey="3" disabled>
                    NavItem 3 content
                </NavItem>

            </Nav>
        </div>;
    }
}

export default NurseDashboard;
