import { useEffect } from 'react';
import './App.css';
import Header from './components/Header';

function App(){

  // COOKIE
  const [user, setUser] = useState(null)       
  useEffect(() =>{
    const email = localStorage.getItem("email")

    axios.get('http://localhost:8080/user/findUserByEmail/${email}')
    .then((response) => {
        setUser(response.data)
    }).catch((e) => {

    })
  }, [] )



  const displayUserName = () => {
    if(user != null){
      return user.name
    } return "CONTENT"
  }

  return (
    <div className="flex-col container" justify-center>
      <Header />

      <div className='main-content flex-col'>
        <div className='flex-row content'>{displayUserName()}</div>
        <div className='flex-row content'>MORE CONTENT</div>
        <div className='flex-row content'>EVEN MORE CONTENT</div>
      </div>
    </div>
  );
}

export default App;