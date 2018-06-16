"use strict"

import React from 'react';
import {Well, Panel, FormControl,FormGroup,ControlLabel, Button} from 'react-bootstrap';
import { connect } from 'react-redux';
import {bindActionCreators} from 'redux';
import {findDOMNode} from 'react-dom'



class VisitForm extends React.Component{

    handleSubmit(){
        const visit={
            observation: findDOMNode(this.refs.observation).value,
            name: findDOMNode(this.refs.name).value,
            visitType: findDOMNode(this.refs.visitType).value,
            dateTime: findDOMNode(this.refs.dateTime).value,



        }
        this.props.addPatient(patient);
    }
    render(){
        return(
            <div>

                <Well>
                    <Panel>
                        <FormGroup controlId="name">
                            <ControlLabel>reason</ControlLabel>
                            <FormControl
                                type="text"
                                placeholder="enter reason"
                                ref="reason"/>

                        </FormGroup>
                        <FormGroup controlId="title">
                            <ControlLabel>visitType</ControlLabel>
                            <FormControl
                                type="text"
                                placeholder="visitType"
                                ref="visitType"/>

                        </FormGroup>
                        <FormGroup controlId="observation">
                            <ControlLabel>observation</ControlLabel>
                            <FormControl
                                type="textarea"
                                placeholder="enter observation"
                                ref="observation"/>

                        </FormGroup>
                        <FormGroup controlId="date">
                            <ControlLabel>Date</ControlLabel>
                            <FormControl
                                type="text"
                                placeholder="DD/MM/YYYY"
                                ref="dateTime"/>
                        </FormGroup>

                        <Button onClick={this.handleSubmit.bind(this)} bsStyle="primary">Add</Button>
                    </Panel>
                </Well>
            </div>
        )
    }
}

function mapStateToProps(state){
    return {


    }
}
function mapDispatchToProps(dispatch){
    return bindActionCreators({

    }, dispatch)
}
export default connect(mapStateToProps, mapDispatchToProps)(VisitForm);