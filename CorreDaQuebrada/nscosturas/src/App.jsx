import './App.css'
import Header from './components/Header'
import BackgroundAnimado from './components/BackgroundAnimado'
import Home from './components/Home'
import Sobre from './components/Sobre'
import Servicos from './components/Servicos'
import Contato from './components/Contato'
import Footer from './components/Footer'

function App() {
  return (
    <>
      <BackgroundAnimado className="fixed top-0 left-0 w-full h-full -z-10" />

      <Header />

      <main className="scroll-smooth">
        <Home />
        <Sobre />
        <Servicos />
        <Contato />
        <Footer />
      </main>
    </>
  )
}

export default App
