
import './App.css'
import fundo from './imgReact/fundo.jpg'

function App() {

  return (
    <main>
      <h1 className={'titulo'}>testando um titulo usando react js</h1>

      <div className={'alinha'}>
      <img className={'imagem'} src={fundo} alt="" />

      <p className={'textoUm'}>Lorem ipsum dolor sit amet consectetur adipisicing elit. Magnam repellendus molestias perspiciatis ratione itaque eligendi optio illum vel consectetur placeat officia voluptatum, totam alias! Nemo harum a nulla expedita magni.</p>
      </div>

      
    </main>
  )
}

export default App
