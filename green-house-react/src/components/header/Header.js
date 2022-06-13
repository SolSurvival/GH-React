import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import { faHouse } from '@fortawesome/free-solid-svg-icons'

const Header = () => {


const navigate = useNavigate()
  const logOut = () +>{
    localStorage.removeItem('email')
    navigate('/')
  }

    // const displayLinks = () => {
    //   if(PaymentResponse.customer == null){
    //     return (
    //       <div>
    //       <a href="/Sign-Up">Sign Up</a>
    //       <a href="/Sign-In">Sign In</a>
    //       </div>
    //     )

      
    //   }else {
    //     return (
    //       <div>
    //       <a href="/Listings">Listings</a>
    //       <button onClick={signOut}>Sign Out</button>
    //       </div>
    //     )
    //   }
    // }

    // return ( 
    //     <header className="header flex-row">
    //     <div className="third-width">
        
    //     </div>
    //     <div className="full-width">
    //     <img src='https://media.istockphoto.com/vectors/vegetables-on-shopping-cart-trolley-grocery-logo-icon-design-vector-vector-id1205419959?k=20&m=1205419959&s=612x612&w=0&h=F4gyp5wuFkCaZr00OQS8KPCSE1_4pHmFiOIM2TQlOPI=' alt="grocery picture" className='logo'/>
    //     </div>
    //     <div className="third-width header-buttons">
    //     <a href="/signIn">Sign In</a>
    //     <a href="/cart">Cart</a>
    //     </div>
        
    //   </header>
    )
}
export default header;