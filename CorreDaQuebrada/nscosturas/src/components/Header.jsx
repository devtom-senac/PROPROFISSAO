import { useState } from 'react'

function Header() {
  const [menuOpen, setMenuOpen] = useState(false)

  const navLinks = [
    { href: '#home', label: 'Início' },
    { href: '#sobre', label: 'Sobre' },
    { href: '#servicos', label: 'Serviços' },
    { href: '#contato', label: 'Contato' },
  ]

  return (
    <nav className="bg-black border-1 border-b-purple-900 fixed w-full z-50">
      <div className="container mx-auto px-4 py-4 flex justify-between items-center">
        <h1 className="pl-5 text-2xl font-bold text-blue-600 dark:text-white">NS COSTURAS</h1>

        <div className="hidden md:flex space-x-14 p-5 pr-10 ">
          {navLinks.map(link => (
            <a
              key={link.href}
              href={link.href}
              className="text-white dark:hover:text-purple-600 transition-colors"
            >
              {link.label}
            </a>
          ))}
        </div>
        
        {/* Botão Hamburguer no mobile */}
        <div className="md:hidden pr-4">
          <button
            onClick={() => setMenuOpen(!menuOpen)}
            className="text-purple-800 dark:text-purple-100 text-2xl focus:outline-none"
          >
            <i className={`fas ${menuOpen ? 'fa-times' : 'fa-bars'}`} />
          </button>
        </div>
      </div>

      {/* Menu Mobile */}
      {menuOpen && (
        <div className="md:hidden bg-white dark:bg-black shadow-md py-4 px-6">
          <div className="flex flex-col space-y-4 text-center">
            {navLinks.map(link => (
              <a
                key={link.href}
                href={link.href}
                className="text-purple-900 dark:text-purple-100 dark:hover:border-b-purple-600 text-lg font-medium transition"
                onClick={() => setMenuOpen(false)} // Fecha o menu quando clicar
              >
                {link.label}
              </a>
            ))}
          </div>
        </div>
      )}
    </nav>
  )
}
 
export default Header

