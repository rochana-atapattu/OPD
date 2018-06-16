'use strict';

import React, {Component} from 'react';

class QueueController extends Component {
    constructor(props) {
        super(props);
    }

    render() {
        return <div>

            <h5>Queue Controller</h5>

            <button type="button" className="btn btn-primary btn-lg btn-block">Hold Queue</button>
            <button type="button" className="btn btn-primary btn-lg btn-block">Redirect Queue</button>
            <button type="button" className="btn btn-primary btn-lg btn-block">Enable OPD Queue</button>
        </div>;
    }
}

export default QueueController;
