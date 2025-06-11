import { motion } from "framer-motion"
import { FaFemale, FaUser, FaStar, FaSnowflake, FaExchangeAlt, FaUserTie } from "react-icons/fa"
import CardServico from "../components/CardServico"

function Servicos() {
  const servicos = [
    {
      titulo: "Ajuste de vestido",
      Icone: FaFemale,
      lista: ["Bainha", "Cintura", "Alça", "Barra de tule"]
    },
    {
      titulo: "Ajuste de calça",
      Icone: FaUser,
      lista: ["Cintura", "Comprimento", "Perna", "Gancho"]
    },
    {
      titulo: "Vestido de festa",
      Icone: FaStar,
      lista: ["Modelagem", "Forro", "Decote", "Barra"]
    },
    {
      titulo: "Blusa de frio",
      Icone: FaSnowflake,
      lista: ["Manga", "Gola", "Punho", "Zíper frontal"]
    },
    {
      titulo: "Troca de zíper",
      Icone: FaExchangeAlt,
      lista: ["Calça jeans", "Blusa de frio", "Jaqueta", "Bolsa"]
    },
    {
      titulo: "Ajuste de blazer",
      Icone: FaUserTie,
      lista: ["Ombros", "Manga", "Costas", "Botões"]
    }
  ] // 👈 Faltava fechar isso aqui

  return (
    <section
      id="servicos"
      className="relative min-h-screen px-6 py-20 snap-start"
    >
      {/* Gradiente topo para transição visual com Sobre */}
      <div
        className="absolute top-0 left-0 w-full h-16 pointer-events-none"
        style={{
          background: 'linear-gradient(to bottom, rgba(0,0,0,1), rgba(0,0,0,0))',
          zIndex: 5,
        }}
      />

      <motion.div
        className="relative z-10 max-w-6xl mx-auto text-center"
        initial={{ opacity: 0, y: 40 }}
        whileInView={{ opacity: 1, y: 0 }}
        transition={{ duration: 1 }}
        viewport={{ once: true, amount: 0.3 }}
      >
        <h2 className="text-4xl font-bold mb-12 text-white">
          Nossos <span className="text-purple-400">serviços</span>
        </h2>

        <div className="grid gap-10 sm:grid-cols-2 lg:grid-cols-3">
          {servicos.map((servico, i) => (
            <CardServico
              key={i}
              Icone={servico.Icone}
              titulo={servico.titulo}
              lista={servico.lista}
            />
          ))}
        </div>
      </motion.div>
    </section>
  )
}

export default Servicos
