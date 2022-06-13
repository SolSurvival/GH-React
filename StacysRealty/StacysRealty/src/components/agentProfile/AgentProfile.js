import { useEffect} from "react"
import { Navigate } from "react-router-dom"
import PageWrapper from "../pageWrapper/PageWrapper"

const AgentProfile = () => {

    const [agent, setAgent] = useState({})
    const [house, setHouse] = useState({
        price: 0,
        beds: 0,
        baths: 0,
        squareFeet: 0,
        isOnMarket: true,
        address: {
            streetNumber: 0,
            streetName: '',
            unitNumber: 0,
            city: '',
            state: '',
            zipCode: 0
        }

    })
    const navigate = useNavigate()

    useEffect(() => {

        const email = localStorage.getItem("emailCookie")
        axios.post(`http://localhost:8080/agent/findAgentByEmail/${email}`)
        .then((response) => {
            setAgent(response.data)
        }).catch((error) => {
            navigate('/')
        })
    }, []) 

    const displayNameIfLoggedIn = () => {
        if(localStorage.getItem("emailCookie")) {
            return (
                {agent.firstName + ' ' + agent.lastName
            )
        }
        return null
    }

    return (
        <div className="justify-center">
            <h1>GO CREATE SOME HOMES{displayNameIfLoggedIn()}!</h1>
        </div>
    )
}