import Styles from './Footer.module.css'

import insta from './imagens/insta.png'
import face from './imagens/face.png'
import tiktok from './imagens/tiktok.png'
import whats from './imagens/whats.png'

function Footer() {
    return (
        <footer>
            <div className={Styles.info}>
                <p>Siga nossas redes sociais</p>
            </div>
            <div className={Styles.redes}>
                <a href="#">
                    <img src={insta} alt="Instagram" />
                </a>
                <a href="#">
                    <img src={face} alt="Instagram" />
                </a>
                <a href="#">
                    <img src={tiktok} alt="Instagram" />
                </a>
                <a href="#">
                    <img src={whats} alt="Instagram" />
                </a>
            </div>
            <div className={Styles.info}>
                <p>Telefone de contato: (11) 9555-3355</p>
            </div>
        </footer>

    )
}

export default Footer