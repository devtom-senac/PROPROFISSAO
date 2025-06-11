// Footer.jsx
import React from 'react';
import { FaFacebookF, FaInstagram, FaWhatsapp, FaMapMarkerAlt, FaEnvelope, FaPhone } from 'react-icons/fa';

export default function Footer() {
  return (
    <footer className="bg-gray-950 text-gray-300 py-12 px-6">
      <div className="max-w-7xl mx-auto grid grid-cols-1 md:grid-cols-4 gap-8">

        
        <div className="col-span-1">
          <h3 className="text-2xl font-bold text-purple-400 mb-4">NS Costuras</h3>
          <p className="text-sm leading-relaxed">
            Costura que transforma.
          </p>
        </div>

        <div className="col-span-1">
          <h4 className="text-xl font-semibold text-white mb-4">Links Rápidos</h4>
          <ul className="space-y-2 text-sm">
            <li><a href="#home" className="hover:text-purple-400 transition-colors">Início</a></li>
            <li><a href="#servicos" className="hover:text-purple-400 transition-colors">Serviços</a></li>
            <li><a href="#galeria" className="hover:text-purple-400 transition-colors">Galeria</a></li>
            <li><a href="#contato" className="hover:text-purple-400 transition-colors">Contato</a></li>
          </ul>
        </div>

        <div className="col-span-1">
          <h4 className="text-xl font-semibold text-white mb-4">Fale Conosco</h4>
          <ul className="space-y-2 text-sm">
            <li className="flex items-center gap-2">
              <FaWhatsapp className="text-purple-400" /> (11) 91329-8255
            </li>
            <li className="flex items-center gap-2">
              <FaEnvelope className="text-purple-400" /> contato@nscosturas.com
            </li>
            <li className="flex items-start gap-2 mt-4">
              <FaMapMarkerAlt className="text-purple-400 flex-shrink-0 mt-1" />
              Av. Dr. Henrrique Gulherme Thut, 437 - JD. Guanabara <br/> São Paulo - SP, CEP: 048210-300
            </li>
          </ul>
        </div>

        <div className="col-span-1">
          <h4 className="text-xl font-semibold text-white mb-4">Redes Sociais</h4>
          <div className="flex space-x-4">
            <a href="https://instagram.com/nscosturas" target="_blank" rel="noopener noreferrer" className="text-gray-300 hover:text-purple-400 transition-colors text-2xl">
              <FaInstagram />
            </a>
            <a href="https://wa.me/XXXXXXXXXXX" target="_blank" rel="noopener noreferrer" className="text-gray-300 hover:text-purple-400 transition-colors text-2xl">
              <FaWhatsapp />
            </a>
          </div>
        </div>

      </div>

      <div className="mt-12 pt-8 border-t border-gray-800 text-center text-sm text-gray-500">
        &copy; {new Date().getFullYear()} NS Costuras. Todos os direitos reservados.
      </div>
    </footer>
  );
}