import './usuarios.css'
import { useState, useRef } from 'react';
export default function Oportunidades(props){
    const [cliente, setcliente] = useState("")
    const [message, setMessage] = useState("");
    const ref = useRef(null);

    let handleSubmit = async (e) => {
  
        e.preventDefault();
        try {
          let res = await fetch(`http://localhost:8686/${ref.current.defaultValue}/tipoDeCliente/${cliente}`, {
            method: "PUT"
          });
          let resJson = await res.json();
          if (res.status === 200) {
            setcliente("");
           
            setMessage("Cliente Creada");
            window.location.reload()
          } else {
            setMessage("Some error occured");
          }
        } catch (err) {
          console.log(err);
        }
      };
   
   
    function deleteUser(id){
        fetch(`http://localhost:8686/${id}`,{
               method: 'DELETE'
           });
           window.location.reload()
       }

    const listItems =    props.todos.filter((element) =>element.oportunidad==true)
                                    .map((element) =>
    
    <div className="contacto-container">
    <h3>Oportunidades</h3>
    <div className='contacto-lista'>
    <h4>Name</h4>
    <h5>{element.name} {element.lastName}</h5>
  
    </div >
    <div className='contacto-lista'>
    <h4>Email</h4>
    <h5>{element.email}</h5>
  
    </div >
    <div className='contacto-lista'>
    <h4>Tlf</h4>
    <h5>{element.tlf}</h5>
  
    </div>
    <div className='contacto-lista '>
    <h4>Oportunidad</h4>
    <div className='oportunidad'>
    <h5 >{element.oportunityType}</h5>
    </div>
    </div>
    <form  onSubmit={handleSubmit} >
    <input type="text" ref={ref} style={{visibility: "hidden"}}  defaultValue={`${element.id}`}  />
    <h4>Tipo de cliente(add)</h4>
    <textarea cols="30" rows="2" value={cliente}   onChange={(e) => setcliente(e.target.value)}></textarea>
    <button id='botonadd' type="submit"> CREAR CLIENTE</button>
    <div className="message">{message ? <p>{message}</p> : null}</div>

    </form>
    <button name='delete'  id='deletebuton' onClick={() => deleteUser(element.id) } type="submit"> ELIMINAR</button>

   
</div>
    
    );

    
    return(
        
        <div id='oportunidades'>
       {listItems}
        </div>
    );

}