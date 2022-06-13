import { useEffect } from "react";

const PageWrapper = (props) =>{

    const navigate = useNavigate()
    const [customer, setCustomer] = useState({})
    useEffect(() => {
        const email = localStorage.getItem("emailCookie")
        axios.post("http://localhost:8080/agent/signUp", user)
    .then((response) => {
        setCustomer(response.data)
    }).catch((error) => {
        navigate('/')
    })
    } )
    return ( 
        <div className ="flex-col container">
            <div className='main-content flex-col'></div>
            <
        </div>
    )
}

// TIMESTAMP 1:30 6/1 and :30 6/3