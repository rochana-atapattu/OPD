"use strict"

import React from 'react';
import {Well, Panel, FormControl,FormGroup,ControlLabel, Button} from 'react-bootstrap';
import { connect } from 'react-redux';
import {bindActionCreators} from 'redux';
import {findDOMNode} from 'react-dom'
import {addPatient} from "../../action/patient";



class AddFood extends React.Component{

    handleSubmit(){
        const patient={
            title: findDOMNode(this.refs.title).value,
            name: findDOMNode(this.refs.name).value,
            othername: findDOMNode(this.refs.othername).value,
            dob: findDOMNode(this.refs.dob).value,
            gender: findDOMNode(this.refs.gender).value,
            cstatus: findDOMNode(this.refs.cstatus).value,
            nic: findDOMNode(this.refs.nic).value,
            citizenship: findDOMNode(this.refs.citizenship).value,
            add1  : findDOMNode(this.refs.add1).value


        }
        this.props.addPatient(patient);
    }
    render(){
        return(
            <div>

                <Well>
                    <Panel>
                        <FormGroup controlId="name">
                            <ControlLabel>Name</ControlLabel>
                            <FormControl
                                type="text"
                                placeholder="enter name"
                                ref="name"/>

                        </FormGroup>
                        <FormGroup controlId="title">
                            <ControlLabel>Titile</ControlLabel>
                            <FormControl
                                type="text"
                                placeholder="title"
                                ref="title"/>

                        </FormGroup>
                        <FormGroup controlId="othername">
                            <ControlLabel>Other Name</ControlLabel>
                            <FormControl
                                type="text"
                                placeholder="enter other name"
                                ref="othername"/>

                        </FormGroup>
                        <FormGroup controlId="dob">
                            <ControlLabel>DOB</ControlLabel>
                            <FormControl
                                type="text"
                                placeholder="DD/MM/YYYY"
                                ref="dob"/>
                        </FormGroup>
                        <FormGroup controlId="gender">
                            <ControlLabel>Other Name</ControlLabel>
                            <FormControl
                                type="text"
                                placeholder="gender"
                                ref="gender"/>
                        </FormGroup>
                        <FormGroup controlId="cstatus">
                            <ControlLabel>Other Name</ControlLabel>
                            <FormControl
                                type="text"
                                placeholder="cstatus"
                                ref="cstatus"/>

                        </FormGroup>

                        <FormGroup controlId="nic">
                            <ControlLabel>NIC</ControlLabel>
                            <FormControl
                                type="text"
                                placeholder="nic"
                                ref="nic"/>

                        </FormGroup>
                        <FormGroup controlId="citizenship">
                            <ControlLabel>Citizenship</ControlLabel>
                            <FormControl
                                type="text"
                                placeholder="citizenship"
                                ref="citizenship"/>

                        </FormGroup>
                        <FormGroup controlId="add1">
                            <ControlLabel>NIC</ControlLabel>
                            <FormControl
                                type="text"
                                placeholder="address"
                                ref="add1"/>

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
        addPatient:addPatient
    }, dispatch)
}
export default connect(mapStateToProps, mapDispatchToProps)(AddFood);