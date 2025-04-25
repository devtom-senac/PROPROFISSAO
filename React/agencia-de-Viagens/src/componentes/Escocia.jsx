import styles from '../css/Escocia.module.css'
import ComponenteProps from './ComponenteProps'
import logo from '../assets/imagens/viagens.jpg'
import Formulario from './Formulario'
import pais from '../assets/imagens/escocia.png'

function Escocia() {
    return (
        <div className={styles.corpo}>
            <div>
                <ComponenteProps
                    lugar='Escócia'
                    texto='Lindos castelos, com o requinte da Idae média, e luxo do grandes imperios! Uma viagem no tempo, com gostinho de realeza!!'
                    logo_texto={logo} />

            </div>

            <div>
                <Formulario
                    bandeira={pais} />
            </div>


        </div>
    )
}
export default Escocia