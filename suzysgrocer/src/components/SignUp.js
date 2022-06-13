import { useNavigate } from 'react-router-dom';
import React, { useState } from "react";
import axios from 'axios'
import Header from './Header';

const SignUp = () => {

    const navigate = useNavigate()
    
    const [toggleError, setToggleError] = useState(false)
    const [user, setUser] = useState({
        name: "",
        email: "",
        password: ""
    })


    const userChangeHandler = (event) => {
        const name = event.target.name;
        const value = event.target.value;
        const tempUser = { ...user };
        tempUser[name] = value;
        setUser(tempUser)
    }

    const signUpSubmitHandler = () => {
        
        axios.post("http://localhost:8080/user/signUp", user)
        .then((response) => {
            navigate('/signIn')
        }).catch((error) => {
            setToggleError(true)
            console.log("error: " + error)
        })
    }

    const toggleErrorFunc = () => {

        if(toggleError) {
            return <div>INVALID INVALID INVALID</div>
        }
        return null
    }
     
    function gotRendered() {
        console.log("got rendered?")
    }

    return (
        <div>
            {gotRendered()}
        <form className="row g-3">
            <h2> Sign up below!!!!!!!!</h2>
            <div className="col-md-6">
                <label for="inputFirstName" className="form-label">Name</label>
                <input name="name" value={user.name} onChange={userChangeHandler} type="text" className="form-control" id="inputFirstName" />
            </div>
            <div className="col-md-6">
                <label for="inputEmail4" className="form-label">Email</label>
                <input name="email" value={user.email} onChange={userChangeHandler} type="email" className="form-control" id="inputEmail4" />
            </div>
            <div className="col-md-6">
                <label for="inputPassword4" className="form-label">Password</label>
                <input name="password" value={user.password} onChange={userChangeHandler} type="password" className="form-control" id="inputPassword4" />
            </div>
            <div className="d-grid gap-2 ">
                <button onClick={signUpSubmitHandler} className="bg-dark btn btn-outline-success" type="button">Sign up</button>
            </div>
            {toggleErrorFunc()}
        </form>
        </div>
    )
}
export default SignUp;