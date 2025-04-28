function Tipografia() {
    return (
        <div>
            <div>
                <p className="text-sm">Text pequeno</p>
                <p className="text-lg">Texto grande</p>
                <p className="text-5xl">Texto muito grande</p>
            </div>
 
            <div className="mt-10">
                <p className="font-light">Peso leve</p>
                <p className="font-normal">Peso normal</p>
                <p className="font-bold">Peso bold</p>
            </div>
 
            <div className="mt-10">
                <p className="text-left">Texto na esquerda</p>
                <p className="text-center">Texto no centro</p>
                <p className="text-right">Texto na direita</p>
            </div>
        </div>
    )
}
 
export default Tipografia