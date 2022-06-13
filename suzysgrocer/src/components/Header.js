const Header = () => {


const navigate = useNavigate()
  const logOut = () +>{
    localStorage.removeItem('email')

    navigate('/')
  }

    return ( 
        <header className="header flex-row">
        <div className=""

        <div className="full-width">
        <img src='https://media.istockphoto.com/vectors/vegetables-on-shopping-cart-trolley-grocery-logo-icon-design-vector-vector-id1205419959?k=20&m=1205419959&s=612x612&w=0&h=F4gyp5wuFkCaZr00OQS8KPCSE1_4pHmFiOIM2TQlOPI=' alt="grocery picture" className='logo'/>
        </div>
        <div className="third-width header-buttons">
        <a href="/signIn">Sign In</a>
        <a href="/cart">Cart</a>
        </div>
        
      </header>
    )
}
export default header;