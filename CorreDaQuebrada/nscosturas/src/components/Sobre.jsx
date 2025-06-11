import { motion } from 'framer-motion'
import { FaUserAlt, FaHandsHelping, FaClock } from 'react-icons/fa'
import CardPadrao from '../components/CardPadrao'

function Sobre() {
  const sobreInfo = [
    {
      icon: <FaUserAlt />,
      title: "Costureira Especializada",
      desc: "Neide é uma profissional qualificada que entende sua necessidade.",
    },
    {
      icon: <FaHandsHelping />,
      title: "Atendimento Personalizado",
      desc: "Cada cliente é único, cada ajuste é feito com carinho.",
    },
    {
      icon: <FaClock />,
      title: "Entrega no Prazo",
      desc: "Compromisso com pontualidade e muita qualidade.",
    },
  ]

  return (
    <section
      id="sobre"
      className="relative min-h-screen px-6 py-20 text-white snap-start"
    >
      <motion.div
        className="relative z-10 w-full max-w-6xl mx-auto text-center"
        initial={{ opacity: 0, y: 40 }}
        whileInView={{ opacity: 1, y: 0 }}
        transition={{ duration: 1 }}
        viewport={{ once: true, amount: 0.3 }}
      >
        <h2 className="text-4xl md:text-5xl font-extrabold mb-6">
          Quem <span className="text-purple-400">Somos</span>
        </h2>
        <p className="text-lg md:text-xl text-gray-300 max-w-3xl mx-auto mb-12 leading-relaxed">
          Na NS Costuras, transformamos suas roupas com ajustes e consertos de alta qualidade.
          Com mais de 10 anos de experiência, unimos técnica, cuidado e atenção para entregar peças que se encaixam perfeitamente no seu estilo e conforto.
        </p>

        <div className="flex flex-col md:flex-row justify-center gap-8 mt-8 items-center"> 
          {sobreInfo.map((item, i) => (
            <CardPadrao key={i} {...item} />
          ))}
        </div>
      </motion.div>
    </section>
  )
}

export default Sobre