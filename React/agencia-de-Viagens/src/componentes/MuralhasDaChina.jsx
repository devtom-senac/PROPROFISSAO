import styles from '../css/MuralhasDaChina.module.css'
import ComponenteProps from './ComponenteProps'
import logo from '../assets/imagens/viagens.jpg'
import Formulario from './Formulario'
import pais from '../assets/imagens/china.png'
 
function MuralhasDaChina(){
    return(
        <div className={styles.corpo}>
             <ComponenteProps
            lugar=' Grandy Canyon'
            texto='Bem vindo as Muralhas da China'
            logo_texto={logo} />

            <Formulario 
            bandeira={pais} />
 
        </div>
    )
}
export default MuralhasDaChina