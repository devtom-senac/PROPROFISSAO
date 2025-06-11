import { useEffect, useState } from "react";

function Particula({ style }) {
  return (
    <div
      className="absolute rounded-full bg-purple-300 opacity-30"
      style={{
        width: style.size,
        height: style.size,
        left: style.left,
        bottom: style.bottom,
        animationDuration: style.duration,
        animationDelay: style.delay,
        animationName: "subir",
        animationTimingFunction: "linear",
        animationIterationCount: "infinite",
      }}
    />
  );
}

export default function BackgroundAnimado() {
  const [particulas, setParticulas] = useState([]);

  useEffect(() => {
    const novasParticulas = Array(20)
      .fill(0)
      .map(() => ({
        size: `${Math.random() * 6 + 4}px`, // entre 4px e 10px
        left: `${Math.random() * 100}%`,
        bottom: `${-Math.random() * 20}px`,
        duration: `${Math.random() * 10 + 10}s`, // 10 a 20s
        delay: `${Math.random() * 20}s`,
      }));
    setParticulas(novasParticulas);
  }, []);

  return (
    <>
      <div className="fixed inset-0 -z-10 bg-gradient-to-tr from-purple-900 via-black to-purple-900 overflow-hidden">
        {particulas.map((p, i) => (
          <Particula key={i} style={p} />
        ))}
      </div>

      <style>{`
        @keyframes subir {
          0% {
            transform: translateY(0);
            opacity: 0.3;
          }
          80% {
            opacity: 0.3;
          }
          100% {
            transform: translateY(-120vh);
            opacity: 0;
          }
        }
      `}</style>
    </>
  );
}
