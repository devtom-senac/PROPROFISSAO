import styles from '../css/GrandyCanyon.module.css'
import ComponenteProps from './ComponenteProps'
import logo from '../assets/imagens/viagens.jpg'
import Formulario from './Formulario'
import pais from '../assets/imagens/usa.png'


function GrandyCanyon(){
    return(
        <div className={styles.corpo}>
             <ComponenteProps
            lugar=' Grandy Canyon'
            texto='Bem vindo ao GC'
            logo_texto={logo} />

            <Formulario 
            bandeira={pais}/>
        </div>
    )
}
export default GrandyCanyon