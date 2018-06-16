import React from 'react';
import { render } from 'react-dom';
import { Provider } from 'react-redux';

import { store } from './helper/index';
import  App  from './App';



render(
    <Provider store={store}>
        <div>

            <App />
        </div>

    </Provider>,
    document.getElementById('app')
);