import { TypeAnimation } from 'react-type-animation';
import BackgroundAnimado from './BackgroundAnimado';

function Home() {
  return (
    <section
      id="home"
      className="relative min-h-screen flex items-center justify-center px-6 py-24 text-white overflow-hidden"
    >
      <BackgroundAnimado />

      <div className="z-10 max-w-7xl w-full mx-auto flex flex-col md:flex-row items-center gap-12">
        {/*
          o div flex-1 agora está como um container flex para seus filhos (título, parágrafo, TypeAnimation, botão)
        */}
        <div className="flex-1 flex flex-col items-center">
          <h1 className="text-5xl md:text-6xl font-extrabold leading-tight mb-6 text-center">
            <span className="text-purple-400">Costura</span> que transforma
          </h1>
          {/* texto do parágrafo principal*/}
          <p className="text-xl md:text-2xl text-gray-300 mb-6 text-center">
            Ajustes e consertos com excelência, cuidado e atenção aos detalhes.
          </p>

          {/* Texto com digitação */}
          <TypeAnimation
            sequence={[
              'Ajustou...',
              1500,
              'Experimentou...',
              1500,
              'Amou!',
              1500,
            ]}
            wrapper="p"
            cursor={true}
            repeat={Infinity}
            // 'text-center' aqui é bom para garantir o texto animado
            className="text-center text-4xl text-purple-300 font-medium mb-8 h-[3rem]"
          />

          <a
            href="#contato"
            className="inline-block bg-purple-800 hover:bg-purple-400 text-white font-semibold px-8 py-3 rounded-xl transition-all"
          >
            Clique aqui e fale conosco
          </a>
        </div>
      </div>
    </section>
  );
}

export default Home;