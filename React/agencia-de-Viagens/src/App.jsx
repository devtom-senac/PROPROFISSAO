import { BrowserRouter as Router, Routes, Route } from 'react-router-dom'

import './App.css'
import Header from './assets/Header'
import Meio from './assets/meio'
import Footer from './assets/Footer'
import GrandyCanyon from './componentes/GrandyCanyon'
import Escocia from './componentes/Escocia'
import Aruba from './componentes/Aruba'
import MuralhasDaChina from './componentes/MuralhasDaChina'

function App() {
  return (
    <>
      <main className='fundo'>
        <Router>
          <Header />
          <Routes>
            <Route path='/Meio' element={<Meio />} />
            <Route path='/Escocia' element={<Escocia />} />
            <Route path='/Aruba' element={<Aruba />} />
            <Route path='/MuralhasDaChina' element={<MuralhasDaChina />} />
            <Route path='/GrandyCanyon' element={<GrandyCanyon />} />
          </Routes>
        </Router>
        <Footer />

      </main>
    </>
  )
}

export default App
