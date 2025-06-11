import { FaCheck } from "react-icons/fa";

export default function CardServico({ Icone, titulo, lista }) {
  return (
    <div
      className="bg-gray-900 bg-opacity-80 p-6 rounded-xl border border-transparent
                 shadow-md hover:border-purple-600 hover:shadow-[0_0_15px_4px_rgba(139,92,246,0.7)]
                 transition-all duration-300 cursor-pointer focus:outline-none focus:ring-2 focus:ring-purple-500
                 flex flex-col items-center text-white text-center w-[300px] h-[380px] pt-10"
      tabIndex={0}
      role="group"
    >
      <div
        className="w-16 h-16 mb-3 rounded-full flex items-center justify-center bg-black text-purple-400 text-3xl"
        aria-hidden="true"
      >
        <Icone />
      </div>
      <h3 className="text-3xl font-semibold mb-3">{titulo}</h3>
      <ul className="space-y-2 text-left text-base text-gray-300 overflow-y-auto w-full px-2 pt-5">
        {lista.map((item, i) => (
          <li key={i} className="flex items-start gap-2">
            <FaCheck className="text-purple-400 mt-1" />
            <span>{item}</span>
          </li>
        ))}
      </ul>
    </div>
  );
}