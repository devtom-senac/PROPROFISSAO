import styles from '../css/Aruba.module.css'
import ComponenteProps from './ComponenteProps'
import logo from '../assets/imagens/usa.png'
import Formulario from './Formulario'
import pais from '../assets/imagens/aruba.png'

function Aruba() {
    return (
        <div className={styles.corpo}>
            <ComponenteProps
                lugar='Aruba'
                texto='Praias paradisíacas, mar cristalino, hotéis requintados,cassinos e programação para toda a família são alguns dos atrativos de Aruba.'
                logo_texto={logo} />

            <Formulario
                bandeira={pais} />     
        </div>
    )
}
export default Aruba