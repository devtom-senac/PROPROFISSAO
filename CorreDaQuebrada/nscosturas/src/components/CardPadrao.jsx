export default function CardPadrao({ icon, title, desc }) {
  return (
    <div
      className="flex flex-col items-center text-center w-full 
                 max-w-xs px-6 py-8
                 bg-gray-900 bg-opacity-80 rounded-xl border border-transparent
                 shadow-md hover:border-purple-600 hover:shadow-[0_0_15px_4px_rgba(139,92,246,0.7)]
                 transition-all duration-300 cursor-pointer focus:outline-none focus:ring-2 focus:ring-purple-500"
      tabIndex={0}
      role="group"
    >
      <div className="text-purple-400 text-5xl mb-4" aria-hidden="true">
        {icon}
      </div>
      <h3 className="text-xl font-semibold text-white mb-2">{title}</h3>
      <p className="text-gray-300">{desc}</p>
    </div>
  );
}
