import axios from 'axios';
import { useEffect } from 'react';
import Header from './components/Header';

function Product(){

  const navigate = useNavigate({})
  // COOKIE
  const [user, setUser] = useState({})       
  useEffect(() =>{
    const email = localStorage.getItem("email")

    axios.get('http://localhost:8080/user/findUserByEmail/${email}')
    .then((response) => {
        setUser(response.data)
    }).catch((e) => {
      navigate('/')
    })
  }, [] )


  return (
    <div className="flex-col container" justify-center>
      <Header />

      <div className='main-content flex-col'>
        <div className='flex-row content'>{user.name()}</div>
        <div className='flex-row content'>MORE CONTENT</div>
        <div className='flex-row content'>EVEN MORE CONTENT</div>
      </div>
    </div>
  );
}

export default Product;