import { useEffect} from "react"
import { Navigate } from "react-router-dom"
import PageWrapper from "../pageWrapper/PageWrapper"

const Home = () => {

    const [user, setUser] = useState({})

    useEffect(() => {

        const email = localStorage.getItem("emailCookie")
        axios.post('http://localhost:8080/customer/findCustomerByEmail/${email}')
        .then((response) => {
            setUser(response.data)
        }).catch((error) => {
        })
    }, [])

    const displayNameIfLoggedIn = () => {
        if(localStorage.getItem("emailCookie")) {
            return (
                <p>{user.firstName}</p>
            )
        }
        return null
    }

    return (
        <div className="justify-center">
            <h1>Welcome to Stacy Realty{displayNameIfLoggedIn()}!</h1>
        </div>
    )
}