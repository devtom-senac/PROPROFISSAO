import Styles from './Meio.module.css'
import mala from './imagens/mala.jpg'

function Meio() {
    return (
        <section className={Styles.container}>
            <div className={Styles.mala}>
                  <img src={mala} alt="mala de viagem" />
            </div>
            <div className={Styles.texto}>
                <h1>Encontre a viagem dos seus sonhos !!!</h1>
                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Vero blanditiis officia voluptates, tempora, eaque accusantium ipsam veniam earum, cupiditate eos aperiam illum esse suscipit quisquam. Eius omnis illum corrupti doloremque!</p>
            </div>

        </section>
    )
}

export default Meio
