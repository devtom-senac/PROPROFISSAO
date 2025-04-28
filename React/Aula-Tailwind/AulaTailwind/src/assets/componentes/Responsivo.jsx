function Responsivo() {
    return (
        <div>
            <p className="text-sm sm:text-xl lg:text-5xl">
                Texto aleátorio
            </p>
 
            <div className="flex flex-col mt-10 gap-2 md:flex-row">
                <div className="bg-blue-300 w-48">Item 1</div>
                <div className="bg-blue-600 w-48">Item 2</div>
                <div className="bg-blue-900 w-48">Item 3</div>
            </div>
        </div>
    )
}
 
export default Responsivo