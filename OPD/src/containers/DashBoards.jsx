import React from 'react';
import { Link } from 'react-router-dom';
import { connect } from 'react-redux';
import DoctorDashboard from '../components/DoctorsComponents/DoctorDashboard'
import NurseDashboard from '../components/NursesComponents/NurseDashboard'
class DashBoard extends React.Component {
    componentDidMount() {

    }




    render() {
        return (
            <div className="col-md-6 col-md-offset-3">
                <NurseDashboard/>
            </div>
        );
    }
}

function mapStateToProps(state) {
    const { users, authentication } = state;
    const { user } = authentication;
    return {
        user,
        users
    };
}

const connectedDashBoard = connect(mapStateToProps)(DashBoard);
export { connectedDashBoard as DashBoard };