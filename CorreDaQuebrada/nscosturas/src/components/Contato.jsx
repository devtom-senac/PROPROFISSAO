import { FaWhatsapp, FaMapMarkerAlt } from 'react-icons/fa'

const cores = {
  /*cor para o zap*/
  green: {
    bgLight: 'bg-green-700 bg-opacity-70',
    textLight: 'text-green-300',
    bgButton: 'bg-green-600',
    hover: 'hover:bg-green-700',
  },
  purple: {
    bgLight: 'bg-purple-700 bg-opacity-70',
    textLight: 'text-purple-300',
    bgButton: 'bg-purple-600',
    hover: 'hover:bg-purple-700',
  },
  /*cor para localização*/
  blue: {
    bgLight: 'bg-blue-700 bg-opacity-70',
    textLight: 'text-blue-300',
    bgButton: 'bg-blue-600',
    hover: 'hover:bg-blue-700',
  },
}

function Contato() {
  return (
    <section
      id="contato"
      className="min-h-screen py-20 snap-start"
    >
      <div className="container w-200 mx-auto px-6">
        <h2 className="text-4xl font-bold text-center text-white mb-12">
          Entre em <span className="text-purple-400">Contato</span>
        </h2>
        <div className=" grid gap-8 md:grid-cols-2">
          <ContatoCard
            Icon={FaWhatsapp}
            titulo="WhatsApp"
            texto="Clique aqui para entrar em contato. Agende seu horário e tire dúvidas"
            cor="green"
            link="https://wa.me/5511913298255"
          />
          <ContatoCard
            Icon={FaMapMarkerAlt}
            titulo="Localização"
            texto="Deseja de saber como chegar na loja?   Clique aqui e veja a melhor rota no mapa"
            cor="blue"
            link="https://maps.app.goo.gl/HpJmfLvDYd3zef2w9"
          />
        </div>
      </div>
    </section>
  )
}

function ContatoCard({ Icon, titulo, texto, cor, link }) {
  const c = cores[cor]

  return (
    <a
      href={link}
      target="_blank"
      rel="noopener noreferrer"
      className={`
        block rounded-xl p-8
        bg-gray-900 bg-opacity-80
        border border-transparent
        shadow-md transition-all duration-300
        hover:border-purple-600 hover:shadow-[0_0_15px_4px_rgba(139,92,246,0.7)]
        ${c.textLight} cursor-pointer
        focus:outline-none focus:ring-2 focus:ring-purple-500
      `}
      aria-label={`Contato via ${titulo}`}
    >
      <div
        className="w-16 h-16 mx-auto mb-4  rounded-full flex items-center justify-center bg-black text-purple-400 text-4xl"
        aria-hidden="true"
      >
        <Icon />
      </div>
      <h3 className="text-xl font-semibold text-center mb-2 text-white">{titulo}</h3>
      <p className="text-center text-gray-300">{texto}</p>
    </a>
  )
}


export default Contato
