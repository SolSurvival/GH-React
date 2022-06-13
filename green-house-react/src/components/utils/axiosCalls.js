import axios from "axios";

const userSignUp = (path) => {
    axios.post("http://localhost:8080/agent/signUp", user)
    .then((response) => {
        setCustomer(response.data)
    }).catch((error) => {
        navigate('/')
    })
}

// cookie @ :35 6/3