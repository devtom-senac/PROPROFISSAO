import {Link} from  'react-router-dom'
import Styles from './Header.module.css'
import logo from './imagens/viagens.jpg'

function Header() {
    return (
        <header>
            <div className={Styles.logo}>
                <Link to='/' href="#">
                    <img src={logo} alt="logo marca" />
                </Link>
            </div>
            <div className={Styles.lugares}>
                <Link to='/Meio'>Home</Link>
                <Link to='/GrandyCanyon'>Grandy Canyon</Link>
                <Link to='/Escocia'>Escócia</Link>  
                <Link to='/MuralhasDaChina'>Muralhas da China</Link>
                <Link to='/Aruba'>Aruba</Link>

            </div>

        </header>
    )
}

export default Header
