

import './usuarios.css'
export default function Cliente(props){

    const listItems =    props.todos.filter((element) =>element.cliente==true)
    .map((element) =>

       
        <div className="contacto-container">
            <h3>Cliente</h3>
            <div className='contacto-lista'>
            <h4>Name</h4>
            <h5>{element.name} {element.lastName}</h5>
          
            </div >
            <div className='contacto-lista'>
            <h4>Número de llamadas</h4>
            <h5>{element.numberOfCalls}</h5>
           <button type="submit">+</button>
            </div>
           
            <div className='contacto-lista'>
            <h4>Tlf</h4>
            <h5>{element.tlf}</h5>
          
            </div>
            <div className='contacto-lista'>
            <h4>Ultima fecha</h4>
            <h5>{element.date}</h5>
          
            </div>
            <div className='contacto-lista'>
            <h4>Tipo de Cliente</h4>
            <h5> {element.clientType}</h5>
          
            </div>
            <button id='deletebuton' type="button"> ELIMINAR CLIENTE</button>
        </div>
    );
    return(
        
        <div id='clientes'>
            {listItems}
        </div>

    
    );

}