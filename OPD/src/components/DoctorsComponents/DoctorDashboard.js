'use strict';

import React, {Component} from 'react';
import '../../Css/App.css';
import SummaryView from './SummaryView';
import QueueController from './QueueController';
import { Container, Row, Col } from 'reactstrap';

class DoctorDashboard extends Component {
    constructor(props) {
        super(props);
    }

    render() {
        return <div>


            <nav className={'navbar navbar-expand-lg navbar-dark bg-primary'} id={'nav'}>

                <div className={'collapse navbar-collapse'} id={'navbarColor01'}>
                    <ul className="navbar-nav mr-auto">
                        <li className="nav-item active">
                            <a className="nav-link" href="#">Dashboard <span className="sr-only">(current)</span></a>
                        </li>
                        <li className="nav-item">
                            <a className="nav-link" href="#">My OPD patients</a>
                        </li>
                        <li className="nav-item">
                            <a className="nav-link" href="#">My queue</a>
                        </li>
                        <li className="nav-item">
                            <a className="nav-link" href="#">Questionnaire</a>
                        </li>
                    </ul>
                </div>

            </nav>

            <br/><br/>


            <Container>
            <Row>
                <Col xs="6" sm="4"><SummaryView /></Col>
                <Col xs="6" sm="4"> </Col>
                <Col sm="4"><QueueController /></Col>


            </Row>
            </Container>

            <Container>
                <Col>Queue Order</Col>
            </Container>





        </div>;
    }
}

export default DoctorDashboard;
