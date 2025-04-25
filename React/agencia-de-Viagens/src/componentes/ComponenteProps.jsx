import styles from '../css/ComponenteProps.module.css'
 
function ComponenteProps({lugar,texto, logo_texto}){
    return(
        <div className={styles.corpo_texto}>
            <h4> Venha Explorar esse lugar incrível {lugar}!!</h4>
            <p>{texto}</p>
            <img src={logo_texto} alt="logo" />
        </div>
   
    )
}
export default ComponenteProps