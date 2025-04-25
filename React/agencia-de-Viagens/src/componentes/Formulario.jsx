import styles from '../css/Formulario.module.css'
 
function Formulario({bandeira}){
    return(
         <div className={styles.corpo_texto}>
                <h4> Fique por dentro da viagem do seus sonhos!</h4>
                <form>
                  Nome:  <input type="text" />
                  Email: <input type="text" />
                  Telefone: <input type="text" />
                  <input type="button" value="enviar" />
                </form>
                <img className={styles.button} src={bandeira}  alt="bandeira" />
            </div>
    )
}
export default Formulario