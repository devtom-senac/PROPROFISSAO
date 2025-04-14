// area com - aula de componentes telefone e endereço 
// icones de redes sociais 4 icons

import Styles from './Footer.module.css'
import insta from './imagens/youtube.png'
import youtube from './imagens/facebook.png'
import facebook from './imagens/insta.png'
import zap from './imagens/.zap'

function Footer() {
    return (
        <footer>
            <div className={Styles.info}>
                <h1>AULA DE INTERFACES</h1>
                <p>Rua Tito, 350, Vila Romana</p>
            </div>
            <div className={Styles.redes}>
                <a href="#">
                    <img src={insta} alt="Instagram" />
                </a>
                <a href="#">
                    <img src={youtube} alt="Instagram" />
                </a>
                <a href="#">
                    <img src={facebook} alt="Instagram" />
                </a>
                <a href="#">
                    <img src={zap} alt="Instagram" />
                </a>

            </div>
        </footer>

    )
}

export default Footer