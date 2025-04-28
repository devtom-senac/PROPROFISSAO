function Flexbox() {
    return (
        <div>  
            <div className="flex">
                <div className="w-50 h-50 bg-black m-10">Item 1</div>
                <div className="w-50 h-50 bg-black m-10">Item 2</div>
                <div className="w-50 h-50 bg-black m-10">Item 3</div>
            </div>

            <div className="flex flex-col">
                <div className="w-50 h-50 bg-black m-10">Item 1</div>
                <div className="w-50 h-50 bg-black m-10">Item 2</div>
                <div className="w-50 h-50 bg-black m-10">Item 3</div>
            </div>

            
        </div>
    )
}
 
export default Flexbox
 