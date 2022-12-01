import './usuarios.css'
import { useState } from 'react';
import { useRef } from 'react';
import { Navigate, useNavigate } from 'react-router-dom';
export default function Contacto(props){
    
    const [oportunidad, setoportunidad] = useState("")
    const [message, setMessage] = useState("");
    const ref = useRef(null);

    let handleSubmit = async (e) => {
  
        e.preventDefault();
        try {
          let res = await fetch(`http://localhost:8686/${ref.current.defaultValue}/tipoDeOportunidad/${oportunidad}`, {
            method: "PUT"
          });
          let resJson = await res.json();
          if (res.status === 200) {
            setoportunidad("");
           
            setMessage("Oportunidad Creada");
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
   
    
    const listItems = props.todos.map((element) =>
    <div className="contacto-container">
    <h3>Contacto</h3>
    <div className='contacto-lista'>
    <h4>Nombre</h4>
    <h5>{element.name } {element.lastName}</h5>
  
    </div >
    <div className='contacto-lista'>
    <h4>Número de llamadas</h4>
    <h5>{element.numberOfCalls}</h5>
   <button type="submit"> + </button>
    </div>
    <div className='contacto-lista'>
    <h4>Email</h4>
    <h5>{element.email}</h5>
  
    </div >
    <div className='contacto-lista'>
    <h4>Tlf</h4>
    <h5>{element.tlf}</h5>
  
    </div>
    <div className='contacto-lista'>
    <h4>Ultima fecha</h4>
    <h5>{element.date}</h5>
  
    </div>

    <form onSubmit={handleSubmit}>

        <input type="text" ref={ref} style={{visibility: "hidden"}}  defaultValue={`${element.id}`}  />
        <h4>Tipo de oportunidad</h4>
        <textarea cols="30" rows="2" value={oportunidad}   onChange={(e) => setoportunidad(e.target.value)}></textarea>
        <button name='añadiroportunidad' id='botonadd' type="submit"> OPORTUNIDAD</button>
        <div className="message">{message ? <p>{message}</p> : null}</div>
        
    </form>

    <button name='delete'  id='deletebuton' onClick={() => deleteUser(element.id) } type="submit"> ELIMINAR</button>

</div>

  ); 
    return(
        <>
        <div id='contactos'>

       {listItems}
       
       
        
        </div>
        </>
    );

}