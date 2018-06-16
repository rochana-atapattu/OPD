import React from 'react';


import { Router, Route } from 'react-router-dom';
import { connect } from 'react-redux';
import { history } from './helper';

import { LoginPage } from './containers';
import { DashBoard } from './containers';


export default class App extends React.Component {
    constructor(props) {
        super(props);

    }

    render() {
        return (
            <div className="jumbotron">
                <div className="container">
                    <div className="col-sm-8 col-sm-offset-2">

                        <Router history={history}>
                            <div>

                                <Route exact path="/" component={DashBoard} />
                            </div>
                        </Router>
                    </div>
                    </div>
                </div>
                );
                }
}

