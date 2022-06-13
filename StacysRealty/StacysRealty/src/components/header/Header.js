import { FontAwesomeIcon} from '@fortawesome/react-fontawesome'
import { faHouse } from '@fortawesome/free-solid-svg-icons'
import { Link, useNavigate} from 'react-router-dom'

const Header = (props) => {
    
    const navigate = useNavigate()

    const signOut = () => {
        localStorage.removeItem('emailCookie')
    
        navigate('/')
    }

    return (
        <header className=""
    )
}

    
}