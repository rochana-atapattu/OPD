"use strict"

import React from 'react';
import {Well, Panel, FormControl,FormGroup,ControlLabel, Button} from 'react-bootstrap';
import { connect } from 'react-redux';
import {bindActionCreators} from 'redux';
import {findDOMNode} from 'react-dom'
import {visitAction} from "../../action";



class ExaminationForm extends React.Component{

    handleSubmit(){
        const exam={exam: {
                height: findDOMNode(this.refs.height).value,
                weight: findDOMNode(this.refs.weight).value,
                bmi: findDOMNode(this.refs.bmi).value,
                tempurature: findDOMNode(this.refs.tempurature).value,

            }

        }
        this.props.addExam(exam);
    }
    render(){
        return(
            <div>

                <Well>
                    <Panel>
                        <FormGroup controlId="height">
                            <ControlLabel>Height</ControlLabel>
                            <FormControl
                                type="text"
                                placeholder="enter height"
                                ref="height"/>

                        </FormGroup>
                        <FormGroup controlId="title">
                            <ControlLabel>Weight</ControlLabel>
                            <FormControl
                                type="text"
                                placeholder="weight"
                                ref="weight"/>

                        </FormGroup>
                        <FormGroup controlId="bmi">
                            <ControlLabel>BMI</ControlLabel>
                            <FormControl
                                type="textarea"
                                placeholder="enter bmi"
                                ref="bmi"/>

                        </FormGroup>
                        <FormGroup controlId="tempurature">
                            <ControlLabel>Temperature</ControlLabel>
                            <FormControl
                                type="text"
                                placeholder=""
                                ref="temp"/>
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
    addExam:visitAction.addExamination
    }, dispatch)
}
export default connect(mapStateToProps, mapDispatchToProps)(ExaminationForm);